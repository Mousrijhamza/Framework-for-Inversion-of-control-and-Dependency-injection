package Framework.Container.Factory;

import Framework.Container.Bean;
import mypackage2.bean;
import mypackage2.beans;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;


public class PluginImpl implements AbstractPlugin {


    private Bean bean;
    private Map<Integer, Object> map;

    /*
            public Bean getBean() {
                return bean;
            }

         */

    @Override
    public void loadBean(String path) throws Exception {


        // Traitement de Xml.config
        // 1er je dois naviguer vers le config.Xml et extraire les classes des beans
        // c'est possible avec Jdom Api java pour manipuler le Config.XML
        // importer l'essentiel avec maven (SAX parseur)
        // allons y

        bean = Bean.getBean();
        map =bean.getMapBeans();
        JAXBContext context=JAXBContext.newInstance(mypackage2.beans.class);
        Unmarshaller unmarshaller= context.createUnmarshaller();
        beans beans= (beans) unmarshaller.unmarshal(new File("config.xml"));
        List<mypackage2.bean> beanList = beans.getBean();
        for (mypackage2.bean bean1:beanList){
            System.out.println("bean list="+bean1.getClasse());
        }



        for (mypackage2.bean bean1:beanList){
            int id = bean1.getId();
            String className = bean1.getClasse();
            Class<?> beanClass = Class.forName(className);
            Object beanInstance = beanClass.getDeclaredConstructor().newInstance();
            bean.addBean(beanInstance);
        }

        // il va checher  la classo qui a comment element dans config.xml une property

        for (mypackage2.bean bean1:beanList){
            int id=bean1.getId();
            Object beanEntity= map.get(id);
            List<mypackage2.property> properties = bean1.getProperty();

            if(properties != null){
                    int propertyRef = properties.getFirst().getRef();
                    Object beanDependacy = map.get(propertyRef);       //bean


                    ////////////////////////////////////////////////////////////////
                    //                                                            //
                    //        ici le code d'DI avec setter ou constructeur        //
                    //                                                            //
                    ////////////////////////////////////////////////////////////////
                    //j'ai choisi laDI par setter

                    //Method=beanEntity.getClass().getMethod("setD", application.DAO.DaoImpl.class);
                    // beanDependacy.getClass()
                    try {
                        Constructor<?> constructor = beanEntity.getClass().getConstructor(application.DAO.Dao.class);
                        Object o2 = constructor.newInstance(beanDependacy);
                    } catch (NoSuchMethodException e) {
                        System.err.println("Constructor not found for class: " + beanEntity.getClass().getName());
                        throw e;
                    } catch (Exception e) {
                        System.err.println("Error invoking constructor for class: " + beanEntity.getClass().getName());
                        throw e;
                    }



            }

        }
    }
}

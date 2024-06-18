package Framework.Container.Factory;



//La fabrique est responsable de la création de l'objet et de l'injection des dépendances,
// ce qui réduit le couplage et rend le code plus modulaire et maintenable.


public class AbstractFactoryImpl implements AbstractFactory {
    @Override
    public AbstractPlugin createMyBean() {
        return null;
    }
}

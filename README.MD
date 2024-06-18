<h1>Mini Projet (Framework Injection des dépendance)</h1>
Concevoir et créer un mini Framework d'injection des dépendances similaire
a Le Framework Spring, doit permettre a un programmeur de faire l'injection des dépendances
entre les différents composant de son application respectant les possibilités
suivantes:
  <ol>1- A travers fichier XML de configuration en utilisant Jax Binding (OXM : Mapping
       Objet XML MOX)</ol>
  <ol>2- En utilisant les annotations</ol>
  <ol>
    <p>3- Possibilité d'injection via</p>
      <ul> a- Le constructeur </ul>
      <ul>b- Le Setter </ul>
      <ul>c- Attribut (accés direct a l'attribut : Field) </ul>

</ol>


<h2>Plan de mise en œuvre</h2>
<ol>
    <li>
        <strong>Conception du Conteneur IoC (Singleton Pattern)</strong> :
        <ul>
            <li>Créez un conteneur IoC unique pour gérer les beans.</li>
        </ul>
    </li>
    <img>
        <strong>Configuration des Beans via XML et Annotations (Factory Pattern et Adapter Pattern)</strong> 
        <img src="C:\Users\Hamza\Pictures\Screenshots\Capture d'écran 2024-06-18 191025.png"></img>
        <ul>
            <li>Utilisez des usines pour instancier les beans à partir de configurations XML et d’annotations.</li>
            <li>Adaptez les annotations et les configurations XML pour qu'elles soient compréhensibles par le conteneur IoC.</li>
        </ul>
    </li>
    <li>
        <strong>Injection des Dépendances (Dependency Injection Pattern)</strong> :
        <ul>
            <li>Implémentez l’injection par constructeur, setter, et champ.</li>
        </ul>
    </li>
    <li>
        <strong>Gestion du Cycle de Vie des Beans (Builder Pattern et Prototype Pattern)</strong> :
        <ul>
            <li>Utilisez des builders pour assembler les beans avec leurs dépendances.</li>
            <li>Utilisez des prototypes pour créer des copies d’instances de beans.</li>
        </ul>
    </li>
    <li>
        <strong>Ajout de Fonctionnalités Supplémentaires (Decorator Pattern)</strong> :
        <ul>
            <li>Ajoutez dynamiquement des fonctionnalités aux beans existants sans modifier leur code source.</li>
        </ul>
    </li>
    <li>
        <strong>Localisation des Services (Service Locator Pattern)</strong> :
        <ul>
            <li>Implémentez un service locator pour trouver et fournir des instances de services ou de beans.</li>
        </ul>
    </li>
    <li>
        <strong>Gestion de l'Accès et des Transactions (Proxy Pattern)</strong> :
        <ul>
            <li>Utilisez des proxys pour gérer l’accès aux beans et les transactions.</li>
        </ul>
    </li>
</ol>

<p>En utilisant ces patterns, vous serez en mesure de concevoir et de créer un mini framework d'injection des dépendances qui répond aux exigences spécifiées dans le projet.</p>

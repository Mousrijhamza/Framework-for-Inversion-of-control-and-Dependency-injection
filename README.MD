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


<h1>Pour développer un mini framework d'injection des dépendances similaire à Spring IoC, plusieurs design patterns peuvent être utilisés pour répondre aux exigences du projet. Voici les principaux patterns qui peuvent vous aider :</h1>

<h2>1. Singleton Pattern</h2>
<p>Utilisé pour garantir qu'une seule instance de votre conteneur IoC est créée et partagée à travers l'application.</p>
<ul>
    <li><strong>Utilisation</strong> : Assurer qu'il n'y a qu'une seule instance du conteneur IoC.</li>
</ul>

<h2>2. Factory Pattern</h2>
<p>Permet de créer des objets sans avoir à spécifier la classe exacte de l'objet à créer.</p>
<ul>
    <li><strong>Utilisation</strong> : Créer des instances de beans à partir des configurations XML ou des annotations.</li>
</ul>

<h2>3. Builder Pattern</h2>
<p>Facilite la création d'objets complexes en séparant la construction de l'objet de sa représentation.</p>
<ul>
    <li><strong>Utilisation</strong> : Construire les beans avec leurs dépendances injectées.</li>
</ul>

<h2>4. Prototype Pattern</h2>
<p>Permet de créer des objets en clonant une instance prototype préexistante.</p>
<ul>
    <li><strong>Utilisation</strong> : Créer des instances de beans à partir d'une configuration prototype.</li>
</ul>

<h2>5. Decorator Pattern</h2>
<p>Permet d’ajouter dynamiquement des responsabilités supplémentaires à un objet.</p>
<ul>
    <li><strong>Utilisation</strong> : Ajouter des fonctionnalités supplémentaires aux beans sans modifier leur structure de base.</li>
</ul>

<h2>6. Dependency Injection Pattern</h2>
<p>Implémentation du principe de l’injection de dépendances, qui peut être réalisé via les constructeurs, les setters, ou directement par les champs.</p>
<ul>
    <li><strong>Utilisation</strong> : Injecter des dépendances via constructeur, setter, ou champ (field).</li>
</ul>

<h2>7. Service Locator Pattern</h2>
<p>Fournit une façon de déléguer la recherche des services à un service locator, qui fournit les services nécessaires à la demande.</p>
<ul>
    <li><strong>Utilisation</strong> : Localiser et fournir des instances de services ou de beans à partir du conteneur IoC.</li>
</ul>

<h2>8. Adapter Pattern</h2>
<p>Permet à des classes avec des interfaces incompatibles de travailler ensemble en convertissant l'interface d'une classe en une autre interface que le client attend.</p>
<ul>
    <li><strong>Utilisation</strong> : Adapter les annotations et les configurations XML pour qu'elles puissent être interprétées de manière uniforme par le conteneur IoC.</li>
</ul>

<h2>9. Proxy Pattern</h2>
<p>Utilisé pour créer des objets substituts ou des objets place-holder, contrôlant l'accès à d'autres objets.</p>
<ul>
    <li><strong>Utilisation</strong> : Gérer la création paresseuse (lazy loading) et les transactions.</li>
</ul>

<h2>Plan de mise en œuvre</h2>
<ol>
    <li>
        <strong>Conception du Conteneur IoC (Singleton Pattern)</strong> :
        <ul>
            <li>Créez un conteneur IoC unique pour gérer les beans.</li>
        </ul>
    </li>
    <li>
        <strong>Configuration des Beans via XML et Annotations (Factory Pattern et Adapter Pattern)</strong> :
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

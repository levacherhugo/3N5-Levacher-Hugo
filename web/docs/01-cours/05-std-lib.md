---
title: Librairie standard
description: Librairies standard
hide_table_of_contents: true
---

# Kotlin, librairie standard

## Contenu

TODO on oublie hashcode et equals
TODO on parle de collection mutable / pas mutable
TODO on parle de set et list  Thème collection
TODO on parle de fichiers écriture et lecture fichiers texte

<Row>

<Column>

:::danger Avant la séance (2h)

Explication en profondeur mutalibilité et immutabilité.

Kotlin peut utiliser 
- les librairies Java incluant tout le contenu de la librairie standard exemple java.util.List
- la librairie standard de Kotlin qui est une surcouche de la librairie Java https://kotlinlang.org/api/latest/jvm/stdlib/

Une liste mutable peut faire tout ce que peut faire une liste immuable, alors:
- pourquoi la immuable existe?
- pourquoi on recommande d'utiliser le plus possible des collection immuables?

Sources:
- https://web.mit.edu/6.005/www/fa15/classes/09-immutability/#:~:text=The%20answer%20is%20that%20immutable,much%20harder%20to%20enforce%20contracts.
- https://kt.academy/article/ek-mutability

1. La source la plus importante de documentation sur la librairie standard est le javadoc. Parcourez une ou deux pages en partant de **[javadoc](https://docs.oracle.com/javase/7/docs/api/)** (max 20 minutes).
2. Lire le javadoc de la classe **[Set](https://docs.oracle.com/javase/7/docs/api/java/util/Set.html)** (max 10 minutes).
3. Regarder les vidéos de théorie
4. Commencer les exercices de la semaine. Arrêter après 2 heures de travail

:::

</Column>

</Row>

<Row>

<Column>

:::tip Vidéos

<Video url="https://youtu.be/KhK604sQik8" />

<Video url="https://youtu.be/YxLB9Hc9GLI" />

<Video url="https://youtu.be/0nIQGQ6D6xw" />

<Video url="https://youtu.be/v4HM5iTfSoE" />

:::

</Column>

<Column>

:::info À faire pendant la séance

- Compléter les exercices de la semaine
- Continuer le **[travail pratique](../tp/tp1)** (à remettre au début de la semaine prochaine)

:::

</Column>


</Row>

:::note Exercices

### Exercice EcritFichier.java

En utilisant soit la librairie standard, soit une librairie que tu auras cherchée, ton programme doit:

- Écrire un fichier vide dans le dossier courant appelé vide.txt
- Créer un fichier texte contenant ton nom et ton prénom dans le dossier parent du dossier courant

### Exercice LitFichier.java

En utilisant soit la librairie standard, soit une librairie que tu auras cherchée, ton programme doit:

- Prendre un ou plusieurs noms de fichiers comme paramètres de ligne de commandes (le String[] de ta méthode main)
- Afficher le contenu de chaque fichier passé en argument dans la console en les séparant par une ligne de -------------

### Exercice ListeSimple.java

Tu dois programmer une méthode *repete(int n, int nombreFois)* qui renvoie une liste d'entiers avec tous les nombres de 1 à *n* répétés *nombreFois*. Par exemple pour *repete(4, 2)*, on obtient **[1, 1, 2, 2, 3, 3, 4, 4]**

Ecris une classe avec une méthode *main* pour tester la méthode précédente avec plusieurs valeurs de paramètres.

### Exercice TriSimple.java

Tu dois programmer une méthode *tri(List&lt;Double&gt; liste)* qui renvoie la liste triée par ordre inverse. Par exemple, si on passe **[0.1, 12.34, -0.1234, 3.1416]** on obtient **[-0.1234, 0.1, 3.1416, 12.34]**.

Ecris une classe avec une méthode main pour tester la méthode précédente avec plusieurs listes.

### Exercice TriComparator.java

Tu dois programmer une méthode *triComplexe(List&lt;Integer&gt; liste)* qui renvoie la liste triée par un ordre un peu complexe.

- Si un nombre contient moins de '7' qu'un autre, il doit être avant dans le tri
- Si 2 nombres ont le même nombre de 7, le plus petit devrait être avant dans la liste

Par exemple, si on passe [1234, 747, 77, 1977, -71, 17, 7] on obtient [1234, -**7**1, **7**, 1**7**, **77**, **7**4**7**, 19**77**].

Ecris une classe avec une méthode main pour tester la méthode précédente avec plusieurs listes.

### Exercice TrouvePisCompte.java

Tu dois programmer une méthode **boolean trouve(int element, List&lt;Integer&gt; liste)** qui renvoie si la liste contient l'élément fourni.

Tu dois programmer une méthode **int compte(int element, List&lt;Integer&gt; liste)** qui renvoie le nombre d'apparitions de l'element dans la liste.

Écris un main qui permet de tester les 2 méthodes sur plusieurs exemples.

### Exercice Liste et références

Avant de commencer tu dois créer une classe Java que tu vas appeler Truc (dans le fichier Truc.java). Ta classe doit avoir 2 champs (propriétés):

- un int (type entier sur 32 bits) appelé pipo
- un String (chaîne de caractères) appelé popi

Tu dois surcharger la méthode toString de la classe Truc pour afficher les valeurs des 2 champs.

Dans ta classe exécutable (celle avec le *main*), tu dois écrire la séquence d'instructions pour :

- Créer 3 objets de classe Truc dans les variables a b et c avec des valeurs différentes pour chaque
- Créer une liste appelée liste1 dans laquelle ajouter dans l'ordre a, b puis c
- Créer une liste appelée liste2 dans laquelle ajouter dans l'ordre b, c puis a
- Modifier les valeurs de l'objet a
- Afficher les 2 listes à l'aide d'un System.out.println en utilisant le toString de vos listes

Pour compléter l'exercice, il faut faire un dessin pour expliquer ce qui se passe ou un texte. Si tu comprends pas ce qui se passe, on s'en parle.

### Exercice EntrezUnNombre.java

En utilisant un Scanner sur le System.in, écrivez un programme qui demande à l'utilisateur de taper un mot jusqu'à ce que ce soit un nombre entier :

```text {2,4,6}
Veuillez entrer un nombre:
pipo
Ceci n’est pas un nombre, veuillez entrer un nombre:
popi
Ceci n’est pas un nombre, veuillez entrer un nombre:
123
Merci votre nombre est 123.
```

### Exercice Map et itération (optionnel)

On veut garder en mémoire les notes de nos étudiants. Après mûre réflexion, on décide d'utiliser une structure MAP avec la note de l'étudiant comme clé et le nom de famille de l'étudiant comme valeur.

1. Évaluer la solution proposée (bon / pas bon et pourquoi)
2. Créer la structure demandée
   - Sanchez a eu 92%
   - Tremblay a eu 68%
   - Richard a eu 73%
3. On veut ajouter un nouvel étudiant, Gino Tremblay. Il a eu 30%. Comment s'y prendrait-on?
4. On veut ajouter une nouvelle étudiante, Mauda Sasa. Elle a eu 68%. Comment s'y prendrait-on?
5. On veut imprimer un rapport de tous les étudiants avec leurs notes. Pour se faire, vous devrez parcourir tous les éléments de votre map. Choisissez deux implémentations différentes pour itérer dans votre structure.

:::

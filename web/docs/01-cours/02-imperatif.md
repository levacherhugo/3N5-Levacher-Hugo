---
title: Impératif
description: Prog. impérative
hide_table_of_contents: true
---

# Programmation impérative en Kotlin

## Contenu

- Exemples d'applications pour revenir sur les éléments couverts dans la vidéo
- Correction commentée de certains exercices de la semaine
- Focus sur la null safety 
  - https://en.wikipedia.org/wiki/Null_pointer#History
- Focus sur val et var
- Focus sur les annotations de types

<Row>

<Column>

:::danger Avant la séance (2h)

1. Parcourir la page Wikipédia concernant **[Kotlin](<https://fr.wikipedia.org/wiki/Kotlin_(langage)>)** (max 20 minutes)
2. Regarder les vidéos de théorie
3. Commencer les exercices de la semaine. Arrêter après 2h de travail

:::

</Column>

<Column>

:::tip Vidéos

<Video url="https://youtu.be/PSnfqJ8pW2k"/>

<Video url="https://youtu.be/kpBcxKXacZM"/>

<Video url="https://youtu.be/BzFx1dszk4I"/>

:::

</Column>

<Column>

:::info À faire pendant la séance

- Compléter les exercices de la semaine
- Avancer le **[premier travail](../tp/tp1)**

:::

</Column>

</Row>

:::note Exercices

Le but des exercices est de découvrir Kotlin par la pratique.

Certaines syntaxes sont pareilles en C# et en Kotlin, alors que d'autres sont différentes. À toi de trouver lesquelles.

### Exercice de compréhension sur val var

**val** et **var** sont des mots clés très similaires en lecture rapide. Pourtant, ils sont très différents.

### Exercice de compréhension sur les types

Etant donné le code suivant et sans utiliser l'IDE, déterminer le type de chaque variable.

Consigne ta réponse dans un fichier **types.md**

TODO
```kotlin
val a = 1                                   // type est            
val aa = 1L                                 // type est
val aaa = a * 25 + aa * 100                 // type est
val b = 1.0                                 // type est 
val c = "1"                                 // type est 
val d = true                                // type est
val laChose = a +  b + c                    // type est
val lautreChose = b + c                     // type est
val k = listOf("1", "2", "3")               // type est
val l = mutableListOf(true, false, true)    // type est
```

Fais-toi un projet avec un main pour exécuter le code en débogage. Prends des screenshots de l'écran du débogueur
qui te permet de déterminer le type de chaque **val**.

Des surprises?

### Exercice Pyramide

Tu peux soit créer un projet appelé Pyramide ou un fichier Pyramide.kt dans un projet existant.

Reproduis un triangle en prenant sa hauteur par un argument de ligne de commande.

Par exemple, pour un argument de 3, le programme doit afficher :
```
  *
 ***
*****
```

Teste ton code sur les hauteurs suivantes 1, 2, 3, 10, 1000.

### Exercice Moyenne

Dans un projet ou un fichier avec un main, tu dois :
- définir une fonction qui prend un paramètre **n** et crée un tableau de **n** entiers tirés au hasard entre 0 et 100 inclus.
```kotlin
fun creeTableauAleatoire(n: Int): Array<Int> {
    // ton code ici
}
```
- calcule la somme, la moyenne, le min et le max et affiche les dans la console (tu es fortement encouragé à définir des fonctions ici pour te pratiquer).

Indications
- https://kotlinlang.org/docs/arrays.html#create-arrays pour les manipulations de tableau en Kotlin
- besoin d’un objet de la classe Random pour les tirages aléatoires : https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.random/-random/
- pour trouver la documentation d’une classe, on Google `kotlin nomdelaclasse Random`, ici `kotlin class Random`

### Exercice Web

Ton programme doit prendre en argument une adresse (URL) d’un site web et afficher son contenu dans la console. Pour faire cela, tu peux utiliser une librairie externe ou la librairie standard.

Commence par l'implémenter en utilisant la librairie [jsoup](https://jsoup.org/), puis refais-le avec l'une des autres alternatives suivantes pour comparer :

- [Librairie standard](http://docs.oracle.com/javase/tutorial/networking/urls/readingWriting.html)
- [Librairie Guava](https://stackoverflow.com/a/6068228/1227197)
- [Autres (Java 9, Scanner, Apache Commons)](https://www.techiedelight.com/read-contents-of-url-into-string-java/)

### Exercice EclateTaString

Crée un programme qui prend en argument (le paramètre de la méthode main) une chaîne de caractères et qui affiche chaque caractère de la chaîne individuellement sur une ligne.

### Exercice BinariseTonEntier

Crée un programme qui prend en argument (le paramètre de la méthode main) une chaîne de caractères.

Tu dois d'abord convertir le String que tu as reçu en Integer. Ensuite tu dois chercher comment afficher ce nombre en binaire.

### Exercice ConvertisDansTousLesSens

Crée un programme qui teste différentes conversions de type et affiche les résultats.

- convertis un int en float
- convertis un double en int. Qu'est-ce qui se passe après la virgule ?
- convertis une String en int. Qu'est-ce qui se passe s'il y a autre chose que des chiffres ?
- convertis un int en String
- convertis un float en double
- etc.

:::

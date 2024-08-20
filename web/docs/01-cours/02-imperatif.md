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

### Exercice de compréhension sur les types

Crée un nouveau projet **Types**.

Etant donné le code suivant, et sans rouler de code ni utiliser l'IDE, détermine le type de chaque variable.  
Consigne tes réponses dans un fichier **types.md** à la racine de ton projet **Types**.

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

Dans le *main*, copie et exécute ce code en mode débogage.  
Prends des screenshots de l'écran du débogueur qui te permettent de déterminer le type de chaque **val**.

Des surprises?

### Exercice de compréhension sur val / var

**val** et **var** sont des mots clés très similaires en lecture rapide. Pourtant, ils sont très différents.  
Dans un fichier **valvar.md** à la racine de ton projet **Types**, explique en tes mots la différence entre les deux.

### Exercice EclateTaString

Crée un nouveau projet **EclateTaString**, ou bien dans un projet existant un nouveau fichier exécutable (avec une fonction *main*) **EclateTaString.kt**.  
Ce programme doit prendre en argument de ligne de commande (paramètre de la méthode main) une chaîne de caractères et afficher chaque caractère de la chaîne individuellement sur une ligne.

### Exercice Pyramide

Crée un programme (nouveau projet ou nouveau fichier exécutable) qui reproduit un triangle en obtenant sa hauteur par un argument de ligne de commande.

Par exemple, pour un argument de 3, le programme doit afficher :
```
  *
 ***
*****
```

Teste ton code sur les hauteurs suivantes : 1, 2, 3, 10, 1000.

### Exercice Moyenne

Dans un nouveau projet ou un nouveau fichier exécutable :
- Définis une fonction qui prend un paramètre **n** et retourne un tableau de **n** entiers tirés au hasard entre 0 et 100 inclus.
```kotlin
fun creeTableauAleatoire(n: Int): Array<Int> {
    // ton code ici
}
```
- Calcule la somme, la moyenne, le min et le max d'un tableau d'entiers et affiche-les dans la console.

Il t'est fortement recommandé ici de définir des fonctions et de les appeler dans le *main*.

Liens pour des ressources :
- [Manipulation de tableaux en Kotlin](https://kotlinlang.org/docs/arrays.html#create-arrays)
- [Classe Random pour les tirages aléatoires](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.random/-random/)

**Astuce** : pour trouver la documentation d’une classe, on google `kotlin class nomdelaclasse`, par exemple ici `kotlin class Random`

### Exercice BinariseTonEntier

Crée un programme (nouveau projet ou exécutable) qui prend en argument une chaîne de caractères, la convertit en Integer et affiche ce nombre en binaire.

### Exercice ConvertisDansTousLesSens

Crée un programme qui teste différentes conversions de type et affiche les résultats :
- convertit un Int en Float
- convertit un Double en Int (qu'est-ce qui se passe après la virgule?)
- convertit une String en Int (qu'est-ce qui se passe s'il y a autre chose que des chiffres?)
- convertit un Int en String
- convertit un Float en Double
- etc.

### Exercice Web

Crée un programme qui prend en argument une adresse (URL) d’un site web et affiche son contenu dans la console.  
Pour faire cela, tu peux utiliser une librairie externe (par exemple la librairie [jsoup](https://jsoup.org/)) ou bien la librairie standard.

:::

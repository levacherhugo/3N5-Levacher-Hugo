---
title: Accueil
description: Accueil et intro à Kotlin
hide_table_of_contents: true
---

# Intro à Kotlin et environnement de développement

<Row>

<Column>

## Contenu

- Application : architecture, exceptions, robustesse et tests automatisés
- Kotlin comme langage, Android comme plateforme
- Plan de cours et logistique

## Évaluations et date

- Politique concernant les absences / retards
- Politique concernant le plagiat

</Column>

<Column>

## En cours avec le prof (démos)

1. Utilisation du script d'installation
2. Ouvrir l'IDE pour Kotlin (Intellij IDEA)
3. Premier projet, première classe Kotlin
4. Point d'arrêt et débogueur
5. Configuration d'exécution et .idea
6. Ajouter une librairie avec gradle
7. Définir une fonction en Kotlin
8. Créer un fork du repo du cours privé pour mettre vos exercices 3N5-NomDeFamille-Prenom

</Column>

</Row>

<Row>


<Column>

:::tip Contenu pour cette semaine

TODO Video sur premier projet, avec point d'arrêt et arguments

[Recette](../recette-ajout-librairie) sur ajouter une librairie Java dans un projet Kotlin en gradle.

:::



</Column>

<Column>

:::info À faire pendant la séance

- Se familiariser avec l'environnement de développement
- Compléter les exercices de la semaine
- Commencer le **[premier travail](../tp/tp1)** (création du projet, création de la classe pour l'application, exécution et débogue).

:::

</Column>

</Row>

:::note Exercices

TODO utiliser ChatGPT pour traduire de C# à kotlin.

### Exercice Bonjour Kotlin

Tu dois créer un projet Kotlin au format gradle dont le nom de package de base (*GroupId*) est **org.nomdefamille** en changeant le nom de famille.

Crée 2 classes exécutables (avec un *main* qui suit la convention Kotlin).\
La première s'appelle **NomDeFamille.kt** et affiche "Bonjour Nom de famille" à l'exécution.\
La deuxième s'appelle **PrenomDuProf.kt** et affiche "Salut prénom du prof" à l'exécution.

N'OUBLIE PAS DE FAIRE UN COMMIT DANS TON REPO AVEC L'EXERCICE, PUIS DE FAIRE UN PUSH.

### Exercice Triangle

Reproduis un triangle en prenant sa hauteur par un argument de ligne de commandes.

```
*
**
***
****
```

Indications

- La méthode qui permet de transformer une chaîne de caractères en entier est une méthode statique de la classe Integer.
- Pour afficher un caractère sans sauter de ligne, print()

N'OUBLIE PAS DE FAIRE UN COMMIT DANS TON REPO AVEC L"EXERCICE PUIS DE FAIRE UN PUSH.

### Exercice Triangles

Tu dois produire 5 triangles de suite en utilisant une fonction kotlin qui:
- prend la hauteur en paramètre
- renvoie une **String** avec le triangle

```kotlin
fun triangle(hauteur : Int) : String {
    return "TODO"
}
```
Utilise cette fonction pour faire un main qui affiche 5 triangles de suite de taille 4, 8, 10 et 100.

N'OUBLIE PAS DE FAIRE UN COMMIT DANS TON REPO AVEC L"EXERCICE PUIS DE FAIRE UN PUSH.

### Exercice TraceManuelle

TODO faire un exo avec du code, dire quelle ligne s'exécute dans quel ordre et quels affichages se font en console.

```kotlin
fun main() {
    for (i : Int in 1..1) {
        for (j : Int in 1..2) {
            for (k : String in listOf(" pif", "") ) {
                val b = .1 + .1 + .1
                val z = (i + j * b / k.length * j).toString() + k
                println(z + " " + b)
            }
        }
    }
}
```
Dans un fichier appelé **TraceManuelle.md**, tu dois écrire à quoi va ressembler la
console à la fin de l'exécution du programme.

Finalement tu écriras ce que vaut **b / k.length** à chaque itération.

### Exercice TraceDebugger

Refaire le même exercice que précédemment, mais en utilisant le débogueur. Tu devras:
- placer un point d'arrêt
- évaluer une expression sur un point d'arrêt pour savoir combien vaut **b/ k.length** à chaque itération

Valide que les valeurs que tu trouves sont les mêmes que pour TraceManuelle

### Exercice librairie JSOUP

Tu dois créer un projet Kotlin au format gradle dont le nom est DemoJSoup.

Tu dois inclure JSoup dans les dépendances de ton projet dans le build.gradle.

Tu dois créer une classe exécutable appelée **SuperDuperDemo.kt**. 

Dedans tu copieras un des exemples que tu trouves sur la page de JSOUP [https://jsoup.org/](https://jsoup.org/):
- les exemples sont en Java
- tu peux essayer de les traduire en Kotlin
- tu peux demander à ChatGPT de traduire l'exemple en Kotlin
- tu peux aussi copier le code de l'exemple en Java et le coller dans un fichier **.kt** dans Intellij, il te proposera de traduire pour toi.

Démontre la bonne exécution de ton programme.

N'OUBLIE PAS DE FAIRE UN COMMIT DANS TON REPO AVEC L"EXERCICE PUIS DE FAIRE UN PUSH.

## Défi de la semaine (optionnel)

### Exercice UnUn

Tu dois programmer une méthode en Kotlin qui transforme une String en une autre String:

```kotlin
fun unUn(source: String): String{
    TODO()
}
```

Par exemple, si la source est "111213", on compte le nombre de chiffres identiques

- source commence par "111" ce qui va donner 3 fois 1, soit "31"
- "2" va donner 1 fois 2 donc "12"
- "1" va donner 1 fois 1 donc "11"
- "3" va donner 1 fois 2 donc "13"

Le résultat de "111213" serait donc "31121113"

### Exercice UnUnSequence

Tu programmes une méthode qui affiche une séquence de _n_ String partant du paramètre source.

```kotlin
fun sequence(source: String, longueur: Int): List<String>{
    TODO()
}
```

Par exemple, pour **sequence("1", 6)** donne

```
1
11
21
1211
111221
312211
```

Tu produis des programmes exécutables pour répondre aux questions suivantes :

- Quel est le nombre le plus élevé qu'on peut atteindre en partant de "1"? Par exemple, dans les 100 000 premières itérations.
- Est-ce qu'il peut arriver que le résultat de unUn soit plus court que la source? Si oui, donne un exemple.

:::

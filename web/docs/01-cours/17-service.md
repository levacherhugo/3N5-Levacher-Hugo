---
title: Service
description: Service et modèle
hide_table_of_contents: true
---

# Modèle (entités) et service (actions)

## Contenu

Nous allons voir comment appliquer la décomposition en entités (modèle) et actions (service) sur l'exemple suivant:

On veut une application qui permet d'aller chercher l'avis de personnes sur des films, des disques, un peu de tout. On veut pouvoir ajouter un item dans l'appli pour pouvoir entrer les avis des gens. On peut voir la liste de tous les items et pour chaque item, on veut pouvoir ajouter une évaluation (une note entre 0 et 5) ainsi que le nom de la personne. On veut aussi calculer des statistiques comme la moyenne des notes pour un item, l'écart-type ou encore le nombre de personnes ayant donné la note de 0, 1, 2, 3, 4 ou 5.

On s'arrêtera aux signatures des méthodes d'action et aux classes de modèle.

<Row>

<Column>

:::warning Avant la séance (2h)

Regarder la video qui décrit comment concevoir une application en fonction :

- des entités à représenter
- des actions à fournir à l'utilisateur

:::

</Column>

<Column>

:::tip Vidéos

<Video url="https://youtu.be/MmpgnWLEa5s" />

:::

</Column>

<Column>

:::info À faire pendant la séance

Compléter l'exercice de la semaine les exercices de la semaine. Continuer le travail évalué en cours.

:::

</Column>

</Row>

:::note Exercices

### Exercice Notes

Vous devez appliquer la même méthode de décomposition en entités et actions sur l'exemple suivant:

On cherche à réaliser une application permettant de gérer des étudiants et leurs notes. L'application permet de créer des épreuves avec une pondération. L'ensemble des épreuves donne une somme de poids de 100. On peut créer des étudiants dans le système. Finalement, on peut saisir les notes pour un étudiant et pour une épreuve.

Après la saisie de chaque nouvelle note d'étudiant, le système donne le détail de la situation de l'étudiant.

Prenez cet exemple pour votre application (TP). Vous devez définir le modèle de données ainsi que le service sous la forme des méthodes nécessaires.

:::

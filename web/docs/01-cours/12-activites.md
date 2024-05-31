---
title: Activités
description: Navigation entre activités
hide_table_of_contents: true
---

# Multiples activités et navigation

## Contenu

Démo d'un startActivity.

<Row>

<Column>

:::danger Avant la séance (2h)

- Regarder les vidéos
- Commencer les exercices . Arrête quand tu as complété tes 2 heures.

:::

</Column>

<Column>

:::tip Vidéos

<Video url="https://youtu.be/MOF0kb0ampc" />

<Video url="https://youtu.be/t4jYehSpR1A" />

<Video url="https://youtu.be/qvty1jwEj-4" />

<Video url="https://youtu.be/Zu2pd6vOxMM" />

:::

</Column>

<Column>

:::info À faire pendant la séance

Vous devez compléter les exercices de la semaine.

Vous travaillerez sur le **[travail 2](../tp/tp2)**.

:::

</Column>

</Row>

:::note Exercices

### Exercice de navigation

Tu dois implémenter une application avec trois activités. Voici la navigation souhaitée :

- Accueil -> Contact ou Article
- Article -> Contact
- Contact -> Accueil

L'apparence n'est **pas** importante.

<Row>

<Column>

![Accueil v1](_12-activites/Accueil_v1.png)

</Column>

<Column>

![Article v1](_12-activites/Article_v1.png)

</Column>

<Column>

![Contact v1](_12-activites/Contact_v1.png)

</Column>

</Row>

### Exercice de transfert d'informations

Tu dois maintenant rajouter un peu de logique à ton application

- Accueil : Contient un texte disant Bonjour et un Number Picker.
- Article : Affiche toujours le même texte (lorem ipsum), mais le numéro de l'article dans le titre change en fonction de ce qui a été choisi sur l'activité d'accueil
- Contact : Contient un texte éditable où on entre son nom
- Lorsqu'on est sur l'activité Contact et qu'on revient à l'accueil avec le bouton, on doit changer le message pour Bonjour *nom*

<Row>

<Column>

![Accueil v2 s1](_12-activites/Accueil_v2_state1.png)

</Column>

<Column>

![Accueil v2 s2](_12-activites/Accueil_v2_state2.png)

</Column>

<Column>

![Contact v2](_12-activites/Contact_v2.png)

</Column>

<Column>

![Article v2](_12-activites/Article_v2.png)

</Column>

</Row>

### (OPTIONNEL) Exercice d'exploration

Utilise la documentation en ligne pour apprendre comment appeler un numéro de téléphone en utilisant un intent

1. Crée une activité avec un bouton
2. Chaque fois que tu cliques sur le bouton, ouvre automatiquement l'écran pour appeler ton numéro
 
<Row>

<Column>

![Email v1](_12-activites/Email_v1.png)

</Column>

<Column>

![Email after click v1](_12-activites/Email_afterClick.png)

</Column>


</Row>

:::

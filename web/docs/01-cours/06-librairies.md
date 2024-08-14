---
title: Librairies externes
description: Librairies externes
hide_table_of_contents: true
---

# Kotlin et librairies tierces

## Contenu

- Demo de MavenRepository: librairie, version et pom.xml
- Librairies Java dans Kotlin (bcp de librairies en Java)
- 100% interoperability
- Exemple de recherche de librairie : exemple de [https://square.github.io](https://square.github.io)

<Row>

<Column>

:::danger Avant la séance (2h)

Il existe des milliers de librairies Java pour faire presque tout qui fonctionnent généralement bien. De nombreuses compagnies tech comme Google Twitter ou Square partagent leur librairies.

:::

</Column>

<Column>

:::tip Vidéos

Pas de vidéos cette semaine

:::

</Column>

<Column>

:::info À faire pendant la séance

- Compléter les exercices de la semaine
- **Continuer le [premier travail](../tp/tp1)**

:::

</Column>

</Row>

:::note Exercices

### Exercice Jsoup

Vous devez écrire un petit programme qui prend une url en paramètre, qui télécharge la page web correspondant, puis qui extrait toutes les balises *a* de la page et affiche leur attribut href.

Par exemple, si la page contient

```html
<a href="pipo.html">test</a>
```

le programme devra afficher `test = pipo.html` dans la console.

### Exercice Validation d'un courriel valide

Petite recherche, tu dois trouver une librairie qui valide si un courriel est valide. Écris un petit programme avec un main pour voir si la méthode fournie par la librairie fonctionne sur les exemples suivants:

- Ok : jo@pipo.org
- Ok : ma_mu@m.ca
- Ok : a.a@a.ca
- Ko : a.a@a.aa
- Ko : ab@ab
- Ko : a.b@ab
- Ko : jo

### Exercice ArrayList LinkedList et GapList (externe)

On veut comparer les performances de plusieurs implémentations de List quand on parle de performance pour l'insertion.
On souhaite comparer le temps d'exécution nécessaire pour:

- ajouter 100 000 éléments en dernière position dans la liste
- ajouter 100 000 éléments en première position dans la liste
- ajouter 100 000 éléments dans une position au hasard dans la liste

Pour permettre de tester plusieurs listes, on vous recommande de créer une méthode

```java
void testeCetteListe(List<Integer> liste){
    Random random = new Random(1234);
    long a = System.currentTimeMillis();
    // ajouter 100 000 elements en dernière position liste.add(nombre);
    long b = System.currentTimeMillis();
    // ajouter 100 000 elements en première position liste.add(0, nombre);
    long c = System.currentTimeMillis();
    // ajouter 100 000 elements position au hasard liste.add(random.nextInt(liste.size() + 1), nombre);
    long d = System.currentTimeMillis();
    // afficher b-a, c-b, d-c qui sont les durées d'exécution en millisecondes
}
```

Le but est de voir quelle liste est la plus performante entre LinkedList, ArrayList et une dernière que vous trouverez dans la librairie suivante [GapList](http://www.magicwerk.org/page-collections-download.html).

Du coup avec un *main* qui appelle la méthode testeCetteListe pour une LinkedList puis une ArrayList puis une GapList, vous aurez une bonne idée des performances respectives.

:::

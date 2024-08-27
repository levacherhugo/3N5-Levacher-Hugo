b=0.3
z=1+1*0.3

Résultat:

1-Println i=1 j=1 k=1

2-println i=1 j=1 k=2

3-println i=1 j=2 k=1

4-println i=1 j=2 k=2

1-b/k.length = 0.3/3=0.1

2-b/k.length = 0.3/3=0.1

3-b/k.length = 0.3/0=erreur

4-b/k.length = 0.3/0=erreur

Il y aura probablement une erreur, car il est impossible de diviser par 0.

Retour:
Le Lenght de k etait 4 à cause de l'espace au debut de " pif" et b ne donne pas 0.3 mais 0.30000...0004.

Une division par 0 ne donne pas d'erreur mais donne "Infinity".

b/k.length = 0.75000...0001 ou "Infinity"
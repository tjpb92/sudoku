## Objectif

Faire un programme qui génère des grilles selon un niveau donné et qui résoud une grille.

## Utilisation

- sudoku -g -l level -api api

Gènere un grille de niveau level dans le fichier grid.json.
Il est assez difficile de générer une grille de Sudoku a solution unique sans 
solveur initial. Ce qui représente un temps de développement non négligeable.

Le nombre de grilles étant fini, il est plus simple d'interrogrer Internet via 
une API libre pour obtenir une grille d'une difficulté données.
On prévoira de permettre le choix de différentes API.

Dans l'immédiat, on commence avec [Sugoku](https://github.com/bertoort/sugoku)
Les valeurs reconnues pour le niveau sont :
- 1 : easy
- 2 : medium
- 3 : hard
- 4 : random
Les objets relatifs aux APIs sont rangés dans des packages portant leur nom, 
exemple : sugoku

- sudoku -s grid.json

Résoud la grille définie dans le fichier grid.json (ou autre).

- sudoku -t

Liste les meilleurs scores.

- sudoku -h

Liste les modalités d'utilisation du programme.

- sudoku -p -l level

Résoudre une ou plusieurs grilles à la main.

## Le format d'échange des grilles et des résultats 

Les grilles et les résultats sont exportées au format json.

## Les niveaux de difficulté

### Le niveau Facile ou 1

Nombre de valeurs par case :

- Minimum : 3
- Maximum : 7
### Le niveau Moyen ou 2

Nombre de valeurs par case :

- Minimum : 0
- Maximum : 6
### Le niveau Difficile ou 3

Nombre de valeurs par case :

- Minimum : 1 
- Maximum : 5
### Le niveau Expert ou 4

Nombre de valeurs par case :

- Minimum : ?
- Maximum : ?

### Le niveau Diabolique ou 5

Nombre de valeurs par case :

- Minimum : ?
- Maximum : ?

# Références
[Sudoku](https://fr.wikipedia.org/wiki/Sudoku)
[Hodoku](https://hodoku.sourceforge.net/en/index.php)
[Création d'un solveur et d'un créateur de sudoku](https://marioncandau.fr/Documents/rapport.pdf)
[Générateur de Sudoku](https://portaileduc.net/website/generateur-de-sudoku/)
[Sugoku](https://github.com/bertoort/sugoku)

### Annexes 
##### Format fichier json pour les grilles 
```
{
"name":"name",
  "grid":[
  ]
}
```
##### Format fichier json pour les résultats
```
{
"title":"title",
"ranks":[
{level:n, duration:54, errors:0},
{},
...
]
}
```




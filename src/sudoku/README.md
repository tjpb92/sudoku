## Objectif

Faire un programme qui génère des grilles selon un niveau donné et qui résoud une grille.

## Utilisation

- sudoku -g -l level

Gènere un grille de niveau level dans le fichier grid.json

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




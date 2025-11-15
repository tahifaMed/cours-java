# Exercice 1 : Template Method - Traitement de Fichiers

## Objectif

Implémenter le Template Method Pattern pour traiter différents types de fichiers.

## Contexte

Vous devez créer un système de traitement de fichiers où la structure (charger, parser, valider, sauvegarder) est commune mais le parsing et la validation varient selon le type de fichier.

## À Faire

1. Créer `FileProcessor` (classe abstraite) avec :
   - `processFile(String)` comme template method
   - `loadFile()` et `saveResult()` comme méthodes communes
   - `parseContent()` et `validateContent()` comme méthodes abstraites
2. Implémenter `CSVFileProcessor` et `JSONFileProcessor`

## Points Importants

- Template method définit le squelette
- Steps communs et abstraits séparés
- Chaque processeur définit ses propres parsing/validation

## Notes

- Pattern classique dans Spring (Template classes)
- Évite la duplication
- Structure fixe, implémentation variable

## Résultat Attendu

```
Traitement CSV:
Chargement du fichier: ...
Parsing CSV: Name,Age Alice,30 Bob,25
Validation CSV réussie
Sauvegarde du résultat CSV

Traitement JSON:
Chargement du fichier: ...
Parsing JSON: {"name":"Alice","age":30}
Validation JSON réussie
Sauvegarde du résultat JSON
```


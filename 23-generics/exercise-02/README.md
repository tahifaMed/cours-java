# Exercice 2 : Utiliser des Wildcards

## Objectif

Comprendre les wildcards (? extends et ? super) pour travailler avec des types génériques de manière plus flexible.

## Instructions

1. Créez une hiérarchie de classes (ex: Animal, Chien, Chat)
2. Créez une classe générique qui utilise des wildcards
3. Testez avec ? extends (upper bounded)
4. Testez avec ? super (lower bounded)

## À Faire

- Créer une classe Animal et des sous-classes Chien et Chat
- Créer une méthode qui accepte List<? extends Animal>
- Créer une méthode qui accepte List<? super Chien>
- Tester les méthodes avec différentes listes
- Comprendre les différences entre extends et super

## Notes

- ? extends T : accepte T et ses sous-types (upper bounded)
- ? super T : accepte T et ses super-types (lower bounded)
- ? : wildcard non borné (accepte n'importe quel type)
- extends permet la lecture (get), super permet l'écriture (add)
- PECS : Producer Extends, Consumer Super

## Résultat Attendu

```
Animaux dans la liste :
Chien aboie
Chat miaule
Peut ajouter un Chien à la liste
Liste après ajout : [Chien aboie, Nouveau chien]
```


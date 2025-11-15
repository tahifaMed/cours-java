# Exercice 1 : Utiliser les Annotations Intégrées

## Objectif

Apprendre à utiliser les annotations intégrées de Java : @Override, @Deprecated, @SuppressWarnings.

## Instructions

1. Utilisez @Override pour redéfinir une méthode
2. Utilisez @Deprecated pour marquer une méthode comme obsolète
3. Utilisez @SuppressWarnings pour supprimer des avertissements du compilateur
4. Observez le comportement de ces annotations

## À Faire

- Créer une classe qui étend une autre classe
- Redéfinir une méthode avec @Override
- Marquer une méthode avec @Deprecated
- Utiliser @SuppressWarnings("unused") pour supprimer un avertissement
- Afficher un message pour montrer l'utilisation

## Notes

- @Override : indique que la méthode redéfinit une méthode de la classe parente
- @Deprecated : marque un élément comme obsolète, génère un avertissement si utilisé
- @SuppressWarnings : supprime des avertissements spécifiques du compilateur
- Les annotations sont des métadonnées ajoutées au code
- Le compilateur et les outils utilisent ces annotations

## Résultat Attendu

```
Méthode redéfinie avec @Override
Méthode dépréciée appelée
Variable non utilisée (avertissement supprimé)
```


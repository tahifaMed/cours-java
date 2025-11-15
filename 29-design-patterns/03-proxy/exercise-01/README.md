# Exercice 1 : Virtual Proxy - Lazy Loading d'Images

## Objectif

Implémenter un Virtual Proxy pour charger des images de manière différée (lazy loading).

## Contexte

Vous devez créer un système de gestion d'images où le chargement d'une image est coûteux. Le proxy doit différer ce chargement jusqu'à ce que l'image soit réellement affichée pour la première fois.

## À Faire

1. Créer l'interface `Image` avec une méthode `afficher()`
2. Créer `RealImage` qui :
   - Charge l'image depuis le disque dans le constructeur
   - Affiche "Chargement de [nom] depuis le disque..."
   - Affiche l'image quand `afficher()` est appelé
3. Créer `ImageProxy` qui :
   - Stocke juste le nom de l'image (pas encore chargée)
   - Crée le `RealImage` seulement à la première utilisation
   - Délègue les appels suivants au `RealImage` créé

## Points Importants

- RealImage se charge dans son constructeur
- ProxyImage diffère la création du RealImage
- Première call à afficher() déclenche le chargement
- Appels suivants utilisent l'instance déjà chargée

## Notes

- Virtual Proxy améliore les performances
- Économie de mémoire si l'image n'est jamais affichée
- Pattern commun pour les ressources coûteuses

## Résultat Attendu

```
Création du proxy pour: photo1.jpg
Création du proxy pour: photo2.jpg
Affichage de photo1.jpg...
Chargement de photo1.jpg depuis le disque
Affichage: photo1.jpg

Affichage de photo2.jpg...
Chargement de photo2.jpg depuis le disque
Affichage: photo2.jpg

Affichage de photo1.jpg...
Affichage: photo1.jpg
```

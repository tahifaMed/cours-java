# Kata : Système de Gestion de Bibliothèque

## 🎯 Objectif

Ce kata vous permet de mettre en pratique **tous les concepts Java** que vous avez appris dans ce cours en construisant un système complet de gestion de bibliothèque. Vous allez créer une application qui gère des livres, des membres, des emprunts et des statistiques.

## 📚 Scénario

Vous êtes développeur et devez créer un système de gestion de bibliothèque pour une bibliothèque municipale. Le système doit permettre de :

- Gérer un catalogue de livres (ajout, recherche, suppression)
- Gérer les membres de la bibliothèque
- Gérer les emprunts de livres
- Calculer des statistiques sur les emprunts
- Gérer les retours de livres avec calcul automatique des retards

## 🏗️ Fonctionnalités à Implémenter

### Phase 1 : Modélisation de Base

#### 1.1 Gestion des Genres de Livres
Créez un système pour catégoriser les livres par genre. Les genres doivent inclure au minimum : ROMAN, SCIENCE_FICTION, HISTOIRE, BIOGRAPHIE, POESIE, DOCUMENTAIRE. Chaque genre doit avoir une description associée.

#### 1.2 Gestion du Statut des Emprunts
Créez un système pour suivre le statut d'un emprunt. Les statuts doivent inclure : EN_COURS, RETOURNE, RETARDE.

#### 1.3 Gestion des Livres
Le système doit pouvoir :
- Représenter un livre avec un identifiant unique (ISBN)
- Stocker les informations essentielles d'un livre (titre, auteur, genre, année de publication)
- Suivre si un livre est disponible pour emprunt ou non
- Comparer deux livres pour vérifier s'ils sont identiques (basé sur l'ISBN)
- Afficher les informations d'un livre de manière lisible

#### 1.4 Gestion des Membres
Le système doit pouvoir :
- Représenter un membre avec un numéro unique
- Stocker les informations d'un membre (nom, prénom, email, date d'inscription)
- Comparer deux membres pour vérifier s'ils sont identiques (basé sur le numéro de membre)
- Afficher les informations d'un membre de manière lisible

#### 1.5 Gestion des Emprunts
Le système doit pouvoir :
- Créer un emprunt associant un livre à un membre
- Enregistrer la date d'emprunt
- Calculer automatiquement la date de retour prévue (14 jours après l'emprunt)
- Suivre la date de retour réelle (null si pas encore retourné)
- Calculer le nombre de jours de retard si le livre n'est pas retourné à temps
- Déterminer si un emprunt est en retard
- Suivre le statut de l'emprunt

### Phase 2 : Interfaces et Polymorphisme

#### 2.1 Système d'Emprunt
Créez une interface qui définit le contrat pour les objets qui peuvent être empruntés. Cette interface doit permettre de :
- Vérifier si l'objet peut être emprunté
- Marquer l'objet comme emprunté
- Marquer l'objet comme disponible

Les livres doivent implémenter cette interface.

#### 2.2 Système de Recherche
Créez une interface qui définit le contrat pour les objets qui peuvent être recherchés. Cette interface doit permettre de vérifier si un objet correspond à un critère de recherche donné.

Les livres et les membres doivent implémenter cette interface.

### Phase 3 : Gestion des Collections

#### 3.1 Classe Principale de Gestion
Créez une classe principale qui gère toute la bibliothèque. Cette classe doit :

**Gestion du Catalogue de Livres :**
- Ajouter un livre au catalogue
- Rechercher un livre par son identifiant unique (utilisez Optional pour gérer le cas où le livre n'existe pas)
- Rechercher des livres par titre (utilisez Stream API pour filtrer)
- Rechercher des livres par auteur (utilisez Stream API)
- Rechercher des livres par genre (utilisez Stream API)
- Supprimer un livre du catalogue

**Gestion des Membres :**
- Ajouter un membre à la bibliothèque
- Rechercher un membre par son numéro unique (utilisez Optional)
- Rechercher des membres par nom (utilisez Stream API)

**Gestion des Emprunts :**
- Créer un emprunt (associer un livre à un membre)
  - Vérifier que le livre existe et est disponible
  - Vérifier que le membre existe
  - Gérer les erreurs avec des exceptions personnalisées si l'emprunt n'est pas possible
- Retourner un livre (mettre fin à un emprunt)
  - Mettre à jour la date de retour réelle
  - Changer le statut de l'emprunt
  - Rendre le livre disponible à nouveau
- Obtenir la liste de tous les emprunts actifs
- Obtenir la liste des emprunts en retard (utilisez Stream API pour filtrer)

### Phase 4 : Gestion des Erreurs

#### 4.1 Exceptions Personnalisées
Créez des exceptions personnalisées pour gérer les cas d'erreur :
- Quand un livre n'est pas trouvé dans le catalogue
- Quand un livre n'est pas disponible pour emprunt
- Quand un membre n'est pas trouvé
- Quand un emprunt ne peut pas être effectué (pour diverses raisons)

Ces exceptions doivent être utilisées dans les méthodes de gestion des emprunts pour signaler les problèmes.

### Phase 5 : Statistiques et Analyses

#### 5.1 Méthodes de Statistiques
Ajoutez des méthodes pour calculer des statistiques sur la bibliothèque (utilisez Stream API) :

- Compter le nombre total de livres dans le catalogue
- Compter le nombre de livres disponibles
- Compter le nombre total de membres
- Compter le nombre d'emprunts actifs
- Obtenir des statistiques par genre (combien de livres de chaque genre)
- Trouver les livres les plus empruntés (top N)
- Calculer la durée moyenne des emprunts (pour les emprunts déjà retournés)
- Trouver les membres qui ont des emprunts en retard

### Phase 6 : Application Principale

#### 6.1 Classe d'Application
Créez une classe principale avec une méthode `main` qui démontre toutes les fonctionnalités :
1. Créer une instance de la bibliothèque
2. Ajouter plusieurs livres de différents genres
3. Ajouter plusieurs membres
4. Effectuer plusieurs emprunts
5. Afficher diverses statistiques
6. Simuler quelques retours de livres
7. Afficher les emprunts en retard
8. Tester les différentes fonctionnalités de recherche

## 📋 Checklist de Vérification

Vérifiez que vous avez utilisé :

- ✅ **Classes et Objets** : Création de classes pour représenter les entités du système
- ✅ **Encapsulation** : Utilisation de modificateurs d'accès appropriés (private, public)
- ✅ **Héritage** : Utilisation de `extends` pour créer des hiérarchies (ex: exceptions)
- ✅ **Interfaces** : Création et implémentation d'interfaces pour définir des contrats
- ✅ **Polymorphisme** : Utilisation des interfaces pour traiter différents objets de manière uniforme
- ✅ **Enums** : Utilisation d'enums pour représenter des ensembles de valeurs fixes
- ✅ **Collections** : Utilisation de `List` et `Map` pour stocker les données
- ✅ **Stream API** : Utilisation de `filter`, `map`, `collect`, `groupingBy`, `count`, `reduce`, etc.
- ✅ **Optional** : Utilisation d'Optional pour gérer les valeurs qui peuvent être absentes
- ✅ **Lambda Expressions** : Utilisation de lambdas dans les Stream API
- ✅ **Exceptions** : Création et gestion d'exceptions personnalisées
- ✅ **Date-Time API** : Utilisation de `LocalDate` pour gérer les dates
- ✅ **Génériques** : Utilisation de génériques dans les collections
- ✅ **Méthodes equals/hashCode** : Redéfinition pour permettre la comparaison et l'utilisation dans les collections

## 🎓 Conseils

1. **Commencez par identifier les entités principales** : Quelles sont les classes principales dont vous avez besoin ?
2. **Pensez aux relations** : Comment les livres, membres et emprunts sont-ils liés ?
3. **Testez chaque fonctionnalité** avant de passer à la suivante
4. **Utilisez des données de test variées** pour tester tous les cas
5. **Gérez les cas limites** : que se passe-t-il si un livre n'existe pas ? Si un membre n'existe pas ?
6. **Documentez votre code** avec des commentaires clairs

## 📝 Exemple d'Utilisation Attendu

Votre système devrait permettre d'utiliser le code suivant (adaptez selon votre modélisation) :

```java
Bibliotheque bibliotheque = new Bibliotheque();

// Ajouter des livres
Livre livre1 = new Livre(...); // Créez votre constructeur
bibliotheque.ajouterLivre(livre1);

// Ajouter un membre
Membre membre1 = new Membre(...); // Créez votre constructeur
bibliotheque.ajouterMembre(membre1);

// Emprunter un livre
try {
    Emprunt emprunt = bibliotheque.emprunterLivre(isbn, numeroMembre);
    System.out.println("Emprunt créé : " + emprunt);
} catch (EmpruntImpossibleException e) {
    System.out.println("Erreur : " + e.getMessage());
}

// Afficher les statistiques
System.out.println("Livres disponibles : " + bibliotheque.nombreLivresDisponibles());
System.out.println("Emprunts actifs : " + bibliotheque.nombreEmpruntsActifs());
```

## 🚀 Défi Bonus (Optionnel)

Si vous voulez aller plus loin :

1. Ajoutez un système de **pénalités** pour les retards (calcul automatique des frais)
2. Implémentez une **classe abstraite** pour représenter différents types de documents (livres, magazines, etc.)
3. Ajoutez un système de **recherche avancée** avec plusieurs critères combinés
4. Créez une **interface pour exporter** les données en format texte
5. Utilisez **try-with-resources** si vous ajoutez la gestion de fichiers
6. Ajoutez un système de **réservation** pour les livres actuellement empruntés

## 📚 Concepts Pratiqués

Ce kata vous permet de pratiquer :
- Programmation Orientée Objet (POO)
- Encapsulation et abstraction
- Héritage et polymorphisme
- Interfaces et contrats
- Collections Java
- Stream API et programmation fonctionnelle
- Gestion d'exceptions
- API Date-Time
- Optional pour gérer les valeurs nulles
- Génériques
- Enums

Bon courage et amusez-vous bien ! 🎉

# 29 - Design Patterns

## Vue d'Ensemble

Les design patterns (ou patrons de conception) sont des solutions réutilisables à des problèmes courants de conception logicielle. Ils représentent des modèles éprouvés utilisés pour résoudre des problèmes spécifiques de manière élégante et maintenable.

## Pourquoi Apprendre les Design Patterns ?

1. **Solutions éprouvées** : Ce sont des solutions testées et validées par la communauté développeurs
2. **Langage commun** : Permet de communiquer efficacement entre développeurs
3. **Code maintenable** : Facilite la maintenance et l'évolutivité du code
4. **Compréhension des frameworks** : Les frameworks modernes comme Spring utilisent intensivement ces patterns
5. **Meilleure architecture** : Aide à concevoir des applications robustes et scalables

## Design Patterns et Spring Framework

Spring Framework s'appuie massivement sur les design patterns pour fournir ses fonctionnalités :

- **Singleton** : Gestion du cycle de vie des beans Spring
- **Factory** : BeanFactory et ApplicationContext pour créer les beans
- **Proxy** : AOP (Aspect-Oriented Programming) et lazy loading
- **Dependency Injection** : Cœur du framework Spring
- **Template Method** : JdbcTemplate, RestTemplate, TransactionTemplate
- **Observer** : Système d'événements Spring (@EventListener, ApplicationEvent)

## Design Patterns Couverts

Ce module couvre 6 patterns essentiels utilisés dans Spring Framework :

### 1. Singleton Pattern (`01-singleton/`)
Assure qu'une classe n'a qu'une seule instance et fournit un point d'accès global à cette instance.

**Dans Spring** : Les beans par défaut sont des singletons (une instance par conteneur)

### 2. Factory Pattern (`02-factory/`)
Fournit une interface pour créer des objets sans spécifier exactement leur classe.

**Dans Spring** : BeanFactory crée et gère les beans

### 3. Proxy Pattern (`03-proxy/`)
Fournit un substitut ou un placeholder pour contrôler l'accès à un objet.

**Dans Spring** : AOP utilise des proxies pour ajouter des fonctionnalités transversales

### 4. Dependency Injection Pattern (`04-dependency-injection/`)
Permet d'inverser le contrôle en injectant les dépendances plutôt que de les créer.

**Dans Spring** : C'est le mécanisme fondamental du framework via @Autowired, @Inject

### 5. Template Method Pattern (`05-template-method/`)
Définit le squelette d'un algorithme dans une classe de base, permettant aux sous-classes de redéfinir certaines étapes.

**Dans Spring** : JdbcTemplate, RestTemplate encapsulent le code boilerplate

### 6. Observer Pattern (`06-observer/`)
Définit une dépendance un-à-plusieurs entre objets pour notifier automatiquement les observateurs lors de changements d'état.

**Dans Spring** : ApplicationEvent et ApplicationListener

## Catégories de Design Patterns

Les patterns sont traditionnellement classés en trois catégories :

1. **Créationnels** : Singleton, Factory
2. **Structurels** : Proxy, Adapter, Decorator
3. **Comportementaux** : Observer, Template Method, Strategy

## Prérequis

- Sujet 09 : Héritage
- Sujet 10 : Interfaces
- Sujet 11 : Classes abstraites
- Bonne compréhension de la POO en Java

## Comment Utiliser Ce Module

1. **Commencez par le README de chaque pattern** : Lisez d'abord la théorie et les exemples
2. **Regardez les diagrammes** : Les diagrammes Mermaid aident à visualiser la structure
3. **Faites les exercices dans l'ordre** : Les exercices progressent de la théorie à la pratique
4. **Comparez avec les solutions** : Utilisez le dossier solutions/ pour vérifier votre travail
5. **Expérimentez** : Modifiez le code, ajoutez vos propres features

## Exercices

Chaque pattern contient 3 exercices progressifs :

- **Exercise-01** : Implémentation de base du pattern
- **Exercise-02** : Scénario intermédiaire avec cas d'usage réaliste
- **Exercise-03** : Cas avancé ou combinaison avec d'autres patterns

## Ressources

- [Design Patterns - Gang of Four](https://en.wikipedia.org/wiki/Design_Patterns)
- [Spring Framework Documentation](https://spring.io/docs)
- [SourceMaking - Design Patterns](https://sourcemaking.com/design_patterns)

## À Retenir

- Les patterns ne sont pas des solutions universelles : ils doivent être choisis selon le contexte
- Privilégiez la clarté et la simplicité : un code simple est souvent meilleur qu'un pattern complexe mal utilisé
- Connaître les patterns aide à comprendre les frameworks existants
- La pratique est essentielle : faites les exercices régulièrement

---

**Note** : Ce module utilise Mermaid pour les diagrammes. Assurez-vous d'utiliser un visualiseur Markdown qui supporte Mermaid (comme GitHub, VS Code avec extension, etc.)

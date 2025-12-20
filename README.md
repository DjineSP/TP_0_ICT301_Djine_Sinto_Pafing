# TP 0 – ICT301 : Principes SOLID

- **Nom** : DJINE  
- **Prénoms** : SINTO PAFING
- **Matricule** : 23U2292

---

## Travail fait

Chaque principe est illustré par :
- un exemple **avant refactoring** (violation du principe)
- un exemple **après refactoring** (application correcte du principe)

---

## 1. SRP – Single Responsibility Principle
Le principe de responsabilité unique stipule qu’une classe ne doit avoir **qu’une seule responsabilité**, c’est-à-dire **une seule raison de changer**.

Dans l’exemple étudié, une même classe gérait à la fois les données, l’affichage, la persistance et la logique métier, ce qui viole le SRP.  
La solution consiste à **séparer ces responsabilités** dans des classes distinctes, rendant le code plus lisible, maintenable et évolutif.

---

## 2. OCP – Open/Closed Principle
Le principe Open/Closed affirme qu’une classe doit être **ouverte à l’extension** mais **fermée à la modification**.

Dans l’exemple du calcul d’aire, l’utilisation de conditions (`instanceof`) obligeait à modifier la classe à chaque nouvelle forme géométrique.  
Le refactoring introduit une **interface**, permettant d’ajouter de nouvelles formes sans modifier le code existant, uniquement par extension.

---

## 3. LSP – Liskov Substitution Principle
Le principe de substitution de Liskov stipule qu’une **sous-classe doit pouvoir remplacer sa classe mère sans altérer le comportement du programme**.

L’exemple du carré héritant du rectangle viole ce principe, car le comportement attendu du rectangle n’est plus respecté.  
La solution consiste à utiliser une **abstraction commune**, garantissant que chaque classe respecte son propre contrat.

---

## 4. ISP – Interface Segregation Principle
Le principe de ségrégation des interfaces recommande de **préférer plusieurs petites interfaces spécialisées** plutôt qu’une interface générale trop large.

Dans l’exemple, une interface imposait à un robot d’implémenter une méthode qu’il n’utilise pas.  
Le refactoring sépare les interfaces selon les responsabilités réelles, évitant ainsi les dépendances inutiles.

---

## 5. DIP – Dependency Inversion Principle
Le principe d’inversion des dépendances indique que les **modules de haut niveau ne doivent pas dépendre des modules de bas niveau**, mais des **abstractions**.

Dans l’exemple étudié, une classe métier dépendait directement d’une base de données concrète.  
La solution introduit une interface, ce qui réduit le couplage, facilite les tests et permet de changer l’implémentation sans modifier la logique métier.

---

## Conclusion
Les principes SOLID constituent une base essentielle pour la conception logicielle orientée objet.  
Leur application permet de produire des applications plus flexibles, évolutives et faciles à maintenir, tout en réduisant les risques d’erreurs lors des évolutions futures.

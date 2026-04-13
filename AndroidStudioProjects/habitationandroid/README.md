# 📱 HabittionAndroid

> Application Android — Calculateur d’impôts locaux : Saisie, traitement et affichage


## Description

HabittionAndroid est une application Android simple permettant de calculer une taxe locale basée sur :
la surface du logement (en m²)/le nombre de pièces /la présence ou non d’une piscine..
L’objectif est de fournir un résultat rapide et clair à l’utilisateur.

---

##  Fonctionnalités

* Saisie de la surface
* Saisie du nombre de pièces
* Option "Piscine" (CheckBox)
* Calcul automatique de la taxe
* Affichage du résultat en DH
* Vérification des champs (message Toast si vide)

---

## Formule de calcul

```text
Taxe = (surface × 2) + (pièces × 50) + (100 si piscine)
```

---

## Structure du projet

### 🔹 MainActivity.java

Contient :

* La récupération des données utilisateur
* La validation des champs
* Le calcul de la taxe
* L’affichage du résultat

### 🔹 activity_main.xml

Contient l’interface utilisateur :

* 2 champs de saisie (surface, pièces)
* 1 checkbox (piscine)
* 1 bouton (calculer)
* 1 zone d’affichage du résultat

---

##  Utilisation

1. Lancer l’application
2. Entrer la surface en m²
3. Entrer le nombre de pièces
4. Cocher "Piscine" si applicable
5. Cliquer sur "calculer"
6. Voir le résultat affiché


---

## Réalisé PAR
NAFTAOUI NIAMA

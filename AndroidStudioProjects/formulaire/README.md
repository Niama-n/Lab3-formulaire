# 🚀Formulaire — Formulaire et navigation entre activités

> **LAB 3 — Programmation Mobile : Android avec Java** 
> Formulaire et navigation entre activités
---
 Vidéo de démonstration
Vous pouvez visualiser le test de l'application ici :
---

https://github.com/user-attachments/assets/3c639be9-9ad8-4b3a-a7a7-07c8b6236c9c




---
## Structure du projet

```
formulaire/
├── app/src/main/
│   ├── java/com/example//formulaire
│   │   ├── MainActivity.java         # Écran 1 : Formulaire
│   │   └── Screen2Activity.java      # Écran 2 : Récapitulatif
│   ├── res/layout/
│   │   ├── activity_main.xml         # UI du formulaire
│   │   └── activity_screen2.xml      # UI du récapitulatif
│   └── AndroidManifest.xml           # Déclaration des activités
```


##   Stack technique️
- **Langage** : Java
- **Plateforme** : Android (Min SDK 24+)
- **IDE** : Android Studio
- **UI** : XML Layouts (ScrollView, LinearLayout, EditText, Button, TextView)
- **Navigation** : Intent explicite + putExtra / getStringExtra


---

##  Ce que fait l'application

- ✅ Formulaire avec 5 champs : **Nom**, **Email**, **Téléphone**, **Adresse**, **Ville**
- ✅ Validation des champs obligatoires avec message d'erreur inline
- ✅ Navigation vers l'écran de récapitulatif via **Intent explicite**
- ✅ Transmission des données entre activités via **putExtra / getStringExtra**
- ✅ Affichage du récapitulatif avec gestion des champs vides
- ✅ Bouton **Retour** pour revenir au formulaire via `finish()`

---

## Lancer le projet

1. Clone le dépôt :
   ```bash
   git clone https://github.com/Niama-n/Lab3-formulaire.git
   ```
2. Ouvre le projet dans **Android Studio**
3. Attends la synchronisation Gradle
4. Lance sur un émulateur ou appareil réel (**Min SDK 24**)

---

## Concepts appris

| Concept | Description |
|---|---|
| `EditText` | Champ de saisie avec clavier adapté (`inputType`) |
| `Intent explicite` | Navigation ciblée vers une activité précise |
| `putExtra` | Envoi de données clé/valeur entre activités |
| `getStringExtra` | Réception des données dans l'activité cible |
| `setError()` | Affichage d'erreur directement sur le champ |
| `finish()` | Fermeture de l'activité courante |
| `AndroidManifest` | Déclaration obligatoire de toutes les activités |

---

## Explications des fichiers

### `MainActivity.java`
- Lie les vues XML via `findViewById`
- Écoute le clic du bouton `btnSoumettre`
- Valide les champs (Nom, Email, Téléphone obligatoires)
- Construit et lance un `Intent` vers `Screen2Activity` avec les données

### `Screen2Activity.java`
- Récupère l'`Intent` via `getIntent()`
- Extrait les données avec `getStringExtra("KEY_...")`
- Affiche le récapitulatif dans un `TextView`
- Gère les valeurs vides avec la méthode `verifier()`

### `activity_main.xml`
- `ScrollView` pour le défilement sur petits écrans
- `LinearLayout` vertical pour empiler les champs
- 5 `EditText` avec `inputType` adapté à chaque donnée

### `activity_screen2.xml`
- `LinearLayout` vertical simple
- `TextView#recap` rempli dynamiquement par le code Java
- Bouton retour pour fermer l'écran

---

## 👨‍💻 Auteure

**NAFTAOUI NIAMA**  
 

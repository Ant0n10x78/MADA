# MADA

## Introduction

L'objectif du projet est de fournir une plateforme de développement sécurisée pour des équipes distantes.


## WARNING - Mise en production

Avant toute mise en production il est nécessaire de modifier les mots de passe par défaut.


Se connecter en cli sur le conteneur
```
docker exec -it gitlab bash
```

Démarrer gitlab-rails
```
gitlab-rails console
```
Redéfinir le mot de passe
```
user = User.find_by_username('root')
user.password = 'NouveauMotDePasse123'
user.password_confirmation = 'NouveauMotDePasse123'
user.save!
```

# MADA

## Define root password on gitlab

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

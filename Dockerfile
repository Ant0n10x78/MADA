FROM jenkins/jenkins:lts

# Pré-installation des plugins via script (facultatif mais pratique)
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN jenkins-plugin-cli --plugin-file /usr/share/jenkins/ref/plugins.txt

# (Optionnel) Copier un fichier de config LDAP ou init groovy
#COPY init.groovy.d/ /usr/share/jenkins/ref/init.groovy.d/

# Exposition du port Jenkins
EXPOSE 8080
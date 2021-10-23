# Test Maison
Pour utiliser ce projet il faut avoir au minimum java 8 et maven installé sur votre machine.

## Installation
Générer un fichier jar de projet avec la commande :
```
mvn clean install
```
Pour exécuter l'application, dans le dossier Target exécuter la commande:
```
java -jar testmaison-0.0.1-SNAPSHOT.jar
```
On teste une liste avec les nombres `1, 2, 3, 4, 5, 6, 7`, partitionné vers des sous-listes de 3 nombres au maximum.
Le résultat que vous deviez obtenir `[[1, 2, 3], [4, 5, 6], [7]]`
## Comment utiliser la méthode?
Pour Utiliser la méthode de partition:
```
Partition.partition(liste, taille);
```

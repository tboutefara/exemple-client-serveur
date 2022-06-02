# Projet Client/Serveur : Etape 04

## Description du projet

L'objectif est de créer un système de chat publique (pas de messages
privés) avec authentification. L'objectif pédagogique est :

1. Manipulation de Java : comme la création des Java Beans pour
représenter la couche modèle.
2. Création d'une interface utilisateur Swing.
3. Programmation Réseau en Java : connexion et échange de flux
avec un serveur en utilisant les Sockets.
4. Manipulation des base de données en utilisant JDBC.
5. Programmation Multithreading.

Pour mieux assimiler ces notions, le projet sera présenté en plusieurs
étapes où chaque étape repérsente l'ajout d'une nouvelle fnctionnalité 
ou d'un nouveau aspect.

## Etape 04 :

L'étape 03 nous a permis d'établir une connexion entre le client et 
le serveur pur envoyer un message. Pour cette étape, le message sera
le "pseudo" et le "mot de passe" de l'utilisateur.

Sur reception, le serveur ne se limite pas un seul renvoie, mais, il
procède à la vérification de la présence de l'utilisateur dans la base
de données. Ensuite, il envoie le résultat de l'authentification.

Le pseudo et le mot de passe sont lus  partir du clavier (grâce à 
Scanner).

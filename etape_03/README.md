# Projet Client/Serveur : Etape 03

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

## Etape 03 :

Pour cette étape, nous allons établier une première **Connection réseau**
entre le client et le serveur. Pour cela, on utilise une *ServerSocket*
pour démarrer un serveur et des *Socket*s pour communiquer entre le client 
et le serveur.

La communication se résume en un seul échange de message.

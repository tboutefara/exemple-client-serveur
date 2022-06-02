# Projet Client/Serveur : Etape 05

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

## Etape 05 :

L'étape 05 consiste à créer une classe Thread pour poouvoir 
accpeter plusieurs clients. Par créer une classe Thread dédié à
chaque client, le Thread principal (main) peut déléguer l'échange
(l'envoie et la réception des messages avec le client) avec chaque 
client à un Thread dédié pour se limiter à la réception des requêtes
de connexion.

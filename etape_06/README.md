# Projet Client/Serveur : Etape 06

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
étapes où chaque étape repérsente l'ajout d'une nouvelle fonctionnalité 
ou d'un nouveau aspect.

## Etape 06 :

L'étape 06 consiste ajouter le Thread écouteur côté client. Comme pour 
le sevreur, le thread principal est dédié pour la lecture à partir de
la console, ainsi, un deuxième thread est nécessaire pour écouter
les message en prevenance du serveur.

L'architecture reste inchangée.

# Projet Client/Serveur : Etape 07

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

## Etape 07 :

Pour cette version, l'entrée des message se fait désormais en 
utilisant une interface utilisateur Swing.

L'interface consiste en deux frames :

1. Une fenêtre d'authentification,
2. Une fenêtre de chat.

Il reste quelques détails à fixer. Par exemple, en fermant la fenêtre 
de chat le serveur lève une exception qui n'est pas encore corrigée.

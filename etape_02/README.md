# Projet Client/Serveur : Etape 02

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

## Etape 02 :

Pour cette étape; nous allons ajouter la couche **Accès aux Données**.
Les données des utilisateurs sont stockées dans une base de données
qui contient une seule table (Utilisateur).

La classe AccesBDD offre trois méthodes :

. Pour se connecter à la base de données : cette méthode inialise 
la connexion à la base de données (suivant le design pattern Singleton).
. Pour insérer un nouveau utilisateur.
. Pour vérifier la présence d'un utilisateur dans la base de données.
Vu le besoin de l'authentification, nous n'allons pas ajouter d'autres
méthodes d'interrogation.

Une autre classe du test a été ajoutée. Cela ne respecte pas les normes 
du test unitaire, mais, ce n'est pas notre sujet pour ce projet.

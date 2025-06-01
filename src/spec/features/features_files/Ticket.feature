Feature: je verifier l ajout de ticket
  En tant que utilisateur je souhaite ajouter un ticket
     
     @ticket
     Scenario: je verifier l ajout de ticket
     Given je me connecte sur lapplication proservice
     When je saisi le Email "jawherhajri01@gmail.com" 
     And je sasi le Password "Password@123"
     And je click sur le bouton se connecter
     And je click sur le bouton ajout ticket
     And je choisir une agence apartir de input agence 
     And je choisir un departement
     And je saisie le titre "ticket deux"
     And je saisie le description "description ticket deux"
     And je choisi le responsable
     Then je click sur le bouton creation
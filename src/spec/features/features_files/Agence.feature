Feature: je verifier l ajout de l agence
  En tant que utilisateur je souhaite ajouter un agence
     
     @agence
     Scenario: je verifier l ajout de l agence
       Given je me connecte sur lapplication proservice
     When je saisi le Email "jawherhajri01@gmail.com" 
     And je sasi le Password "Password@123"
     And je click sur le bouton se connecter
     And je navige vers le menu agence
     And je click sur le button ajouter agence
     And ajouter le nom de l agence "proservice agence test 10"
     And je click le button ajouter
     And je click ok 
     Then je me redirige vers la page agences "Success!"
Feature: je verifier l ajout de service
  En tant que utilisateur je souhaite ajouter un service
     
     @service
     Scenario: je verifier l ajout de service
     Given je me connecte sur lapplication proservice
     When je saisi le Email "jawherhajri01@gmail.com" 
     And je sasi le Password "Password@123"
     And je click sur le bouton se connecter
     And je navige vers le menu service
     And je click sur le button ajouter service
     And ajouter le nom de le service "proservice service test 10"
     And je choisir un agence
     And je click le button ajouter service
     And je click ok 
     Then je me redirige vers la page agences "Success!"
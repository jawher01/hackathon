Feature: je verifier l ajout de l departement
  En tant que utilisateur je souhaite ajouter un departement
     
     @departement
     Scenario: je verifier l ajout de l agence
     Given je me connecte sur lapplication proservice
     When je saisi le Email "jawherhajri01@gmail.com" 
     And je sasi le Password "Password@123"
     And je click sur le bouton se connecter
     And je navige vers le menu departement
     And je click sur le button ajouter departement
     And ajouter le nom de le departement "proservice departement abcds"
     And je choisir un agence
     And je click le button ajouter departement
     And je click ok 
     Then je me redirige vers la page agences "Success!"
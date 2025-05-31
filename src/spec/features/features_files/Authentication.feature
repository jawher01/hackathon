Feature: je verifier la page d authentification
  En tant que utilisateur je souhaite m authentifier au site mercury

  @connexion
  Scenario: je verifier la page d authentification
     Given je me connecte sur lapplication proservice
     When je saisi le Email "jawherhajri01@gmail.com" 
     And je sasi le Password "Password@123"
     And je click sur le bouton se connecter
     Then je me redirige vers la page dashboard "https://adiat-front-formation-2-lake.vercel.app/dashboards/default"
   

     

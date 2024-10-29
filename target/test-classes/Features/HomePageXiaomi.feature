#Author: CSI


Feature: Verification Menu HomePageXiaomi
  
  Scenario: Accéder à Maison connectée via le menu
  
    Given Utilisateur  sur la Page dacceuil
    When je survole le MenuHaut "Smart Home" et Cliquer Sur "Maison connectée"
    Then La page est affiché "Maison Connectée"
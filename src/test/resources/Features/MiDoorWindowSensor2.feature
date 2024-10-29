#Author: CSI


Feature: Vérification Produit Maison Connectée
  


  Scenario: Vérifier Produit Page Mi Door Window Sensor II
  
    Given Utilisateur est connécté sur la page Mi Door Window Sensor II
    When Utilisateur clique sur Ajouter Au Panier
    And Utilisateur clique sur Bouton Panier
    Then Vérifier si le produit est dans le panier "Mi Door Window Sensor 2"


 

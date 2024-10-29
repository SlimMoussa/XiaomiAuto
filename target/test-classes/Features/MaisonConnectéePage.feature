#Author: CSI


Feature: Vérification Menu Maison Connectée 

  
  Scenario: Vérifier Produit Menu Maison Connectée 
  
    Given Utilisateur est connécté sur la page maison connectée
    When Utilisateur effectue le tri "Tri par popularité" et clique sur le produit "Mi Smart LED Bulb Essential Lampe"
    Then Redirection vers la page du produit "Mi Smart LED Bulb Essential Lampe"
    
    
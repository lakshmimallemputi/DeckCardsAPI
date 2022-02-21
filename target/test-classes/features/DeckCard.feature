@Card
Feature: Deck Card Feature


 Scenario: : Remaining cards correctly updated after drawing
     Given I Shuffle the cards with 1 deck
     When  I Draw the cards
      And  I return the first drawn card to deck
     When  I Draw the cards
      And  I return the first drawn card to deck
     When  I Draw the cards
      And  I return the first drawn card to deck
     When  I Draw the cards
      And  I return the first drawn card to deck
     When  I Draw the cards
      And  I return the first drawn card to deck
     Then  I validate the remaining number of cards
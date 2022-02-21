$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/DeckCard.feature");
formatter.feature({
  "name": "Deck Card Feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Card"
    }
  ]
});
formatter.scenario({
  "name": ": Remaining cards correctly updated after drawing",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Card"
    }
  ]
});
formatter.step({
  "name": "I Shuffle the cards with 1 deck",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cards.spring.api.bdd.CardDeckSteps.iShuffleTheCardsWithDeck(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Draw the cards",
  "keyword": "When "
});
formatter.match({
  "location": "com.cards.spring.api.bdd.CardDeckSteps.iDrawCards()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I return the first drawn card to deck",
  "keyword": "And "
});
formatter.match({
  "location": "com.cards.spring.api.bdd.CardDeckSteps.iReturnTheFirstDrawnCardToDeck()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Draw the cards",
  "keyword": "When "
});
formatter.match({
  "location": "com.cards.spring.api.bdd.CardDeckSteps.iDrawCards()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I return the first drawn card to deck",
  "keyword": "And "
});
formatter.match({
  "location": "com.cards.spring.api.bdd.CardDeckSteps.iReturnTheFirstDrawnCardToDeck()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Draw the cards",
  "keyword": "When "
});
formatter.match({
  "location": "com.cards.spring.api.bdd.CardDeckSteps.iDrawCards()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I return the first drawn card to deck",
  "keyword": "And "
});
formatter.match({
  "location": "com.cards.spring.api.bdd.CardDeckSteps.iReturnTheFirstDrawnCardToDeck()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Draw the cards",
  "keyword": "When "
});
formatter.match({
  "location": "com.cards.spring.api.bdd.CardDeckSteps.iDrawCards()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I return the first drawn card to deck",
  "keyword": "And "
});
formatter.match({
  "location": "com.cards.spring.api.bdd.CardDeckSteps.iReturnTheFirstDrawnCardToDeck()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Draw the cards",
  "keyword": "When "
});
formatter.match({
  "location": "com.cards.spring.api.bdd.CardDeckSteps.iDrawCards()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I return the first drawn card to deck",
  "keyword": "And "
});
formatter.match({
  "location": "com.cards.spring.api.bdd.CardDeckSteps.iReturnTheFirstDrawnCardToDeck()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the remaining number of cards",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cards.spring.api.bdd.CardDeckSteps.i_can_see_number_of_remaing_cards_as()"
});
formatter.result({
  "status": "passed"
});
});
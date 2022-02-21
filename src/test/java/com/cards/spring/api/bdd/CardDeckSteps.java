package com.cards.spring.api.bdd;

import com.cards.spring.api.service.RestCall;

import com.cards.spring.api.utils.annotation.LazyAutowired;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;



@SpringBootTest
public class CardDeckSteps {

    @LazyAutowired
    private RestCall restCall;
    public String deckId;
    public Integer remainingNumberOfCards;
    public Integer numberOfCardsAfterShuffle;
    public Integer remainingNumberOfCardsBeforeDraw;
    public Integer noOfCardsDrawn = 0;
    private Integer numberOfTimesTheFirstCardReturned = 5;
    public String codeOfFirstDrawnCard;

    @Given("I Shuffle the cards with {int} deck")
    public void iShuffleTheCardsWithDeck(int count) {
        String shuffleResult[] = restCall.shuffleTheCards(count);
        deckId = String.valueOf(shuffleResult[0]);
        numberOfCardsAfterShuffle = Integer.valueOf(shuffleResult[1]);
    }

    @When("I Draw the cards")
    public void iDrawCards() {
        remainingNumberOfCardsBeforeDraw = remainingNumberOfCards;
        String drawCardResult[] = restCall.drawTheCards(deckId);
        remainingNumberOfCards= Integer.parseInt(drawCardResult[1]);
        noOfCardsDrawn  =    noOfCardsDrawn + Integer.parseInt(drawCardResult[0]);
        codeOfFirstDrawnCard = drawCardResult[2];
    }
    @Then("I validate the remaining number of cards")
    public void i_can_see_number_of_remaing_cards_as() {
         int expectedNoOfCardsRemaining=  numberOfCardsAfterShuffle - noOfCardsDrawn + numberOfTimesTheFirstCardReturned;
         int actualNoOfCardsRemaining = remainingNumberOfCards;
         System.out.println("Expected Number Of Cards Remaining: " + expectedNoOfCardsRemaining);
         System.out.println("Actual Number Of Cards Remaining  : " + actualNoOfCardsRemaining);
         Assert.assertEquals( expectedNoOfCardsRemaining, actualNoOfCardsRemaining);
    }

    @And("I return the first drawn card to deck")
    public void iReturnTheFirstDrawnCardToDeck() {
        remainingNumberOfCards = restCall.returnTheCard(deckId,codeOfFirstDrawnCard);
        System.out.println("Count after return from the Deck :" +  remainingNumberOfCards);
    }
}


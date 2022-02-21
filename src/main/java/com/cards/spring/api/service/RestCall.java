package com.cards.spring.api.service;
import com.cards.spring.api.doto.Card;
import com.cards.spring.api.doto.DrawCards;
import com.cards.spring.api.doto.ReturnCards;
import com.cards.spring.api.doto.ShuffleCards;
import com.cards.spring.api.utils.annotation.Page;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.springframework.beans.factory.annotation.Value;

import java.util.Random;

@Page
public  class RestCall  {

    @Value("${base.url}")
    private String url;
    private static ShuffleCards shuffleCardsResponse;
    private static DrawCards drawCardResponse;
    private static Card cardResponse;
    private static ReturnCards returnCardResponse;

    public String deckId;

   public String[]  shuffleTheCards(int count){
        RestAssured.baseURI = url;
        String id ;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.post("/api/deck/new/shuffle/?deck_count=count");
        shuffleCardsResponse = response.getBody().as(ShuffleCards.class);
        id=shuffleCardsResponse.getDeckId();
        int noOfCardsRemaining  =  shuffleCardsResponse.getNoOfRemainingCards();
        System.out.println("Deck Id" + deckId);
        deckId = id;
        return new String[]{deckId, String.valueOf(noOfCardsRemaining)};

    }
    public  String[] drawTheCards( String id){
        RequestSpecification httpRequest = RestAssured.given();
        Random rn = new Random();
        int count = rn.nextInt(5) + 1;
        System.out.println("No of Cards Drawn :" + count);
        String postUrl = "/api/deck/" + id + "/draw/?count=" + count;
        Response response =  httpRequest.get(postUrl);
        drawCardResponse = response.getBody().as(DrawCards.class);
        String codeOfFirstDrawnCard = drawCardResponse.cards.get(0).getCode();
        int noOfCardsRemaining  = drawCardResponse.getRemaining();
        System.out.println("Number Of Cards Remaining after the Draw:" + noOfCardsRemaining);
        return new String[] {String.valueOf(count),String.valueOf(noOfCardsRemaining),codeOfFirstDrawnCard};
    }
    public int returnTheCard(String deckId, String firstReturnCard) {
        RequestSpecification httpRequest = RestAssured.given();
        String postUrl = "/api/deck/" + deckId + "/return/?cards=" + firstReturnCard;
        Response response = httpRequest.get(postUrl);
        returnCardResponse = response.getBody().as(ReturnCards.class);
        int numberOfCardsRemaining = returnCardResponse.getReturnCards();
        return numberOfCardsRemaining;
    }

}
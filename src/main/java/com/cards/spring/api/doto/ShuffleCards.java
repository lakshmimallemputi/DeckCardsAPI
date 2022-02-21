package com.cards.spring.api.doto;

public class ShuffleCards {
    private boolean success;
    private String deck_id;
    private boolean shuffled;
    private int remaining;

    public String getDeckId()
    {
        return deck_id;
    }
    public int getNoOfRemainingCards()
    {
        return remaining;
    }

}

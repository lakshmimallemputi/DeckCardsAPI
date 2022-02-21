package com.cards.spring.api.doto;

import java.util.ArrayList;

public class DrawCards {

    public boolean success;
    public ArrayList<Card> cards;
    public String deck_id;
    public int remaining;

    public int getRemaining()
    {
        return remaining;
    }
    public ArrayList<Card> Cards()
    {
        return cards;
    }
}

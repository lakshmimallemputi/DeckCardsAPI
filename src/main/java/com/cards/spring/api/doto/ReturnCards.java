package com.cards.spring.api.doto;

public class ReturnCards {
    public boolean success;
    public String deck_id;
    public int remaining;

    public int getReturnCards(){
        return remaining;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carddecktest;

/**
 *
 * @author Oktawian
 */
public class Card {
    
    private String rank;
    private String suit;
    
    public Card(){
        this("Blank","Blank");
    }
    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }
    
    String getRank(){
        return rank;
    }
    
    String getSuit(){
        return suit;
    }
    
    String getValue(){
        return rank + " of " + suit + "s";
    }
}

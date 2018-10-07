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
public class CardDeckTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Card cardBlank = new Card();
        Card cardOne = new Card("Ace","Spade");
        Card cardTwo = new Card("King", "Heart");
        
        DeckOfCards deckOfCards = new DeckOfCards();
        
        System.out.println("The cardBlank has rank: " + cardBlank.getRank()
                            + " and suit: " + cardBlank.getSuit());
        System.out.println("The cardOne has rank: " + cardOne.getRank()
                            + " and suit: " + cardOne.getSuit());
        System.out.println("The cardTwo has rank: " + cardTwo.getRank()
                            + " and suit: " + cardTwo.getSuit());
        System.out.println("24th card from deck has rank: "
                            + deckOfCards.getCard(23).getRank()
                            + " and suit: " 
                            + deckOfCards.getCard(23).getSuit());
        
        for (int i = 0; i<52; i++){
            System.out.println(i+1 + " card from deck is " 
                               + deckOfCards.getCard(i).getValue());
        }
        
                            
        
        
    }
    
}

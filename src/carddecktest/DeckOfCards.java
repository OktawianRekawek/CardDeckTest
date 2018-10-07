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
public class DeckOfCards {
    
    private Card [] cards = new Card[52];
    private String[] suit = {"Heart", "Spade", "Club", "Diamond"};
    private String[] rank = {"2","3","4","5","6","7","8","9",
                              "10","Jack","Queen","King","Ace"};
    
    
    
    public DeckOfCards(){
        
        for(int i=0; i<4; i++){
            for(int j=0; j<13; j++){
                cards[i*13+j] = new Card(rank[j], suit[i]);
            }
        }
    }
    
    public Card getCard(int numberOfCard){
        return cards[numberOfCard];
    }
    
    public Card[] getCards(){
        return cards;
    }
    
}

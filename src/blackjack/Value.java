/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author DouglasD
 */
public enum Value {
    ACE(1, 11),
    TWO(2, 2),
    THREE(3, 3),
    FOUR(4, 4),
    FIVE(5, 5),
    SIX(6, 6),
    SEVEN(7, 7),
    EIGHT(8, 8),
    NINE(9, 9),
    TEN(10, 10),
    JACK(10, 10),
    QUEEN(10, 10),
    KING(10, 10);

    private final int FIRSTVALUE;
    private final int SECONDVALUE;

    private Value(int first, int second) {
        this.FIRSTVALUE = first;
        this.SECONDVALUE = second;
    }

    public int getSECONDVALUE() {
        return SECONDVALUE;
    }

    public int getFIRSTVALUE() {
        return FIRSTVALUE;
    }

    

}

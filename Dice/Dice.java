import java.io.*;
import java.math.*;
import java.util.*;
public class Dice {

    private int noOfDice;

    Dice(int noOfDice) {

        this.noOfDice = noOfDice;

    }

    public int rollDice() {

        return ((int) (Math.random() * (6 * noOfDice - 1 * noOfDice))) + 1;

 

    }

}

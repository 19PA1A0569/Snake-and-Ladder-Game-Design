import java.util.*;

public class SingleDice extends Dice {

    private int noOfDice = 1;

    SingleDice() {

        super(1);

    }
    public int rollDice() {

        int ran = ((int) (Math.random() * (6 - 1))) + 1;

        if (ran == 6) {

            while (true) {

                ran = 6 + ((int) (Math.random() * (6 - 1))) + 1;

                if (ran == 12) {

                    ran = 12 + ((int) (Math.random() * (6 - 1))) + 1;

                    if (ran == 18) {

                        System.out.println("3 6's in row. Hard Luck!");

                        ran = 0;

                        break;

                    } else {

                        break;

                    }

                } else {

                    break;

                }

            }

        }

        return ran;
    }
}

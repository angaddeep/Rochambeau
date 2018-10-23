/**
 * Created by angaddeep
 */
import java.util.Random;

public class RochambeauPlayer {

    private String name;
    //made it = to 0 because you start with zero wins
    private int wins = 0;
    private int previousThrow = -1;
    private Random rand;

    public RochambeauPlayer(String name){
        this.name = name;
        rand = new Random();
    }

    public RochambeauPlayer(String name, int seed){
        this.name = name;
        rand = new Random(seed);



    }
    //returns players name
    public String getName(){
        return name;
    }

    public int getWins() {
        return wins;

    }

    public String lastThrow() {
        if(previousThrow == Rochambeau.ROCK) {
            return "Rock";
        }

        else if(previousThrow == Rochambeau.PAPER){
            return  "Paper";
        }

        else if(previousThrow == Rochambeau.SCISSORS) {
            return  "Scissors";
        }

        else {
            return "No Throw";
        }

    }

    public String toString() {
        if(wins == 1){
            return name + " has " + wins + " wins.";
        }

        else{
            return name + " has " + wins + " wins.";
        }
    }

    public void  incrementWins() {
        ++wins;

    }

    public  int makeThrow() {
        previousThrow = rand.nextInt(3);
        return previousThrow;
    }

    public int makeThrow(int throwType){
        previousThrow = throwType;
        return throwType;
    }
}



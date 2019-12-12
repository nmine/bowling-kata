package be.nmine.bowling;

public class Game {

    private int score;

    public void roll(int pinDown) {
        score += pinDown;
    }

    public int score() {
        return score;

    }
}

package be.nmine.bowling;

public class Game {
    private RollsWrapper rollsTemps;

    public Game() {
        this.rollsTemps = new RollsWrapper();
    }

    void roll(int pinDown) {
        this.rollsTemps.setPinDowns(pinDown);
    }

    int score() {
        int score = 0;
        int frameIndex = 0;
        for (int i = 0; i < 10; i++) {
            score += rollsTemps.getScoreForFrame(frameIndex);
            frameIndex += 2;
        }
        return score;
    }

}

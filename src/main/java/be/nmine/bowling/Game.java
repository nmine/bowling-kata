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
            if (rollsTemps.getPinDown(frameIndex) + rollsTemps.getPinDown(frameIndex + 1) == 10)
                score += 10 + rollsTemps.getPinDown(frameIndex+2);
            else
                score += rollsTemps.getPinDown(frameIndex) + rollsTemps.getPinDown(frameIndex + 1);
            frameIndex += 2;
        }
        return score;
    }

}

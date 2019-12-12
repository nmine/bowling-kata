package be.nmine.bowling;

public class RollsWrapper {

    private int[] rolls;

    private int currentRollIndex;

    public RollsWrapper() {
        this.rolls = new int[21];
        currentRollIndex = 0;
    }


    public void setPinDowns(int pinDown) {
        rolls[currentRollIndex++] = pinDown;
    }

    public int getPinDown(int index) {
        return rolls[index];
    }
}

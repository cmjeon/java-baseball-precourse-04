package baseball;

import java.util.ArrayList;

public class Umpire {
    private ArrayList<Integer> goalNumbers;
    private ArrayList<Integer> resultNumbers;

    public Umpire() {
        this.goalNumbers = new ArrayList<Integer>();
        this.resultNumbers = new ArrayList<Integer>();
    }

    public void setGoalNumbers(ArrayList<Integer> randomNumbers) {
        this.goalNumbers = randomNumbers;
    }

    public ArrayList<Integer> getResultNumbers() {
        return resultNumbers;
    }

    public void resetResultNumbers() {
        this.resultNumbers.clear();
        this.resultNumbers.add(0);
        this.resultNumbers.add(0);
    }

    public ArrayList<Integer> checkGuessedNumber(ArrayList<Integer> guessedNumbers) {
        resetResultNumbers();
        for (int i = 0; i < guessedNumbers.size(); i++) {
            this.checkNumberInGoalNumbers(i, guessedNumbers.get(i));
        }
        return this.resultNumbers;
    }

    public void checkNumberInGoalNumbers(int guessIndex, int guessNum) {
        for (int i = 0; i < this.goalNumbers.size(); i++) {
            this.checkStrikeOrBall(guessIndex, guessNum, i);
        }
    }

    public void checkStrikeOrBall(int guessIndex, int guessNum, int goalIndex) {
        if (guessNum == this.goalNumbers.get(goalIndex)) {
            this.isStrike(guessIndex, goalIndex);
            this.isBall(guessIndex, goalIndex);
        }
    }

    public void isStrike(int guessIndex, int randomIndex) {
        if (guessIndex == randomIndex) {
            this.resultNumbers.set(0, this.resultNumbers.get(0) + 1);
        }
    }

    public void isBall(int guessIndex, int randomIndex) {
        if (guessIndex != randomIndex) {
            this.resultNumbers.set(1, this.resultNumbers.get(1) + 1);
        }
    }
}

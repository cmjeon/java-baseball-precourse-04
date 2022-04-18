package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeTeam {

    ArrayList<Integer> guessedNumbers = new ArrayList<>();

    public void setGuessedNumbers(ArrayList<Integer> guessedNumbers) {
        this.guessedNumbers = guessedNumbers;
    }

    public ArrayList<Integer> getGuessedNumbers() {
        return guessedNumbers;
    }

    public ArrayList<Integer> getGuessedNumberFromReadLine() {
        String guessedNumberString = "";
        do {
            guessedNumberString = Console.readLine();
        } while (!this.validateGuessedNumberString(guessedNumberString));
        return this.guessedNumbers;
    }

    public boolean validateGuessedNumberString(String guessedNumberString) {
        this.guessedNumbers.clear();
        try {
            this.parseStringToGuessedNumbers(guessedNumberString);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    public void parseStringToGuessedNumbers(String guessedNumberString) {
        ArrayList<String> guessedStrings = new ArrayList<>(Arrays.asList(guessedNumberString.split("")));
        for (String str : guessedStrings) {
            this.makeGuessedNumbers(Integer.parseInt(str));
        }
        if (this.guessedNumbers.size() != 3) {
            throw new IllegalArgumentException();
        }
    }

    public void makeGuessedNumbers(int number) {
        if (this.guessedNumbers.contains(number)) {
            throw new IllegalArgumentException();
        }
        this.guessedNumbers.add(number);
    }

}

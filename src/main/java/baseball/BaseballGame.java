package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;

public class BaseballGame {

    HomeTeam homeTeam;
    AwayTeam awayTeam;
    Umpire umpire;
    ScoreBoard scoreBoard;

    public BaseballGame(HomeTeam homeTeam, AwayTeam awayTeam, Umpire umpire, ScoreBoard scoreBoard) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.umpire = umpire;
        this.scoreBoard = scoreBoard;
    }

    public void startGame() {
        do {
            this.scoreBoard.printMessage(this.scoreBoard.startMessage());
            this.runGame();
        } while (this.askReGame());
        this.scoreBoard.printMessage(this.scoreBoard.endMessage());
    }

    public void runGame() {
        ArrayList<Integer> resultNumbers;
        this.awayTeam.generateGoalNumbers();
        do {
            this.umpire.setGoalNumbers(this.awayTeam.getGoalNumbers());
            this.scoreBoard.printMessage(this.scoreBoard.inputNumberMessage());
            ArrayList<Integer> guessedNumbers = this.homeTeam.getGuessedNumberFromReadLine();
            resultNumbers = this.umpire.checkGuessedNumber(guessedNumbers);
            this.scoreBoard.printMessage(this.scoreBoard.resultMessage(resultNumbers));
        } while (!this.isStrikeAll(resultNumbers));
        this.scoreBoard.printMessage(this.scoreBoard.winMessage());
    }

    private boolean askReGame() {
        this.scoreBoard.printMessage(this.scoreBoard.askReGameMessage());
        return Integer.parseInt(Console.readLine()) == 1;
    }

    private boolean isStrikeAll(ArrayList<Integer> resultNumbers) {
        return resultNumbers.get(0) == 3;
    }

}

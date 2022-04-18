package baseball;

public class Application {
    public static void main(String[] args) {
        BaseballGame baseballGame = createGame();
        baseballGame.startGame();
    }

    static BaseballGame createGame() {
        HomeTeam homeTeam = new HomeTeam();
        AwayTeam awayTeam = new AwayTeam();
        Umpire umpire = new Umpire();
        ScoreBoard scoreBoard = new ScoreBoard();
        return new BaseballGame(homeTeam, awayTeam, umpire, scoreBoard);
    }

}

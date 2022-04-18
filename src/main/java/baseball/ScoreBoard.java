package baseball;

import java.util.ArrayList;

public class ScoreBoard {
    public void printMessage(String message) {
        System.out.println(message);
    }
    public String startMessage() {
        return "게임 시작";
    }

    public String endMessage() {
        return "게임 종료";
    }

    public String winMessage() {
        return "3개의 숫자를 모두 맞히셨습니다! 게임 끝";
    }

    public String askReGameMessage() {
        return "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    }

    public String inputNumberMessage() {
        return "숫자를 입력해주세요 : ";
    }

    public String resultMessage(ArrayList<Integer> resultNumbers) {
        String resultMessage = "";
        if (this.isNothing(resultNumbers)) {
            resultMessage = "낫싱";
        }
        if (isBall(resultNumbers.get(1))) {
            resultMessage += resultNumbers.get(1) + "볼";
        }
        if (isBall(resultNumbers.get(1)) && isStrike(resultNumbers.get(0))) {
            resultMessage += " ";
        }
        if (isStrike(resultNumbers.get(0))) {
            resultMessage += resultNumbers.get(0) + "스트라이크";
        }
        return resultMessage;
    }

    boolean isNothing(ArrayList<Integer> resultNumbers) {
        return (!isStrike(resultNumbers.get(0)) && !isBall(resultNumbers.get(1)));
    }

    boolean isStrike(int strikeCount) {
        return (strikeCount > 0);
    }

    boolean isBall(int ballCount) {
        return (ballCount > 0);
    }

}

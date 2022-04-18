package baseball;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;


public class ScoreBoardTest {

    @Test
    public void 스코어보드_낫싱_테스트() {
        ScoreBoard sb = new ScoreBoard();
        ArrayList<Integer> resultNumbers = new ArrayList<Integer>();
        resultNumbers.add(0);
        resultNumbers.add(0);
        assertThat(sb.resultMessage(resultNumbers)).isEqualTo("낫싱");
    }

    @Test
    public void 스코어보드_볼_테스트() {
        ScoreBoard sb = new ScoreBoard();
        ArrayList<Integer> resultNumbers = new ArrayList<Integer>();
        resultNumbers.add(0);
        resultNumbers.add(1);
        assertThat(sb.resultMessage(resultNumbers)).isEqualTo("1볼");
    }

    @Test
    public void 스코어보드_스트라이크_테스트() {
        ScoreBoard sb = new ScoreBoard();
        ArrayList<Integer> resultNumbers = new ArrayList<Integer>();
        resultNumbers.add(2);
        resultNumbers.add(0);
        assertThat(sb.resultMessage(resultNumbers)).isEqualTo("2스트라이크");
    }

    @Test
    public void 스코어보드_볼_스트라이크_테스트() {
        ScoreBoard sb = new ScoreBoard();
        ArrayList<Integer> resultNumbers = new ArrayList<Integer>();
        resultNumbers.add(1);
        resultNumbers.add(2);
        assertThat(sb.resultMessage(resultNumbers)).isEqualTo("2볼 1스트라이크");
    }
}

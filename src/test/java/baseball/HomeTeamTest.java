package baseball;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class HomeTeamTest {

	@Test
	public void 입력한번호_정상여부_테스트() {
		HomeTeam ht = new HomeTeam();
		assertThat(ht.validateGuessedNumberString("123")).isTrue();
		assertThat(ht.validateGuessedNumberString("817")).isTrue();
	}

	@Test
	public void 입력한번호_비정상_일_때_예외테스트() {
		HomeTeam ht = new HomeTeam();
		assertThatThrownBy(() -> ht.parseStringToGuessedNumbers("abc")).isInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(() -> ht.parseStringToGuessedNumbers("7183")).isInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(() -> ht.parseStringToGuessedNumbers("38")).isInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(() -> ht.parseStringToGuessedNumbers("a3b")).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	public void 입력한번호에_중복된_숫자가_있을_때_예외테스트() throws Exception {
		HomeTeam ht = new HomeTeam();
		ArrayList<Integer> guessNumbersList = new ArrayList<>();
		guessNumbersList.add(1);
		guessNumbersList.add(2);
		ht.setGuessedNumbers(guessNumbersList);
		assertThatThrownBy(() -> ht.makeGuessedNumbers(2)).isInstanceOf(IllegalArgumentException.class);
		ht.makeGuessedNumbers(3);
		assertThat(ht.getGuessedNumbers()).hasSize(3);
	}
}

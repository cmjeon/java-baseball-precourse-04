package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AwayTeamTest {

	@Test
	void 랜덤생성한_번호리스트의_사이즈가_3인_것을_확인() {
		AwayTeam at = new AwayTeam();
		at.generateGoalNumbers();
		assertThat(at.getGoalNumbers()).hasSize(3);
	}
}

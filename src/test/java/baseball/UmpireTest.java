package baseball;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class UmpireTest {

	public ArrayList<Integer> createGoalList() {
		ArrayList<Integer> goalList = new ArrayList<Integer>();
		goalList.add(1);
		goalList.add(2);
		goalList.add(3);
		return goalList;
	}

	@Test
	public void 초기화된_심판결과가_0스트라이크_0볼인지_확인() {
		Umpire um = new Umpire();
		um.resetResultNumbers();
		assertThat(um.getResultNumbers()).hasSize(2).containsExactly(0, 0);
	}

	@Test
	public void 심판결과_3스트라이크_테스트() {
		Umpire um = new Umpire();
		um.setGoalNumbers(createGoalList()); // goalList : 123
		ArrayList<Integer> guessList = new ArrayList<Integer>();
		guessList.add(1);
		guessList.add(2);
		guessList.add(3);
		assertThat(um.checkGuessedNumber(guessList)).hasSize(2).containsExactly(3, 0);
	}
	@Test
	public void 심판결과_1스트라이크_테스트() {
		Umpire um = new Umpire();
		um.setGoalNumbers(createGoalList()); // goalList : 123
		ArrayList<Integer> guessList = new ArrayList<Integer>();
		guessList.add(1);
		guessList.add(4);
		guessList.add(5);
		assertThat(um.checkGuessedNumber(guessList)).hasSize(2).containsExactly(1, 0);
	}

	@Test
	public void 심판결과_1볼_테스트() {
		Umpire um = new Umpire();
		um.setGoalNumbers(createGoalList()); // goalList : 123
		ArrayList<Integer> guessList = new ArrayList<Integer>();
		guessList.add(2);
		guessList.add(4);
		guessList.add(5);
		assertThat(um.checkGuessedNumber(guessList)).hasSize(2).containsExactly(0, 1);
	}

	@Test
	public void 심판결과_1스트라이크_1볼_테스트() {
		Umpire um = new Umpire();
		um.setGoalNumbers(createGoalList()); // goalList : 123
		ArrayList<Integer> guessList = new ArrayList<Integer>();
		guessList.add(1);
		guessList.add(3);
		guessList.add(5);
		assertThat(um.checkGuessedNumber(guessList)).hasSize(2).containsExactly(1, 1);
	}

	@Test
	public void 심판결과_3볼_테스트() {
		Umpire um = new Umpire();
		um.setGoalNumbers(createGoalList()); // goalList : 123
		ArrayList<Integer> guessList = new ArrayList<Integer>();
		guessList.add(3);
		guessList.add(1);
		guessList.add(2);
		assertThat(um.checkGuessedNumber(guessList)).hasSize(2).containsExactly(0, 3);
	}

	@Test
	public void 심판결과_처리_테스트() {
		Umpire um = new Umpire();
		um.setGoalNumbers(createGoalList()); // goalList : 123
		um.resetResultNumbers();
		um.checkNumberInGoalNumbers(0, 1);
		assertThat(um.getResultNumbers()).hasSize(2).containsExactly(1, 0);
		um.checkNumberInGoalNumbers(1, 3);
		assertThat(um.getResultNumbers()).hasSize(2).containsExactly(1, 1);
		um.checkNumberInGoalNumbers(2, 2);
		assertThat(um.getResultNumbers()).hasSize(2).containsExactly(1, 2);
	}

	@Test
	public void 스트라이크_볼_체크_테스트() {
		Umpire um = new Umpire();
		um.setGoalNumbers(createGoalList()); // goalList : 123
		um.resetResultNumbers();
		um.checkStrikeOrBall(0, 1, 0);
		assertThat(um.getResultNumbers()).hasSize(2).containsExactly(1, 0);
		um.checkStrikeOrBall(1, 2, 1);
		assertThat(um.getResultNumbers()).hasSize(2).containsExactly(2, 0);
	}

	@Test
	public void 스트라이크_볼_처리_테스트() {
		Umpire um = new Umpire();
		um.setGoalNumbers(createGoalList()); // goalList : 123
		um.resetResultNumbers();
		um.isStrike(0, 0);
		um.isBall(0, 0);
		assertThat(um.getResultNumbers()).hasSize(2).containsExactly(1, 0);
		um.isStrike(1, 2);
		um.isBall(1, 2);
		assertThat(um.getResultNumbers()).hasSize(2).containsExactly(1, 1);
	}

}

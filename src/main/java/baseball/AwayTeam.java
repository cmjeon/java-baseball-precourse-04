package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;

public class AwayTeam {

    private final ArrayList<Integer> goalNumbers;

    public AwayTeam() {
        this.goalNumbers = new ArrayList<>();
    }

    public ArrayList<Integer> getGoalNumbers() {
        return this.goalNumbers;
    }

    public void generateGoalNumbers() {
        this.goalNumbers.clear();
        while(this.goalNumbers.size() < 3) {
            this.addNumberToGoalNumbers(Randoms.pickNumberInRange(1, 9));
        }
    }

    void addNumberToGoalNumbers(int i) {
        if(!this.goalNumbers.contains(i)) {
          this.goalNumbers.add(i);
        }
    }

}

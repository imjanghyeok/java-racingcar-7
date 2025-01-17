package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.strategy.IntGeneratorStrategy;

public class RandomIntGeneratorStrategy implements IntGeneratorStrategy {
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 9;

    @Override
    public int getIntValue() {
        return Randoms.pickNumberInRange(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
    }
}

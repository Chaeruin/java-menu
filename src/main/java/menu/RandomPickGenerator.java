package menu;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomPickGenerator implements RandomPickService {

    private static final int RANDOM_LOWER_INCLUSIVE = 1;
    private static final int RANDOM_UPPER_INCLUSIVE = 5;

    @Override
    public int getRandomCategory() {
        return Randoms.pickNumberInRange(RANDOM_LOWER_INCLUSIVE, RANDOM_UPPER_INCLUSIVE);
    }
}
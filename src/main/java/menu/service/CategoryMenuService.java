package menu.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class CategoryMenuService {

    public String getTodayWhatCategoryToMenu(List<String> categoryMenus, List<String> already, List<String> notMenu) {
        String menu = Randoms.shuffle(categoryMenus).get(0);
        for (String alr : already) {
            while (menu.equals(alr)) {
                menu = Randoms.shuffle(categoryMenus).get(0);
            }
        }
        if (notMenu != null) {
            for (String m : notMenu) {
                while (menu.equals(m)) {
                    menu = Randoms.shuffle(categoryMenus).get(0);
                }
            }
        }
        return menu;
    }
}

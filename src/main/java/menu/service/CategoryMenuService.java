package menu.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class CategoryMenuService {

    public String getTodayWhatCategoryToMenu(List<String> categoryMenus, List<String> already, List<String> notMenu) {
        String menu = Randoms.shuffle(categoryMenus).get(0);
        for (String alr : already) {
            menu = returnMenuRe(menu, alr, categoryMenus);
        }
        if (notMenu != null) {
            for (String m : notMenu) {
                menu = returnMenuRe(menu, m, categoryMenus);
            }
        }
        return menu;
    }

    public String returnMenuRe(String menu, String s, List<String> categoryMenus) {
        while (menu.equals(s)) {
            menu = Randoms.shuffle(categoryMenus).get(0);
        }
        return menu;
    }
}

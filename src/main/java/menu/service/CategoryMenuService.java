package menu.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import menu.domain.Menu;

public class CategoryMenuService {

    public String getTodayWhatCategoryToMenu(List<String> categoryMenus, List<String> already, List<Menu> notMenu) {
        String menu = Randoms.shuffle(categoryMenus).get(0);
        for (Menu m : notMenu) {
            for (String alr : already) {
                while (!m.getName().equals(menu) && !m.getName().equals(alr)) {
                    menu = Randoms.shuffle(categoryMenus).get(0);
                }
            }
        }
        return menu;
    }
}

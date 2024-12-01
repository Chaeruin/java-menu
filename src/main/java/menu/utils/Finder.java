package menu.utils;

import java.util.List;
import menu.domain.Menu;
import menu.enums.Category;

public class Finder {

    public static Menu findMenuByName(List<Menu> categoryMenus, String name) {
        for (Menu menu : categoryMenus) {
            if (menu.getName().equals(name)) {
                return menu;
            }
        }
        return null;
    }

    public static Category findCategoryByMenuName(List<Menu> categoryMenus, String name) {
        for (Menu menu : categoryMenus) {
            if (menu.getName().equals(name)) {
                return menu.getCategory();
            }
        }
        return null;
    }
}

package menu.utils;

import java.util.List;
import menu.domain.Menu;
import menu.dto.MenuStatus;
import menu.enums.Category;

public class Finder {

    public static Menu findMenuByName(List<Menu> categoryMenus, String name) {
        for (Menu menu : categoryMenus) {
            if (MenuStatus.of(menu).name().equals(name)) {
                return menu;
            }
        }
        return null;
    }

    public static Category findCategoryByMenuName(List<Menu> categoryMenus, String name) {
        for (Menu menu : categoryMenus) {
            if (MenuStatus.of(menu).name().equals(name)) {
                return menu.getCategory();
            }
        }
        return null;
    }
}

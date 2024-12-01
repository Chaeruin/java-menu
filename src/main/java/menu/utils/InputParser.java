package menu.utils;

import java.util.ArrayList;
import java.util.List;
import menu.domain.Coach;
import menu.domain.Menu;

public class InputParser {

    public static List<Coach> parseCoaches(String input) {
        List<Coach> coaches = new ArrayList<>();
        if (InputValidator.isCoachNumberOK(input)) {
            String[] inputs = input.split(",");
            for (int i = 0; i < inputs.length; i++) {
                coaches.add(new Coach(inputs[i]));
            }
        }
        return coaches;
    }

    public static List<String> parseNotMenus(List<Menu> categoryMenus, String input) {
        List<String> notMenu = new ArrayList<>();
        if (InputValidator.isMenuNumberOK(input)) {
            String[] inputs = input.split(",");
            for (int i = 0; i < inputs.length; i++) {
                InputValidator.isMenuFinded(categoryMenus, inputs[i]);
                notMenu.add(inputs[i]);
            }
        }
        return notMenu;
    }
}

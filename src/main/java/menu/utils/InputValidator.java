package menu.utils;

import java.util.List;
import menu.domain.Menu;
import menu.enums.ErrorMessage;

public class InputValidator {

    public static boolean isCoachNumberOK(String input) {
        String[] inputs = input.split(",", -1);
        if (inputs.length < 2 || inputs.length > 4) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_LENGTH_NUMBER.getErrorMessage());
        }
        return true;
    }

    public static boolean isMenuNumberOK(String input) {
        String[] inputs = input.split(",", -1);
        if (inputs.length > 2) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_LENGTH_MENU.getErrorMessage());
        }
        return true;
    }

    public static void isMenuFinded(List<Menu> categoryMenus, String name) {
        if (!name.equals("") && Finder.findMenuByName(categoryMenus, name) == null) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_MENU.getErrorMessage());
        }
    }

}
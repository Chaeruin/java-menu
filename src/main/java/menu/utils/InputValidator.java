package menu.utils;

import menu.enums.ErrorMessage;

public class InputValidator {

    public static boolean isCoachNumberOK(String input) {
        String[] inputs = input.split(",", -1);
        if (inputs.length < 2 || inputs.length > 5) {
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

}
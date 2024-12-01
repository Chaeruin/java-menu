package menu.domain;

import java.util.List;
import menu.enums.ErrorMessage;

public class Coach {
    private final String name;
    private List<String> recommendedMenu;

    public Coach(String name) {
        isLengthOK(name);
        this.name = name;
        this.recommendedMenu = null;
    }

    public void isLengthOK(String name) {
        if (name.trim().length() < 2 || name.trim().length() > 4) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_LENGTH_NAME.getErrorMessage());
        }
        if (name.equals("  ") || name.equals("   ") || name.equals("    ")) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getErrorMessage());
        }
    }

    public String getName() {
        return this.name;
    }

    public List<String> getRecommendedMenu() {
        return this.recommendedMenu;
    }

    public void setRecommendedMenu(List<String> recommendedMenu) {
        this.recommendedMenu = recommendedMenu;
    }
}

package menu.domain;

import java.util.List;

public class Coach {
    private final String name;
    private List<Menu> recommendedMenu;

    public Coach(String name) {
        this.name = name;
        this.recommendedMenu = null;
    }

    public String getName() {
        return this.name;
    }

    public List<Menu> getRecommendedMenu() {
        return this.recommendedMenu;
    }

    public void setRecommendedMenu(List<Menu> recommendedMenu) {
        this.recommendedMenu = recommendedMenu;
    }
}

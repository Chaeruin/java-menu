package menu.dto;

import menu.domain.Menu;
import menu.enums.Category;

public record MenuStatus(
        String name,
        Category category
) {
    public static MenuStatus of(final Menu menu) {
        return new MenuStatus(
                menu.getName(),
                menu.getCategory()
        );
    }
}

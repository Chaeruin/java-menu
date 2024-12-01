package menu.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import menu.domain.Menu;
import menu.enums.Category;
import menu.service.CategoryMenuInitializerService;
import menu.service.CategoryMenuService;

public class CategoryMenuController {

    final CategoryMenuInitializerService categoryMenuInitializerService;
    final CategoryMenuService categoryMenuService;

    public CategoryMenuController(CategoryMenuInitializerService categoryMenuInitializerService,
                                  CategoryMenuService categoryMenuService) {
        this.categoryMenuInitializerService = categoryMenuInitializerService;
        this.categoryMenuService = categoryMenuService;
    }

    public List<String> getWeeklyWhatCategoryToMenu(List<Category> categories, List<Menu> notMenu) {
        List<String> weekly = new LinkedList<>();
        for (Category category : categories) {
            List<Menu> menu = new ArrayList<>();
            sameCategoryMenus(category, menu, notMenu);
            weekly.add(categoryMenuService.getTodayWhatCategoryToMenu(getGroupByCategory(category), weekly, menu));
        }
        return weekly;
    }

    public void sameCategoryMenus(Category category, List<Menu> menu, List<Menu> notMenu) {
        for (Menu m : notMenu) {
            if (m.getCategory() == category) {
                menu.add(m);
            }
        }
    }

    public List<String> getGroupByCategory(Category category) {
        if (category == Category.JAPANESE) {
            return categoryMenuInitializerService.setJapaneseMenuGroups();
        } else if (category == Category.KOREAN) {
            return categoryMenuInitializerService.setKoreanMenuGroups();
        } else if (category == Category.CHINESE) {
            return categoryMenuInitializerService.setChineseMenuGroups();
        } else if (category == Category.ASIAN) {
            return categoryMenuInitializerService.setAsianMenuGroups();
        } else if (category == Category.WESTERN) {
            return categoryMenuInitializerService.setWesternMenuGroups();
        }
        return null;
    }
}

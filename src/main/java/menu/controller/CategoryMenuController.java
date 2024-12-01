package menu.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import menu.domain.Coach;
import menu.domain.Menu;
import menu.enums.Category;
import menu.service.CategoryMenuInitializerService;
import menu.service.CategoryMenuService;
import menu.utils.Finder;

public class CategoryMenuController {

    final CategoryMenuInitializerService categoryMenuInitializerService;
    final CategoryMenuService categoryMenuService;

    public CategoryMenuController(CategoryMenuInitializerService categoryMenuInitializerService,
                                  CategoryMenuService categoryMenuService) {
        this.categoryMenuInitializerService = categoryMenuInitializerService;
        this.categoryMenuService = categoryMenuService;
    }

    static List<Menu> categoryMenus;

    public Map<Coach, List<String>> getWeeklyWhatCategoryToMenu(List<Coach> coaches, List<Category> categories,
                                                                Map<Coach, List<String>> notMenu) {
        categoryMenus = categoryMenuInitializerService.setMenuToCategoryGroups();
        Map<Coach, List<String>> coachesWeekly = initialize(coaches);
        for (Category category : categories) {
            for (Coach coach : coaches) {
                List<String> menu = new ArrayList<>();
                sameCategoryMenus(category, menu, notMenu.get(coach));
                coachesWeekly.get(coach)
                        .add(categoryMenuService.getTodayWhatCategoryToMenu(getGroupByCategory(category),
                                coachesWeekly.get(coach), menu));
            }
        }
        return coachesWeekly;
    }

    public Map<Coach, List<String>> initialize(List<Coach> coaches) {
        Map<Coach, List<String>> coachesWeekly = new HashMap<>();
        for (Coach coach : coaches) {
            coachesWeekly.put(coach, new LinkedList<>());
        }
        return coachesWeekly;
    }

    public void sameCategoryMenus(Category category, List<String> menu, List<String> notMenu) {
        for (String m : notMenu) {
            if (Finder.findCategoryByMenuName(categoryMenus, m) == category) {
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

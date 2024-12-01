package menu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import menu.domain.Coach;
import menu.domain.Menu;
import menu.enums.Category;
import menu.service.CategoryMenuInitializerService;
import menu.service.CategoryService;
import menu.utils.InputParser;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {
    final InputView inputView;
    final OutputView outputView;
    final CategoryMenuController categoryMenuController;
    final CategoryMenuInitializerService categoryMenuInitializerService;
    final CategoryService categoryService;


    public MenuController(InputView inputView, OutputView outputView, CategoryMenuController categoryMenuController,
                          CategoryMenuInitializerService categoryMenuInitializerService,
                          CategoryService categoryService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.categoryMenuController = categoryMenuController;
        this.categoryMenuInitializerService = categoryMenuInitializerService;
        this.categoryService = categoryService;
    }

    static List<Menu> categoryMenus;

    public void run() {
        categoryMenus = categoryMenuInitializerService.setMenuToCategoryGroups();
        printStart();
        List<Coach> coaches = getCoachesHandler();
        Map<Coach, List<String>> notCoachMenu = new HashMap<>();
        for (Coach coach : coaches) {
            notCoachMenu.put(coach, getNotMenusHandler(coach));
            outputView.printEnter();
        }

        List<Category> categories = categoryService.getCategoryWeek();
        Map<Coach, List<String>> pickMenus = categoryMenuController.getWeeklyWhatCategoryToMenu(coaches, categories,
                notCoachMenu);
        for (Coach coach : coaches) {
            coach.setRecommendedMenu(pickMenus.get(coach));
        }

        outputView.printCoachesMenu(coaches, categories);
    }

    public void printStart() {
        outputView.printStart();
        outputView.printEnter();
    }

    public List<Coach> getCoachesHandler() {
        List<Coach> coaches = null;
        while (coaches == null) {
            try {
                coaches = InputParser.parseCoaches(inputView.getCoachNames());
                return coaches;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return coaches;
    }

    public List<String> getNotMenusHandler(Coach coach) {
        List<String> notMenu = null;
        while (notMenu == null) {
            try {
                notMenu = InputParser.parseNotMenus(categoryMenus, inputView.getCoachesNotMenus(coach));
                return notMenu;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return notMenu;
    }
}

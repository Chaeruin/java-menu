package menu;

import menu.controller.CategoryMenuController;
import menu.controller.MenuController;
import menu.service.CategoryMenuInitializerService;
import menu.service.CategoryMenuService;
import menu.service.CategoryService;
import menu.view.InputView;
import menu.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        CategoryMenuInitializerService categoryMenuInitializerService = new CategoryMenuInitializerService();
        CategoryMenuController categoryMenuController = new CategoryMenuController(categoryMenuInitializerService,
                new CategoryMenuService());
        CategoryService categoryService = new CategoryService(new RandomPickGenerator());

        MenuController menuController = new MenuController(inputView, outputView, categoryMenuController,
                categoryMenuInitializerService, categoryService);

        menuController.run();
    }
}

package menu.controller;

import java.util.List;
import menu.domain.Coach;
import menu.domain.Menu;
import menu.utils.InputParser;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {
    final InputView inputView;
    final OutputView outputView;

    public MenuController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {

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

    public List<Menu> getNotMenusHandler(Coach coach) {
        List<Menu> notMenu = null;
        while (notMenu == null) {
            try {
                notMenu = InputParser.parseNotMenus(inputView.getCoachesNotMenus(coach));
                return notMenu;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return notMenu;
    }
}

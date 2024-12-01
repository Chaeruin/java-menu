package menu.view;

import java.util.List;
import menu.domain.Coach;
import menu.enums.Category;

public class OutputView {

    public void printEnter() {
        System.out.println();
    }

    public void printStart() {
        System.out.println("점심 메뉴 추천을 시작합니다.");
    }

    public void printCoachesMenu(List<Coach> coaches, List<Category> categories) {
        System.out.println("메뉴 추천 결과입니다.");
        System.out.println("[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]");
        System.out.print("[ 카테고리 ");
        for (Category category : categories) {
            System.out.print("| " + category + " ");
        }
        System.out.println("]");
        for (Coach coach : coaches) {
            printMenusOneCoach(coach);
        }
        printEnter();
        System.out.println("추천을 완료했습니다.");
    }

    public void printMenusOneCoach(Coach coach) {
        System.out.print("[ " + coach.getName() + " ");
        for (String menu : coach.getRecommendedMenu()) {
            System.out.print("| " + menu + " ");
        }
        System.out.println("]");
    }
}

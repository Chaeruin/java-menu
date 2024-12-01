package menu.service;

import java.util.ArrayList;
import java.util.List;
import menu.domain.Menu;
import menu.enums.Category;

public class CategoryMenuInitializerService {

    public List<String> setJapaneseMenuGroups() {
        List<String> japanese = new ArrayList<>();
        japanese.add("규동");
        japanese.add("우동");
        japanese.add("미소시루");
        japanese.add("스시");
        japanese.add("가츠동");
        japanese.add("오니기리");
        japanese.add("하이라이스");
        japanese.add("라멘");
        japanese.add("오꼬노미야끼");
        return japanese;
    }

    public List<String> setKoreanMenuGroups() {
        List<String> korean = new ArrayList<>();
        korean.add("김밥");
        korean.add("김치찌개");
        korean.add("쌈밥");
        korean.add("된장찌개");
        korean.add("비빔밥");
        korean.add("칼국수");
        korean.add("불고기");
        korean.add("떡볶이");
        korean.add("제육볶음");
        return korean;
    }

    public List<String> setChineseMenuGroups() {
        List<String> chinese = new ArrayList<>();
        chinese.add("깐풍기");
        chinese.add("볶음면");
        chinese.add("동파육");
        chinese.add("짜장면");
        chinese.add("짬뽕");
        chinese.add("마파두부");
        chinese.add("탕수육");
        chinese.add("토마토 달걀볶음");
        chinese.add("고추잡채");
        return chinese;
    }

    public List<String> setAsianMenuGroups() {
        List<String> asian = new ArrayList<>();
        asian.add("팟타이");
        asian.add("카오 팟");
        asian.add("나시고랭");
        asian.add("파인애플 볶음밥");
        asian.add("쌀국수");
        asian.add("똠양꿍");
        asian.add("반미");
        asian.add("월남쌈");
        asian.add("분짜");
        return asian;
    }

    public List<String> setWesternMenuGroups() {
        List<String> western = new ArrayList<>();
        western.add("라자냐");
        western.add("그라탱");
        western.add("뇨끼");
        western.add("끼슈");
        western.add("프렌치 토스트");
        western.add("바게트");
        western.add("스파게티");
        western.add("피자");
        western.add("파니니");
        return western;
    }

    public List<Menu> setMenuToCategoryGroups() {
        List<Menu> menuToCategory = new ArrayList<>();
        setJapaneseMenuToCategory(menuToCategory);
        setKoreanMenuToCategory(menuToCategory);
        setChineseMenuToCategory(menuToCategory);
        setAsianMenuToCategory(menuToCategory);
        setWesternMenuToCategory(menuToCategory);
        return menuToCategory;
    }

    public void setJapaneseMenuToCategory(List<Menu> menuToCategory) {
        menuToCategory.add(new Menu("규동", Category.JAPANESE));
        menuToCategory.add(new Menu("우동", Category.JAPANESE));
        menuToCategory.add(new Menu("미소시루", Category.JAPANESE));
        menuToCategory.add(new Menu("스시", Category.JAPANESE));
        menuToCategory.add(new Menu("가츠동", Category.JAPANESE));
        menuToCategory.add(new Menu("오니기리", Category.JAPANESE));
        menuToCategory.add(new Menu("하이라이스", Category.JAPANESE));
        menuToCategory.add(new Menu("라멘", Category.JAPANESE));
        menuToCategory.add(new Menu("오코노미야끼", Category.JAPANESE));
    }

    public void setKoreanMenuToCategory(List<Menu> menuToCategory) {
        menuToCategory.add(new Menu("김밥", Category.KOREAN));
        menuToCategory.add(new Menu("김치찌개", Category.KOREAN));
        menuToCategory.add(new Menu("쌈밥", Category.KOREAN));
        menuToCategory.add(new Menu("된장찌개", Category.KOREAN));
        menuToCategory.add(new Menu("비빔밥", Category.KOREAN));
        menuToCategory.add(new Menu("칼국수", Category.KOREAN));
        menuToCategory.add(new Menu("불고기", Category.KOREAN));
        menuToCategory.add(new Menu("떡볶이", Category.KOREAN));
        menuToCategory.add(new Menu("제육볶음", Category.KOREAN));
    }

    public void setChineseMenuToCategory(List<Menu> menuToCategory) {
        menuToCategory.add(new Menu("깐풍기", Category.CHINESE));
        menuToCategory.add(new Menu("볶음면", Category.CHINESE));
        menuToCategory.add(new Menu("동파육", Category.CHINESE));
        menuToCategory.add(new Menu("짜장면", Category.CHINESE));
        menuToCategory.add(new Menu("짬뽕", Category.CHINESE));
        menuToCategory.add(new Menu("마파두부", Category.CHINESE));
        menuToCategory.add(new Menu("탕수육", Category.CHINESE));
        menuToCategory.add(new Menu("토마토 달걀볶음", Category.CHINESE));
        menuToCategory.add(new Menu("고추잡채", Category.CHINESE));
    }

    public void setAsianMenuToCategory(List<Menu> menuToCategory) {
        menuToCategory.add(new Menu("팟타이", Category.ASIAN));
        menuToCategory.add(new Menu("카오 팟", Category.ASIAN));
        menuToCategory.add(new Menu("나시고랭", Category.ASIAN));
        menuToCategory.add(new Menu("파인애플 볶음밥", Category.ASIAN));
        menuToCategory.add(new Menu("쌀국수", Category.ASIAN));
        menuToCategory.add(new Menu("똠양꿍", Category.ASIAN));
        menuToCategory.add(new Menu("반미", Category.ASIAN));
        menuToCategory.add(new Menu("월남쌈", Category.ASIAN));
        menuToCategory.add(new Menu("분짜", Category.ASIAN));
    }

    public void setWesternMenuToCategory(List<Menu> menuToCategory) {
        menuToCategory.add(new Menu("라자냐", Category.WESTERN));
        menuToCategory.add(new Menu("그라탱", Category.WESTERN));
        menuToCategory.add(new Menu("뇨끼", Category.WESTERN));
        menuToCategory.add(new Menu("끼슈", Category.WESTERN));
        menuToCategory.add(new Menu("프렌치 토스트", Category.WESTERN));
        menuToCategory.add(new Menu("바게트", Category.WESTERN));
        menuToCategory.add(new Menu("스파게티", Category.WESTERN));
        menuToCategory.add(new Menu("피자", Category.WESTERN));
        menuToCategory.add(new Menu("파니니", Category.WESTERN));
    }
}

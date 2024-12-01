package menu.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import menu.RandomPickGenerator;
import menu.enums.Category;

public class CategoryService {

    private final static int MONDAY = 0;
    private final static int FRIDAY = 4;

    private final RandomPickGenerator randomPickGenerator;

    public CategoryService(RandomPickGenerator randomPickGenerator) {
        this.randomPickGenerator = randomPickGenerator;
    }

    public List<Category> getCategoryWeek() {
        List<Category> weeklyCategory = new LinkedList<>();
        List<Integer> randomPick = randomPickNumberNotDuplicate();
        for (int i = MONDAY; i <= FRIDAY; i++) {
            weeklyCategory.add(getCategoryByRandomPick(randomPick.get(i)));
        }
        return weeklyCategory;
    }

    public Category getCategoryByRandomPick(int randomPick) {
        for (Category category : Category.values()) {
            if (category.getNumber() == randomPick) {
                return category;
            }
        }
        return null;
    }

    public List<Integer> randomPickNumberNotDuplicate() {
        List<Integer> integers = new LinkedList<>();
        for (int i = 0; i <= 4; i++) {
            integers.add(randomPickGenerator.getRandomCategory());
            if (i >= 2 && isDuplicateUpto3(integers)) {
                integers.remove(integers.size() - 1);
                i--;
            }
        }

        return integers;
    }

    public boolean isDuplicateUpto3(List<Integer> integers) {
        int last = integers.get(integers.size() - 1);
        Map<Integer, Integer> map = integers.stream().collect(
                Collectors.toMap(Function.identity(), value -> 1, Integer::sum));

        for (Entry<Integer, Integer> integer : map.entrySet()) {
            if (integer.getKey() == last && integer.getValue() >= 3) {
                return true;
            }
        }

        return false;
    }
}

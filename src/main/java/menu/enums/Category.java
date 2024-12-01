package menu.enums;

public enum Category {
    JAPANESE(1),
    KOREAN(2),
    CHINESE(3),
    ASIAN(4),
    WESTERN(5);


    private final int number;

    Category(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }
}

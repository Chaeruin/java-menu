package menu.enums;

public enum ErrorMessage {

    INVALID_LENGTH_NAME("[ERROR] 코치 이름은 2자 이상 혹은 4자 이하여야 합니다."),
    INVALID_LENGTH_NUMBER("[ERROR] 코치는 2명 이상 5명 이하여야 합니다."),
    INVALID_INPUT("[ERROR] 유효하지 않은 입력입니다."),
    INVALID_LENGTH_MENU("[ERROR] 메뉴는 2개 이하만 입력할 수 있습니다");

    private final String errorMessage;


    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

}

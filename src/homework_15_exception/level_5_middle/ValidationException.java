package homework_15_exception.level_5_middle;

class ValidationException extends Exception {
    private String ruleName;
    private String description;
    private String fieldName;
    // (Product: title, price, description),
    // UI сможет по этому названию показать ошибку рядом с нужным полем
    public ValidationException(String ruleName, String description, String fieldName) {
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public String getFieldName() {
        return fieldName;
    }
}

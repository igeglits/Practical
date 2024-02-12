package homework_15_exception.level_5_middle;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ValidationException that)) return false;
        return Objects.equals(getRuleName(), that.getRuleName()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getFieldName(), that.getFieldName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRuleName(), getDescription(), getFieldName());
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

package homework_15_exception.level_5_middle;

interface FieldValidationRule {
    void validate(Product product) throws ValidationException;
}

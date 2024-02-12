package homework_15_exception.level_5_middle;

interface ProductValidationRule {
    void validate(Product product) throws ValidationException;
}

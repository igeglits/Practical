package homework_15_exception.level_5_middle;

class ProductTitleValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getName() == null || product.getName().isEmpty()) {
            throw new ValidationException("RULE_1", "Title can not be empty", "title");
        }
        if (product.getName().length() < 3) {
            throw new ValidationException("RULE_2", "Title can not be less then 3 symbols", "title");
        }
        if (product.getName().length() > 100) {
            throw new ValidationException("RULE_3", "Title can not be more then 100 symbols", "title");
        }
        if (!product.getName().matches("[a-zA-Z0-9]+")) {
            throw new ValidationException("RULE_4", "Title can be only latin and number", "title");
        }
    }
}

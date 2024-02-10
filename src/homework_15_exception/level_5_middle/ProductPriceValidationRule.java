package homework_15_exception.level_5_middle;

import java.math.BigDecimal;

class ProductPriceValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getPrice()==null) {
            throw new ValidationException("RULE_5", "Price can not be empty", "price");
        }
        if (product.getPrice().compareTo(BigDecimal.ZERO) < 0){
throw new ValidationException("RULE_6", "Price can not be less then 0", "price");
        }
    }
}

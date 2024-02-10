package homework_15_exception.level_5_middle;

import java.util.List;

interface ProductValidator {
    List<ValidationException> validate(Product product);
}

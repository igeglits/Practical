package homework_15_exception.level_5_middle;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {
    private ProductTitleValidationRule titleValidationRule;
    //это правило валидации, которое будет использоваться
    // для проверки названия продукта.
    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule) {
        this.titleValidationRule = titleValidationRule;
    }
    /*
    Это конструктор класса ProductValidatorImpl, который принимает
    объект типа ProductTitleValidationRule в качестве аргумента и
    сохраняет его в поле titleValidationRule. Это позволяет внедрить
    правило валидации в экземпляр класса ProductValidatorImpl.
     */
    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        try {
            titleValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        return exceptions;

    }

}

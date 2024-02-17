package homework_15_exception.level_5_middle;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {

    private final List<ProductValidationRule> validationRules = new ArrayList<>();

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                                ProductPriceValidationRule priceValidationRule,
                                ProductDescriptionValidationRule productDescriptionValidationRule) {
        validationRules.add(titleValidationRule);
        validationRules.add(priceValidationRule);
        validationRules.add(productDescriptionValidationRule);
        System.out.println(validationRules.size());
    }

    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        for (ProductValidationRule validationRule : validationRules) {
            try {
                validationRule.validate(product);
            } catch (ValidationException e) {
                exceptions.add(e);
            }
        }
        return exceptions;
    }
}
/* private final ProductTitleValidationRule titleValidationRule;
     private final ProductPriceValidationRule priceValidationRule;
     private final ProductDescriptionValidationRule productDescriptionValidationRule;

     //это правило валидации, которое будет использоваться
     // для проверки названия продукта.
      public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                                 ProductPriceValidationRule priceValidationRule,
                                 ProductDescriptionValidationRule productDescriptionValidationRule) {
         this.titleValidationRule = titleValidationRule;
         this.priceValidationRule = priceValidationRule;
         this.productDescriptionValidationRule = productDescriptionValidationRule;
     }

     Это конструктор класса ProductValidatorImpl, который принимает
     объект типа ProductTitleValidationRule в качестве аргумента и
     сохраняет его в поле titleValidationRule. Это позволяет внедрить
     правило валидации в экземпляр класса ProductValidatorImpl.
      */




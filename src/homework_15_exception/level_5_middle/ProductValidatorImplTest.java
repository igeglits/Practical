package homework_15_exception.level_5_middle;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

class ProductValidatorImplTest {
    ProductTitleValidationRule productTitleValidationRule = new ProductTitleValidationRule();
    private ProductValidator productValidator = new ProductValidatorImpl(productTitleValidationRule);

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.RULE_1_v1();
        test.RULE_1_v2();
        test.RULE_2();
        test.RULE_3();
        test.RULE_4();
    }

    void RULE_1_v1() {
        Product product = new Product(null, new BigDecimal("1.50"), "Milk from cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_1_v1");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE_1"), "RULE_1_v1");
        checkResult(validationExceptions.get(0).getFieldName().equals("title"), "RULE_1_v1");
        checkResult(validationExceptions.get(0).getDescription().equals("Title can not be empty"), "RULE_1_v1");
    }

    void RULE_1_v2() {
        Product product = new Product("", new BigDecimal("1.50"), "Milk from cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_1_v2");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE_1"), "RULE_1_v2");
        checkResult(validationExceptions.get(0).getFieldName().equals("title"), "RULE_1_v2");
        checkResult(validationExceptions.get(0).getDescription().equals("Title can not be empty"), "RULE_1_v2");
    }

    void RULE_2() {
        Product product = new Product("Mi", new BigDecimal("1.50"), "Milk from cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_2");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE_2"), "RULE_2");
        checkResult(validationExceptions.get(0).getFieldName().equals("title"), "RULE_2");
        checkResult(validationExceptions.get(0).getDescription().equals("Title can not be less then 3 symbols"), "RULE_2");
    }

    void RULE_3() {
        Product product = new Product("MilkyMilkyMilkyMilkyMilkyMilkyMilkyMilky" +
                "MilkyMilkyMilkyMilkyMilkyMilky" +
                "MilkyMilkyMilkyMilkyMilkyMilkyM", new BigDecimal("1.50"), "Milk from cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_3");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE_3"), "RULE_3");
        checkResult(validationExceptions.get(0).getFieldName().equals("title"), "RULE_3");
        checkResult(validationExceptions.get(0).getDescription().equals("Title can not be more then 100 symbols"), "RULE_3");
    }

    void RULE_4() {
        Product product = new Product("ABC#", new BigDecimal("1.50"), "Milk from cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_4");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE_4"), "RULE_4");
        checkResult(validationExceptions.get(0).getFieldName().equals("title"), "RULE_4");
        checkResult(validationExceptions.get(0).getDescription().equals("Title can be only latin and number"), "RULE_4");
        for (ValidationException validationException : validationExceptions) {
            System.out.println(validationException.getRuleName()+" "+validationException.getDescription()+" "+validationException.getFieldName());

        }
    }

    void RULE_5() {
        Product product = new Product("Milk", new BigDecimal((BigInteger) null), "Milk from cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_5");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE_5"), "RULE_5");
        checkResult(validationExceptions.get(0).getFieldName().equals("price"), "RULE_5");
        checkResult(validationExceptions.get(0).getDescription().equals("Price can not be empty"), "RULE_5");
    }

    void RULE_6() {
        Product product = new Product("Milk", new BigDecimal("-1.00"), "Milk from cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_6");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE-6"), "RULE_6");
        checkResult(validationExceptions.get(0).getFieldName().equals("price"), "RULE_6");
        checkResult(validationExceptions.get(0).getDescription().equals("Price can not be less then 0"), "RULE_6");
    }

    void RULE_7() {
        Product product = new Product("Milk", new BigDecimal("10.00"), "Milk from cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_7");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE-7"), "RULE_7");
        checkResult(validationExceptions.get(0).getFieldName().equals("description"), "RULE_7");
        checkResult(validationExceptions.get(0).getDescription().equals("Description can not be more than 2000 symbols"), "RULE_7");
    }
    void RULE_8() {
        Product product = new Product("Milk", new BigDecimal("10.00"), "Milk from cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_8");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE-8"), "RULE_8");
        checkResult(validationExceptions.get(0).getFieldName().equals("description"), "RULE_8");
        checkResult(validationExceptions.get(0).getDescription().equals("Description can be only latin or number"), "RULE_8");
    }

    private void checkResult(boolean conditions, String testName) {
        if (conditions) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}

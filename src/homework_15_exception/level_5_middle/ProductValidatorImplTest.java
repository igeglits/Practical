package homework_15_exception.level_5_middle;

import java.math.BigDecimal;
import java.util.List;

class ProductValidatorImplTest {
    ProductTitleValidationRule productTitleValidationRule = new ProductTitleValidationRule();
    private final ProductValidator productValidator = new ProductValidatorImpl(productTitleValidationRule,
            new ProductPriceValidationRule(),
            new ProductDescriptionValidationRule());

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.RULE_1_v1();
        test.RULE_1_v2();
        test.RULE_2();
        test.RULE_3();
        test.RULE_4();
        test.RULE_5();
        test.RULE_6();

        test.RULE_8();
        test.RULE_9();
        test.RULE_10();
    }

    void RULE_1_v1() {
        Product product = new Product(null, new BigDecimal("1.50"), "Milk from cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_1_v1");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE_1"), "RULE_1_v1");
        checkResult(validationExceptions.get(0).getFieldName().equals("title"), "RULE_1_v1");
        checkResult(validationExceptions.get(0).getDescription().equals("Title can not be empty"), "RULE_1_v1");
        printException(validationExceptions);
    }

    void RULE_1_v2() {
        Product product = new Product("", new BigDecimal("1.50"), "Milk from cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_1_v2");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE_1"), "RULE_1_v2");
        checkResult(validationExceptions.get(0).getFieldName().equals("title"), "RULE_1_v2");
        checkResult(validationExceptions.get(0).getDescription().equals("Title can not be empty"), "RULE_1_v2");
        printException(validationExceptions);
    }

    void RULE_2() {
        Product product = new Product("Mi", new BigDecimal("1.50"), "Milk from cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_2");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE_2"), "RULE_2");
        checkResult(validationExceptions.get(0).getFieldName().equals("title"), "RULE_2");
        checkResult(validationExceptions.get(0).getDescription().equals("Title can not be less then 3 symbols"), "RULE_2");
        printException(validationExceptions);
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
        printException(validationExceptions);
    }

    void RULE_4() {
        Product product = new Product("ABC 12", new BigDecimal("1.50"), "Milk from cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_4");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE_4"), "RULE_4");
        checkResult(validationExceptions.get(0).getFieldName().equals("title"), "RULE_4");
        checkResult(validationExceptions.get(0).getDescription().equals("Title can be only latin and number"), "RULE_4");
        printException(validationExceptions);
    }



    void RULE_5() {
        Product product = new Product("Milk",  null, "Milk from cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_5");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE_5"), "RULE_5");
        checkResult(validationExceptions.get(0).getFieldName().equals("price"), "RULE_5");
        checkResult(validationExceptions.get(0).getDescription().equals("Price can not be empty"), "RULE_5");
        printException(validationExceptions);
    }

    void RULE_6() {
        Product product = new Product("Milk", new BigDecimal("-1.00"), "Milk from cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_6");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE_6"), "RULE_6");
        checkResult(validationExceptions.get(0).getFieldName().equals("price"), "RULE_6");
        checkResult(validationExceptions.get(0).getDescription().equals("Price can not be less then 0"), "RULE_6");
        printException(validationExceptions);
    }

   /* void RULE_7() {
        Product product = new Product("Milk", new BigDecimal("10.00"), "Milk from cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_7");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE_7"), "RULE_7");
        checkResult(validationExceptions.get(0).getFieldName().equals("price"), "RULE_7");
        checkResult(validationExceptions.get(0).getDescription().equals("Price can be only in XX.YY format"), "RULE_7");
        printException(validationExceptions);
    }*/
    void RULE_8() {
        Product product = new Product("Milk", new BigDecimal("10.00"), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \" +\n" +
                "                \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, \" +\n" +
                "                \"quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \" +\n" +
                "                \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. \" +\n" +
                "                \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \" +\n" +
                "                \"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. \" +\n" +
                "                \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \" +\n" +
                "                \"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. \" +\n" +
                "                \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \" +\n" +
                "                \"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. \" +\n" +
                "                \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \" +\n" +
                "                \"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur." +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \" +\n" +
                "                \"Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, \" +\n" +
                "                \"quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \" +\n" +
                "                \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. \" +\n" +
                "                \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \" +\n" +
                "                \"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. \" +\n" +
                "                \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \" +\n" +
                "                \"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. \" +\n" +
                "                \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \" +\n" +
                "                \"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. \" +\n" +
                "                \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \" +\n" +
                "                \"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_8");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE_8"), "RULE_8");
        checkResult(validationExceptions.get(0).getFieldName().equals("description"), "RULE_8");
        checkResult(validationExceptions.get(0).getDescription().equals("Description can not be longer than 2000 symbols"), "RULE_8");
        printException(validationExceptions);

    }
    void RULE_9() {
        Product product = new Product("Milk", new BigDecimal("10.00"), "Milk%from%cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 1, "RULE_9");
        checkResult(validationExceptions.get(0).getRuleName().equals("RULE_9"), "RULE_9");
        checkResult(validationExceptions.get(0).getFieldName().equals("description"), "RULE_9");
        checkResult(validationExceptions.get(0).getDescription().equals("Description can contain only letters, digits, spaces, commas, dots and hyphens"), "RULE_9");
        printException(validationExceptions);
    }
    void RULE_10(){
        Product product = new Product(null, new BigDecimal(-1.00), "Milk@from@cow");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResult(validationExceptions.size() == 3, "RULE_10");
        checkResult(validationExceptions.stream().anyMatch(s -> "RULE_1".equals(s.getRuleName())), "RULE_10");
        checkResult(validationExceptions.stream().anyMatch(s -> s.getRuleName().equals("RULE_6")), "RULE_10");
        checkResult(validationExceptions.stream().anyMatch(s -> s.getRuleName().equals("RULE_9")), "RULE_10");
        printException(validationExceptions);
    }

    private void checkResult(boolean conditions, String testName) {
        if (conditions) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
    private static void printException(List<ValidationException> validationExceptions) {
        for (ValidationException validationException : validationExceptions) {
            System.out.printf("Rule name: %s, Description: %s, Field name: %s%n",
                    validationException.getRuleName(), validationException.getDescription(), validationException.getFieldName());
        }
    }
}

package homework_15_exception.level_5_middle;

class ProductDescriptionValidationRule implements ProductValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getDescription().length() > 2000) {
            throw new ValidationException("RULE_8", "Description can not be longer than 2000 symbols", "description");
        }
        if (!product.getDescription().matches("^[a-zA-Z0-9\\s.,-]*$")) {
            throw new ValidationException("RULE_9", "Description can contain only letters, digits, spaces, commas, dots and hyphens", "description");
        }
      /*  ^ - это начало строки. Этот символ указывает, что соответствие должно начинаться с начала строки.

        [a-zA-Z0-9\\s.,-] - это набор символов, который разрешен в строке. Он описывает следующее:

        a-zA-Z - латинские буквы в верхнем и нижнем регистрах.
        0-9 - цифры от 0 до 9.
        \\s - пробелы (или любой другой символ пробела).
        .,- - запятая, точка и дефис.
        * - это квантификатор, который означает, что предыдущий элемент
        (набор символов в данном случае) может повторяться ноль или более раз.

        $ - это конец строки. Этот символ указывает, что соответствие
        должно заканчиваться в конце строки.

        Таким образом, данное регулярное выражение соответствует строкам,
        содержащим только латинские буквы (верхний и нижний регистр), цифры, пробелы,
        запятые, точки и дефисы. Этот шаблон не допускает других символов в строке.*/
    }
}

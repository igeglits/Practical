package FraudDetector2;

abstract class FraudRule {
    abstract boolean isFraud(Transaction transaction);
    abstract String ruleName();
}


package FraudDetector2;

interface FraudRule {
    boolean isFraud(Transaction transaction);
}

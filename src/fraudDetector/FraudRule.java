package fraudDetector;

interface FraudRule {
boolean isFraud(Transaction transaction);
}

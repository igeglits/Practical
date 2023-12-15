package FraudDetector2;

class FraudRule2 extends FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount()==(1_000_000);
    }

    @Override
    String ruleName() {
        return "Rule 2";
    }
}

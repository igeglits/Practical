package FraudDetector2;

class FraudRule1 extends FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader=transaction.getTrader();
        return trader.getName().equals("Pokemon");
    }

    @Override
    public String ruleName() {
        return "Rule 1";
    }
}

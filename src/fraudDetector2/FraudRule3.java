package fraudDetector2;

class FraudRule3 extends FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Berlin");
    }

    @Override
    String ruleName() {
        return "Rule 3";
    }
}

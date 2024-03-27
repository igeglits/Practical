package fraudDetector2;

class FraudRule4 extends FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jamaica");
    }

    @Override
    String ruleName() {
        return "Rule 4";
    }
}

package FraudDetector2;

class FraudRule1 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader=transaction.getTrader();
        return trader.getName().equals("Pokemon");
    }
}

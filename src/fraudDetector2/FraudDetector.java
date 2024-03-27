package fraudDetector2;

class FraudDetector {
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getName().equals("Pokemon");
    }
}

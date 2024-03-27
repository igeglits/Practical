package fraudDetector;

class FraudRule1 implements FraudRule{
    public boolean isFraud(Transaction transaction){
        Trader trader = transaction.getTrader();
        var name = trader.getName();
        return name.equals("Pokemon");
    }
}

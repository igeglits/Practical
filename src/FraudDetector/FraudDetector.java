package FraudDetector;

class FraudDetector {
    boolean isFraud(Transaction transaction){
        Trader trader = transaction.getTrader();
        var name = trader.getName();
        if (name.equals("Pokemon")) return true;
        else return false;
    }
}

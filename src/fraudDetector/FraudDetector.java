package fraudDetector;

class FraudDetector {
//    boolean isFraud(Transaction transaction){
//        Trader trader = transaction.getTrader();
//        var name = trader.getName();
//        if (name.equals("Pokemon")) return true;
//        else return false;
    boolean isFraud(Transaction transaction){
    FraudRule rule1 = new FraudRule1();
    return rule1.isFraud(transaction);
    }


}

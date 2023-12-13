package FraudDetector2;

class FraudRuleDetector {
    FraudRule rule1=new FraudRule1();
    public boolean isFraud(Transaction transaction){
        return rule1.isFraud(transaction);
    }
}

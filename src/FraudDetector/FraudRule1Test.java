package FraudDetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule1Test {
    FraudRule1 rule1= new FraudRule1();
    @Test
    public void test1(){
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        boolean result = rule1.isFraud(transaction);
        assertTrue(result);
    }
    @Test
    public void test2(){
        Trader trader = new Trader("Zorro", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        boolean result = rule1.isFraud(transaction);
        assertFalse(result);
    }

}
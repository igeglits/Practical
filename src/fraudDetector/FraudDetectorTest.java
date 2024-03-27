package fraudDetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {
    FraudDetector fraudDetector = new FraudDetector();

    @Test
    public void test1(){
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        boolean result = fraudDetector.isFraud(transaction);
        assertTrue(result);
    }
    @Test
    public void test2(){
        Trader trader = new Trader("Zorro", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        boolean result = fraudDetector.isFraud(transaction);
        assertFalse(result);
    }

}
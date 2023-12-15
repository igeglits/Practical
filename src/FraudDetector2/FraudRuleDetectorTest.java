package FraudDetector2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRuleDetectorTest {
    FraudRuleDetector fraudRuleDetector=new FraudRuleDetector();
    Transaction transaction;
    @Test
    void testRule1(){
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        transaction = new Transaction(trader, 1000);
        FraudDetectorResult fraudDetectorResult = fraudRuleDetector.isFraud(transaction);
        assertTrue(fraudDetectorResult.isFraud());
        assertEquals(fraudDetectorResult.getRuleName(), "Rule 1");
    }
    @Test
    void testRule1Decent(){
        Trader trader = new Trader("Zorro", "Riga", "Latvia");
        transaction = new Transaction(trader, 1000);
        FraudDetectorResult fraudDetectorResult = fraudRuleDetector.isFraud(transaction);
        assertFalse(fraudDetectorResult.isFraud());
        assertNull(fraudDetectorResult.getRuleName());
    }

}
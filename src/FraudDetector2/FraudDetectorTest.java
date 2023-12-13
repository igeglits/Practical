package FraudDetector2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    @Test
    void reallyFraud() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudDetector.isFraud(transaction), "Rule 1");
    }

}
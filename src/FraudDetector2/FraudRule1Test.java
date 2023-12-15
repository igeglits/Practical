package FraudDetector2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule1Test {

    @Test
    void reallyFraud (){
        FraudRule1 fraudRule1=new FraudRule1();
        Trader trader = new Trader("Pokemon1", "RIga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudRule1.isFraud(transaction));
        assertEquals(fraudRule1.ruleName(),"Rule 1");
    }
    @Test
    void decentTransaction(){
        FraudRule1 fraudRule1=new FraudRule1();
        Trader trader = new Trader("Zorro", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudRule1.isFraud(transaction));
    }
}
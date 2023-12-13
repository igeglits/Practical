package FraudDetector2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule1Test {

    @Test
    void reallyFraud (){
        FraudRule1 fraudRule1=new FraudRule1();
        Trader trader = new Trader("Pokemon", "RIga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudRule1.isFraud(transaction),"Rule 1");
    }
}
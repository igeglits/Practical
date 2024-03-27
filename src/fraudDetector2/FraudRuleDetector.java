package fraudDetector2;

import java.util.ArrayList;
import java.util.List;

class FraudRuleDetector {

    FraudDetectorResult isFraud(Transaction transaction) {
        List<FraudRule> fraudRulesList = new ArrayList<>();
        fraudRulesList.add(new FraudRule1());
        fraudRulesList.add(new FraudRule2());
        fraudRulesList.add(new FraudRule3());
        fraudRulesList.add(new FraudRule4());
        for (FraudRule fraudRule : fraudRulesList) {
            if (fraudRule.isFraud(transaction)) {
                String ruleName = fraudRule.ruleName();
                return new FraudDetectorResult(true, ruleName);
            }
        }
        return new FraudDetectorResult(false, null);
    }

}

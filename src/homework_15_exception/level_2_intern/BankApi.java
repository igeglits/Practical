package homework_15_exception.level_2_intern;

import java.util.Optional;

interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws NoRoleCanSearchClient;

}


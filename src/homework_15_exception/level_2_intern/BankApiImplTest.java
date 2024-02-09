package homework_15_exception.level_2_intern;

import java.util.ArrayList;
import java.util.List;
class BankApiImplTest {
    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
    }

    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        BankClient client = new BankClient("1234", "Ivan Ivanov");
        BankClient client2 = new BankClient("123", "Petja Petrov");
        List<BankClient> clients = new ArrayList();
        clients.add(0, client);
        clients.add(1, client2);
        BankApi bankApi = new BankApiImpl(clients);

        List<Role> roles = new ArrayList();
        roles.add(0, Role.CAN_SEARCH_CLIENTS);
        roles.add(1, Role.CAN_SEARCH_CLIENTS);
        UserCredentials credentials = new UserCredentials(roles);


        try {
            bankApi.findByUid(credentials, "1234");
            System.out.println("TEST FAIL"); // потому что если мы дошли до этой строки,
            // значит что метод findByUid() не кинул ошибку, а он был должен сделать это
            // так как в credentials нет нужной роли
        } catch (NoRoleCanSearchClient e) {
            System.out.println("TEST OK");
        }

    }

}

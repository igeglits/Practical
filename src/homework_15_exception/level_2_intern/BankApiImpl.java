package homework_15_exception.level_2_intern;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static homework_15_exception.level_2_intern.Role.CAN_SEARCH_CLIENTS;


class BankApiImpl implements BankApi {
    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws NoRoleCanSearchClient {
        if (!credentials.hasRole(credentials, CAN_SEARCH_CLIENTS)) {
            throw new NoRoleCanSearchClient("Access denied because no role - Can Search Clients");
        } else {
            return clients.stream()
                    .filter(u -> Objects.equals(u.getUid(), uid))
                    .findFirst()
                    .map(client -> (BankClient) client)// Преобразуем клиента в BankClient (приведение типа)
                    .map(Optional::of)//оборачиваем Optional
                    .orElse(Optional.empty());
        }
        // если в credentials нет роли Role.CAN_SEARCH_CLIENTS
        // то метод должен кидать ошибку AccessDeniedException
        // иначе производить поиск клиента с указанным uid

    }
}

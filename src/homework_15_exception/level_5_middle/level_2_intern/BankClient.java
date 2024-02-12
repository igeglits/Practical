package homework_15_exception.level_5_middle.level_2_intern;

class BankClient {
    private String uid;      // уникальный идентификатор клиента
    private String fullName;

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}

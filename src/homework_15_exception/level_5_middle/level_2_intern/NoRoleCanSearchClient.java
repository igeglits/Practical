package homework_15_exception.level_5_middle.level_2_intern;

class NoRoleCanSearchClient extends Exception {
    NoRoleCanSearchClient(String message) {
        super(message);
    }
}

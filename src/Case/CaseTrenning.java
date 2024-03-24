package Case;

class CaseTrenning {
    public static void main(String[] args) {
        int monthNumber = 9;
        switch (monthNumber) {
            case 1, 4, 6 -> System.out.println("31 день");
            case 2, 5, 7 -> System.out.println("30 days");
            case 3, 8, 9 -> System.out.println("31 days");
            default -> System.out.println("wrong month");
        }
    }
}

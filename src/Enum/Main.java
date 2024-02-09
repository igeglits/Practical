package Enum;

class Main {
    public static void main(String[] args) {
        Subscription subscription = new Subscription();

        subscription.state = Subscription.SUBSCRIPTION_STATE_SUSPENDED;


    }
}

class Subscription {
    public static final int SUBSCRIPTION_STATE_NONE = 0;
    public static final int SUBSCRIPTION_STATE_ACTIVE = 1;
    public static final int SUBSCRIPTION_STATE_SUSPENDED = 2;
    String name;
    String description;
    int state;
}
class  Main2{
    public static void main(String[] args) {
        Subscription2 subscription = new Subscription2();

        subscription.state = Subscription2.State.SUSPENDED;
        System.out.println(Subscription2.State.valueOf("SUSPENDED"));
        System.out.println(Subscription2.State.NONE.toString());
        System.out.println(Subscription2.State.SUSPENDED.ordinal());
        System.out.println(Subscription2.State.values()[2]);

        switch (subscription.state){
            case NONE -> System.out.println("A");
            case ACTIVE -> System.out.println("B");
            case SUSPENDED -> System.out.println("C");
        }

    }
}

class Subscription2 {

    String name;
    String description;
    State state;
    enum State{
        NONE, ACTIVE, SUSPENDED;
    }
}
package enums;

public class Programs {
    public static void main(String[] args) {
        Subscription subscription = new Subscription();
        subscription.state = Subscription.State.SUSPENDED;
        System.out.println(Subscription.State.valueOf("ACTIVE"));
        System.out.println(Subscription.State.NONE.toString());
        System.out.println(Subscription.State.SUSPENDED.ordinal());
        System.out.println(Subscription.State.values()[2]);
    }
}

class Subscription{  // функционал доступен по подписке
    String name;
    String description;
    State state;
    enum State{
        NONE, ACTIVE, SUSPENDED;  //SUSPENDED - подвешенный
    }
}

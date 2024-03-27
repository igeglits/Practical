package exeptions;

class MeatNoMeatException {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();

        tiger.eat("meat");
        try {
            tiger.drink("water");
            try {
                tiger.drink("alko");
            } catch (NoWaterException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("This is finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class NoMeatException extends RuntimeException {
    NoMeatException(String message) {
        super(message);
    }
}

class NoWaterException extends Exception {
    NoWaterException(String message) {
        super(message);
    }
}

class Tiger {
    void eat(String message) {
        if (!message.equals("meat")) {
            throw new NoMeatException("Tiger dooesn`t eat " + message);
        } else {
            System.out.println("Tiger eats " + message);
        }
    }

    void drink(String message) throws NoWaterException {
        if (!message.equals("water")) {
            throw new NoWaterException("Tiger doesn`t drink " + message);
        } else {
            System.out.println("Tiger drinks " + message);
        }
    }
}

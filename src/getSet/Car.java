package getSet;

class Car {
private String color, engine;
private int doors;
    public Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }



    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public int getDoors() {
        return doors;
    }
}

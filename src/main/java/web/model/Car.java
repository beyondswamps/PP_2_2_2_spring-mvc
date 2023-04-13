package web.model;

public class Car {
    private String name;
    private String color;
    private Integer seats;

    public Car() {
    }

    public Car(String name, String color, Integer seats) {
        this.name = name;
        this.color = color;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", seats=" + seats +
                '}';
    }
}

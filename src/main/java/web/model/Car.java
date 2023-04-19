package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private String color;
    private Integer seats;

    public Car() {
    }

    public Car(String model, String color, Integer seats) {
        this.model = model;
        this.color = color;
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", seats=" + seats +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(seats, car.seats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, seats);
    }
}

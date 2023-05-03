import java.util.ArrayList;


public class CarList {
    private ArrayList<Car> cars;

    public CarList() {
        cars = new ArrayList<>();
    }

    public int size() {
        return cars.size();
    }

    public int indexOfRegNumber(String regNumber) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getRegNumber().equals(regNumber)) {
                return i;
            }
        }
        return -1;
    }

    public Car getCar(int index) {
        return cars.get(index);
    }

    public Car getCar(String regNumber) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getRegNumber().equals(regNumber)) {
                return cars.get(i);
            }
        }
        return null;

    }
    //a method addCar that takes a Car object as an argument and
    // adds this to the car list if the list does not already
    // contain a car with the same registration number
    public void addCar(Car car) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getRegNumber(). equals(car.getRegNumber()))
            {
                return;
            }

        }
        cars.add(car);
    }

    //toString method return a String with the properties
    // of each car int he list(each car on a separate line)
    @Override
    public String toString() {
        return "CarList:" + "cars=" + cars;
    }

}
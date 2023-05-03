public class Test
{
    public static void main(String[] args)
    {
        CarModelManager manager = new CarModelManager("Cars.txt");
        System.out.println(manager.getAllCars());

        CarList cars = manager.getAllCars();

        Owner owner = new Owner("anna", "Lester");
        Car car = new Car("cvb 678", "kia", "Skoda", 2022, owner);
        cars.addCar(car);

        manager.addCars(cars);
        System.out.println(manager.getAllCars());
    }
}

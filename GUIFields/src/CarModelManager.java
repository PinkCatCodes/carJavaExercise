import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CarModelManager
{
    //represents access point to model (owner, car, CarLIst
    // and containing methods using file functionality
    //(MyFileHandler)
    // file need to be in the same directory as the classes and you need to specify its extension .txt
    private String fileName;

    public CarModelManager(String fileName)
    {
        this.fileName = fileName;
    }

    public CarList getAllCars()
    {
        //they need to be accessed through out the method
        Scanner in = null;
        File file = null;
        CarList carlist = new CarList(); //creating new carlist obj

        try
        {
            file = new File(fileName);
            in = new Scanner(file);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        int i = 0;
        //checking if there is some line after
        while (in.hasNext())
        {
            String line = in.nextLine();
            String[] token = line.split(",");
            String regNumber = token[0].trim();
            String make = token[1].trim();
            String model = token[2].trim();
            int year = Integer.parseInt(token[3].trim());
            String firstName = token[4].trim();
            String lastName = token[5].trim();
            //creating owner, car obj and returning
            Owner owner = new Owner(firstName, lastName);
            Car car = new Car(regNumber, make, model, year, owner);
            //adding car in the car list
            carlist.addCar(car);

        }
        return carlist;
    }

    public void addCar(Car car)
    {
        PrintWriter out = null;//creating a class that helps to get object to a text file
        File fileSecond = null; // creating file has to be set to be null because  then  it is  initialized
        //both of these files could be inside try method, but if it was
        // a main method  then anyhting in try{} is lacal variable

        try
        {
            fileSecond = new File(fileName);//creating new file, assigning value to the variable
            out = new PrintWriter(fileSecond);
            out.println(car);
            out.flush();// flushes car into their destination e.g. car list

        } catch (FileNotFoundException e)

        {
            e.printStackTrace();
        } finally
        {
            out.close();//always close and be terminated because of the finaly clause
        }


    }

    public void addCars(CarList cars)
    {
        PrintWriter out = null;//creating a class that helps to get object to a text file
        File fileSecond = null; // creating file has to be set to be null because  then  it is  initialized
        //both of these files could be inside try method, but if it was
        // a main method  then anyhting in try{} is lacal variable

        try
        {
            fileSecond = new File(fileName);//creating new file, assigning value to the variable
            out = new PrintWriter(fileSecond);
            for ( int i=0; i<cars.size(); i++){
                out.println(cars.getCar(i));
            }
            out.flush();// flushes car into their destination e.g. car list

        } catch (FileNotFoundException e)

        {
            e.printStackTrace();
        } finally
        {
            out.close();//always close and be terminated because of the finaly clause
        }

    }

}

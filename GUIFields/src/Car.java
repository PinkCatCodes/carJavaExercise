public class Car {
    private String regNumber;
    private String make;
    private String model;
    private int year;
    private Owner owner;

    public Car(String regNumber, String make, String model, int year, Owner owner) {
        this.regNumber = regNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.owner = owner;

    }



    public String getMake() {
        return make;
    }


    public String getModel() {
        return model;
    }


    public String getRegNumber() {
        return regNumber;
    }



    public int getYear() {
        return year;
    }



    public Owner getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return regNumber +","+
                model+","+ make+","+year+","+owner.getFirstName()+","+owner.getLastName();
    }

    //An equals method returning true if two Car-objects have the same registration number, make,
    //model, year, and owner.
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car other = (Car) obj;
            if (regNumber.equals(other.regNumber) && make.equals(other.make) &&
                    model.equals(other.model) && owner.equals(other.owner) &&
                    year == (other.year))
            {
                return true;
            }
        }
        return false;
    }
}
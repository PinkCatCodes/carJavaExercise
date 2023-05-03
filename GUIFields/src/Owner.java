public class Owner {
    private String firstName;
    private String lastName;

    public Owner(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Owner: "+firstName+" "+ lastName;
    }

    //An equals method returning true if two
    // Owner-objects have the same first and last name.
    public boolean equals(Object obj) {
        if (!(obj instanceof Owner)) {//now we are comparing if the object is the same type as this class
            return false;
        }
        Owner other = (Owner) obj;
        return firstName.equals(other.firstName) && lastName.equals(other.lastName);

           // or return firstName.equals(((Owner) obj).firstName) && lastName.equals(((Owner) obj).lastName);

        }

    }

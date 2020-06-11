public class Person {
    String firstName;
    String lastName;
    int yearOfBirth;
    int monthOfBirth;
    int dayOfBirth;
    int hourOfBirth;
    String address;

    public Person() {
        System.out.println("Default Person constructor called");
        firstName = "";
        lastName = "";
        yearOfBirth = 2000;
        monthOfBirth =1;
        dayOfBirth = 1;
        hourOfBirth = 0;
        address = "";
    }

    public Person(String first, String lastName) {
        this();
        System.out.println("Parameterized constructor called");
        firstName = first;
        this.lastName = lastName;
    }

    public String getFullName() {
        String fullName = firstName + "" + lastName;
        return fullName;
    }

    public void setDateofBirth(int day, int month, int year) {
        dayOfBirth = day;
        monthOfBirth = month;
        yearOfBirth = year;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

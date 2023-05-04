import java.util.OptionalInt;

public class Person {

    protected final String name;
    protected final String surname;
    protected final int age;
    protected final String address;

    public static class PersonBuilderInternal {

    }

    public Person(String name, String surname, int age, String address) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        boolean hasAge;
        if (this.age != 0) {
            hasAge = true;
        } else hasAge = false;
        return hasAge;
    }

    public boolean hasAddress() {
        boolean hasAddress;
        if (this.address != null) {
            hasAddress = true;
        } else hasAddress = false;
        return hasAddress;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {
        if (this.hasAge()) {
            return OptionalInt.of(this.age);
        } else {
            return OptionalInt.empty();
        }
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) { /*...*/ }

    public void happyBirthday() { /*...*/ }

    @Override
    public String toString() {
        return this.name + " " + this.surname + ", " + this.age + ", from " + this.address;
    }

}

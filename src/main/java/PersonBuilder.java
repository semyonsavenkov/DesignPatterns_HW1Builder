public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public Person person;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age can not be less than zero");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException {
        if (surname == null || name == null) {
            throw new IllegalStateException("fields name and surname are required");
        } else {
            Person person = new Person(name, surname, age, address);
            return person;
        }
    }

    public PersonBuilder newChildBuilder(Person parent) {
        PersonBuilder childBuilder = new PersonBuilder();
        childBuilder.setSurname(parent.getSurname());
        childBuilder.setAge(1);
        childBuilder.setAddress(parent.getAddress());
        return childBuilder;
    }

}

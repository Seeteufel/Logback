package intro.tasks;

public class Person {

    private String name;
    private String last_name;
    private Address address;
    private int age;

    public Person(String name, String last_name, Address address, int age) {
        this.name = name;
        this.last_name = last_name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Address getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address=" + address +
                ", age=" + age +
                '}';
    }
}

package Day6.Q2nd;

public class PhoneBook {
    public String name;
    public int number;

    public PhoneBook(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}

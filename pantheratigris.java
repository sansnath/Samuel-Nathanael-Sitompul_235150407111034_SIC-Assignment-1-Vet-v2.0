package pemlan2;

public class pantheratigris {
    String id;
    String name;
    String colour;
    int yearOfBirth;
    int yearnow = 2024;

    String eat() {
        return "Rau rau rau...";
    }

    void roar() {
        System.out.println("Roooaaar...!");
    }

    Integer age() {
        return yearnow - yearOfBirth;
    }
}

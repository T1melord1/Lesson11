public class Main {
    public static void main(String[] args) {

        Human vasya = new Human("Вася",  "m", 51);
        vasya.walk();
        System.out.println("Имя " + vasya.name + " возраст " + vasya.age + " пол " + vasya.gender);

        Human petya = new Human("Петя", "f", 13);
        petya.walk();
        System.out.println("Имя " + petya.name + " возраст " + petya.age + " пол " + petya.gender);

    }
}
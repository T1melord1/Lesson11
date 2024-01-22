public class Main {
    public static void main(String[] args) {
        Human vasya = new Human();
        vasya.age = 51;
        vasya.name = "Вася";
        vasya.gender = "m";

        System.out.println("Имя " + vasya.name + " возраст " + vasya.age + " пол " + vasya.gender);

        Human petya = new Human();
        petya.age = 13;
        petya.name = "Петя";
        petya.gender= "f";

        System.out.println("Имя " + petya.name + " возраст " + petya.age + " пол " + petya.gender);

    }
}
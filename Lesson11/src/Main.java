public class Main {
    public static void main(String[] args) {
        Human vasya = new Human();
        vasya.age = 51;
        vasya.name = "Вася";
        vasya.gender = "m";

        System.out.println("Имя " + vasya.name + " возраст " + vasya.age + " пол " + vasya.gender);
    }
}
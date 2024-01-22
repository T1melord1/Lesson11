public class Human {
    String name;
    String gender;
    int age;

    public Human(){

    }
    public Human(String humanName, int humanAge){
        this.name = name;
        this.age = age;
    }
    public Human(String humanName, String humanGender, int humanAge){
    this.name = name;
    this.gender = gender;
    this.age = age;
}

    public void walk(int stepsCount){
        System.out.println(name+ " прошёл " + stepsCount+ " шагов");
    }

}


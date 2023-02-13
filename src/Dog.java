public class Dog {


    //instance variables
    private int age;
    private String name;
    private String color;

    //constructor 1
    public Dog() {
        age = 0;
        name = " ";
        color = " ";

    }

    //constructor 2
    public Dog(int dogAge, String dogName, String dogColor) {
        age = dogAge;
        name = dogName;
        color = dogColor;
    }

    //getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    //setters
    public void setAge(int age) {
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //methods
    private void addOneAge() {
        age += 1;
    }

    public int birthday() {
        addOneAge();
        return age;
    }

    public String toString() {
        return "The dog is named " + name + " and is " + age + " years old." + " This dog is " + color + ".";
    }


}

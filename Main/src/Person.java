 class Person {

    private String name;
    private String designation;


    void learn()
    {
        System.out.println("I Can learn");
    }
    void walk()
    {
        System.out.println("I Can walk");
    }
    void eat()
    {
        System.out.println("I Can eat");
    }
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Singer singer = new Singer();
        Dancer dancer = new Dancer();
        System.out.println("I'm a Programmer");
        programmer.learn();
        programmer.eat();
        programmer.walk();
        programmer.coding();
        System.out.println("I'm a Singer");
        singer.learn();
        singer.eat();
        singer.walk();
        singer.playGuitar();
        singer.singing();
        System.out.println("I'm a Dancer");
        dancer.learn();
        dancer.eat();
        dancer.walk();
        dancer.dancing();
    }


} 
 

 

 
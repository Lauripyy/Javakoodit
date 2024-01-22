package main;

public class Hedgehog {
    String name;
    int age;
    String text;


    public Hedgehog() {
        name = "Pikseli";
        age = 5;

    
    }
    public Hedgehog(String name, int age){
        this.name=name;
        this.age=age;

    }

    public void speak(String text) {
        System.out.println(name +": "+text);
    }

    /*
    public void run(int rounds, String name) {
        if (rounds < 0) {
            return;
        }
        System.out.println(name+ "juoksee kovaa vauhtia.");
        run(rounds - 1);
        */

    }
    
    

}
public class Power_ranger {

    String color;
    String helmet;
    String weapon;

    //construtor

    //syntax of constructor = class name + (pass attributes) + {this.attributName = this.attributeName}

    Power_ranger (String color, String helmet, String weapon){
        this.color = color;
        this.helmet = helmet;
        this.weapon = weapon;
    }
    //syntax of method = return type + method name + () + {}

    /*shoot
    run
    attack
     */
    void shoot(){
        System.out.println("He can shoot");
    }
    void run(){
        System.out.println("He can run");
    }
    void attack(){
        System.out.println("He can walk");
    }
    void information(){
        System.out.println(color);
        System.out.println(helmet);
        System.out.println(weapon);
    }
    void Ranger(){
        System.out.println(color);
        System.out.println(helmet);
        System.out.println(weapon);
    }
}



package JavaWithStumi;

import JavaWithStumi.Human;

public class HumanRunningThingy {
	
    public static void main(String[] args) {
        Human yuna = new Human("yuna ji", 25, 'f', 158, 48);
        yuna.learnJava();

        Human stumi = new Human("Stumici", 24, 'm', 178, 68);
        stumi.learnJava();
        
        Human yunasChild = yuna.beAParent();
        System.out.println(yunasChild.getName());
        
        //Math is static
        System.out.println(Math.random());
    }
}

package JavaWithStumi;

public class Human {
	private String name;
    private int bday;
    private char sex;
    private double heightcm;
    private double weightkg;
    private boolean rich;

    public Human(String name, int bday, char sex, double heightcm, double weightkg) {
        this.name = name;
        this.bday = bday;
        this.sex = sex;
        this.heightcm = heightcm;
        this.weightkg = weightkg;
        this.rich = false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Human beAParent(){
        return new Human("Florian", (int) System.currentTimeMillis() * 1000, 'n', 20, 3.5);
    }

    public boolean learnJava(){
        System.out.println(this.name + " learns Java");
        if(Math.random() == 0.00002){
            this.getRich();
        }
        return this.rich;

    }

    private void getRich(){
        System.out.println(this.name+" got rich baby");
        this.rich = true;
    }
}

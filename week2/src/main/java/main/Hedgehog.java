package main;

public class Hedgehog {

    private String name;
    private int age;

    public Hedgehog() {
        name = "Pikseli";
        age = 5;
    }

    public Hedgehog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setAge(int newAge) {
        if (newAge < 0 || newAge > 100) {
            System.out.println("Syöte oli väärä");
            return;
        }
        this.age = newAge;
    }

    public void speak(String speaking) {
        System.out.println(this.name + ": " + speaking);
    }

    public void run(int num) {
        for (int i=0; i<num; i++){
            System.out.println(this.name +" juoksee kovaa vauhtia!");
        }
    }

    public String toString() {
        String ret = "Olen " + this.name + " ja ikäni on " + this.age + " vuotta, mutta antaisitko silti syötteen?";
        return ret;
    }
}

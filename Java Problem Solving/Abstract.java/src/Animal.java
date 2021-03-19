abstract class Animal {
    String name,colour;
    double weight;
    public Animal(){
        this.name=name;
        this.colour=colour;
        this.weight=weight;
    }
    public void eat(){
        System.out.println(name+" Eat");
    }
    public abstract void makeSound();
}

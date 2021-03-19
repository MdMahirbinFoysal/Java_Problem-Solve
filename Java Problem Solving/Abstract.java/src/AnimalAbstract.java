public class AnimalAbstract {
    public static void main(String[] args) {
        Bird b=new Bird();
        b.eat();
        System.out.println("Bird sound:");
        b.makeSound();
        Tiger t=new Tiger();
        t.eat();
        System.out.println("Tiger Sound: ");
        t.makeSound();
    }
}

class Bird extends Animal implements Flyable, Floatable{
    public void fly() {
        System.out.println("Bird can fly in the " + Flyable.media);
    }

    public  boolean needFuel(){
        return false;
    }
    public void canFloat() {
        System.out.println("Bird can float in air.");
    }
}

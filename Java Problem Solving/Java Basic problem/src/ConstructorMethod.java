 class ConstructorMethod101{
    //Constractor with out parameter
    public ConstructorMethod101(){
        System.out.println("Wellcome to Uap");
    }
    //Constractor Method with parameter
    public ConstructorMethod101(String prm){
        System.out.println("This is Constructor Method whit parameter :"+prm);
    }
    //This is Instance method
    public void instancemethod(){
        System.out.println("Emon");
    }
}
public class ConstructorMethod {
    public static void main(String args[]){
        //creating object for default constractor method
        ConstructorMethod101 method1=new ConstructorMethod101();
        method1.instancemethod();
        ConstructorMethod101 method2=new ConstructorMethod101("What do you want");
        method2.instancemethod();
    }

}

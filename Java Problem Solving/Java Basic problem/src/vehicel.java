class vehicel1 {
        String vname;
        String bname;
        int myear;
        public vehicel1(String vehicel1Vname,String vehicel1Bname,int vehicel1Myear){
            vname=vehicel1Vname;
            bname=vehicel1Bname;
            myear=vehicel1Myear;
            System.out.println("vehicel name is:"+vehicel1Vname);
            System.out.println("vehicel Brand is:"+vehicel1Bname);
            System.out.println("vehicel Model year is:"+vehicel1Myear);
    }
    public void start(){
            System.out.println("Licence supmited");
    }
}
public class vehicel{
    public static void main(String args[]){
        vehicel1 v1=new vehicel1("Car","Toyota",2010);
        v1.start();
        vehicel1 v2=new vehicel1("micro","Ford",2015);
        v2.start();
        vehicel1 v3=new vehicel1("Noha","Mitshubishi",2017);

    }
}

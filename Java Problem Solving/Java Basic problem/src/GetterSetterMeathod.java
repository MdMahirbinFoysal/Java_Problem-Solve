public class GetterSetterMeathod {
        String name;
        String model;
        int year;
    //Using constractor method
        public GetterSetterMeathod(String n,String m,int y){
            this.name=n;
            this.model=m;
            this.year=y;
        }
        //Using getter meathod
        public String getName(){
            return name;
        }
        public String getModel(){
            return model;
        }
        public int getYear(){
            return year;
        }
        //using setter meathod
    public void setName(String Nname){
            this.name=Nname;
    }
    public void setModel(String Mmodel){
        this.model=Mmodel;
    }
    public void setYear(int Yyear){
        this.year=Yyear;
    }
    public static void main(String args[]){
            GetterSetterMeathod gs1=new GetterSetterMeathod("Toyota","Prius",2015);
            System.out.println(gs1.getName());
            System.out.println(gs1.getModel());
            System.out.println(gs1.getYear());
            gs1.setName("Honda");
            gs1.setModel("Vazel");
            gs1.setYear(2018);
            System.out.println(gs1.getName());
            System.out.println(gs1.getModel());
            System.out.println(gs1.getYear());
    }

    }


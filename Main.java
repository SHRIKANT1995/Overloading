package NewCodes;

public class Main {
    public static void main(String[] args){
        Add add= new Add(2,2,2,2,2);
        Add add1= new Add(2,2,2,2);
        Add add2= new Add(2,2,2);
        Add add3= new Add(2,2,);

        add.PrintSum();
        add1.PrintSum();
        add2.PrintSum();
        add3.PrintSum();

    }

}

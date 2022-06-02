public class Question44 {
    public static void main(String[] args) {
        int r1= (301+0) /5;
       double r2= 7.0e-6 * 10000000;
       boolean r3= true && true;
       boolean r4= false && true;
       boolean r5= (false && false) || (true && true);
       boolean r6= (false || false) && (true && true);

       System.out.println("(301+0)/5->" +r1);
       System.out.println("(7.0e-6 * 1000000)->" +r2);
       System.out.println("(true && true)->" +r3);
       System.out.println(r4);
       System.out.println(r5);
       System.out.println(r6);
    }

}

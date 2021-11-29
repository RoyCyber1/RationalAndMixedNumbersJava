public class Main {

 public static void main(String[] args) {
     try {

         RationalNumber e = new RationalNumber(15, 25);
         RationalNumber w = new RationalNumber(4, 7);
         RationalNumber x = new RationalNumber(15,-25);
         RationalNumber m = new RationalNumber(-40,35);


         System.out.println(e.toString());
         System.out.println( e.equals(x));

         w.setNumerator(3);
         w.setDenominator(5);

         System.out.println(x);

         System.out.println(m);




         e =e.sub(w);
         System.out.println(e.GetNumerator());
         System.out.println(e.GetDenominator());
         System.out.println(e.toString());

         e = e.add(w);
         System.out.println(e.GetNumerator());
         System.out.println(e.GetDenominator());
         System.out.println(e.toString());


         e = e.divide(w);
         System.out.println(e.GetNumerator());
         System.out.println(e.GetDenominator());
         System.out.println(e.toString());

         e = e.multiply(w);
         System.out.println(e.GetNumerator());
         System.out.println(e.GetDenominator());


         System.out.println(e.toString());
         System.out.println(e.GetNumerator());
         System.out.println(e.GetDenominator());




     }catch(Exception e){

     }




    }
}

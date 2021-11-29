public class MixedNumberTest {


    public static void main(String[] args) {
        try {
            MixedNumber x = new MixedNumber(2, 2, 3);
            MixedNumber m = new MixedNumber(-22, 2, 3);
            MixedNumber n = new MixedNumber(2, -7, -14);
            MixedNumber r = new MixedNumber(2, 14, 14);
            MixedNumber s = new MixedNumber(2, 17, -3);
            MixedNumber z = new MixedNumber(-1, 1, 1);

            System.out.println( x.toString());
            System.out.println( m.toString());
            System.out.println( n.toString());
            System.out.println( r.toString());
            System.out.println( s.toString());
            System.out.println( z.toString());


        }catch(Exception e){

        }
      }
    }

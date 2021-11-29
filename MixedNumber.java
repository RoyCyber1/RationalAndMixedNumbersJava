public class MixedNumber extends RationalNumber {

    private int whole;


    public MixedNumber() {
        super();
        whole = 0;
    }


    public MixedNumber(int w, int num, int dem) throws Exception {
        super(num, dem);
        whole = w;

    }

    public MixedNumber(MixedNumber rhs) throws Exception {
        super(rhs);
        this.whole = rhs.whole;
    }


    public String toString() {
        try {

            RationalNumber a = this.Simplify(this);
            MixedNumber x = new MixedNumber(this.whole, a.GetNumerator(), a.GetDenominator());

            RationalNumber wh = new RationalNumber(this.whole, 1);
            RationalNumber rat = new RationalNumber(this.numerator, this.denominator);
            if (Math.abs(this.numerator) > Math.abs(this.denominator)) {
                String st = super.toString();
                x.whole = x.whole + Integer.parseInt(st.substring(0, 1));
                String fra = st.substring(1, st.length());
                return x.whole + fra;
            }
            return wh.add(rat).toString();
        } catch (Exception e) {

        }
        return "";

//        RationalNumber a = this.Simplify(this);
//        try {
//            MixedNumber x = new MixedNumber(this.whole, a.GetNumerator(), a.GetDenominator());
//            this.setNumerator(a.GetNumerator());
//            this.setDenominator((a.GetDenominator()));
//
//            //Whole number and fraction
//            if (x.whole != 0 && Math.abs(x.GetNumerator()) != Math.abs(x.GetDenominator()) && Math.abs(x.GetNumerator()) > 0 && Math.abs(x.GetDenominator()) > 0) {
//                if (Math.abs(x.GetNumerator())>Math.abs(x.GetDenominator())){
//                   String st = super.toString();
//                   x.whole = x.whole + Integer.parseInt(st.substring(0,1)) ;
//                   String fra = st.substring(1,st.length());
//                   return x.whole  +fra;
//                }
//else return x.whole +" "+ super.toString();
//            }
//
//            //Whole number
//            if (x.GetNumerator() / x.GetDenominator() == 0 || Math.abs(x.GetNumerator()) / Math.abs(x.GetDenominator()) == 1) {
//
//                if (x.whole > 0 && x.GetNumerator() < 0 || x.GetNumerator() < 0) {
//                    return x.whole * -1 + " ";
//                }
//                if (x.whole > 0 && x.GetNumerator() < 0 && x.GetDenominator() < 0) {
//                    return x.whole + " ";
//                }
//                if (x.whole < 0 && x.GetNumerator() < 0 && x.GetDenominator() < 0) {
//                    return x.whole + " ";
//
//                }
//                if (x.whole < 0 && x.GetNumerator() < 0 || x.GetDenominator() < 0) {
//                    return x.whole * -1 + "";
//                } else return x.whole + " ";
//
//            }
//            //just Fraction
//            if (x.whole == 0 && x.GetNumerator()<x.GetDenominator()) {
//                return super.toString();
//            }
//
//
//           else return x.whole + " " + super.toString();
//
//
//        } catch (Exception e) {
//
//        }
//        return this.whole +super.toString();
//    }
//
    }


}

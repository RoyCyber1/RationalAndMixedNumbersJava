
public class RationalNumber {

    protected int numerator;
    protected int denominator;

    //Exception on the Constructor and Setter for Setting denominator to 0

    public RationalNumber() {
        numerator = 0;
        denominator = 1;
    }


    public RationalNumber(int n, int d) throws Exception {
        if (d == 0) {
            throw new Exception("Cant have 0 in the denominator");
        }
        numerator = n;
        denominator = d;
    }

    public RationalNumber(RationalNumber rhs) throws Exception {
        if (rhs.denominator == 0) {
            throw new Exception("cant have 0 in denominator");
        }
        this.numerator = rhs.numerator;
        this.denominator = rhs.denominator;
    }

    public int GetNumerator() {
        return this.numerator;
    }

    public int GetDenominator() {
        return this.denominator;
    }

    void setNumerator(int num){
      this.numerator = num;
    }

    void setDenominator(int num){
        this.denominator = num;

    }

    public String toString() {

        RationalNumber simple = this.Simplify(this);


        if (simple.numerator == 0) {
            return simple.numerator + "/" + simple.denominator + "= 0";
        } else if (simple.denominator == simple.numerator) {
            if (simple.numerator * -1 < simple.numerator && simple.denominator * -1 > simple.denominator) {
                return "-1";
            } else return "1";
        }
        if (simple.numerator * -1 > 0 && simple.denominator * -1 > 0) {
            simple.numerator = simple.numerator * -1;
            simple.denominator = simple.denominator * -1;
        }
            if((Math.abs(simple.numerator) < Math.abs(simple.denominator))){
                if (simple.numerator * -1 > 0 && simple.denominator * -1 > 0) {
                    return simple.numerator * -1 + "/" + simple.denominator * -1;
                } else if (simple.numerator * -1 < simple.numerator && simple.denominator * -1 > simple.denominator) {
                    return "" + simple.numerator * -1 + "/" + simple.denominator * -1 + "";
                }
            }


         if (Math.abs(simple.numerator) > Math.abs(simple.denominator)) {

             int q = (int) simple.numerator / simple.denominator;
             int rem = (int) simple.numerator % simple.denominator;
             simple.numerator = rem;
             if(q *-1 >0 && simple.numerator*-1 >0){
                 simple.numerator = simple.numerator*-1;
             }
             if (simple.numerator * -1 < simple.numerator && simple.denominator * -1 > simple.denominator && q * -1 > q) {
                 q = q * -1;
                 simple.numerator = simple.numerator * -1;
                 simple.denominator = simple.denominator * -1;
             }
             if (simple.numerator == 0) {
                 return q + "";
             }
             if (q == 0) {
                 return simple.numerator + "/" + simple.denominator;
             }


             else return q + " " + simple.numerator + "/" + simple.denominator;


         }

       if (!canSimplify(simple)) {
            if (simple.numerator * -1 > simple.numerator && simple.denominator * -1 > simple.denominator) {
                return simple.numerator * -1 + "/" + simple.denominator * -1;
            } else if (simple.numerator * -1 < simple.numerator && simple.denominator * -1 > simple.denominator) {
                return "" + simple.numerator * -1 + "/" + simple.denominator * -1 + "";
            } else return simple.numerator + "/" + simple.denominator;
        }
        return "";
    }



    public RationalNumber add(RationalNumber rhs) {
        if (this.denominator == rhs.denominator) {
            try {
                int n = this.numerator + rhs.numerator;
                RationalNumber a = new RationalNumber(n, this.denominator);
                return a;
            } catch (Exception e) {

            }
        }
        int i = 2;
        while (this.denominator != rhs.denominator) {
            if (this.denominator * i == rhs.denominator) {
                int sum = this.numerator * i + rhs.numerator;
                try {
                    RationalNumber a = new RationalNumber(sum, this.denominator * i);
                    return a;
                } catch (Exception e) {

                }

            } else if (this.denominator == rhs.denominator * i) {
                int sum = this.numerator + rhs.numerator * i;
                try {
                    RationalNumber a = new RationalNumber(sum, rhs.denominator * i);
                    return a;
                } catch (Exception e) {

                }
            } else if (this.denominator * i == rhs.denominator * i) {
                int sum = this.numerator * i + rhs.numerator * i;
                try {
                    RationalNumber a = new RationalNumber(sum, this.denominator * i);
                } catch (Exception e) {
                }


            }
            i++;

        }

        return this;
    }

    public RationalNumber sub(RationalNumber rhs) {
        if (this.denominator == rhs.denominator) {
            try {
                int n = this.numerator - rhs.numerator;
                RationalNumber a = new RationalNumber(n, this.denominator);
                return a;
            } catch (Exception e) {

            }
        }
        int i = 2;
        while (this.denominator != rhs.denominator) {
            if (this.denominator * i == rhs.denominator) {
                int dif = this.numerator * i - rhs.numerator;
                try {
                    RationalNumber a = new RationalNumber(dif, this.denominator * i);
                    return a;
                } catch (Exception e) {

                }

            } else if (this.denominator == rhs.denominator * i) {
                int dif = this.numerator - rhs.numerator * i;
                try {
                    RationalNumber a = new RationalNumber(dif, rhs.denominator * i);
                    return a;
                } catch (Exception e) {

                }
            } else if (this.denominator * i == rhs.denominator * i) {
                int dif = this.numerator * i - rhs.numerator * i;
                try {
                    RationalNumber a = new RationalNumber(dif, this.denominator * i);
                } catch (Exception e) {
                }


            }
            i++;
        }
        return this;
    }
    public RationalNumber multiply(RationalNumber rhs) {
        int num = this.numerator * rhs.numerator;
        int dem = this.denominator *rhs.denominator;
        try {
            RationalNumber a = new RationalNumber(num, dem);
            return a;
        }catch(Exception e){

        }
        return this;


    }
    public RationalNumber divide (RationalNumber rhs) {
        int num = this.numerator * rhs.denominator;
        int dem = this.denominator *rhs.numerator;
        try {
            RationalNumber a = new RationalNumber(num, dem);
            return a;
        }catch(Exception e){

        }
        return this;


    }



    public boolean equals(RationalNumber rhs) {
        if (this.numerator == rhs.numerator && this.denominator == rhs.denominator) {
            return true;
        }
        return false;
    }

/*
    private int LCM(int d1, int d2) {
        if (d1 == d2) {
            return 1;
        } else {
            int i = 2;
            while (d1 != d2) {

                if (d1 * i == d2 * i || d1 * i == d2 || d1 == d2 * i) {
                    return i;
                }
                i++;
            }
        }
        return 0;

    }
*/
    protected RationalNumber Simplify(RationalNumber num) {

        // add when 15/15 ==1 and when num.denom< num.numerator
        if (Math.abs(num.denominator) > Math.abs(num.numerator)) {
            for (int i = 2; i <= Math.abs(num.denominator); i++) {
                while (num.numerator % i == 0 && num.denominator % i == 0) {
                    try {
                        num.numerator = num.numerator/i;
                        num.denominator= num.denominator/i;

                    } catch (Exception e) {

                    }
                }

            }
            try {
                RationalNumber a = new RationalNumber(num.numerator, num.denominator);
                return a;
            }catch(Exception e){

            }
        }
           else if (Math.abs(num.denominator) < Math.abs(num.numerator)) {
                for (int x = 2; x <= Math.abs(num.numerator); x++) {
                    while (num.numerator % x == 0 && num.denominator % x == 0) {
                        try {
                            num.numerator = num.numerator/x;
                            num.denominator= num.denominator/x;

                        } catch (Exception e) {

                        }
                    }

                }
            try {
                RationalNumber a = new RationalNumber(num.numerator, num.denominator);
                return a;
            }catch(Exception e){

            }

            }


        return this;
        }



        protected boolean canSimplify (RationalNumber rhs) {

            if (Math.abs(rhs.denominator) > Math.abs(rhs.numerator)) {
                for (int i = 2; i <= Math.abs(denominator); i++) {
                    if (numerator % i == 0 && denominator % i == 0) {
                        return true;
                    }
                }
            }
           else if (Math.abs(rhs.denominator) < Math.abs(rhs.numerator)) {
               for(int i =2; i<=Math.abs(numerator); i++){
                 if (this.numerator % i == 0 && this.denominator % i == 0) {
                     return true;
                 }
            }


                    }



            return false;
        }

    }


package com.delta.deltacontrolflow;

/**
 * Created by spawrks on 10/30/13.
 */
public class Gonzo {

    public String numberStuffOnString(int a, int b, int c, String what ){

        Fraction myFraction = new Fraction(a);
        Fraction myOtherFraction = new Fraction(b,c);
        myFraction.add(myFraction);
        myOtherFraction.divide(myFraction);

        if (myOtherFraction.divide(myFraction.add(myOtherFraction)).denominator > myOtherFraction.divide(myFraction).numerator){
            what = "spawrksrules";
        }

        return what;
    }

    public class Fraction {
        private int numerator; //Numerator of fraction
        private int denominator; //Denominator of fraction

        public Fraction(int num, int denom) { //Constructor
            numerator = num;
            denominator = denom;
        }

        public Fraction() { //Constructor w/ no parameters
            new Fraction(0, 1);
        }

        public Fraction(int num) { //Constructor w/ numerator parameter
            numerator = num;
            int denom = 1;
        }

        public int getNumerator() { //getNumerator method
            return numerator;
        }

        public int getDenominator() { //getDenominator method
            return denominator;
        }

        public void setNumerator(int num) { //setNumerator method
            numerator = num;
        }

        public void setDenominator(int denom) { //setDenominator method
            denominator = denom;
        }

        public Fraction add(Fraction f) { //Add method
            int num = numerator * f.getDenominator() + f.getNumerator() *
                    denominator;
            int denom = denominator * f.getDenominator();
            Fraction result = new Fraction(num, denom);
            return result;
        }

        public Fraction subtract(Fraction f) { //Subtract method
            int num = numerator * f.getDenominator() - f.getNumerator() *
                    denominator;
            int denom = denominator * f.getDenominator();
            Fraction result = new Fraction(num, denom);
            return result;
        }

        public Fraction multiply(Fraction f) { //Multiply method
            int num = numerator * f.getNumerator();
            int denom = denominator * f.getDenominator();
            Fraction result = new Fraction(num, denom);
            return result;
        }

        public Fraction divide(Fraction f) { //Divide method
            int num = numerator * f.getDenominator();
            int denom = denominator * f.getNumerator();
            Fraction result = new Fraction(num, denom);
            return result;
        }
    }
}

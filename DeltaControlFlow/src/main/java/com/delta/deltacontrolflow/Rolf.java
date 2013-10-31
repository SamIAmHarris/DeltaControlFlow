package com.delta.deltacontrolflow;

/**
 * Created by spawrks on 10/30/13.
 */
public class Rolf {

    String mName = "Mal";

    public static String stringFun(int a, String boogle , int b){

        int fun = a + b;
        int notfun = fun - b;
        int funfun = b+a+fun;


        String thisString = "meow";
        String thisOtherString = "huh";
        for(int i = 0; i < boogle.length(); i++){
            String g;
            if (i < 5){
                g = boogle.substring(i,i+1);
                thisString = thisString.concat(g);
            }
            funfun--;

        }
        thisOtherString = tryThisOut(boogle, thisString);

        return thisOtherString;
    }


    public static String tryThisOut(String a, String boogle){
        for(int i = 0; i < boogle.length(); i++){
            boogle.concat(a);
        }
        return boogle;
    }
}

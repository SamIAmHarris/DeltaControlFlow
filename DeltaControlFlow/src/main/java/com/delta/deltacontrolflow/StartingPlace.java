package com.delta.deltacontrolflow;

import android.util.Log;

/**
 * Created by spawrks on 10/30/13.
 */
public class StartingPlace {

    public StartingPlace() {

        String myString = "dog";
        String anotherString = "notdog";
        int blarg = 3;
        int flarg = 4;

        doSomething(myString,5);

        somethingStringy(myString.toUpperCase(),"hi");
        int totallyAString = doSomething(myString,5);
        String whatIsThis = somethingStringy(myString, somethingStringy(myString, myString));

        whatIsThis = Rolf.tryThisOut(whatIsThis, anotherString);

        String wowzers = Rolf.stringFun(totallyAString,whatIsThis,10);

        String finalString = "kitty";
        if(doSomething("quack",flarg) == doSomething("quack",flarg)){

            int wolfNum = doSomething(wowzers,totallyAString);
            wolfNum = doSomething(wowzers,doSomething(wowzers,doSomething(wowzers,wolfNum)));
            finalString = Rolf.stringFun(blarg,Rolf.tryThisOut(finalString,"ruff"),10);
            finalString = somethingStringy(finalString,"spawrks");
        }

        Log.e("CONTROLFLOW",finalString);

    }

    public int doSomething(String s, int whatever){
        s = s + s;
        int blarg = whatever + whatever;
        return blarg;
    }


    public String somethingStringy(String s, String string){
        String newString;
        newString = "";
        newString = s + string;
        return newString;
    }
}

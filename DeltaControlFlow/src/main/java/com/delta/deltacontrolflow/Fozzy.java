package com.delta.deltacontrolflow;

/**
 * Created by spawrks on 10/30/13.
 */
public class Fozzy {

    int doSomething(String s, int whatever){
        s.concat(s);
        int blarg = whatever - whatever;
        return blarg;
    }

    String somethingStringy(String s, String string){
        String newString;
        newString = "boo";
        newString = s + string;
        return newString;
    }
}

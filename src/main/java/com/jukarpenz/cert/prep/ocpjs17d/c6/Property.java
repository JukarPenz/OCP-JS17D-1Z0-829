package com.jukarpenz.cert.prep.ocpjs17d.c6;

import com.jukarpenz.cert.prep.ocpjs17d.c6.sub.SuperProperty;

public class Property extends SuperProperty {

    protected long getId(){
        //super.getId();
        return 1;
    }

    public long getId(int i){
        System.out.println("Property getId int)");
        return 3;
    }

    static final private String CL = "Property ";
    static int area=30;
    public static String sld;

    public void Property(){
        System.out.println("this is a method @ Prop");
    }

    public Property(){
//        if(false){
//            this();
//        }
        System.out.println(CL + "constructor");
    }

    {
        System.out.println(CL + ": fist iniz");
    }


    static {
        System.out.println(CL + ": fist static");
    }
    static void staticMethod(){
        System.out.println("Property Static method");
    }

    {
        System.out.println(CL + ": second iniz");
    }
    static {
        System.out.println(CL + ": second static");
    }

    static final protected String ID=CL+"3";
    public  String NSID="Proper 3";
    protected int mount;

    protected boolean fs = true;

    public static void main(String[] args) {
        Property p = new Property();
        System.out.println(p.fs);
        System.out.println(p.NSID);
        System.out.println("----------");
        SuperProperty sp=p;
        System.out.println(sp.NSID);
//        System.out.println(sp.NSID);


    }
}

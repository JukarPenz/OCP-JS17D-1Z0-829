package com.jukarpenz.cert.prep.ocpjs17d.c6.sub;

public class SuperProperty {

    protected long getId(){
        return 2;
    }

    public long getId(int i){
        System.out.println("Super Property getId int)");
        return 3;
    }

    static final private String CL = "SuperProperty ";
    static int area;

    public void Property(){
        System.out.println("this is a Super method");
    }

    public SuperProperty(){
//        if(false){
//            this();
//        }
        //this(3);
        System.out.println(CL + "constructor");
    }

    public SuperProperty(int i){
        System.out.println(CL + " INTI constructor");
    }

    {
        System.out.println(CL + ": fist iniz");
    }


    static {
        System.out.println(CL + ": fist static");
    }

    {
        System.out.println(CL + ": second iniz");
    }
    static {
        System.out.println(CL + ": second static");
    }

    static final protected String ID="Super 3";
    public String NSID="Super 3";
    protected int mount;
    protected boolean fs = false;

    protected String superVar = "Super Var";

}


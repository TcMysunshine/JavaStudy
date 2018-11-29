package com.chenhao.gc;

public class GcTest {
    private String name;
    public GcTest(String name){
        this.name = name;
    }
    @Override
    public void finalize() throws Throwable{
        super.finalize();
        System.out.println(this.name + "是垃圾 被回收了");
    }
    public static void main(String[] args) {
        GcTest gc1 = new GcTest("gc1");
        GcTest gc2 = new GcTest("gc2");
        GcTest gc3 = new GcTest("gc3");

        gc1=null;
        gc2=null;
        gc3=null;
        System.gc();
    }
}

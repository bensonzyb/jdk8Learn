package com.zyb.jdk8;

/**
 * @author by ben
 * @Description TODO
 * @Date 2020/1/5
 */
public  class FcuntionInterfaceTest {

    public  void testInterface(Myinterface myinterface){
        System.out.println("test1");
        myinterface.test();
        System.out.println("test2");
    }

    public static void main(String[] args) {
        FcuntionInterfaceTest iTest =new FcuntionInterfaceTest();
        // (1)
        iTest.testInterface(new Myinterface() {
            @Override
            public void test() {
                System.out.println("myInterface!");
            }
        });
        System.out.println("---------------------------------------------");

        //(2)
        //iTest.testInterface(()-> System.out.println("myInterface2!"));

        System.out.println("---------------------------------------------");

       //(3)
        Myinterface myinterface=()-> {
            System.out.println("myInterface3!");
            System.out.println("myInterface4!");
        };
        System.out.println(myinterface.getClass());
        System.out.println(myinterface.getClass().getSuperclass());
        System.out.println(myinterface.getClass().getInterfaces()[0]);


    }



}

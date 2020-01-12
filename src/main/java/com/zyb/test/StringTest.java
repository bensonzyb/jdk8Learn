package com.zyb.test;

/**
 * Hello world!
 *
 */
public class StringTest
{
    public static void main( String[] args )
    {
        String str1="123";
        String str2=new String("123");
        String str3="1"+"2"+"3";
        String str4="12";
        String str6=str4+"3";
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str6);
        System.out.println(str2==str3);
        System.out.println(str2==str6);

        //false,true,false,false,false
        System.out.println( "Hello World!" );
    }
}

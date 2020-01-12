package com.zyb.jdk8.entity;

/**
 * @author by ben
 * @Description TODO
 * @Date 2019/11/24
 */
public class Person {
    private  String  id;

    private  String userName;

    private int age;

    public Person(){
    }


     public Person(String id,String userName,int age){
        this.id=id;
        this.age=age;
        this.userName=userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

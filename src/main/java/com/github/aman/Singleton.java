package com.github.aman;

class DB{
    static DB obj = null;
    String db_name;
    private DB(){
        System.out.println("invoked only once");
        db_name = "userDB";
    }

    //instead of naming it as getInstance we can name it as DB (method name same as class name)
    static DB getInstance(){
        if(obj==null){
            obj = new DB();
        }
        return obj;
    }
}
public class Singleton {
    public static void main(String[] args) {
        DB s = DB.getInstance();
        DB s1 = DB.getInstance();
        System.out.println(s.db_name + " " + s1.db_name);
    }

}

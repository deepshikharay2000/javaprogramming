package Oops;

public class inheritance {
    public static void main(String[] args) {
        childclass obj = new childclass();
        obj.fun1();
        obj.fun2();
        
    }
    
}
class parentclass{
    void fun1(){
        System.out.println("parentclass");

    }
}
class childclass extends parentclass{
    void fun2(){
        System.out.println("childclass");

    }
}
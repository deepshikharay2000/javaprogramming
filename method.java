public class method {
    

    public static void fun() {
        
    
        System.out.println("Hi i am Function");

    }
    public void cheaters(){
        String cheater1 = "deepmita";
        String cheater2 = "sachin";
        String cheater3 = "kadam";
        System.out.println("cheater's are:-" + cheater1 +"" + cheater2 + "" + cheater3);

    }
    public void number(int a){
        a++;
        System.out.println("function type is :- takes something & returns nothing" + a);
    }
    public int sum() {
        int a,b;
        a = 2;
        b = 3;
        return a + b;


    }
    public char alphabet(char z) {
        return z;

    }

        public static void main(String[] args) {
     
        
        method o1 = new method();
        fun();
        o1.cheaters();
        o1.cheaters();
        o1.cheaters();
        o1.number(10);
        int result = o1.sum();
        System.out.println("function type is takes nothing return something" + result);
        char store = o1.alphabet('a');
        System.out.println("store");


    }


}


    
package Oops;

public class multilevelinheritance {
    public static void main(String[] args) {
        division o1 = new division();
        o1.add();
        o1.mult();
        o1.div();

    }
    
}
class sums {
    int a, b, c;
    public void add(){
        a = 10;
        b = 20;
        c = a+b;
        System.out.println("Sum Result=" + c);

    }
}
class division extends sums {
    int i, j, k;
    public void mul(){
        i = 4;
        j = 2;
        c = a*b;
        System.out.println("Multiply Result=" + c);


    }

    }
    class division extends mult {
        public void div(){
            k = i/j;
            System.out.println("Division Result=" + k);

        }
    }




public class casting {
 public static void main(String[] args) {
        int num1 = 33;
        double numtodouble = num1;
        System.out.println("double="+ numtodouble);

        int num2 = (int) numtodouble;
        System.out.println("double to int="+ num2);//narrowing

        float var = 45;
        System.out.println("float value"+ var);

        int var2 = (int) var;
        System.out.println("float to int="+ var2);
        


    }

    
}


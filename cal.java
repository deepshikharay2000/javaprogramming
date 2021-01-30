
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
    public class cal {
        public static void main(String[] args) {
            try{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter a first num :");
                int n1=Integer.parseInt(br.readLine());
                System.out.println("enter a second :");
                int n2=Integer.parseInt(br.readLine());
                System.out.println("opreator :");
                String op=br.readLine();
                int result=0;
                if(op.equals("+")){
                    result=n1+n2;
                }
                else if(op.equals("-")){
                    result=n1-n2;
                }
                else if(op.equals("*")){
                        result=n1*n2;
                    }
                    else if(op.equals("/")){

                    }else{
                        throw new java.lang.Error("opreator nat recpgnize");
                    }
                    System.out.println("result:"+result);
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
        
            }
        }
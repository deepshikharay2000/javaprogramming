package Oops;

public class stuID {
    private int stuID;
    private String stuName;
    studentData()
    {
        stuID = 100;
        stuName = "New student";
        StuAge = 18;
    }
    studentData(int num1, String str, int num2){
        stuId = num1;
        studName = str;
        stuAge = num2;



    }
    public int getstuID(){
        return stuID;

    }
    public void setstuID(int stuID){
        this.stuID = stuID;
    }
    public String getstuName(){
        return stuName;
    }
    public void setstuName(String stuName){
        this. stuName = stuName;
    }
    public int get.stuAge(){
        retun stuAge;
    }public void setstuAge(int stuAge){
        this.stuAge = stuAge;
    }
    public static void main(String[] args) {
        StudentData myobj = new StudentData();
        System.out.println("student Name is" + myobj.getstuName());
        System.out.println("student Age is" + myobj.getStuAge);
        System.out.println("student ID is" + myobj.getstuID);
    }
    

}

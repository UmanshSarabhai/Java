class Encapsulation{
    private int ssn;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpSSN(){
        return ssn;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpSSN(int newValue){
        ssn = newValue;
    }
}
public class Que_A2{
    public static void main(String args[]){
         Encapsulation obj = new Encapsulation();
         obj.setEmpName("Umansh");
         obj.setEmpAge(23);
         obj.setEmpSSN(22329);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee No: " + obj.getEmpSSN());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}
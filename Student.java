public class Student {
    private String name;
    private int rollNo;
    private String subject;
    private String department;
    public String getName(){
        return name;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String getDepartment(){
        return department;
    }
    public int getRollNo(){
        return rollNo;
    }
    public void setSubject(int rollNo){
        this.rollNo=rollNo;

    }
    public String getSubject(){
        return subject;
    }
    public Subject(String name,int rollNo, String department){
        this.name=name;
        this.rollNo=rollNo;
        this.department=department;
    }
    public Subject(String name,int rollNo, String department,String subject){
        this.name=name;
        this.rollNo=rollNo;
        this.department=department;
        this.subject=subject;
    }
}

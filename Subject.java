public class Subject {
    private String name;
    private String SubID;
    private String teacherName;
    private int MaxMarks;
    private int MarksObtained;
    public String getName(){
        return name;
    }
    public  void setName(String name){
        this.name=name;
        
        
    }
    public String getSubID(){
        return SubID;
    }
    public void setSubID(String SubID){
        this.SubID=SubID;

    }
    public String getTeacherName(){
        return teacherName;
    }
    public void setTeacherName(String teacherName){
        this.teacherName=teacherName;
    }
    public int getMaxMarks(){
        return MaxMarks;

    }
    public void setMaxMarks(int MaxMarks){
        this.MaxMarks=MaxMarks;
    }
    public int getMarksObtained(){
        return MarksObtained;
    }
    public void setMarksObtained(int MarksObtained){
        this.MarksObtained=MarksObtained;
    }
    boolean isPass(){
        return MarksObtained >= MaxMarks/10*4;
    }
    public Subject(String name,String SubID, String teacherName){
        this.name=name;
        this.SubID=SubID;
        this.teacherName=teacherName;
    }
        public Subject(String name,String SubID, String teacherName,int MaxMarks){
        this.name=name;
        this.SubID=SubID;
        this.teacherName=teacherName;
        this.MaxMarks=MaxMarks;
    }
            public Subject(String name,String SubID, String teacherName,int MaxMarks,int MarksObtained){
        this.name=name;
        this.SubID=SubID;
        this.teacherName=teacherName;
        this.MaxMarks=MaxMarks;
        this.MarksObtained=MarksObtained;
    }
    
}

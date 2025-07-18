public class Main {
    public static void main(String[] args){
        Subject s[]=new Subject[3];
        s[0]=new Subject("Maths","S01","Ramesh",100,50);
        s[1]=new Subject("Maths","S01","Ramesh",100,50);
        s[2]=new Subject("Maths","S01","Ramesh",100,50);
        for(Subject m:s){
            System.err.println(m);

        }
        Student stu[]=new Student[3];
        stu[0]=new Student("Ramesh",1, "Maths","CSE");
        stu[1]=new Student("Ramesh",1, "Maths","CSE");
        stu[2]=new Student("Ramesh",1, "Maths","CSE");
        for(Student l:stu){
            System.out.println(l);
        }
    }
}

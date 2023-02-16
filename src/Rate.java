import java.util.ArrayList;

public class Rate {

    private String object;
    private ArrayList<Student> students = new ArrayList<>();

    public Rate(String object){
this.object = object;
    }

    public double AverageGrade(){
        int sum = 0;
        for(Student student:students){
            sum+=student.getGrade();
        }
        return (double) sum/students.size();
    }

    public static void main(String[] args) {
        Rate r1 = new Rate("TOI");
        Student st1 = new Student("Артем", "Задворный", 5);
        Student st2 = new Student("Марк", "Гутман", 4);
        Student st3 = new Student("Семен", "Плеханов", 5);
        Student st4 = new Student("Роман", "Марасанов", 3);
        Student st5 = new Student("Артем", "Верютин", 5);


        r1.students.add(st1);
        r1.students.add(st2);
        r1.students.add(st3);
        r1.students.add(st4);
        r1.students.add(st5);

        System.out.println(r1.AverageGrade());
    }
}
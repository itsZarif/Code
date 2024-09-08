import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.age> o2.age)
                    return 0;
                else
                    return -1;
            }
        };
        ArrayList<Student> stud = new ArrayList<>();
        stud.add(new Student(14, "Zarif"));
        stud.add(new Student(13, "Adham"));
        stud.add(new Student(12, "Seam"));
        stud.add(new Student(11, "Helllo"));

        Collections.sort(stud, com);

        for (Student st : stud) {
            System.out.println(st);
        }
    }
}
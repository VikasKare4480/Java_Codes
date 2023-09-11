import java.util.ArrayList;
import java.util.Iterator;

class Student {

    int rollNo = 0;
    String name = null;
    int age = 0;

    Student(int rollNo, String name, int age) {

        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public String toString() {

        return "{" + rollNo + ":" + name + ":" + age +  "}";
    }
}


class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Student> al = new ArrayList<Student>();

        Student s1 =
         new Student(101, "Vikas", 20);        
        Student s2 = new Student(102, "Rahul", 21);
        Student s3 = new Student(103, "Ram", 22);

        al.add(s1);
        al.add(s2);
        al.add(s3);

        // System.out.println(al);

        Iterator itr = al.iterator();

        al.forEach(a -> {

            System.out.println(a);
        });


    }
}
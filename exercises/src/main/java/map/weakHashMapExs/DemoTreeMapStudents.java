package map.weakHashMapExs;
//Create a TreeMap object.
//        Add several student names as keys and their corresponding grades as values to the TreeMap.
//        Print all the student names and grades in ascending order of the student names.
//        Add a new student and their grade to the TreeMap.
//        Print the updated list of student names and grades in ascending order.

import java.util.Map;
import java.util.TreeMap;


class Student{
    public String getName() {
        return name;
    }

    public long getGrades() {
        return grades;
    }

    String name;
    long grades;
    public Student(String name, long grades) {
        this.grades = grades;
        this.name=name;
    }
}

public class DemoTreeMapStudents {
    public static void main(String[] args) {

        //creating map of Books
        Map<String,Long> studentMap=new TreeMap<String,Long>();

        //creating Students list
        Student s1=new Student("John",45);
        Student s2=new Student("Adam",98);
        Student s3=new Student("Sam",56);
        Student s4=new Student("Zax",89);

        //Adding students names and grades to map
        studentMap.put(s1.getName(),s1.getGrades());
        studentMap.put(s2.getName(),s2.getGrades());
        studentMap.put(s3.getName(),s3.getGrades());
        studentMap.put(s4.getName(),s4.getGrades());
        System.out.println("List of Students:"+studentMap);

       //creating and Adding new student to the map
        Student s5=new Student("Bob",99);

        studentMap.put(s5.getName(),s5.getGrades());

        System.out.println("Updated list of students:"+studentMap);


    }
}

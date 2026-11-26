import java.util.HashSet;

import java.util.HashMap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== HashSet ===");

        HashSet<String> courses = new HashSet<>();

        for (int i = 1; i <= 4; i++) {

            System.out.print("Enter course " + i + ": ");

            courses.add(sc.nextLine());

        }

        System.out.println("Courses: " + courses);

        System.out.print("\nSearch course: ");

        String courseSearch = sc.nextLine();

        if (courses.contains(courseSearch)) {

            System.out.println(courseSearch + " is available.");

        } else {

            System.out.println(courseSearch + " is not available.");

        }

        System.out.print("Remove course: ");

        String courseRemove = sc.nextLine();

        courses.remove(courseRemove);

        System.out.println("Courses after removal: " + courses);

        System.out.println("\n=== HashMap ===");

        HashMap<String, Integer> grades = new HashMap<>();

        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter student " + i + " name: ");

            String name = sc.nextLine();

            System.out.print("Enter " + name + "'s grade: ");

            int grade = sc.nextInt();

            sc.nextLine();

            grades.put(name, grade);

        }

        System.out.println("Grades: " + grades);

        System.out.print("\nSearch student: ");

        String studentSearch = sc.nextLine();

        if (grades.containsKey(studentSearch)) {

            System.out.println(studentSearch + "'s grade: " + grades.get(studentSearch));

        } else {

            System.out.println(studentSearch + " not found!");

        }

        System.out.print("Update student: ");

        String studentUpdate = sc.nextLine();

        if (grades.containsKey(studentUpdate)) {

            System.out.print("New grade: ");

            int newGrade = sc.nextInt();

            sc.nextLine();

            grades.put(studentUpdate, newGrade);

            System.out.println("Grades after update: " + grades);

        } else {

            System.out.println(studentUpdate + " not found!");

        }

        System.out.print("Remove student: ");

        String studentRemove = sc.nextLine();

        grades.remove(studentRemove);

        System.out.println("Grades after removal: " + grades);

        sc.close();

    }

}


"HASHMAP"

import java.util.HashMap;

import java.util.Scanner;

public class HashMapExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> grades = new HashMap<>();

        System.out.println("=== HashMap ===");

        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter student " + i + " name: ");

            String name = sc.nextLine();

            System.out.print("Enter " + name + "'s grade: ");

            int grade = sc.nextInt();

            sc.nextLine();

            grades.put(name, grade);

        }

        System.out.println("Grades: " + grades);

        System.out.print("\nSearch student: ");

        String studentSearch = sc.nextLine();

        if (grades.containsKey(studentSearch)) {

            System.out.println(studentSearch + "'s grade: " + grades.get(studentSearch));

        } else {

            System.out.println(studentSearch + " not found!");

        }

        System.out.print("Update student: ");

        String studentUpdate = sc.nextLine();

        if (grades.containsKey(studentUpdate)) {

            System.out.print("New grade: ");

            int newGrade = sc.nextInt();

            sc.nextLine();

            grades.put(studentUpdate, newGrade);

            System.out.println("Grades after update: " + grades);

        } else {

            System.out.println(studentUpdate + " not found!");

        }

        System.out.print("Remove student: ");

        String studentRemove = sc.nextLine();

        grades.remove(studentRemove);

        System.out.println("Grades after removal: " + grades);

        sc.close();

    }

}

"HASHSET"
import java.util.HashMap;

import java.util.Scanner;

class HashSetExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> grades = new HashMap<>();

        System.out.println("=== HashMap ===");

        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter student " + i + " name: ");

            String name = sc.nextLine();

            System.out.print("Enter " + name + "'s grade: ");

            int grade = sc.nextInt();

            sc.nextLine();

            grades.put(name, grade);

        }

        System.out.println("Grades: " + grades);

        System.out.print("\nSearch student: ");

        String studentSearch = sc.nextLine();

        if (grades.containsKey(studentSearch)) {

            System.out.println(studentSearch + "'s grade: " + grades.get(studentSearch));

        } else {

            System.out.println(studentSearch + " not found!");

        }

        System.out.print("Update student: ");

        String studentUpdate = sc.nextLine();

        if (grades.containsKey(studentUpdate)) {

            System.out.print("New grade: ");

            int newGrade = sc.nextInt();

            sc.nextLine();

            grades.put(studentUpdate, newGrade);

            System.out.println("Grades after update: " + grades);

        } else {

            System.out.println(studentUpdate + " not found!");

        }

        System.out.print("Remove student: ");

        String studentRemove = sc.nextLine();

        grades.remove(studentRemove);

        System.out.println("Grades after removal: \" + grades);\n");

        sc.close();

    }

}







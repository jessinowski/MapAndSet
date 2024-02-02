package com.github;

public class Main {
    public static void main(String[] args) {
        // Step 1:
        Medication ibu = new Medication("Ibuprofen", 10.90, true);
        Medication kytta = new Medication("Kytta", 15.50, true);
        Medication aspirin = new Medication("Aspirin", 5.50, false);
        Medication salbei = new Medication("Salbei", 3.60, true);

        // Step 2:
        Pharmacy apotheke = new Pharmacy();

        // Step 3:
        System.out.println(apotheke.getCount());

        // Step 4:
        apotheke.save(ibu);
        apotheke.save(kytta);
        apotheke.save(aspirin);
        apotheke.save(salbei);
        System.out.println(apotheke.getCount());

        // Step 5:
        System.out.println();
        System.out.println(apotheke.find("Ibuprofen"));

        // Step 6:
        apotheke.delete("Ibuprofen");

        // Step 7:
        System.out.println();
        System.out.println(apotheke);

 /* // Step 1:
    Convert your application from the List lecture so that the School Object uses a Hashmap
    instead of an ArrayList.

        // Step 2: (fromListTask)
        // Create a Java List for elements of type "Student" and add multiple students.
//      List<Student> students = new ArrayList<>();
        Student jessica = new Student("Jessica", "Zarnowski", 25678);
        Student hanne = new Student("Hanne", "Lore", 25689);
        Student bernd = new Student("Bernd", "Brot", 25624);
//      students.add(jessica);
//      students.add(hanne);
//      students.add(bernd);

        // Step 3:(fromListTask)
        // Create a class "School" to which students can be added through a method ('addStudent').
        School school = new School();
        school.addStudent(25678,jessica);
        school.addStudent(25689,hanne);
        school.addStudent(25624,bernd);

        // Step 4:(fromListTask)
        // Implement a method to print all students of the school (as text, to the console).
        System.out.println(school);

        // Step 5:(fromListTask)
        // Add a method to find a student by their ID.
        // The found student should be returned.
        System.out.println();
        System.out.println(school.findStudentByID(25678));
        System.out.println(school.findStudentByID(25677));

        // Step 6:(fromListTask)
        // Create a method to remove a student from the school.
        System.out.println();
        school.removeStudent(25689);
        System.out.println(school);

        //Bonus Course(fromListTask)
        System.out.println();
        Course math = new Course("Mathe","Mueller", 3);
        jessica.addCourseToStudent(math);
        System.out.println(jessica);
        System.out.println();
        System.out.println(school.retrieveCourses(25678));
        System.out.println(jessica.getCourseList());*/

    }

}
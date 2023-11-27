import java.util.HashMap;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class StudentHashTable {
    private HashMap<Integer, Student> hashTable;

    public StudentHashTable() {
        hashTable = new HashMap<>();
    }

    public void insert(int id, String name) {
        Student student = new Student(id, name);
        hashTable.put(id, student);
    }

    public Student get(int id) {
        return hashTable.get(id);
    }

    public void displayAll() {
        for (int key : hashTable.keySet()) {
            Student student = hashTable.get(key);
            System.out.println("Student ID: " + student.id + ", Name: " + student.name);
        }
    }
}

public class QuestionOne {
    public static void main(String[] args) {
        StudentHashTable studentTable = new StudentHashTable();

        // Inserting students into the hash table
        studentTable.insert(1001, "Harshal");
        studentTable.insert(1002, "Milind");
        studentTable.insert(1003, "Prabhu");
        
        // Display all students
        System.out.println("All Students:");
        studentTable.displayAll();

        // Retrieving a student using ID
        int studentId = 1002;
        Student student = studentTable.get(studentId);
        if (student != null) {
            System.out.println("\nStudent with ID " + studentId + " is " + student.name);
        } else {
            System.out.println("\nStudent with ID " + studentId + " not found");
        }
    }
}
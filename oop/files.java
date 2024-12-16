import java.io.*;
import java.util.*;

class Student implements Serializable {
    public int studentId;
    public String name;
    public int rollNo;
    public String studentClass;
    public double marks;
    public String address;

    public Student(int studentId, String name, int rollNo, String studentClass, double marks, String address) {
        this.studentId = studentId;
        this.name = name;
        this.rollNo = rollNo;
        this.studentClass = studentClass;
        this.marks = marks;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Roll No: " + rollNo + ", Class: " + studentClass + ", Marks: " + marks + ", Address: " + address;
    }
}

public class files {
    private static final String FILE_NAME = "students.dat";

    public static void createDatabase(List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
            System.out.println("Database created successfully.");
        } catch (IOException e) {
            System.err.println("Error creating database: " + e.getMessage());
        }
    }

    public static List<Student> readDatabase() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading database: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static void displayDatabase() {
        List<Student> students = readDatabase();
        if (students.isEmpty()) {
            System.out.println("No records found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public static void searchRecord(int studentId) {
        List<Student> students = readDatabase();
        for (Student student : students) {
            if (student.studentId == studentId) {
                System.out.println("Record found: " + student);
                return;
            }
        }
        System.out.println("No record found with Student ID: " + studentId);
    }

    public static void deleteRecord(int studentId) {
        List<Student> students = readDatabase();
        boolean removed = students.removeIf(student -> student.studentId == studentId);
        if (removed) {
            createDatabase(students);
            System.out.println("Record deleted successfully.");
        } else {
            System.out.println("No record found with Student ID: " + studentId);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nStudent Database Management:");
            System.out.println("1. Create Database");
            System.out.println("2. Display Database");
            System.out.println("3. Search Record");
            System.out.println("4. Delete Record");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    List<Student> students = new ArrayList<>();
                    System.out.print("Enter number of students: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter details for student " + (i + 1) + ":");
                        System.out.print("Student ID: ");
                        int id = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Roll No: ");
                        int rollNo = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Class: ");
                        String studentClass = sc.nextLine();
                        System.out.print("Marks: ");
                        double marks = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Address: ");
                        String address = sc.nextLine();

                        students.add(new Student(id, name, rollNo, studentClass, marks, address));
                    }
                    createDatabase(students);
                    break;
                case 2:
                    displayDatabase();
                    break;
                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();
                    searchRecord(searchId);
                    break;
                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();
                    deleteRecord(deleteId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

package exercises;

public class Student {
    private int studentNumber;
    private int phoneNumber;
    private String name;
    private String address;
    private int studentNumber2;

    public Student(int studentNumber, int phoneNumber, String name, String address, int studentNumber2) {
        this.studentNumber = studentNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
        this.studentNumber2 = studentNumber2;
    }

    public int getStudentNumber2() {
        return studentNumber2;
    }

    public Student(int studentNumber2) {
        this.studentNumber2 = studentNumber2;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

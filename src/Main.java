class Main{
    public static void main(String[] args) {
        Student student1 = new Student(2,123456, "Sam", "Legionarska 1, 01001 Zilina", 52142);
        Student student2 = new Student(5,456789, "Jhon", "Legionarska 2, 01001 Zilina",12345);
        System.out.println(student1.getName() + " " + student1.getStudentNumber2());
        System.out.println(student1.getStudentNumber() + ", " + student1.getPhoneNumber() + ", " + student1.getAddress());
        System.out.println(student2.getStudentNumber() + ", " + student2.getPhoneNumber() + ", " + student2.getAddress());
    }
}
class Main{
    public static void main(String[] args) {
        Student student1 = new Student(2,123456, "Sam", "Legionarska 1, 01001 Zilina", 52142);
        Student student2 = new Student(5,456789, "Jhon", "Legionarska 2, 01001 Zilina",12345);
        Person person1 = new Person("Jhon", 21 ,23000);
        Person person2 = new Person("Steve", 32 ,40000);
        Person person3 = new Person("Martin", 16 ,2700);
        Triangle triangle =  new Triangle(3, 4,5  );
        System.out.println(student1.getName() + " " + student1.getStudentNumber2());
        System.out.println(student1.getStudentNumber() + ", " + student1.getPhoneNumber() + ", " + student1.getAddress());
        System.out.println(student2.getStudentNumber() + ", " + student2.getPhoneNumber() + ", " + student2.getAddress());
        System.out.println(BudgetTotal(new Person[] {person1,person2,person3}));
        System.out.println(area(triangle));
        System.out.println(perimeter(triangle));
        Worker worker1 = new Worker("Jozko","Mrkvicka",4,7,1990);
        worker1.setJobPosition("IT Programmer");worker1.setSalary("2100 eur");
        System.out.println(worker1.getName() + " " + worker1.getSurname() + ", " + worker1.getJobPosition() + ", Salary: " + worker1.getSalary() );
    }
    public static int BudgetTotal(Person[] people) {
        int a = 0;
        for (int i = 0; i < people.length; i++) {
            a = a + people[i].getBudget();
        }
        return a;
    }
        public static int perimeter(Triangle Per){
            int per = Per.getA() + Per.getB() + Per.getC();
            return per;
        }
        public static double area (Triangle Ara){
            int s = perimeter(Ara) / 2;
            int area = s * (s - Ara.getA()) * (s - Ara.getB()) * (s - Ara.getC());
            return Math.sqrt(area);
        }
}

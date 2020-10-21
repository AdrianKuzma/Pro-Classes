package exercises;
import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        Student student1 = new Student(2,123456, "Sam", "Legionarska 1, 01001 Zilina", 52142);
        Student student2 = new Student(5,456789, "John", "Legionarska 2, 01001 Zilina", 12345);
        Person person1 = new Person("John", 21 ,23000);
        Person person2 = new Person("Steve", 32 ,40000);
        Person person3 = new Person("Martin", 16 ,2700);
        Triangle triangle =  new Triangle(3, 4,5  );
        Worker worker1 = new Worker("Jozko","Mrkvicka",4,7,1990);
        worker1.setJobPosition("IT Programmer");worker1.setSalary("2100 eur");
        Item item1 = new Item("goldfish", 45);
        Item item2 = new Item("watch", 15);
        Item item3 = new Item("dog", 53);
        ArrayList<Item> items1 = new ArrayList<>();
        items1.add(item1);
        items1.add(item2);
        ArrayList<Item> items2 = new ArrayList<>();
        items1.add(item3);
        Warriors warrior1 = new Warriors("warrior1", 10, 4, 7, items1);
        Warriors warrior2 = new Warriors("warrior2", 9, 5, 3, items2);

        System.out.println(student1.getName() + " " + student1.getStudentNumber2());
        System.out.println(student1.getStudentNumber() + ", " + student1.getPhoneNumber() + ", " + student1.getAddress());
        System.out.println(student2.getStudentNumber() + ", " + student2.getPhoneNumber() + ", " + student2.getAddress());
        System.out.println(budgetTotal(new Person[] {person1,person2,person3}));
        System.out.println(area(triangle));
        System.out.println(perimeter(triangle));
        System.out.println(worker1.getName() + " " + worker1.getSurname() + ", " + worker1.getJobPosition() + ", Salary: " + worker1.getSalary() );
        System.out.println(battle(warrior1,warrior2));
    }

    public static int budgetTotal(Person[] people) {
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

    public static int battle(Warriors warrior1, Warriors warrior2){
        if(warrior1.getForce() == warrior2.getForce()){
            warrior1.setLife(warrior1.getLife() - 1);
            warrior2.setLife(warrior2.getLife() - 1);
            return 0;
        }
        else if (warrior1.getForce() > warrior2.getForce()){
            warrior2.setLife(warrior2.getLife() - 1);
            itemC(warrior2,warrior1);
            return 1;
        }
        else {
            warrior1.setLife(warrior1.getLife() - 1);
            itemC(warrior1,warrior2);
            return 2;
        }
    }

    public static void itemC(Warriors warrior1,Warriors warrior2){
        ArrayList<Item> items1 = warrior1.getItems();
        if(!items1.isEmpty()){
            Item x = items1.get(0);
            for(int i = 1; i < items1.size(); i++){
                Item y = items1.get(i);
                if(y.getValue() > x.getValue()){
                    x = y;
                }
            }
            items1.remove(x);
            warrior2.getItems().add(x);
        }

    }
}

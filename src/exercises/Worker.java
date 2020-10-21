package exercises;

public class Worker {
    private String name;
    private String surname;
    private int day;
    private int month;
    private int year;
    private String jobPosition;
    private String  salary;

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public Worker(String name, String surname, int day, int month, int year) {
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }
}

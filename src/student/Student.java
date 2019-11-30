package student;

public class Student {
    private int id;
    private String name;
    private int year;
    private double cpi;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", cpi=" + cpi +
                '}';
    }

    public Student(int id, String name, int year, double cpi) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.cpi = cpi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }
}

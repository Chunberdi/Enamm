import com.componu.Gennder;
import com.componu.StudFormat;

public class Student {

    private String name;
    private int age;
    private Gennder gennder;
    StudFormat studFormat;

    public Student(String name, int age, Gennder gennder, StudFormat studFormat) {
        this.name = name;
        this.age = age;
        this.gennder = gennder;
        this.studFormat = studFormat;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Gennder getGennder() {
        return gennder;
    }

    public void setGennder(Gennder gennder) {
        this.gennder = gennder;
    }

    public StudFormat getStudFormat() {
        return studFormat;
    }

    public void setStudFormat(StudFormat studFormat) {
        this.studFormat = studFormat;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gennder=" + gennder +
                ", studFormat=" + studFormat +
                '}';
    }
}

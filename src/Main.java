import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner in;
    private List<Student> students;

    public static void main(String[] args) throws FileNotFoundException {
        in = new Scanner(new FileReader("input.txt"));
        new Main().run();
    }

    public void run() {
        students = new ArrayList<Student>();
        while (in.hasNextLine()) {
            String[] line = in.nextLine().split(" ");
            students.add(new Student(line[0], line[1], line[2], Integer.parseInt(line[3])));
        }


    }

    public class NameCity {
        String name;
        String city;

        public NameCity(String name, String city) {
            this.name = name;
            this.city = city;
        }

        @Override
        public String toString() {
            return "NameCity{" +
                    "name='" + name + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }


}

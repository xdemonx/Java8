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
        students = new ArrayList<>();
        while (in.hasNextLine()) {
            String[] line = in.nextLine().split(" ");
            students.add(new Student(line[0], line[1], line[2], Integer.parseInt(line[3])));
        }

        //TODO: написать на StreamAPI вывод мапы <Город> -> <Количество_студентов_из_этого_города>

    }

}

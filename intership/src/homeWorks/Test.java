package homeWorks;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        Emplyee emplyee = new Emplyee();
        InputReader.saveEmployee(emplyee);

        List<Emplyee> list = new ArrayList<>();
        list.add(emplyee);

        Emplyee emplyee1 = new Emplyee();
        InputReader.saveEmployee(emplyee1);
        list.add(emplyee1);

        System.out.println(list);
    }
}

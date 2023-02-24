import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();

        test.add(45);
        test.add(5);
        test.add(450);
        test.add(45);
        test.add(5);
        test.add(450);

        test.remove(2);

        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }

        int count = 0;
        for (int i = 0; i < test.size(); i++) {
            if (test.get(i).equals(5)) {
                count++;
            }
        }
        System.out.println("Count = " + count);

        List<Integer> copy = new ArrayList<>();
        copy.addAll(test);
        List<Integer> copy2 = new ArrayList<>(test);

        System.out.println(test.contains(2));
        System.out.println(test.contains(5));

        System.out.println(test.indexOf(450));
        System.out.println(test.lastIndexOf(450));

        System.out.print("The size is: ");
        System.out.println(test.size());

        if (test.size() >= 45) {
            System.out.println(test.get(45));
        }


        //Arrays // helper class
        Arrays.asList(); // primitive array to ArrayList
        test.toArray();  // ArrayList to primitive array

        String name = new String();
//        char[] name

        List<List<Integer>> doubleTheTrouble = new ArrayList<>();

        doubleTheTrouble.add(new ArrayList<>(test));
        doubleTheTrouble.add(new ArrayList<>(test));
        doubleTheTrouble.add(new ArrayList<>(test));

        for (int i = 0; i < doubleTheTrouble.size(); i++) {

            System.out.println("List num - " + (i + 1));
            for (Integer num: doubleTheTrouble.get(i)) {
                System.out.println(num);
            }
        }

        List<Pie> pies = new ArrayList<>();
    }
}

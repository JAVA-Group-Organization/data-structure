import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Array array = new Array(3);

        array.add(1);
        array.add(2);
        array.add(10);
        array.add(20);
        array.print(); //[1 2 10 20]
        array.remove(0); //[2 10 20]
//        System.out.println(array.contains(1));
//        System.out.println(array.indexOf(2));
//        System.out.println(array.isEmpty());
//        array.print();
//        System.out.println(array.size());
        System.out.println(Arrays.toString(array.toArray()));
    }
}
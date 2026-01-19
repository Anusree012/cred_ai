import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExample {
    public static void main(String[] args)
    {
        ArrayList <Integer> mynumbers = new ArrayList<Integer>();
        mynumbers.add(23);
        mynumbers.add(25);
        mynumbers.add(33);
        mynumbers.add(12);
        mynumbers.add(5);
        /*for(int i : mynumbers)
        {
            System.out.println(i);
        }*/
        Collections.sort(mynumbers);
        for(int i : mynumbers)
        {
            System.out.println(i);
        }
    }
}
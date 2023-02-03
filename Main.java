package Java.HW.HW6;

import java.util.HashMap;
import java.util.Random;
public class Main {
    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJECT = new Object();
    public static void main(String[] args)  {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            addNum(rand(1, 100));
        }
        System.out.println(getSrtring());
    }
    public static int rand(Integer num, int num2) {
        Random rnd = new Random();
        return rnd.nextInt(num, num2);
    }
    public static String getSrtring() {
        return hMap.keySet().toString();
    }
    public static void addNum(Integer numbers) {
        hMap.put(numbers, OBJECT);

    }
}
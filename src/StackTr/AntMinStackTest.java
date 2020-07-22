package StackTr;

import java.util.Random;

public class AntMinStackTest {
    public static void main(String[] args) {
        AntMinStack antMinStack = new AntMinStack();
        Random random = new Random(31);
        for (int i = 0; i < 10; i++) {
            int item = random.nextInt(100);
            antMinStack.push(item);
            System.out.println("PUSH:" + item);
        }
        if (!antMinStack.empty()) {
            System.out.println("min:" + antMinStack.min());
        }
    }
}

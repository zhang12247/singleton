package Cal;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Random;

/**
 * 获取有序数列中缺失数据
 */
public class bitSetUse {
    public static void main(String[] args) {
        List<Integer> initLists = new ArrayList<>();
        //填充100W数据
        for (int i = 1; i <= 100; i++) {
            initLists.add(i);
        }
        //随机在100w里抽取5条
        Random random = new Random();
        List<Integer> randomLists = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            randomLists.add(random.nextInt(100));
        }
        System.out.println("我是随机剔除数" + randomLists);

        for (Integer rand : randomLists) {
            initLists.remove(rand);
        }

        List<Integer> removeNumbers = findRemoveNumber2(initLists, 100);
        System.out.println("被剔除数" + removeNumbers);
    }


    /**
     * 找出被删除数
     */
    private static List<Integer> findRemoveNumber2(List<Integer> numbers, int count) {
        List<Integer> removeList = new ArrayList<>();
        int removeCount = count - numbers.size();
        BitSet bitSet = new BitSet(count);
        for (Integer number : numbers) {
            bitSet.set(number - 1);
        }
        int lastRemoveIndex = 0;
        for (int i = 1; i <= removeCount; i++) {
            lastRemoveIndex = bitSet.nextClearBit(lastRemoveIndex);
            removeList.add(++lastRemoveIndex);
        }
        return removeList;
    }
}

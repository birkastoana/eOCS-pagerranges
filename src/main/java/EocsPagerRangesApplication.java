import entity.PagerRange;
import service.PagerRangesUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EocsPagerRangesApplication {


    public static void main(String... args) {
        PagerRangesUtil pagerRangesUtil = new PagerRangesUtil();

        int[] testArray = {10, 8753, 1, 3, 4, 5, 8, 9, 8752, 8752};

        Set<Integer> testSet = new HashSet<>();

        for (Integer elem : testArray) {
            testSet.add(elem);
        }


        List<PagerRange> pagerRangeList = pagerRangesUtil.generatePagerRangesList(testSet);

        for (PagerRange pr : pagerRangeList) {
            System.out.println(pr.toString());
        }


    }
}

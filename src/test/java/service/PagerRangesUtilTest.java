package service;

import entity.PagerRange;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PagerRangesUtilTest {

    PagerRangesUtil pru ;


    @BeforeEach
    void setUp() {
        pru = new PagerRangesUtil();
    }


    @Test
    void testGeneratePagerRangesList( ) {
        Set<Integer> testSet = new HashSet<>();
        testSet.add(1);
        testSet.add(2);
        testSet.add(3);
        List<PagerRange> expected = new ArrayList<>();
        expected.add(new PagerRange(1,3));
        List<PagerRange> prList =  pru.generatePagerRangesList(testSet);
        assertEquals(expected, prList);

        testSet = new HashSet<>();
        testSet.add(3);
        testSet.add(1);
        testSet.add(2);
        prList =  pru.generatePagerRangesList(testSet);
        assertEquals(expected, prList);

        testSet = new HashSet<>();
        testSet.add(3);
        testSet.add(1);
        testSet.add(4);
        prList =  pru.generatePagerRangesList(testSet);
        expected = new ArrayList<>();
        expected.add(new PagerRange(1,1));
        expected.add(new PagerRange(3,4));
        assertEquals(expected, prList);


        testSet = new HashSet<>();
        testSet.add(3);
        testSet.add(453221);
        testSet.add(453222);
        prList =  pru.generatePagerRangesList(testSet);
        expected = new ArrayList<>();
        expected.add(new PagerRange(3,3));
        expected.add(new PagerRange(453221,453222));
        assertEquals(expected, prList);

    }
}

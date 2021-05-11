package service;

import entity.PagerRange;

import java.util.*;

public class PagerRangesUtil {


    /**
     * @param pagerNumbers A sorted or unsorted Set of Integer representing the pager numbers
     * @return a List of PagerRange objects, each with a start and an end of the range
     */
    public List<PagerRange> generatePagerRangesList(Set<Integer> pagerNumbers) {
        // convert to sorted set
        TreeSet<Integer> sortedSet = new TreeSet(pagerNumbers);

        // method setup
        List<PagerRange> pagerRangesList = new ArrayList<>();
        PagerRange pagerRange;
        Iterator<Integer> iterator = sortedSet.iterator();
        pagerRange = initPagerRange(iterator.next());

        // looping through the treeSet
        while (iterator.hasNext()) {
            Integer nextInt = iterator.next();
            if (pagerRange.getEnd().compareTo(nextInt - 1) == 0) {
                pagerRange.setEnd(nextInt);
            } else if (pagerRange.getEnd().compareTo(nextInt - 1) < 0) {
                pagerRangesList.add(pagerRange);
                pagerRange = initPagerRange(nextInt);
            }
        }
        pagerRangesList.add(pagerRange);

        return pagerRangesList;

    }

    private PagerRange initPagerRange(Integer startEnd) {
        return new PagerRange(startEnd, startEnd);
    }

}

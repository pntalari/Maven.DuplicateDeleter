package com.zipcodewilmington.looplabs;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    private Integer[] intArray;
    private DuplicateDeleter<Integer> deleter;
    Map<Integer, Integer> map = new HashMap();
    ArrayList<Integer> nums = new ArrayList<>();

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Map<Integer, Integer> dupMap = new HashMap();
        dupMap = getDuplicatesMap(maxNumberOfDuplications);


        return new Integer[0];
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Map<Integer, Integer> dupMap = new HashMap();
        dupMap = getDuplicatesMap(exactNumberOfDuplications);
        for (Map.Entry<Integer, Integer> entry : dupMap.entrySet()) {
            int i = 0;
            if (entry.getValue() != (exactNumberOfDuplications)) {
                while (i < entry.getValue()) {
                    nums.add(entry.getKey());
                    i++;
                }
            }
        }

        Integer[] arr = new Integer[nums.size()];
        arr = nums.toArray(arr);

        return arr;
    }

    public Map<Integer, Integer> getDuplicatesMap(int numberOfDuplications) {
        for (Integer num : array) {
            Integer count = map.get(num);
            if (count == null) {
                map.put(num, 1);
            } else {
                map.put(num, ++count);
            }
        }
        return map;
    }
}


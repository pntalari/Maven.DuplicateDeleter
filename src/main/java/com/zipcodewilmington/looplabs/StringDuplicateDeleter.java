package com.zipcodewilmington.looplabs;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by leon on 1/28/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        List<String> list = Arrays.stream(array)
                .filter(i->Collections
                        .frequency(Arrays.asList(array),i)<maxNumberOfDuplications)
                .collect(Collectors.toList());

        String[] arr = new String[list.size()];
        return list.toArray(arr);
//        Map<String, Integer> map = new HashMap();
//        map = getDupStrMap(maxNumberOfDuplications);
//        ArrayList<String> arrList = new ArrayList<>();
//
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            Integer j = 0;
//            if (entry.getValue() < maxNumberOfDuplications) {
//                while (j<entry.getValue()) {
//                    arrList.add(entry.getKey());
//                    j++;
//                }
//            }
//        }
//        String[] arrRet = new String[arrList.size()];
//        arrRet = arrList.toArray(arrRet);
//
//        return arrRet;
    }


    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        List<String> list = Arrays.stream(array)
                .filter(i->Collections
                        .frequency(Arrays.asList(array),i)!=exactNumberOfDuplications)
                .collect(Collectors.toList());

        String[] arr = new String[list.size()];

        return list.toArray(arr);

//        Map<String, Integer> map = new HashMap();
//        map = getDupStrMap(exactNumberOfDuplications);
//        ArrayList<String> arrList = new ArrayList<>();
//
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            Integer j = 0;
//            if (entry.getValue() != exactNumberOfDuplications) {
//                while (j<entry.getValue()) {
//                    arrList.add(entry.getKey());
//                    j++;
//                }
//            }
//        }
//        String[] arrRet = new String[arrList.size()];
//        arrRet = arrList.toArray(arrRet);
//
//        return arrRet;
    }

//    public Map<String, Integer> getDupStrMap(int dupCount){
//        Map<String, Integer> duMap = new HashMap();
//        for(String str: array){
//            Integer count = duMap.get(str);
//            if(count == null)
//                duMap.put(str,1);
//            else
//                duMap.put(str,++count);
//        }
//        return duMap;
//    }
}


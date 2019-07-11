package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        List<Integer> paralist=new ArrayList<Integer>();
        for(int i=leftBorder<rightBorder?leftBorder:rightBorder;i<=(leftBorder<rightBorder?rightBorder:leftBorder);i++){
            paralist.add(i);
        }
        return paralist.stream().filter((item)->item%2==0).mapToInt(a->a).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        //return arrayList.stream().mapToInt((item) ->item*3+2).sum();
        return arrayList.stream().map((item)->item*3+2).reduce(0,(a,b)->a+b);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map((item)->item%2==1?item*3+2:item).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        //return arrayList.stream().filter((item)->item%2==0).collect(Collectors.averagingDouble(a->a));
        return arrayList.stream().filter(item->item%2==0).mapToDouble(a->a).average().orElse(0.00000000);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(item ->item%2==0).distinct().collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}

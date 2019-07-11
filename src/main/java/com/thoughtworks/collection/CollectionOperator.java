package com.thoughtworks.collection;

import sun.plugin.javascript.navig.Array;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        if(left<right){
            return Stream.iterate(left,n->n+1).limit(right-left+1).collect(Collectors.toList());
        }else{
            return Stream.iterate(left,n->n-1).limit(left-right+1).collect(Collectors.toList());
        }
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result=getListByInterval(left,right);
        return result.stream().filter(item->item%2==0).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i:array) {
            list.add(i);
        }
        return list.stream().filter(item->item%2==0).collect(Collectors.toList());
//      return Arrays.asList(Arrays.stream(array).filter(item->item%2==0).toArray());
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}

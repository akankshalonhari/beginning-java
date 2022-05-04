package com.xyzcorp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {

    @Test
    public void testList() {
        //cannot change the list contents by owner or reference holder
        List<Integer> immutableList = List.of(1, 2, 3,4, 5); //10+

        //can change the list contents only by owner not by reference holder
        List<Integer> unmodifiableList = Arrays.asList(41, 52, 13, 74, 25); //5+

        List<Integer> mutableList = new ArrayList<>();
        mutableList.add(30);
        mutableList.add(10);
        mutableList.add(70);

        Collections.sort(mutableList);
        System.out.println(mutableList);

        //Collections.sort(immutableList); doesnt work as cant sort immutable list
        Collections.sort(unmodifiableList);
        System.out.println(unmodifiableList);

        //Converting mutable list to unmodifiable using collections
        List<Integer> unmodifiableListNew = Collections.unmodifiableList(mutableList);
        //Collections.sort(unmodifiableListNew); doesnt work now, worked for mutableList
    }

    @Test
    public void testStreams() {
        List<Integer> result = List.of(40, 50, 10, 30, 90)
                                   .stream()
                                   .map(x -> x * 2)
                                   .sorted()
                                   .collect(Collectors.toList());

        System.out.println(result);
    }
}

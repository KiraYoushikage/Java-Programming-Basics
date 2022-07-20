package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream().reduce(numbers.get(0),(n1,n2)->{
            if((n2&1)==1)return n2;
            else return n1;
        });
    }

    public String getLongest(List<String> words) {
        return words.stream().reduce(words.get(0),(s1,s2)->{
           if (s1.length()<s2.length())return s2;
           else return s1;
        });
    }

    public int getTotalLength(List<String> words) {
        return 0;
    }
}

package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public List<Integer> filterEven(List<Integer> numbers) {
        return numbers.stream().filter(o-> (o&1)==0).collect(Collectors.toList());
    }

    public List<String> filterEndWithS(List<String> words) {
        return words.stream().filter(o-> o.endsWith("s")||o.endsWith("S")).collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> numbers, List<Integer> anotherNumbers) {
        numbers=numbers.stream().distinct().collect(Collectors.toList());
//        anotherNumbers=anotherNumbers.stream().distinct().collect(Collectors.toList());
        return numbers.stream()
                .filter(number-> anotherNumbers.stream().anyMatch(number::equals))
                .collect(Collectors.toList());
    }


}

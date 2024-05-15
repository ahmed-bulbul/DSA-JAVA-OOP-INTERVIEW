package books.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static Map<String,Long> countFrequency (List<String> words){
        Map<String,Long> frequencymap = new HashMap<>();
        for(String word : words){
            if(!frequencymap.containsKey(word)){
                frequencymap.put(word,0L);
            }
            Long oldCount = frequencymap.get(word);
            frequencymap.put(word,oldCount+1);
        }

        return frequencymap;
    }
    public static Map<String,Long> countFrequencyLambda (List<String> words){
        Map<String,Long> frequencymap = new HashMap<>();
        for(String word : words){
            frequencymap.merge(word,1L,(oldValue,newValue) -> oldValue + newValue);
        }

        return frequencymap;
    }
    public static Map<String,Long> countFrequencyLambda2 (List<String> words){
        return words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors. counting()));
    }



    public static void main(String[] args) {

        List<String> words = List.of("hello", "world","bangladesh","hello","Dhaka","world");
        Map<String,Long> frequencyMap = countFrequency(words);
        System.out.println(frequencyMap);

    }
}

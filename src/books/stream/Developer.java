package books.stream;

import books.defaultMethod.A;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Developer {
    private String name;
    private Set<String> language;

    public Developer(String name){
        this.language = new HashSet<>();
        this.name = name;
    }

    public void add(String language){
        this.language.add(language);
    }

    public Set<String> getLanguage(){
        return language;
    }

    public static void main(String[] args) {
        List<Developer> team = new ArrayList<>();

        Developer polyglot = new Developer("Developer X");
        polyglot.add("clojure");
        polyglot.add("scala");
        polyglot.add("groovy");
        polyglot.add("go");

        Developer busy = new Developer("Developer Y");
        busy.add("java");
        busy.add("javascript");

        team.add(polyglot);
        team.add(busy);

//        Stream<Set<String>> setStream = team.stream()
//                .map(developer -> developer.getLanguage());
//        setStream.forEach(languages-> System.out.println(languages));
//
//        List<Set<String>> languages = setStream.collect(Collectors.toList());
//
//        // flatmap
//        Stream<Set<String>> setStream1 = team.stream()
//                .map(developer -> developer.getLanguage());
//
//        Stream<String> stringStream = setStream1.flatMap(language -> language.stream());
//
//        List<String> list = stringStream.collect(Collectors.toList());

//        //same line
//        List<String> stringList = team.stream()
//                .map(developer -> developer.getLanguage())
//                .flatMap(language -> language.stream())
//                .collect(Collectors.toList());
//
//        //using method ref
//        List<String> list1 = team.stream()
//                .map(Developer::getLanguage)
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList());

        //for print
        team.stream().map(Developer::getLanguage)
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        //distinct
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,6);
        numbers.stream().distinct().forEach(System.out::println);


    }




}

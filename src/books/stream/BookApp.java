package books.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BookApp {

    public static String findEnglishBooks(List<Book> books){
        List<Book> englishBooks = new ArrayList<>();
        for(Book book : books){
            if(book.getLanguage().equals("English") && book.getPrice() >=500 && book.getPrice() <=100){
                englishBooks.add(book);
            }
        }

        Collections.sort(englishBooks, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });

        final String comma=", ";
        StringBuilder bookBuilder = new StringBuilder();
        for(Book englishBook : englishBooks){
            bookBuilder.append(englishBook.toString()).append(comma);
        }

        return bookBuilder.toString();
    }

    public static String findEnglishBooksWithJava8(List<Book> books){
        return books.stream()
                .filter(book -> book.getLanguage().equals("English"))
                .filter(book -> 500 <=book.getPrice() && book.getPrice() <=1000)
                .sorted(Comparator.comparingDouble(Book::getPrice))
                .map(Book::toString)
                .collect(Collectors.joining(", "));
    }


    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);

        String[] cities = {"Dhaka","London","Dubai","Tokio"};
        Stream<String> stream = Stream.of(cities);
        stream.filter(city -> city.equals("Dhaka"))
                .collect(Collectors.toSet());

        Stream<Integer> sequence = Stream.iterate(1,val -> val * 2);

        sequence.limit(10).forEach(val -> System.out.println(val+ " "));

        int x = 1;
        do{
            System.out.println(x);
            x++;
        }while (x <=10);

        Stream.iterate(1,val->++val).limit(10)
                .forEach(val -> System.out.print(val+" "));

        Stream<Integer> sequence2 = Stream.iterate(1, val -> val < 100, val -> val * 2 );

        sequence2.forEach(val -> System.out.println(val +" "));

        Stream<UUID> uuidStream = Stream.generate(() -> UUID.randomUUID()).limit(10);
        System.out.println(uuidStream.collect(Collectors.toSet()));

        Stream<Double> randomNumbers = Stream.generate(Math::random).limit(5);
        System.out.println(randomNumbers.collect(Collectors.toSet()));

        IntStream.range(0,10)
                .forEach(val -> System.out.println(val + " "));

//        try{
//            URL url = new URL("http://localhost");
//            URLConnection conn = url.openConnection();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//            Stream<String> lines = reader.lines();
//            lines.limit(10).forEach(val -> System.out.println(val));
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        try{
//            var url = new URL("http://localhost");
//            var conn = url.openConnection();
//
//            var reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//
//            var lines = reader.lines();
//            lines.limit(10).forEach(val -> System.out.println(val));
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        System.out.println("------------------------------------------");
        Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10);

        Stream<Integer> evenNumberStream = numbers.filter(n -> n % 2 == 0 );

        evenNumberStream.forEach(val -> System.out.println(val));









    }






}

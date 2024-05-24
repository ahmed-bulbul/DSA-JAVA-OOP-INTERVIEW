package books.optional;

import java.util.Optional;

public class BookService {
    private static Optional<Book> findBookByName(String javaProgramming) {
        return Optional.of(new Book());
    }
    private static void buyIt(Book book) {
        return;
    }
    private static void writeMessageToPublisher() {
        System.out.println("Please store this book");
        return;
    }

    private static String getNullableString() {
        return null;
    }

    private static String calculateHeavyMethod() {
        return "Heavy method";
    }



    public static void main(String[] args) {
        //way 1
        Optional<Book> optionalBook = findBookByName("Java Programming");
        if(optionalBook.isPresent()){
            Book book = optionalBook.get();
            buyIt(book);
        }else{
            writeMessageToPublisher();
        }

        //way 2 [ preferable]
        findBookByName("Java Programming")
                .ifPresentOrElse((book->{
                    buyIt(book);
                }),() -> {
                    writeMessageToPublisher();
                });
        // optimized way 2 as only 1 method called
        findBookByName("Java Programming")
                .ifPresentOrElse(BookService::buyIt,BookService::writeMessageToPublisher);


        //or
        Optional<Book> optionalBook1
                = findBookByName("Java Programming")
                .or(()->findBookByName("Java Thread Programing"));

        // or else
        String myString = Optional.ofNullable(getNullableString()).orElse("Default");
        //System.out.println(myString);

        //or else get
        String myString2 = Optional.ofNullable(getNullableString()).orElseGet(()->calculateHeavyMethod());
        System.out.println(myString2);

    }



}

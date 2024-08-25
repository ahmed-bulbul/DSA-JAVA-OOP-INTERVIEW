package books.stream;

public class Book {
    private String language;
    private String name;
    private int price;

    public String getLanguage() {
        return language;
    }

    public Book setLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Book setPrice(int price) {
        this.price = price;
        return this;
    }
}

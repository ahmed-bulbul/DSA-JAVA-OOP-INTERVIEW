package books.definitionAndSyntax;


@FunctionalInterface
public interface Converter {
    String apply(String string);
    boolean equals(Object obj);
}

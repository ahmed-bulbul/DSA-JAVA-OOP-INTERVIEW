package books.advancedGenerics;

import java.util.Objects;
import java.util.function.Consumer;

public interface Map<K,V>{
    V put(K key, V value);
    K getKey();
    V getValue();

//    default void forEach(Consumer<? super T> action){
//        Objects.requireNonNull(action);
//        for(T t : this){
//            action.accept(t);
//        }
//    }
}

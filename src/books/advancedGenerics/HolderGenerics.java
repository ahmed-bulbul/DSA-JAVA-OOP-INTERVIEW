package books.advancedGenerics;

import books.defaultMethod.A;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class HolderGenerics <T>{
    private T object;
    public T getObject(){
        return object;
    }

    public HolderGenerics setObject(T object){
        this.object = object;
        return this;
    }

    public static Number process(List<Number> list){
        int sum = 0;
        for(Number number : list){
            sum += number.intValue();
        }

        return sum;
    }

//    public boolean containsAll(Collection<?> c){
//        for(Object e : c)
//            if(!contains(e))
//                return false;
//        return true;
//    }

//    public boolean contains(Object o){
//        Iterator<E> it = iterator();
//        if(o == null){
//            while (it.hasNext())
//                if(it.next() == null)
//                    return true;
//        }else{
//            while (it.hasNext())
//                if(o.equals(it.next()))
//                    return true;
//        }
//        return false;
//    }
//

    public static double sumAll(List<? extends Number> numbers){
        double sum = 0;
        for(Number number : numbers){
            sum+=number.doubleValue();
        }
        return sum;
    }




    public static void main(String[] args) {
        HolderGenerics<String> stringHolderGenerics = new HolderGenerics<>();
        stringHolderGenerics.setObject("Hello world");

        HolderGenerics<Integer> integerHolderGenerics = new HolderGenerics<>();
        integerHolderGenerics.setObject(5);

        Integer holderObj = integerHolderGenerics.getObject();
        Integer sum = holderObj + 5;

        HolderGenerics<Number> numberHolderGenerics = new HolderGenerics<>();
        numberHolderGenerics.setObject(BigInteger.ONE);
        numberHolderGenerics.setObject(5);

        HolderGenerics<HolderGenerics<Number>> holderHolder = new HolderGenerics<>();
        HolderGenerics<Number> integerHolder = new HolderGenerics<>();
        holderHolder.setObject(integerHolder);

        HolderGenerics<Integer> intHolder = new HolderGenerics<>();
//        holderHolder.setObject(intHolder);

        List<Integer> numbers = List.of(1,2,3,4,5,6);
       // process(numbers);


        List<Integer> integers = List.of(1,2,3,4,5);
        sumAll(integers);

        List<Double> doubles = List.of(3.4,4.6,7.5);
        sumAll(doubles);

        List<? extends Number> mixedNumbers = List.of(1,2,3.4,5.4f);
        sumAll(mixedNumbers);


        List<? super BigInteger> bigIntegers = new ArrayList<>();
        bigIntegers.add(BigInteger.TWO);
        bigIntegers.add(BigInteger.TEN);
        bigIntegers.add(BigInteger.ONE);

        List<Integer> integerList = List.of(1,2,3,4);
        integerList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });





    }
}

package books.advancedGenerics;

public class Holder {
    private Object object;

    public Object getObject(){
        return object;
    }

    public Holder setObject(Object object){
        this.object = object;
        return this;
    }

    public static void main(String[] args) {
        Holder stringHolder = new Holder();
        stringHolder.setObject("Hello world!!");

        Holder integerHolder = new Holder();
        integerHolder.setObject(4);

        Integer obj = (Integer) integerHolder.getObject();
        System.out.println(obj);
    }
}

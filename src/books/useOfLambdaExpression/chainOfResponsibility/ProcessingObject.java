package books.useOfLambdaExpression.chainOfResponsibility;

public abstract class ProcessingObject<T> {
    protected ProcessingObject<T> successor;

    public void setSuccessor(ProcessingObject<T> successor){
        this.successor = successor;
    }
    public T handle(T input){
        T t = handleWork(input);
        if(successor !=null){
            return successor.handle(t);
        }
        return t;
    }
    protected abstract T handleWork(T input);
}

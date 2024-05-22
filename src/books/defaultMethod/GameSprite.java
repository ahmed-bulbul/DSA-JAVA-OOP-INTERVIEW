package books.defaultMethod;

public interface GameSprite {

    int getX();
    int getY();
    void setX(int x);
    void setY(int y);

    default void moveRight(int distance){
        setX(getX()+distance);
    }
    default void moveLeft(int distance){
        setX(getX()-distance);
    }

    default void moveBottom(int distance){
        setY(getY() - distance);
    }
}

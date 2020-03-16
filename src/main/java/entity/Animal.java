package entity;

public interface Animal {
    public void breath();
    public void move();

    default void defaultBreath(){
        System.out.println("생물이 숨쉽니다");
    }

    static void staticMove(){
        System.out.println("생물이 움직입니다");
    }
}

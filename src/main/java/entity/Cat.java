package entity;

public class Cat implements Animal{

    @Override
    public void breath() {
        System.out.println("고양이가 숨쉽니다");
    }

    @Override
    public void move() {
        System.out.println("고양이가 움직입니다");
    }
}

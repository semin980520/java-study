package C03Inheritance;

public class C03AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.sound2();
        Cat cat =new Cat();
        cat.sound();
        cat.sound2();

//        상속관계일때는 부모클래스의 타입을 자식클래스의 객체타입으로 지정가능
        Animal d2 = new Dog();
        d2.sound();
//        부모클래스의 타입으로 지정시, 부모클래스에서 정의된 메서드만 객체에서 사용가능
//        d2.sound2();
    }
}

class Animal{
    public void sound(){
        System.out.println("동물이소리를냅니다.");
    }
}
class Dog extends Animal {
    @Override
    public void sound(){

    }
    public void sound2(){
        System.out.println("멍멍멍멍");
    }
}
class Cat extends Animal{

    public void sound2(){
        System.out.println("야옹야옹");
    }
}
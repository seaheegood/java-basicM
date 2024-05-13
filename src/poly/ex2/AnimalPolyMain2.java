package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();
        Animal[] animalArray = {dog, cat, caw, duck};
//        Animal index1 = dog;
//        Animal index2 = cat;
//        Animal index3 = caw;
        for (Animal animal : animalArray) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}

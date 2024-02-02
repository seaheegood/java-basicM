package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);

        data = new Data();
        System.out.println("2. data = " + data);

        data = null;
        // `data` 에 `null` 을 할당했다. 따라서 앞서 생성한 `x001` `Data` 인스턴스를 더는 아무도 참조하지 않는다. 이렇게 아무도 참조하지 않게되면 `x001` 이라는 참조값을 다시 구할 방법이 없다.따라서 해당 인스턴스에 다시 접근할 방법이없다.
        // 이렇게 아무도 참조하지 않는 인스턴스는 사용되지 않고 메모리 용량만 차지할 뿐이다.

        // 과거에는 개발자가 직접 명령어를 사용해서 제거했어야했는데
        // 자바는 이런 과정을 자동으로 처리해준다.
        // 아무도 참조하지 않는 인스턴스가 있으면 JVM의 GC(가비지 컬렉션)가 해당 인스턴스를 자동으로 메로리에서 제거해준다.
        System.out.println("3. data = " + data);
    }
}

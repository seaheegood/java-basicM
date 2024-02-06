package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200;
        speaker.showVolume();

        //직접 접근해서 원하는 값을 설정할 수 있기 때문에 Speaker 클래스에서 음량이 100 넘지 못하도록
        //기능 개발 해놓은 것이 소용 없어 졌다.
        //이러한 문제를 근본적으로 해결하기 위해서는 volume 필드의 외부 접근을 막을 수 있는 방법이 필요하다.

        // 좋은 프로그램은 무한한 자유도가 있는 프로그램이 아니라 적절한 제약을 제공하는 것이다.
    }
}


package _05_class._interface;

public class Speaker implements RemoteControl {
    // 필드
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("스피커 전원 ON");
    }

    @Override
    public void turnOff() {
        System.out.println("스피커 전원 OFF");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("현재 스피커 음량 : " + this.volume);
        // 매개변수로 넘어오는 volume과 해당 파일에서 정의된 volume인지 잘 구별할 것.
    }
}
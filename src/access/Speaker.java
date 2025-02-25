package access;

public class Speaker { //public: 어디서든 해당 속성과 기능 호출 가능
    private int volume; //private: 외부 클래스에서 해당 속성과 기능 호출 제한

    Speaker(int volume) { //default : 외부 패키지에서 해당 속성과 기능 호출 제한
        this.volume = volume;
    }

    void volumeUp() { //default: 자신 클래스 내부와 같은 패키지 내에서만 호출 가능
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() { //default
        if (volume <= 0) {
            System.out.println("음량을 감소할 수 없습니다. 최소 음량입니다.");
        } else {
            volume -= 10;
            System.out.println("음량을 10 감소합니다.");
        }
    }

    void showVolume() { //default
        System.out.println("현재 음량: " + volume);
    }

}

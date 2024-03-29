package wiring.auto;

public class Instrumentlist implements Performer{
	private String song;
	private Instrument instrument;
	
	// set 메소드
	public void setSong(String song) {
		this.song = song;
	}
	
	// 생성자를 하나 만들어줌
	// default로 생성
	public Instrumentlist() {}
	public Instrumentlist(String song, Instrument instrument) {
		this.song = song;
		this.instrument = instrument;
	}
	public void setInstrument(Instrument instrument) { // byType 이면 instrument로 받겠다
		this.instrument = instrument;
	}
	
	// performer 상속받아서 perform 메소드 생성
	public void perform() {
		System.out.println(song + "을 연주 합니다");
		instrument.playing();
	}
}

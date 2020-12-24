package woosongbit.sample3;

abstract class Player {

	int cuurentPos;

	Player() {
		cuurentPos = 0;
	}

	abstract void stop(); // 추상메서드

	abstract void play(int pos);

	void Play() {
		play(cuurentPos); // 추상메서드 사용가능하다.
		stop(); 

	}
}

class AudioPlayer extends Player {

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("AudioPlayer.stop()");

	}
	
	@Override
	void play(int pos) {
		System.out.println("AudioPlayer.play()");
	}

}

public class Start {
	public static void main(String[] args) {
		
		Player p = new AudioPlayer();
		p.Play();

	}
}

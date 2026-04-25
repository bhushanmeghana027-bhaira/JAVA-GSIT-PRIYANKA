package Week7StringsAbstractionInterfacee;
interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

interface SmartFeatures {
    void connectToWifi();
}

class SmartPhone implements Camera,MusicPlayer,SmartFeatures  {

	
	public void connectToWifi() {
		// TODO Auto-generated method stub
		System.out.println("Connected to WiFi🛜");
	}

	
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("Playing music...🎵");
	}

	
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("Photo captured successfully📷");
	}
	
}
public class SmartPhoneInterfacses {
	public static void main(String[] args) {
		SmartPhone s1 = new SmartPhone();
		s1.connectToWifi();
		s1.playMusic();
		s1.takePhoto();
	}

}

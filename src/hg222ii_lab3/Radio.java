package hg222ii_lab3;

public class Radio {
	private int channel = 1;
	private int volume = 1;


	public Radio() {

	}

	public void volumeUp() {
		if (volume > 5 || volume < 0) {
			System.out.println("New volume not within range!");	
				 
		
		if (defaultSettings() == false)
		System.out.println("Radio off ==> No adjustment possible");
		volume++;}
	}

	public void volumeDown() {
		 volume--;
		
		if (volume > 5 || volume < 0) {
			System.out.println("New volume not within range!");
		volume = 0;}
	}

	public int channelUp() {
		return channel++;
	}

	public int channelDown() {
		return channel--;
	}
	
	public int setVolume(int newVolume) {
		while (newVolume > volume) {
			volume++;
		}
		return newVolume;
	}
	
	public int setChannel(int newChannel) {
		while (newChannel > channel) {
			channel++;
		}

		if (newChannel > 10 || newChannel < 0) {
			System.out.println("New channel not within range!");
			channel = 1;
		}
		return newChannel;
	}



	public String getSettings() {
		String str = "Settings: " + "On " + defaultSettings() + ", Channel " + setChannel(channel) + ", Volume "
				+ setVolume(volume);

		return str;
	}

	public boolean defaultSettings() {
		if (setChannel(channel) == 1 && setVolume(volume) == 1)
			return false;
		else
			return true;
	}
	
	public void turnOn() {
		setChannel(channel);
		setVolume(volume);
	}

	public void turnOff() {
		while (setVolume(volume) > 1) {
			volumeDown();
		}
		while (setChannel(channel) > 1) {
			channelDown();
		}

	}

}

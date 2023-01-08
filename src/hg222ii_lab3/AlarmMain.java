package hg222ii_lab3;
//Ställa väckarklockan till tiden 23:48
//Visa tiden
//Ställa in väckningstiden till 6:15
//Låta klockan gå 500 minuter
//Visa tiden igen

public class AlarmMain {
	
	public static void main(String[] args) {
		
	AlarmClock nc = new AlarmClock(23, 48);
	
	nc.displayTime();
	
	nc.setAlarm(6, 15);
	
	nc.displayAlarmTime();{}
	
	for (int i=0; i<500; i++) {
	nc.timeTick();
	
	}
	
	nc.displayTime();
	
	}
}

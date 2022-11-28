package Command;

public class Main {
	public static void main(String[] args) {
		RemoteController remote = new RemoteController();
		LivingRommLight lroom = new LivingRommLight();
		command on = new OnCommand(lroom);
		command off = new OffCommand(lroom);
		
		remote.setCommand(on, off);
		remote.onButtonPushed();
		remote.OffButtonPushed();
	}
}

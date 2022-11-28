package Command;

public class RemoteController {
	command on;
	command off;
	
	
	public void setCommand(command on, command off) {
		this.on = on;
		this.off = off;
	}
	public void onButtonPushed() {
		on.execute();
	}
	public void OffButtonPushed() {
		off.execute();
	}
}

package Command;

public class OnCommand implements command {
	Light light;
	
	public OnCommand(Light light) {
		this.light = light;

	}

	@Override
	public void execute() {
		light.on();
		
	}

}

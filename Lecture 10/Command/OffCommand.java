package Command;

public class OffCommand implements command {
	Light light;
	
	public OffCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.off();

	}

}

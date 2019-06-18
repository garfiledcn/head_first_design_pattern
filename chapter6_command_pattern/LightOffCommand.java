public class LightOffCommand implements Command {
    Light mLight;

    public LightOffCommand(Light light) {
        mLight = light;
    }

    public void execute() {
        mLight.off();
    }
}

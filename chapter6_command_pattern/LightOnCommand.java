public class LightOnCommand implements Command {
    Light mLight;

    public LightOnCommand(Light light) {
        this.mLight = light;
    }

    public void execute() {
        mLight.on();
    }
}

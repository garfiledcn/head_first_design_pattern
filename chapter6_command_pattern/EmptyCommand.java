public class EmptyCommand implements Command{
    public EmptyCommand() {}
    public void execute() {
        System.out.println("empty command execute");
    }
}

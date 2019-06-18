public class SimpleRemoteControl {
    Command mCmdSlot;

    public SimpleRemoteControl() {}

    public void setCommand(Command cmd) {
        mCmdSlot = cmd;
    }

    public void buttonWasPressed() {
        mCmdSlot.execute();
    }
}

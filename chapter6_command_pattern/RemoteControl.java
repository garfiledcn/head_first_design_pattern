public class RemoteControl{
    Command[] mOnCmdSlots;
    Command[] mOffCmdSlots;

    private static final int CMD_SLOT_SIZE = 8;
    
    public static final int CMD_SLOT_0_INDEX = 0;
    public static final int CMD_SLOT_1_INDEX = 1;
    public static final int CMD_SLOT_2_INDEX = 2;
    public static final int CMD_SLOT_3_INDEX = 3;
    public static final int CMD_SLOT_4_INDEX = 4;
    public static final int CMD_SLOT_5_INDEX = 5;
    public static final int CMD_SLOT_6_INDEX = 6;
    public static final int CMD_SLOT_7_INDEX = 7;

    public RemoteControl() {
        mOnCmdSlots = new Command[CMD_SLOT_SIZE];
        mOffCmdSlots = new Command[CMD_SLOT_SIZE];

        Command emptyCmd = new EmptyCommand();
        for (int i=0; i<CMD_SLOT_SIZE; ++i) {
            mOnCmdSlots[i] = emptyCmd;
            mOffCmdSlots[i] = emptyCmd;
        }
    }

    public void setCommand(int slot, Command onCmd, Command offCmd) {
        mOnCmdSlots[slot] = onCmd;
        mOffCmdSlots[slot] = offCmd;
    }

    public void onButtonWasPressed(int slot) {
        mOnCmdSlots[slot].execute();
    }

    public void offButtonWasPressed(int slot) {
        mOffCmdSlots[slot].execute();
    }

    public String toString() {
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("\n-------- Remote Control --------\n");
        for (int i=0; i<CMD_SLOT_SIZE; ++i) {
            strBuff.append("[slot "+i+"]"+mOnCmdSlots[i].getClass().getName()
                    + "    " + mOffCmdSlots[i].getClass().getName() + "\n");
        }

        return strBuff.toString();
    }
}

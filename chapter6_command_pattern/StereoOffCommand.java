public class StereoOffWithCDCommand implements Command {
    Stereo mStereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        mStereo = stereo;
    }

    public void execute() {
        mStereo.off();
    }
}


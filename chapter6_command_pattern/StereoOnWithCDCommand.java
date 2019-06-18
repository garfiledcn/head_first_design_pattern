public class StereoOnWithCDCommand implements Command {
    Stereo mStereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        mStereo = stereo;
    }

    public void execute() {
        mStereo.on();
        mStereo.setCD();
        mStereo.setVolume(11);
    }
}

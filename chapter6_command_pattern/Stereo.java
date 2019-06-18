public class Stereo {
    String mName;
    int mVol;

    public Stereo(String name) {
        mName = name;
        mVol = 0;
    }

    public void on() {
        System.out.println("turn on stereo:"+mName);
    }

    public void setCD() {
        System.out.println("set cd for stereo:"+mName);
    }

    public void setVolume(int v) {
        mVol = v;
        System.out.println("set volume:"+mVol+" for stereo:"+mName);
    }
    public void off() {
        System.out.println("turn off stereo:"+mName);
        mVol = 0;
    }
}

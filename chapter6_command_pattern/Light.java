public class Light {
    String mName;

    public Light(String name) {
        this.mName = name;
    }

    public void on() {
        System.out.println("turn on light:"+mName);
    }

    public void off() {
        System.out.println("turn off light:"+mName);
    }
}

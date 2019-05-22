import java.util.ArrayList;

public abstract class Pizza {
    String mName = "abstract Pizza";
    String mDough;
    String mSauce;
    ArrayList mToppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing " + mName);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (int i=0; i<mToppings.size(); ++i) {
            System.out.println(" " + mToppings.get(i));
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStrore box");
    }

    public String getName() {
        return mName;
    }

    void setName(String name) {
        mName = name;
    }
}

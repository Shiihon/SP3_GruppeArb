
public abstract class AMenu implements Menu {
    protected final TextUI ui;

    public AMenu() {
        ui = new TextUI();
    }

    @Override
    public abstract void setup();
}

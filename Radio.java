public class Radio implements Device{

    @Override
    public void toggleOn() {
        System.out.println("Radio ON");
    }

    @Override
    public void toggleOff() {
        System.out.println("Radio OFF");
    }
}

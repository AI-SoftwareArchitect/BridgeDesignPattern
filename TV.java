public class TV implements Device{
    @Override
    public void toggleOn() {
        System.out.println("TV ON");
    }

    @Override
    public void toggleOff() {
        System.out.println("TV OFF");
    }
}

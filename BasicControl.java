public class BasicControl extends RemoteControl{
    boolean isOn = false;

    BasicControl(Device device) {
        super(device);
    }

    @Override
    void toggleOnOff() {
        if (isOn) {
            isOn = false;
            device.toggleOff();
        } else {
            isOn = true;
            device.toggleOn();
        }
    }
}

package frc.robot.util;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI {
    public JoystickWrapper stick1;

    public OI() {
        stick1 = new JoystickWrapper(Constants.Input.JOYSTICK_1_PORT); 
    }
}

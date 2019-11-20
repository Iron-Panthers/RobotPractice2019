package frc.robot.util;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI {
    public Joystick driveJoystick;
    public JoystickButton joystickButton;

    public OI() {
        driveJoystick = new Joystick(1);
        joystickButton = new JoystickButton(driveJoystick, 2);
    }
}

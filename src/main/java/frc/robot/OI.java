package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
    public Joystick stick1;
    public Joystick driveStick;

    public JoystickButton intakeButton, outtakeButton;
    

    public OI(){   
        driveStick = new Joystick(2);
        

        
    }
}
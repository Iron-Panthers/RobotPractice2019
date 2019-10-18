package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.OuttakeCommand;
import frc.robot.util.Constants;

public class OI {
    public Joystick stick1;
    JoystickButton intakeButton, outtakeButton;
    Joystick driveStick;
    

    public OI(){    
        stick1 = new Joystick(Constants.DRIVER_DEVICE_ID);
        intakeButton = new JoystickButton(stick1, 1);
        outtakeButton = new JoystickButton(stick1, 2);
        driveStick = new Joystick(2);
        

        intakeButton.whileHeld(new IntakeCommand());
        outtakeButton.whileHeld(new OuttakeCommand());
    }
}
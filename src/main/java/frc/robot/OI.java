package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.OuttakeCommand;
import frc.robot.util.Constants;

public class OI {
    public Joystick stick1;
    public JoystickButton intakeButton;
    public JoystickButton outtakeButton;

    public OI() {
        stick1 = new Joystick(Constants.DRIVER_DEVICE_ID);
        intakeButton = new JoystickButton(stick1, Constants.DRIVER_DEVICE_ID);
        outtakeButton = new JoystickButton(stick1, Constants.OUTTAKE_BUTTON_ID);
    
        intakeButton.whileHeld(new IntakeCommand());
        outtakeButton.whileHeld(new OuttakeCommand());
    }
}    


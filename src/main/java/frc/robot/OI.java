package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.OuttakeCommand;

public class OI {
    Joystick stick1;
    JoystickButton intakeButton;
    JoystickButton outtakeButton;
    public OI() {
        stick1 = new Joystick(1);
        intakeButton = new JoystickButton(stick1, 1);
        outtakeButton = new JoystickButton(stick1, 2);

        intakeButton.whileHeld(new IntakeCommand());
        outtakeButton.whileHeld(new OuttakeCommand());
    }
}
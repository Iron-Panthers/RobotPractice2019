package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.OuttakeCommand;

public class OI {
	public Joystick stick1;
	public JoystickButton intakeButton;
	public JoystickButton outtakeButton;

	public OI() {
		stick1 = new Joystick(0);
		intakeButton = new JoystickButton(stick1, 7);
		outtakeButton = new JoystickButton(stick1, 11);

		intakeButton.whileHeld(new IntakeCommand());
		outtakeButton.whileHeld(new OuttakeCommand());
	}
}
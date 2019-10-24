/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.OuttakeCommand;
import frc.robot.util.Constants;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public Joystick stick1, driveStick;
  public JoystickButton intakeButton, outtakeButton;

  public OI(){
    stick1 = new Joystick(Constants.STICK_1_PORT);
    intakeButton = new JoystickButton(stick1, Constants.INTAKE_BUTTON);
    outtakeButton = new JoystickButton(stick1, Constants.OUTTAKE_BUTTON);
    driveStick = new Joystick(Constants.DRIVE_STICK_PORT);

    intakeButton.whileHeld(new IntakeCommand());
    outtakeButton.whileHeld(new OuttakeCommand());
    
  }
}

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ClimbDownCommand;
import frc.robot.commands.ClimbUpCommand;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.OuttakeCommand;
import frc.robot.util.Constants;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public Joystick armStick, driveStick;
  public JoystickButton intakeButton, outtakeButton;
  public JoystickButton climbUpButton, climbDownButton;

  public OI(){
    //sticks
    armStick = new Joystick(Constants.ARM_STICK_PORT);
    driveStick = new Joystick(Constants.DRIVE_STICK_PORT);
    
    //buttons
    intakeButton = new JoystickButton(armStick, Constants.INTAKE_BUTTON);
    outtakeButton = new JoystickButton(armStick, Constants.OUTTAKE_BUTTON);
    climbUpButton = new JoystickButton(driveStick, Constants.CLIMB_UP_BUTTON);
    climbDownButton = new JoystickButton(driveStick, Constants.CLIMB_DOWN_BUTTON);

    //button -> commands
    intakeButton.whileHeld(new IntakeCommand());
    outtakeButton.whileHeld(new OuttakeCommand());
    climbUpButton.whileHeld(new ClimbUpCommand());
    climbDownButton.whileHeld(new ClimbDownCommand());
  }
}

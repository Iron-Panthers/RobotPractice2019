/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.drive;

import edu.wpi.first.wpilibj.Solenoid;
//import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.util.SparkMaxMotorGroup;
import frc.robot.util.*;

import edu.wpi.first.wpilibj.command.Command;

public class DriveSubsystem extends Command {
    private SparkMaxMotorGroup left = Robot.hardware.leftDriveMotors;
    private SparkMaxMotorGroup right = Robot.hardware.rightDriveMotors;
    public Solenoid gearShift = Robot.hardware.gearShift;

  public DriveSubsystem() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    left.setInverted(Constants.Drivebase.IS_LEFT_INVERTED);
    right.setInverted(Constants.Drivebase.IS_RIGHT_INVERTED);
  }

  // public void set(double power) {
  //   left.set(0.3);
  //   right.set(0.3);
  // }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    left.set(Constants.LEFT_POWER);
    right.set(Constants.RIGHT_POWER);
    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    left.stop();
    right.stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    left.stop();
    right.stop();
  }
  
}

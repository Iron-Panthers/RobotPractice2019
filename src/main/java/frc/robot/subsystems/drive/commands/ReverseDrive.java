/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.drive.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ReverseDrive extends Command {
  public ReverseDrive() {
    // No subsystem requirements 
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.drive.isReversed = true; 
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.drive.isReversed = false; 
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    Robot.drive.isReversed = false; 
  }
}

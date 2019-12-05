/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.climb.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class SetupClimb extends Command {
  public SetupClimb() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    /*
    requires(Robot.elevator); 
    requires(Robot.superstructure); 
    */
    requires(Robot.climb); 
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    /*
    Robot.elevator.shiftLow(); 
    Robot.elevator.setTarget(Constants.CLIMB_SETUP_HEIGHT); 
    Robot.superstructure.setIntakeHeight(true); 
    */
    Robot.climb.useClimbRelease(true); 
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.climb.succ(); 
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.climb.succ(); 
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    Robot.climb.succ(); 
  }
}

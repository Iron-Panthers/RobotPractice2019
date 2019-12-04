/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.arm.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class SetPoints extends Command {
  public double height;
  public boolean isFront;
  public SetPoints(double height,boolean isFront) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    this.height = height;
    this.isFront = isFront;
    requires(Robot.arm);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.arm.target = Robot.arm.angleBySetpoint(height, isFront);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double power = 0;
    if (isFront) {
       power = Robot.arm.getPower();
    } else if(!isFront) {
      power = Robot.arm.getPowerBack();
    } else {
      System.out.println("Error isFront not set correctly");
    }
    Robot.arm.set(power);
    System.out.println("The power is:"+power);
    System.out.println("The target angle is:"+Robot.arm.target);
    System.out.println("The current error is"+ (Robot.arm.target-Robot.arm.getCurrentAngle()));
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return Robot.arm.isFinished();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.arm.stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    Robot.arm.stop();
  }
}

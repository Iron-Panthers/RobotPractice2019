/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.arm.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.util.Constants;

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
    Robot.arm.target = Robot.arm.angleBySetpoint(height-Constants.Arm.ARM_BASE_HEIGHT, isFront);
    System.out.println(Robot.arm.target);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double power = Robot.arm.getPower();
    Robot.arm.set(power);
    System.out.println(Robot.arm.target - Robot.arm.getCurrentAngle());
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

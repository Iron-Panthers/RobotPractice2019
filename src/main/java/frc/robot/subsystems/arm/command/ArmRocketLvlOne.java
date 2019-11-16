/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.arm.command;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.util.Constants;


public class ArmRocketLvlOne extends Command {
  public ArmRocketLvlOne() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.arm);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.arm.ArmToTarget(Constants.Arm.ROCKET_LOW_HEIGHT, true);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.arm.currentError = Robot.arm.target - Robot.arm.getCurrentAngle();
    double power = (Constants.Arm.INTAKE_ARM_P * Robot.arm.currentError) + Robot.arm.getBasePower() ;
    Robot.arm.set(power);  
    System.out.println("Arm Target:" + Robot.arm.target);
    System.out.println("Arm Power: " + power);
    System.out.println("Error: " + Math.abs(Robot.arm.target - Robot.arm.getCurrentAngle()));
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return Robot.arm.isFinished();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.arm.isFinished();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    Robot.arm.isFinished();
  }
}

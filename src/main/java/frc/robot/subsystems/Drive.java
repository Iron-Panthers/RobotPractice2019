/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.commands.DriveCommand;
import frc.robot.util.SparkMaxMotorGroup;
import frc.robot.util.Constants;

/**
 * Add your docs here.
 */
public class Drive extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private SparkMaxMotorGroup leftGroup, rightGroup;

  public Drive(){
    leftGroup = new SparkMaxMotorGroup(Robot.hardware.leftLeader, Robot.hardware.leftFollower);
    rightGroup = new SparkMaxMotorGroup(Robot.hardware.rightLeader, Robot.hardware.rightFollower);
    rightGroup.setInversion(Constants.IS_RIGHT_INVERTED);
    leftGroup.setInversion(Constants.IS_LEFT_INVERTED);
  }

  public void set(double leftPower, double rightPower){
    leftGroup.set(leftPower);
    rightGroup.set(rightPower);
  }

  public void stop(){
    leftGroup.set(0);
    rightGroup.set(0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriveCommand());
  }
}
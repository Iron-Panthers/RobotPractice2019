/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Hardware;
import frc.robot.SparkMaxMotorGroup;

/**
 * Add your docs here.
 */
public class Drive extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands
  private SparkMaxMotorGroup left, right;

  public Drive(){
    left = new SparkMaxMotorGroup(Hardware.leftLeader, Hardware.leftFollower);
    right = new SparkMaxMotorGroup(Hardware.rightLeader, Hardware.rightFollower);
  }
  public void set(double leftSpeed, double rightSpeed){
    left.set(leftSpeed);
    right.set(rightSpeed);
  }
  public void stop(){
    left.stop();
    right.stop();
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
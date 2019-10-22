/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.commands.DriveCommands;
import frc.robot.util.CANSparkMaxMotorGroup;

/**
 * Add your docs here.
 */
public class Drive extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public CANSparkMaxMotorGroup leftMotors, rightMotors;

  public Drive(){
    leftMotors = new CANSparkMaxMotorGroup(Robot.hardware.leftLeader, Robot.hardware.leftFollower);
    rightMotors = new CANSparkMaxMotorGroup(Robot.hardware.rightLeader, Robot.hardware.rightFollower);
  }

  public void set(double leftPower, double rightPower){
    leftMotors.set(Math.abs(leftPower));
    rightMotors.set(-Math.abs(rightPower));
  }

  public void stop(){
    leftMotors.set(0);
    rightMotors.set(0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
      setDefaultCommand(new DriveCommands());
  }
}

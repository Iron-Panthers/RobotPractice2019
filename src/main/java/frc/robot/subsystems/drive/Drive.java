/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.drive;


import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.util.SparkMaxMotorGroup;
import frc.robot.subsystems.drive.command.DriveWithJoystick;

/**
 * Add your docs here.
 */
public class Drive extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public SparkMaxMotorGroup leftDrive;
  public SparkMaxMotorGroup rightDrive; 

  public Drive() {
    leftDrive = Robot.hardware.leftDrive;
    rightDrive = Robot.hardware.rightDrive;
  }
  

  public void set(double leftPower, double rightPower) {
    leftDrive.set(leftPower);
    rightDrive.set(rightPower);
  }
  


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriveWithJoystick());
  }
}

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.drive;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Hardware;

/**
 * Add your docs here.
 */
public class Drive extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  double leftPower;
  double rightPower;
  private CANSparkMax leftMotor1;
  private CANSparkMax leftMotor2;
  private CANSparkMax rightMotor1;
  private CANSparkMax rightMotor2;

  public Drive() {
    leftMotor1 = Hardware.leftMotor1;
    leftMotor2 = Hardware.leftMotor2;
    rightMotor1 = Hardware.rightMotor1;
    rightMotor2 = Hardware.rightMotor2;
  }
  

  public void set(double leftPower, double rightPower) {
    leftMotor1.set(leftPower);
    leftMotor2.set(leftPower);
    rightMotor1.set(rightPower);
    rightMotor2.set(rightPower);
	}


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}

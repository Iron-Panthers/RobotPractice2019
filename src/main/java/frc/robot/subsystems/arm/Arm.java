/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.arm;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class Arm extends Subsystem {
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public TalonSRX armMotor;
  public double target; //in degrees

  public Arm() {
    armMotor = Robot.hardware.armMotor;
  }

  public void setY(double y) {
    armMotor.set(ControlMode.PercentOutput, y);
    System.out.println(y);
  }
  public void stop() {
    armMotor.set(ControlMode.PercentOutput, 0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}

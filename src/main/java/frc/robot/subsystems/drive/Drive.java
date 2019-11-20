/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.drive;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;
import frc.robot.subsystems.drive.commands.ArcadeDrive;
import frc.robot.util.Constants;
import frc.robot.util.GearState;
import frc.robot.util.SparkMaxMotorGroup;

/**
 * Add your docs here.
 */
public class Drive extends Subsystem {
  private SparkMaxMotorGroup left = Robot.hardware.leftDriveMotors; 
  private SparkMaxMotorGroup right = Robot.hardware.rightDriveMotors; 
  public Solenoid gearShift = Robot.hardware.gearShift; 
  public GearState state; 
  public boolean isReversed; 

  public Drive() {
    left.setInverted(Constants.Drivebase.IS_LEFT_INVERTED); 
    right.setInverted(Constants.Drivebase.IS_RIGHT_INVERTED); 
    isReversed = false; 
  }

  public void set(double leftPower, double rightPower) {
    left.set(leftPower); 
    right.set(rightPower); 
    SmartDashboard.putNumber("Drive -- Set left power: ", leftPower); 
    SmartDashboard.putNumber("Drive -- Set right power: ", rightPower); 
  }

  public void reset() {
    left.stop(); 
    right.stop(); 
  }

  public double getLeftVelocity() {
    return left.getMasterMotor().getEncoder().getVelocity(); 
  }

  public double getRightVelocity() {
    return right.getMasterMotor().getEncoder().getVelocity(); 
  }

  public double getLeftEncoderRevolutions() {
    return left.getEncoderPosition(); 
  }

  public double getRightEncoderRevolutions() {
    return right.getEncoderPosition(); 
  }

  public void shiftLow() {
    state = GearState.HIGH; 
    gearShift.set(true); 
  }

  public void shiftHigh() {
    state = GearState.LOW; 
    gearShift.set(false); 
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ArcadeDrive());
  }
}

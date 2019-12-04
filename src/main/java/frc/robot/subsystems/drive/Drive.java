/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.drive;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

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
  private final SparkMaxMotorGroup left; 
  private final SparkMaxMotorGroup right; 
  public final Solenoid gearShift; 
  private boolean isReversed; 

  /* Creation of drivebase subsystem.
  + setting of right and left motorgroups */

  public Drive() {
    final CANSparkMax driveLeft1 = new CANSparkMax(Constants.CANIDs.DRIVE_L1_PORT, MotorType.kBrushless); 
    final CANSparkMax driveLeft2 = new CANSparkMax(Constants.CANIDs.DRIVE_L2_PORT, MotorType.kBrushless); 
    final CANSparkMax driveRight1 = new CANSparkMax(Constants.CANIDs.DRIVE_R1_PORT, MotorType.kBrushless); 
    final CANSparkMax driveRight2 = new CANSparkMax(Constants.CANIDs.DRIVE_R2_PORT, MotorType.kBrushless); 
  
    left = new SparkMaxMotorGroup("Elevator/left", driveLeft1, driveLeft2); 
    right = new SparkMaxMotorGroup("Elevator/right", driveRight1, driveRight2); 

    gearShift = new Solenoid(Constants.PCMIDs.DRIVE_GEAR_SHIFT); 

    left.setInverted(Constants.IS_LEFT_INVERTED); 
    right.setInverted(Constants.IS_RIGHT_INVERTED); 

    left.getMasterMotor().setSmartCurrentLimit(Constants.DRIVE_CURRENT_LIMIT); 
    right.getMasterMotor().setSmartCurrentLimit(Constants.DRIVE_CURRENT_LIMIT);
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

  public boolean getReversed() {
    return isReversed; 
  }

  public void setReversed(boolean isReversed) {
    this.isReversed = isReversed; 
  }

  public void shiftLow() {
    gearShift.set(false); 
  }

  public void shiftHigh() {
    gearShift.set(true); 
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ArcadeDrive());
  }
}

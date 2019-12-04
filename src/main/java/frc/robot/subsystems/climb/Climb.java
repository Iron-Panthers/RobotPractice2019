/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.climb;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.util.Constants;

/**
 * Add your docs here.
 */
public class Climb extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private final Solenoid climbRelease; 
  private final TalonSRX leftWinch, rightWinch, vacuumMotor; 
  private final DigitalInput pressureSensor; 

  public Climb() {
    climbRelease = new Solenoid(Constants.PCMIDs.CLIMB_RELEASE); 
    leftWinch = new TalonSRX(Constants.CANIDs.LEFT_WINCH); 
    leftWinch.setInverted(Constants.IS_LEFT_WINCH_INVERTED); 
    rightWinch = new TalonSRX(Constants.CANIDs.RIGHT_WINCH); 
    rightWinch.setInverted(Constants.IS_RIGHT_WINCH_INVERTED); 
    vacuumMotor = new TalonSRX(Constants.CANIDs.VACUUM_PORT); 
    vacuumMotor.setInverted(Constants.IS_VACUUM_MOTOR_INVERTED); 
    pressureSensor = new DigitalInput(Constants.DigitalAnalogIDs.PRESSURE_SENSOR_PORT); 
  }

  public void useClimbRelease(boolean isReleasing) {
    climbRelease.set(isReleasing); 
  }

  public void succ() {
    vacuumMotor.set(ControlMode.PercentOutput, Constants.VACUUM_POWER); 
  }

  public void stopSucc() {
    vacuumMotor.set(ControlMode.PercentOutput, 0); 
  }

  public void raiseLeftWinch() {
    leftWinch.set(ControlMode.PercentOutput, Math.abs(Constants.WINCH_RAISE_POWER)); 
  }

  public void lowerLeftWinch() {
    leftWinch.set(ControlMode.PercentOutput, -Math.abs(Constants.WINCH_LOWER_POWER)); 
  }

  public void stopLeftWinch() {
    leftWinch.set(ControlMode.PercentOutput, 0); 
  }

  public void raiseRightWinch() {
    rightWinch.set(ControlMode.PercentOutput, Math.abs(Constants.WINCH_RAISE_POWER)); 
  }

  public void lowerRightWinch() {
    rightWinch.set(ControlMode.PercentOutput, -Math.abs(Constants.WINCH_LOWER_POWER)); 
  }

  public void stopRightWinch() {
    rightWinch.set(ControlMode.PercentOutput, 0); 
  }

  public boolean isSuccd() {
    return pressureSensor.get(); 
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}

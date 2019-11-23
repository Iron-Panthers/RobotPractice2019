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
import frc.robot.util.Constants;

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
  
  public void set(double y) {
    armMotor.set(ControlMode.PercentOutput, y);
    System.out.println(y); //print power when this method is called to see if it was called corectly 
  } 

  //stops motors
  public void stop() {
    armMotor.set(ControlMode.PercentOutput, 0);
  } 

  
  public double getBasePower() {
    double basePower = Constants.Arm.STALL_TORQUE_COEFFICIENT
    * Math.cos(getCurrentAngle() * Constants.Arm.DEGRESS_TO_RADIANS);
    return basePower;
  }

  //Calculates the angle the arm would need to be at for the arm to reach a target height
  public double angleBySetpoint(double targetHeight, boolean isFront) {
    if (!isFront) {
      return 180 - (Math.asin(targetHeight / Constants.Arm.ARM_LENGTH) * Constants.Arm.RADIANS_TO_DEGREES);
    } else {
      return (Math.asin(targetHeight / Constants.Arm.ARM_LENGTH) * Constants.Arm.RADIANS_TO_DEGREES);
    }
  }

  //calculates and returns the power the robot would need to get to the target with PID
  public double getPower() {
    double currentError = Robot.arm.getCurrentAngle() - target;
    double power = currentError * Constants.Arm.INTAKE_ARM_P + getBasePower();
    return power;
  }

  public boolean isFinished() {
    if ((Math.abs(Robot.arm.target - Robot.arm.getCurrentAngle())) <= Constants.Arm.ERROR_TOLERANCE) {
      return true;
    } else {
      return false;
    }
  }
  
  //gets current angle
  public double getCurrentAngle() {
    double currentAngle = (Constants.Arm.TICKS_TO_DEGREES * (double) armMotor.getSelectedSensorPosition()) + Constants.Arm.BASE_ANGLE_OFFSET;
    return currentAngle;
  }
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}

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
import frc.robot.subsystems.arm.commands.HoldPosition;
import frc.robot.util.Constants;

/**
 * This subsystem can be used to both controll the arm by hand with the joystick
 * or controll it via setpoints that are created in the commands and bound to
 * buttons
 */
public class Arm extends Subsystem {

  public TalonSRX armMotor;
  public double target; // in degrees

  public Arm() {
    armMotor = Robot.hardware.armMotor;
  }

  // sets the power of the arm motor
  // tested, does work
  public void set(double y) {
    armMotor.set(ControlMode.PercentOutput, y);
  }

  // stops motors
  // tested, does work

  public void stop() {
    armMotor.set(ControlMode.PercentOutput, 0);
  }

  /**
   * calculates the base power that is based on the current angle and is used in
   * to help calculate the power in getPower()
   * tested, does work
   */
  public double getBasePower() {
    double basePower = Constants.Arm.STALL_TORQUE_COEFFICIENT
        * Math.cos(getCurrentAngle() * Constants.Arm.DEGRESS_TO_RADIANS);
    return basePower;
  }
/** 
 * @param targetHeight
 * @param isFront
 * @return the angle the arm would need to be at for the arm to reach a target height
 * tested, does work
 */
  
  public double angleBySetpoint(double targetHeight, boolean isFront) {
    if (!isFront) {
      return 180 - ((Math.asin((targetHeight) / Constants.Arm.ARM_LENGTH) * Constants.Arm.RADIANS_TO_DEGREES));
    } else {
      return (Math.asin((targetHeight) / Constants.Arm.ARM_LENGTH) * Constants.Arm.RADIANS_TO_DEGREES);
    }
  }

  /**
   * calculates and returns the power the robot would need to get to the target with PID
   * tested, does work
   */
  public double getPower() {
    double currentError = target - Robot.arm.getCurrentAngle();
    double power = currentError * Constants.Arm.INTAKE_ARM_P + getBasePower();
    power *= Constants.Arm.INTAKE_ARM_MAX_POWER;
    return -power;
  }
  public double getPowerBack() {
    double currentError = target - Robot.arm.getCurrentAngle();
    double power = currentError * Constants.Arm.INTAKE_ARM_P_BACK + getBasePower();
    power *= Constants.Arm.INTAKE_ARM_MAX_POWER;
    return -power;
  }
  


  /** 
   * lets commands know if the arm is close enough to its target and therefore can stop running
   * tested, does work
   */ 
  public boolean isFinished() {
    if ((Math.abs(Robot.arm.target - Robot.arm.getCurrentAngle())) <= Constants.Arm.ERROR_TOLERANCE) {
      return true;
    } else {
      return false;
    }
  }

  /** 
   * gets current angle 
   * tested, does work
   */ 
  public double getCurrentAngle() {
    double currentAngle = (Constants.Arm.TICKS_TO_DEGREES * (double) armMotor.getSelectedSensorPosition())
        + Constants.Arm.BASE_ANGLE_OFFSET;
    return currentAngle;
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new HoldPosition());
  }
}

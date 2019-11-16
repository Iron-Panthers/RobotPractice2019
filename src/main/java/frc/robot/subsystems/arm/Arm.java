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
import frc.robot.subsystems.arm.command.ArmHoldPosition;
import frc.robot.util.Constants;

/**
 * Add your docs here.
 */
public class Arm extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public TalonSRX armMotor;
  public double currentHeight;
	public double currentAngle;
	public double currentTorque;
  public double basePower;
  public double target;
  public double power;
  public double currentError;
  public boolean isFinished;
  
  public Arm() {
    armMotor = Robot.hardware.armMotor;
  }
  
  

  public void set(double y) {
    armMotor.set(ControlMode.PercentOutput, y);
  }
  public void stop() {
    armMotor.set(ControlMode.PercentOutput, 0);
  }
  public double getCurrentAngle() {
		currentAngle = (Constants.Arm.TICKS_TO_DEGREES * (double) armMotor.getSelectedSensorPosition()) + Constants.Arm.BASE_ANGLE_OFFSET;
		return currentAngle;
  }
  public void resetEncoder() {
    armMotor.setSelectedSensorPosition(0);
  }
  public double getCurrentHeight() {
		currentHeight = (Math.sin((getCurrentAngle()) * Constants.Arm.DEGRESS_TO_RADIANS)
				* Constants.Arm.ARM_LENGTH) + Constants.Arm.ARM_BASE_HEIGHT;
		return currentHeight;
  }
  public double getBasePower() {
		basePower = Constants.Arm.STALL_TORQUE_COEFFICIENT
				* Math.cos(getCurrentAngle() * Constants.Arm.DEGRESS_TO_RADIANS);
		return basePower;
  }
  public void ArmToTarget(double targetHeight, boolean isFront) {
		if (!isFront) {
			this.target = 180 - (Math.asin(targetHeight / Constants.Arm.ARM_LENGTH)
					* Constants.Arm.RADIANS_TO_DEGREES);
		} else {
			this.target = (Math.asin(targetHeight / Constants.Arm.ARM_LENGTH)
					* Constants.Arm.RADIANS_TO_DEGREES);
		}
	}
  public boolean isFinished() {
  if ((Math.abs(Robot.arm.target - Robot.arm.getCurrentAngle())) <= Constants.Arm.ERROR_TOLERANCE) {
     return true;
  } else {
     return false;
  }
}


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ArmHoldPosition());
  }
}

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.util;

import com.revrobotics.CANError;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * SparkMaxMotorGroup is a flexible-size grouping of the Spark Max motor
 * controller, which provides for some utility methods for controlling them.
 */
public class SparkMaxMotorGroup {
	private CANSparkMax masterMotor;
	private CANSparkMax[] motors;
	private String name;

	/**
	 * Creates a new SparkMaxMotorGroup.
	 * <p>
	 * SparkMaxMotorGroup is a flexible-size grouping of SparkMax motor controllers.
	 * 
	 * @param name        the name of the motor group.
	 * @param masterMotor the master motor controller of the motor group. A getter
	 *                    is supplied for this motor controller, which should be
	 *                    used for encoder information, etc.
	 * @param motors      other motor controllers to include in the group.
	 */
	public SparkMaxMotorGroup(String name, CANSparkMax masterMotor, CANSparkMax... motors) {
		this.name = name;
		this.masterMotor = masterMotor;
		this.motors = motors;
		setup(masterMotor);
		for (CANSparkMax element : motors) {
			setup(element);
		}
	}

	/**
	 * Sets up a SparkMax motor controller with the team's desired configuration.
	 */
	public void setup(CANSparkMax m_motor) {
		// Restore factory defaults for the motor controller.
		// If no argument is passed, these parameters will not persist between power
		// cycles
		m_motor.restoreFactoryDefaults();

		// Note: SparkMax set methods will return one of three CANError values:
		// CANError.kOk, CANError.kError, or CANError.kTimeout.

		// Set the idle mode to Brake. If it fails, display the error
		if (m_motor.setIdleMode(IdleMode.kBrake) != CANError.kOk) {
            SmartDashboard.putString("SparkMaxMotorGroup " + name + " -- Idle Mode", "Failed to set");
        }

        // Check the idle mode of the motor controller, and put to SmartDashboard
        if (m_motor.getIdleMode() == IdleMode.kCoast) {
            SmartDashboard.putString("SparkMaxMotorGroup " + name + " -- Idle Mode", "Coast");
        } else {
            SmartDashboard.putString("SparkMaxMotorGroup " + name + " -- Idle Mode", "Brake");
        }

        // Set open loop ramp rate to 0. If it fails, display the error
        if (m_motor.setOpenLoopRampRate(0) != CANError.kOk) {
			SmartDashboard.putString("SparkMaxMotorGroup " + name + " -- Ramp Rate", "Error");
		}
	}

	/**
	 * Sets all the motor controllers to have the specified power.
	 * 
	 * @param power The power to set, between -1.0 and 1.0.
	 */
	public void set(double power) {
		masterMotor.set(power);
		for (CANSparkMax motor : this.motors) {
			motor.set(power);
		}
	}

	/**
	 * Sets all the motor controllers to have power 0.
	 */
	public void stop() {
		set(0);
	}

	/**
	 * Sets all CANSparkMax in a MotorGroup to a specified neutral mode.
	 * 
	 * @param idleMode Idle mode (either Coast or Brake).
	 */
	public void setIdleMode(IdleMode idleMode) {
		for (CANSparkMax motor : this.motors) {
			motor.setIdleMode(idleMode);
		}
	}

	/**
	 * Sets all CANSparkMax in a MotorGroup to inverted or not.
	 * 
	 * @param isInverted The state of inversion, with true being inverted.
	 */
	public void setInverted(boolean isInverted) {
		masterMotor.setInverted(isInverted);
		for (CANSparkMax motor : this.motors) {
			motor.setInverted(isInverted);
		}
	}

	/**
	 * Sets the ramp rate for open loop control modes. This is the maximum rate at
	 * which the motor controller's output is allowed to change.
	 * 
	 * @param rate Time in seconds to go from 0 to full throttle.
	 */
	public void setOpenLoopRampRate(double rate) {
		masterMotor.setOpenLoopRampRate(rate);
		for (CANSparkMax motor : this.motors) {
			motor.setOpenLoopRampRate(rate);
		}
	}

	/**
	 * @return the master motor of the MotorGroup.
	 */
	public CANSparkMax getMasterMotor() {
		return masterMotor;
	}

	/**
	 * @return the applied output of the master motor of the MotorGroup.
	 */
	public double getAppliedOutput() {
		return masterMotor.getAppliedOutput();
	}

	/**
	 * @return the encoder position in revolutions of the encoder.
	 */
	public double getEncoderPosition() {
		return masterMotor.getEncoder().getPosition();
	}
}

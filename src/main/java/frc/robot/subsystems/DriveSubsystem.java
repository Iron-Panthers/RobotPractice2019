/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.commands.ManualDriveCommand;
import frc.robot.util.SparkMaxMotorGroup;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
	
	private SparkMaxMotorGroup left, right;

	public DriveSubsystem() {
		left = new SparkMaxMotorGroup(Robot.hardware.leftLeader, Robot.hardware.leftFollower);
    right = new SparkMaxMotorGroup(Robot.hardware.rightLeader, Robot.hardware.rightFollower);
    
    right.setInverted(Constants.IS_RIGHT_INVERTED);
    left.setInverted(Constants.IS_LEFT_INVERTED);
	}

	/**
	 * Sets an open loop percent output to the robot's drivebase.
	 * 
	 * @param leftSpeed The left percent output (-1.0 .. 1.0).
	 * @param rightSpeed The right percent output (-1.0 .. 1.0).
	 */
	public void setOpenLoop(double leftSpeed, double rightSpeed) {
		left.set(leftSpeed);
		right.set(rightSpeed);
	}

	public void setNeutral() {
		left.set(0.0);
		right.set(0.0);
	}

	@Override
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new ManualDriveCommand());
	}
}

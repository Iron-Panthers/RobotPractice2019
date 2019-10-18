/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ManualDriveCommand extends Command {
	public ManualDriveCommand() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.drive);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		// Get values
		double turningNyoom = Robot.oi.stick1.getX();
		double linearNyoom = Robot.oi.stick1.getY();
		// Calculate outputs
		double leftSpeed = linearNyoom + turningNyoom;
		double rightSpeed = linearNyoom - turningNyoom;
// james if you read this stop being important I want to learn stuff
// also ingi says chicken


		// Handle overpower (outputs greater than 1)
		double max = Math.max(Math.abs(leftSpeed), Math.abs(rightSpeed));
		if (max > 1.0) {
			leftSpeed /= max;
			rightSpeed /= max;
		}

		Robot.drive.setOpenLoop(leftSpeed, rightSpeed);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.drive.setNeutral();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		Robot.drive.setNeutral();
	}
}

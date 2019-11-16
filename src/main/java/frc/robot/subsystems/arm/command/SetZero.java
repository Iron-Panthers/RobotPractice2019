/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.arm.command;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class SetZero extends InstantCommand {
	public SetZero() {
		requires(Robot.arm);
	}

	// Called once when the command executes
	@Override
	protected void initialize() {
		Robot.hardware.armMotor.setSelectedSensorPosition(0);
		Robot.arm.target = Robot.arm.getCurrentAngle();
	}
}

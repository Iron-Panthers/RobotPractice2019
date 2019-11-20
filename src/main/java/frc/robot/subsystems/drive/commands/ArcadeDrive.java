/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.drive.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.util.JoystickWrapper;

public class ArcadeDrive extends Command {

  private double leftPower, rightPower;
  private JoystickWrapper stick = Robot.oi.stick1;

  public ArcadeDrive() {
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
    stick.update(); 
    rightPower = stick.findRightPower() + stick.skim(stick.findLeftPower()); 
    leftPower = stick.findLeftPower() + stick.skim(stick.findRightPower()); 
    double[] powers = {leftPower, rightPower}; 
    powers = scalePower(powers); 
    Robot.drive.set(powers[0], powers[1]); 
  }

  public double[] scalePower(double[] powers) {
		// Checks if the array needs to be scaled
		boolean isOverOne = false;
		for (double element : powers) {
			if (Math.abs(element) > 1) {
				isOverOne = true;
				break;
			}
		}
		if (!isOverOne) {
			return powers;
		}
		// Finds the highest value
		double greatestPower = powers[0];
		if (Math.abs(powers[1]) > greatestPower) {
			greatestPower = Math.abs(powers[1]);
		}
		// Scales all values
		for (int i = 0; i < powers.length; i++) {
			powers[i] /= greatestPower;
		}
		
		return powers;
	}

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}

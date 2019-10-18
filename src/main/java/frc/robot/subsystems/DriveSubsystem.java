package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.util.SparkMaxMotorGroup;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
	
	private SparkMaxMotorGroup left, right;

	public DriveSubsystem() {
		left = new SparkMaxMotorGroup(Robot.hardware.leftLeader, Robot.hardware.leftFollower);
		right = new SparkMaxMotorGroup(Robot.hardware.rightLeader, Robot.hardware.rightFollower);
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

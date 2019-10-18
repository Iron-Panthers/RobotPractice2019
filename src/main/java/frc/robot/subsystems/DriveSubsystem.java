package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.commands.ManualDriveCommand;
import frc.robot.util.Constants;
import frc.robot.util.SparkMaxMotorGroup;

public class DriveSubsystem extends Subsystem {
  
  private SparkMaxMotorGroup left, right;

  public DriveSubsystem() {
    left = new SparkMaxMotorGroup(Robot.hardware.leftLeader, Robot.hardware.leftFollower);
    right = new SparkMaxMotorGroup(Robot.hardware.rightLeader, Robot.hardware.rightFollower);

    right.setInverted(Constants.IS_RIGHT_INVERTED);
    left.setInverted(Constants.IS_LEFT_INVERTED);
  }

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
    setDefaultCommand(new ManualDriveCommand());
  }

}
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.commands.DriveCommands;
import frc.robot.util.Constants;
import frc.robot.util.SparkMaxMotorGroup;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private SparkMaxMotorGroup left, right;

  public DriveSubsystem(){
    left = new SparkMaxMotorGroup(Robot.hardware.leftLeader, Robot.hardware.leftFollower);
    right = new SparkMaxMotorGroup(Robot.hardware.rightLeader, Robot.hardware.rightFollower);

    right.setInversion(Constants.IS_RIGHT_INVERTED);
  }

  public void set(double leftPower, double rightPower){
    left.set(leftPower);
    right.set(rightPower);
  }

  public void stop(){
    left.set(0);
    right.set(0);
  }
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriveCommands());
  }
}

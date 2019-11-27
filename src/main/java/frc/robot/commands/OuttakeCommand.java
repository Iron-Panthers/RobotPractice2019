/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

<<<<<<< HEAD:src/main/java/frc/robot/commands/OuttakeCommand.java
public class OuttakeCommand extends Command {
  public OuttakeCommand() {
=======
public class Outtake extends Command {
  public Outtake() {
    requires(Robot.intake);
>>>>>>> Intake:src/main/java/frc/robot/Commands/Outtake.java
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }
  @Override
  protected void initialize() {
  }
  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.intake.outtake(Constants.OUTTAKE_POWER);
    System.out.println("Outtake running");
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.intake.stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
<<<<<<< HEAD:src/main/java/frc/robot/commands/OuttakeCommand.java
   Robot.intake.stop();
=======
    Robot.intake.stop();
>>>>>>> Intake:src/main/java/frc/robot/Commands/Outtake.java
  }
}
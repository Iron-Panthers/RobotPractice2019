
package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.Robot;

<<<<<<< HEAD:src/main/java/frc/robot/commands/IntakeCommand.java
public class IntakeCommand extends Command {
    public IntakeCommand() {
    }
	protected void initialize() {
    }
    protected void execute() {
        Robot.intake.intake(Constants.INTAKE_POWER);
    }
    protected boolean isFinished () {
      return false;
    }
    protected void end () {
        Robot.intake.stop();
    }
    protected void interrupted () {
        Robot.intake.stop();
    }
=======
import edu.wpi.first.wpilibj.command.Command;

public class IntakeCommands extends Command {
  public IntakeCommands() {
    requires(Robot.intake);
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }
  @Override
  protected void initialize() {
  }
  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.intake.intake(Constants.INTAKE_POWER);
    System.out.println("Intake running");
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
    Robot.intake.stop();
  }
>>>>>>> Intake:src/main/java/frc/robot/commands/IntakeCommands.java
}
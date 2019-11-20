package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Constants;
import frc.robot.Robot;

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
    }
}
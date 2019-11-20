package frc.robot.Commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Constants;
import frc.robot.Robot;

public class IntakeCommands extends Command {
    public IntakeCommands () {
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
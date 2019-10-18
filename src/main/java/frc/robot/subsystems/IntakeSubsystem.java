package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class IntakeSubsystem extends Subsystem{
    //Put methods for controlling this subsystem here. Call these from Commands.
    private TalonSRX intakeMotor;

    public IntakeSubsystem() {
        intakeMotor = Robot.hardware.intakeMotor;
    }

    public void intake(double power) {
        intakeMotor.set(ControlMode.PercentOutput, Math.abs(power));
    }
    
    public void outtake(double power) {
        intakeMotor.set(ControlMode.PercentOutput, -Math.abs(power));

        public void stop() {
            intakeMotor.set(ControlMode.PercentOutput, 0);
        }

        @Override
        public void initDefaultCommand() {
            //set the defalt command for a sbsystem here.
            // setDefaultCommand(new MySpecialCommand());
        }
    }
}
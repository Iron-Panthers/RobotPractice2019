package frc.robot.subsystems.climb;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.subsystems.climb.commands.CancelClimb;

public class Climb extends Subsystem {

    @Override
    protected void initDefaultCommand() {

    }

    public void cancelClimb() {
        stopClimb(); 
        setDefaultCommand(new CancelClimb()); 
    }

    public void stopClimb() {
        // climbMotors.set(0); 
    }

}
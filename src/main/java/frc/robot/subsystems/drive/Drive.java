package frc.robot.subsystems.drive;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.util.SparkMaxMotorGroup;

public class Drive extends Subsystem {
    private SparkMaxMotorGroup left = Robot.hardware.leftDriveMotors; 
    private SparkMaxMotorGroup right = Robot.hardware.rightDriveMotors;
    public Solenoid gearShift = Robot.hardware.gearShift; 

    @Override
    protected void initDefaultCommand() {

    }

}
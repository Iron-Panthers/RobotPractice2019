package frc.robot.subsystems.drive;
<<<<<<< HEAD

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

=======

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem {

    @Override
    protected void initDefaultCommand() {

    }
    
>>>>>>> DriveBase
}
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;


public class DriveSubsystem extends Subsystem{

    private SparkMaxMotorGroup left;
    private SparkMaxMotorGroup right;

    public DriveSubsystem()
    {
        left = new SparkMaxMotorGroup(Robot.hardware.leftleader, Robot.hardware.leftFollower);
        right = new SparkMaxMotorGroup(Robot.hardware.rightLeader, Robot.hardware.rightFollower);

        right.setInverted(Constants.IS_RIGHT_INVERTED);
        left.leftInverted(Constants.IS_LEFT_INVERTED);
    }
    public void setOpenLoop(double leftSpeed, double rightSpeed)
    {
        left.set(leftSpeed);
        right.set(rightSpeed);


    }
    public void setNeutral()
    {
        left.set(0.0);
        right.set(0.0);

    }
    @Override
    public void initDefaulCommand()
    {
        setDefaultCommand(new ManualDriveCommand);

    }

}






package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.util.Constants;
import frc.robot.util.SparkMaxMotorGroup;

public class Hardware {
    public final SparkMaxMotorGroup leftDriveMotors = null;
	public final SparkMaxMotorGroup rightDriveMotors = null;
	public final Solenoid gearShift = null;
	public TalonSRX intakeMotor;
    public CANSparkMax leftLeader;
    public CANSparkMax rightLeader;
    public CANSparkMax leftFollower;
    public CANSparkMax rightFollower;


    public Hardware() {
        intakeMotor = new TalonSRX(Constants.Drivebase.INTAKE_MOTOR_PORT);
        leftLeader = new CANSparkMax(Constants.Drivebase.LEFT_LEADER_MOTOR_PORT, MotorType.kBrushless);
        rightLeader = new CANSparkMax(Constants.Drivebase.RIGHT_LEADER_MOTOR_PORT, MotorType.kBrushless);
        leftFollower = new CANSparkMax(Constants.Drivebase.LEFT_FOLLOWER_MOTOR_PORT, MotorType.kBrushless);
        rightFollower = new CANSparkMax(Constants.Drivebase.RIGHT_FOLLOWER_MOTOR_PORT , MotorType.kBrushless);
    }
}
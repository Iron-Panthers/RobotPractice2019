package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.util.Constants;
import frc.robot.util.SparkMaxMotorGroup;

public class Hardware {
    public static final SparkMaxMotorGroup leftDriveMotors = null;
	public static final SparkMaxMotorGroup rightDriveMotors = null;
	public static final Solenoid gearShift = null;
	public TalonSRX intakeMotor;
    public CANSparkMax leftLeader;
    public CANSparkMax rightLeader;
    public CANSparkMax leftFollower;
    public CANSparkMax rightFollower;


    public Hardware() {
<<<<<<< HEAD
        intakeMotor = new TalonSRX(Constants.Drivebase.INTAKE_MOTOR_PORT);
        leftLeader = new CANSparkMax(Constants.Drivebase.LEFT_LEADER_MOTOR_PORT, MotorType.kBrushless);
        rightLeader = new CANSparkMax(Constants.Drivebase.RIGHT_LEADER_MOTOR_PORT, MotorType.kBrushless);
        leftFollower = new CANSparkMax(Constants.Drivebase.LEFT_FOLLOWER_MOTOR_PORT, MotorType.kBrushless);
        rightFollower = new CANSparkMax(Constants.Drivebase.RIGHT_FOLLOWER_MOTOR_PORT , MotorType.kBrushless);
=======
        /* Drivebase motor controller creation */
        leftLeader = new CANSparkMax(0, MotorType.kBrushless); 
        leftFollower = new CANSparkMax(1, MotorType.kBrushless); 
        rightLeader = new CANSparkMax(2, MotorType.kBrushless); 
        rightFollower = new CANSparkMax(3, MotorType.kBrushless); 
        
        gearShift = new Solenoid(Constants.Drivebase.GEAR_SHIFT_PORT); 
    
        /* Drivebase configuration */
        rightDriveMotors = new SparkMaxMotorGroup("Right Drive Motor Group", rightLeader, rightFollower); 
        leftDriveMotors = new SparkMaxMotorGroup("Left Drive Motor Group", leftLeader, leftFollower); 
>>>>>>> DriveBase
    }
}
package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.sensors.PigeonIMU;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.util.Constants;
import frc.robot.util.SparkMaxMotorGroup;

public class Hardware {
    /* Drivebase motor controllers */
    public CANSparkMax leftLeader;
    public CANSparkMax leftFollower;
    public CANSparkMax rightLeader;
    public CANSparkMax rightFollower;
    
    public TalonSRX gyroTestMotor; 
    public PigeonIMU gyro; 

    /* Drivebase MotorGroups */
    public SparkMaxMotorGroup leftDriveMotors;
	public SparkMaxMotorGroup rightDriveMotors;
    
    public Solenoid gearShift;

    public Hardware() {
        /* Drivebase motor controller creation */
        leftLeader = new CANSparkMax(Constants.Drivebase.LEFT_LEADER_MOTOR_PORT, MotorType.kBrushless);
        leftFollower = new CANSparkMax(Constants.Drivebase.LEFT_FOLLOWER_MOTOR_PORT, MotorType.kBrushless);

        rightLeader = new CANSparkMax(Constants.Drivebase.RIGHT_LEADER_MOTOR_PORT, MotorType.kBrushless);
        rightFollower = new CANSparkMax(Constants.Drivebase.RIGHT_FOLLOWER_MOTOR_PORT , MotorType.kBrushless);
        
        /* Drivebase configuration */
        leftLeader.setInverted(Constants.Drivebase.IS_LEFT_INVERTED); 
        rightLeader.setInverted(Constants.Drivebase.IS_RIGHT_INVERTED); 
        leftDriveMotors = new SparkMaxMotorGroup("Left Drive Motor Group", leftLeader, leftFollower); 
        rightDriveMotors = new SparkMaxMotorGroup("Right Drive Motor Group", rightLeader, rightFollower); 
    
        rightDriveMotors.setIdleMode(IdleMode.kBrake); 
        rightDriveMotors.setOpenLoopRampRate(Constants.Drivebase.RAMP_RATE);
        leftDriveMotors.setIdleMode(IdleMode.kBrake); 
        leftDriveMotors.setOpenLoopRampRate(Constants.Drivebase.RAMP_RATE);

        /* Gyro */
        gyroTestMotor = new TalonSRX(5); 
        gyro = new PigeonIMU(gyroTestMotor); 

        gearShift = new Solenoid(Constants.Drivebase.GEAR_SHIFT_PORT); 
    }
}
package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.sensors.PigeonIMU;
import com.revrobotics.CANSparkMax;
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
    public final SparkMaxMotorGroup leftDriveMotors = null;
	public final SparkMaxMotorGroup rightDriveMotors = null;
    
    public final Solenoid gearShift = null;

    public Hardware() {
        /* Drivebase motor controller creation */
        leftLeader = new CANSparkMax(Constants.Drivebase.LEFT_LEADER_MOTOR_PORT, MotorType.kBrushless);
        leftFollower = new CANSparkMax(Constants.Drivebase.LEFT_FOLLOWER_MOTOR_PORT, MotorType.kBrushless);

        rightLeader = new CANSparkMax(Constants.Drivebase.RIGHT_LEADER_MOTOR_PORT, MotorType.kBrushless);
        rightFollower = new CANSparkMax(Constants.Drivebase.RIGHT_FOLLOWER_MOTOR_PORT , MotorType.kBrushless);
        
        /* Drivebase configuration */
        
    }
}
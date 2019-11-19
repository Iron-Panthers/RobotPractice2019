package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.sensors.PigeonIMU;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

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

    public Hardware() {
        leftLeader = new CANSparkMax(0, MotorType.kBrushless); 
        leftFollower = new CANSparkMax(1, MotorType.kBrushless); 
        rightLeader = new CANSparkMax(2, MotorType.kBrushless); 
        rightFollower = new CANSparkMax(3, MotorType.kBrushless); 
    }
}
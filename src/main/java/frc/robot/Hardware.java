package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.util.SparkMaxMotorGroup;

public class Hardware<PigeonIMU, TalonSRX> {
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

    /* Climb motor controllers and pneumatics */
    public Solenoid gearShift; 

    public Hardware() {
        /* Drivebase motor controller creation */
        leftLeader = new CANSparkMax(0, MotorType.kBrushless); 
        leftFollower = new CANSparkMax(1, MotorType.kBrushless); 
        rightLeader = new CANSparkMax(2, MotorType.kBrushless); 
        rightFollower = new CANSparkMax(3, MotorType.kBrushless); 
        
        // gearShift = new Solenoid(Constants.Drivebase.GEAR_SHIFT_PORT); 
    }
}
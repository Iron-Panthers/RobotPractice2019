package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Hardware {
    /* Drivebase motor controllers */
    public CANSparkMax leftLeader; 
    public CANSparkMax leftFollower; 
    public CANSparkMax rightLeader; 
    public CANSparkMax rightFollower; 

    public Hardware() {
        leftLeader = new CANSparkMax(0, MotorType.kBrushless); 
        leftFollower = new CANSparkMax(1, MotorType.kBrushless); 
        rightLeader = new CANSparkMax(2, MotorType.kBrushless); 
        rightFollower = new CANSparkMax(3, MotorType.kBrushless); 
    }
}
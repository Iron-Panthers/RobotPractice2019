package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Hardware {

    public TalonSRX intakeMotor, armMotor;
    public CANSparkMax leftLeader, leftFollower, rightLeader, rightFollower;

    public Hardware(){
        intakeMotor = new TalonSRX(4);
        leftLeader = new CANSparkMax(1, MotorType.kBrushless);
        leftFollower = new CANSparkMax(21, MotorType.kBrushless);
        rightLeader = new CANSparkMax(2, MotorType.kBrushless);
        rightFollower = new CANSparkMax(22, MotorType.kBrushless);
        armMotor = new TalonSRX(2);
    }

}
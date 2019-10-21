package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Hardware {
    public TalonSRX intakeMotor;
    public static CANSparkMax leftMotor1;
    public static CANSparkMax leftMotor2;
    public static CANSparkMax rightMotor1;
    public static CANSparkMax rightMotor2;

    public Hardware() {
        intakeMotor = new TalonSRX(4);
        leftMotor1 = new CANSparkMax(2, MotorType.kBrushless);
        leftMotor2 = new CANSparkMax(22, MotorType.kBrushless);
        rightMotor1 = new CANSparkMax(1, MotorType.kBrushless);
        rightMotor2 = new CANSparkMax(21, MotorType.kBrushless);
        rightMotor1.setInverted(true);
        rightMotor2.setInverted(true);
    }
}
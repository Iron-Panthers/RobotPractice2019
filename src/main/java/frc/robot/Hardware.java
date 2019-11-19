package frc.robot;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;

public class Hardware {
    public TalonSRX armMotor;
    public Hardware() {
        armMotor = new TalonSRX(6);
        armMotor.setNeutralMode(NeutralMode.Brake);
    }
}
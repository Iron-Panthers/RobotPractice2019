package frc.robot;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Hardware {
    public TalonSRX armMotor;
    public Hardware() {
        armMotor = new TalonSRX(6);
        armMotor.setNeutralMode(NeutralMode.Brake);
    }
}
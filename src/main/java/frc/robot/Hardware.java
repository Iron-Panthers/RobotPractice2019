package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Hardware {
    public TalonSRX intakeMotor;
    public Hardware() {
        intakeMotor = new TalonSRX(4);
    }
}
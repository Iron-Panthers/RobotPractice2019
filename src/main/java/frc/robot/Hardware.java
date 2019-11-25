package frc.robot;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import frc.robot.util.Constants;

public class Hardware {
    public TalonSRX armMotor;

    public Hardware() {
        armMotor = new TalonSRX(Constants.Arm.INTAKE_ARM_MOTOR_PORT);
        armMotor.setNeutralMode(NeutralMode.Brake);
    }
}
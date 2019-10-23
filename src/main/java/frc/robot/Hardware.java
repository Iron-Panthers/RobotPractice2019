package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import frc.robot.util.SparkMaxMotorGroup;

public class Hardware {
    public TalonSRX intakeMotor;
    
    public SparkMaxMotorGroup climbMotors; 

    public Hardware() {
        intakeMotor = new TalonSRX(4);
    }
}
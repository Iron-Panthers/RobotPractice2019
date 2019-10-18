package frc.robot;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.robot.util.Constants;

public class Hardware {
    public TalonSRX intakeMotor;
    public CANSparkMax leftLeader;
    public CANSparkMax rightLeader;
    public CANSparkMax leftFollower;
    public CANSparkMax rightFollower;
    public Hardawre() {
        intakeMotor = newTalonSRX(Constants.INTAKE_MOTOR_PORT);
        
    }

    public Hardware() {
        intakeMotor = new TalonSRX(22);
    }
}
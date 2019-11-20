package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.robot.util.Constants;

public SparkMaxMotorGroup right;
public SparkMaxMotorGroup left;

public class Hardware {
    public TalonSRX intakeMotor;
    public CANSparkMax leftLeader;
    public CANSparkMax rightLeader;
    public CANSparkMax leftFollower;
    public CANSparkMax rightFollower;


    public Hardware() {
        intakeMotor = new TalonSRX(Constants.INTAKE_MOTOR_PORT);
        leftLeader = new CANSparkMax(Constants.LEFT_LEADER_MOTOR_PORT, MotorType.kBrushless);
        rightLeader = new CANSparkMax(Constants.RIGHT_LEADER_MOTOR_PORT, MotorType.kBrushless);
        leftFollower = new CANSparkMax(Constants.LEFT_LEADER_MOTOR_PORT, MotorType.kBrushless);
        rightFollower = new CANSparkMax(Constants.RIGHT_FOLLOWER_MOTOR_PORT , MotorType.kBrushless);
    }

//hellohello
}fffffffffffffss
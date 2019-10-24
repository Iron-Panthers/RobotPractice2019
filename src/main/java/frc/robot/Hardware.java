package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.robot.util.Constants;

public class Hardware {

    public TalonSRX intakeMotor, armMotor;
    public CANSparkMax leftLeader, leftFollower, rightLeader, rightFollower;

    public Hardware(){
        intakeMotor = new TalonSRX(Constants.INTAKE_PORT);
        leftLeader = new CANSparkMax(Constants.LEFT_LEADER_PORT, MotorType.kBrushless);
        leftFollower = new CANSparkMax(Constants.LEFT_FOLLOWER_PORT, MotorType.kBrushless);
        rightLeader = new CANSparkMax(Constants.RIGHT_LEADER_PORT, MotorType.kBrushless);
        rightFollower = new CANSparkMax(Constants.RIGHT_FOLLOWER_PORT, MotorType.kBrushless);
        armMotor = new TalonSRX(Constants.ARM_PORT);
    }
}
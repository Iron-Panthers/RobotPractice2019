package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Hardware {
    public static TalonSRX intakeMotor;
    public static CANSparkMax leftLeader;
    public static CANSparkMax leftFollower;
    public static CANSparkMax rightLeader;
    public static CANSparkMax rightFollower;
    public static CANSparkMax climbMotor1;
    public static CANSparkMax climbMotor2;
    public static CANSparkMax climbMotor3;
    public static CANSparkMax climbMotor4;
    public static CANSparkMax climbMotor5;
    public static CANSparkMax climbMotor6;

    public Hardware() {
        intakeMotor = new TalonSRX(Constants.INTAKE_MOTOR_PORT);

        leftLeader = new CANSparkMax(Constants.LEFT_LEADER_MOTOR_PORT, MotorType.kBrushless);
        leftFollower = new CANSparkMax(Constants.LEFT_FOLLOWER_MOTOR_PORT, MotorType.kBrushless);
        rightLeader = new CANSparkMax(Constants.RIGHT_LEADER_MOTOR_PORT, MotorType.kBrushless);
        rightFollower = new CANSparkMax(Constants.RIGHT_FOLLOWER_MOTOR_PORT, MotorType.kBrushless);

        climbMotor1 = new CANSparkMax(Constants.CLIMB_1_MOTOR_PORT, MotorType.kBrushless);
        climbMotor2 = new CANSparkMax(Constants.CLIMB_2_MOTOR_PORT, MotorType.kBrushless);
        climbMotor3 = new CANSparkMax(Constants.CLIMB_3_MOTOR_PORT, MotorType.kBrushless);
        climbMotor4 = new CANSparkMax(Constants.CLIMB_4_MOTOR_PORT, MotorType.kBrushless);
        climbMotor5 = new CANSparkMax(Constants.CLIMB_5_MOTOR_PORT, MotorType.kBrushless);
        climbMotor6 = new CANSparkMax(Constants.CLIMB_6_MOTOR_PORT, MotorType.kBrushless);
    }   
}
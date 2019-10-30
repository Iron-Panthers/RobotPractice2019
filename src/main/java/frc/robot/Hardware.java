package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import frc.robot.util.Constants;

public class Hardware {

    public TalonSRX intakeMotor, armMotor;
    public CANSparkMax leftLeader, leftFollower, rightLeader, rightFollower;
    public CANSparkMax leftClimbLeader, leftClimbFollower1, leftClimbFollower2;
    public CANSparkMax rightClimbLeader, rightClimbFollower1, rightClimbFollower2;
    public DigitalInput forwardLimit, backwardsLimit;

    public Hardware(){
        //intake motor
        intakeMotor = new TalonSRX(Constants.INTAKE_PORT);

        //arm motor
        armMotor = new TalonSRX(Constants.ARM_PORT);

        //drive motors
        leftLeader = new CANSparkMax(Constants.LEFT_LEADER_PORT, MotorType.kBrushless);
        leftFollower = new CANSparkMax(Constants.LEFT_FOLLOWER_PORT, MotorType.kBrushless);
        rightLeader = new CANSparkMax(Constants.RIGHT_LEADER_PORT, MotorType.kBrushless);
        rightFollower = new CANSparkMax(Constants.RIGHT_FOLLOWER_PORT, MotorType.kBrushless);

        //climb motors + digital input
        rightClimbLeader = new CANSparkMax(Constants.RIGHT_CLIMB_L_PORT, MotorType.kBrushless);
        rightClimbFollower1 = new CANSparkMax(Constants.RIGHT_CLIMB_F1_PORT, MotorType.kBrushless);
        rightClimbFollower2 = new CANSparkMax(Constants.RIGHT_CLIMB_F2_PORT, MotorType.kBrushless);
        leftClimbLeader = new CANSparkMax(Constants.LEFT_CLIMB_L_PORT, MotorType.kBrushless);
        leftClimbFollower1 = new CANSparkMax(Constants.LEFT_CLIMB_F1_PORT, MotorType.kBrushless);
        leftClimbFollower2 = new CANSparkMax(Constants.LEFT_CLIMB_F2_PORT, MotorType.kBrushless);

        //climb digital inputs
        forwardLimit = new DigitalInput(0);
        backwardsLimit = new DigitalInput(1);
    }
}
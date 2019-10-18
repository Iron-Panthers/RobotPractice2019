package frc.robot;

public class Hardware {
    public TalonSRX intakeMotor;
    public CANSparkMax leftLeader;
    public CANSparkMax rightLeader;
    public CANSparkmax leftFollower;
    public CANSparkMax rightFollower;

    public Hardware(){
        intakeMotor = TalonSRX(Constants.INTAKE+MOTOR+PORT);
        leftLeader = new CANSparkMax(Constants.LEFT_LEADER_MOTOR_PORT, MotorType.kBrushless);
        rightLeader = new CANSparkMax(Constants.RIGHT_LEADER_MOTOR_PORT, MotorType.kBrushless);
        leftFollower = new CANSparkMax(Constants.LEFT_FOLLOWER_MOTOR_PORT, MotorType.kBrushless);
        rightFollower = new CANSparkMax(Constants.RIGHT_FOLLOWER_MOTOR_PORT, MotorType.kBrushless);
        //i want to use this with a brushless motor controller
    }
}



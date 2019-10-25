package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;

public class Hardware {
    public TalonSRX intakeMotor;
    public TalonSRX armMotor;
    public static CANSparkMax leftMotor1;
    public static CANSparkMax leftMotor2;
    public static CANSparkMax rightMotor1;
    public static CANSparkMax rightMotor2;
    public static DigitalInput forwardLimit, reverseLimit;
    public static CANSparkMax climbLeftMotor1;
	public static CANSparkMax climbLeftMotor2;
	public static CANSparkMax climbLeftMotor3;
	public static CANSparkMax climbRightMotor1;
	public static CANSparkMax climbRightMotor2;
	public static CANSparkMax climbRightMotor3;
	public static TalonSRX leftWinchMotor;
	public static TalonSRX rightWinchMotor;

    public Hardware() {
        intakeMotor = new TalonSRX(4);
        leftMotor1 = new CANSparkMax(2, MotorType.kBrushless);
        leftMotor2 = new CANSparkMax(22, MotorType.kBrushless);
        rightMotor1 = new CANSparkMax(1, MotorType.kBrushless);
        rightMotor2 = new CANSparkMax(21, MotorType.kBrushless);
        armMotor = new TalonSRX(6);
        forwardLimit = new DigitalInput(0);
        reverseLimit = new DigitalInput(1);
        climbLeftMotor1 = new CANSparkMax(8, MotorType.kBrushless);
		climbLeftMotor2 = new CANSparkMax(9, MotorType.kBrushless);
		climbLeftMotor3 = new CANSparkMax(10, MotorType.kBrushless);
		climbRightMotor1 = new CANSparkMax(11, MotorType.kBrushless);
		climbRightMotor2 = new CANSparkMax(12, MotorType.kBrushless);
		climbRightMotor3 = new CANSparkMax(13, MotorType.kBrushless);
		leftWinchMotor = new TalonSRX(5);
		rightWinchMotor = new TalonSRX(7);
        leftMotor1.setInverted(true);
        leftMotor2.setInverted(true);
        climbRightMotor1.setInverted(true);
        climbRightMotor2.setInverted(true);
        climbRightMotor3.setInverted(true);


    }
}
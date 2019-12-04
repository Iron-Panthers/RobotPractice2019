package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.util.Constants;

public class Hardware{
    public static TalonSRX intakeMotor;
    public static Solenoid hatchFingers;
    public static Solenoid hatchThrowing;
    public CANSparkMax lClimbLead, lClimbF1, lClimbF2;
    public CANSparkMax rClimbLead, rClimbF1, rClimbF2;
    public DigitalInput climbUpLimit, climbDownLimit;
    public TalonSRX lWinch, rWinch;
    public Solenoid superStructure;

    public Hardware(){
        intakeMotor = new TalonSRX(Constants.INTAKE_MOTOR_PORT);
        hatchFingers = new Solenoid(Constants.HATCH_FINGERS_SOLENOID_PORT);
        hatchThrowing = new Solenoid(Constants.HATCH_OUTTAKE_PISTONS_SOLDNOID_PORT);

        //climb motors
        lClimbLead = new CANSparkMax(Constants.L_CLIMB_LEAD_PORT, MotorType.kBrushless);
        lClimbF1 = new CANSparkMax(Constants.L_CLIMB_F1_PORT, MotorType.kBrushless);
        lClimbF2 = new CANSparkMax(Constants.L_CLIMB_F2_PORT, MotorType.kBrushless);
        rClimbLead = new CANSparkMax(Constants.R_CLIMB_LEAD_PORT, MotorType.kBrushless);
        rClimbF1 = new CANSparkMax(Constants.R_CLIMB_F1_PORT, MotorType.kBrushless);
        rClimbF2 = new CANSparkMax(Constants.R_CLIMB_F2_PORT, MotorType.kBrushless);
        lWinch = new TalonSRX(Constants.L_WINCH_PORT);
        rWinch = new TalonSRX(Constants.R_WINCH_PORT);
        superStructure = new Solenoid(Constants.SUPER_STRUCTURE_PORT);
        climbUpLimit = new DigitalInput(Constants.CLIMB_UP_LIMIT);
        climbDownLimit = new DigitalInput(Constants.CLIMB_DOWN_LIMIT);
    }   
}
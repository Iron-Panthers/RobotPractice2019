package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.util.Constants;

public class Hardware{
    public CANSparkMax lClimbLead, lClimbF1, lClimbF2;
    public CANSparkMax rClimbLead, rClimbF1, rClimbF2;
    public DigitalInput climbUpLimit, climbDownLimit;
    public TalonSRX lWinch, rWinch;
    public Solenoid superStructure;

    public Hardware(){
        //climb motors
        lClimbLead = new CANSparkMax(Constants.L_CLIMB_LEAD_PORT, MotorType.kBrushless);
        lClimbF1 = new CANSparkMax(Constants.L_CLIMB_F1_PORT, MotorType.kBrushless);
        lClimbF2 = new CANSparkMax(Constants.L_CLIMB_F2_PORT, MotorType.kBrushless);
        rClimbLead = new CANSparkMax(Constants.R_CLIMB_LEAD_PORT, MotorType.kBrushless);
        rClimbF1 = new CANSparkMax(Constants.R_CLIMB_F1_PORT, MotorType.kBrushless);
        rClimbF2 = new CANSparkMax(Constants.R_CLIMB_F2_PORT, MotorType.kBrushless);

        //winch motors
        lWinch = new TalonSRX(Constants.L_WINCH_PORT);
        rWinch = new TalonSRX(Constants.R_WINCH_PORT);

        //solenoid
        superStructure = new Solenoid(Constants.SUPER_STRUCTURE_PORT);

        //digital inputs
        climbUpLimit = new DigitalInput(Constants.CLIMB_UP_LIMIT);
        climbDownLimit = new DigitalInput(Constants.CLIMB_DOWN_LIMIT);
        
    }   
}
package frc.robot.util;

import com.revrobotics.CANError;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;

public class SparkMaxMotorGroup {
    private CANSparkMax masterMotor; 
    private CANSparkMax[] motors; 
    private String name; 

    public SparkMaxMotorGroup(String name, CANSparkMax masterMotor, CANSparkMax... motors) {
        this.name = name; 
        this.masterMotor = masterMotor; 
        this.motors = motors; 
        setup(masterMotor); 
        for (CANSparkMax element : motors) {
            setup(element); 
        }
    }

    // sets up a SparkMax motor controller with the team's desired configuration. 
    public void setup(CANSparkMax m_motor) {
        m_motor.restoreFactoryDefaults(); 

        if (m_motor.setIdleMode(IdleMode.kBrake) != CANError.kOk) {

        }
    }
}
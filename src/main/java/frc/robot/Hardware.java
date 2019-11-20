package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Solenoid;

public class Hardware {
    public static TalonSRX intakeMotor;
    public static Solenoid hatchFingers;
    public static Solenoid hatchThrowing;
    //1 TalonSRX, two solenoids, one for hatch intake/outtake, other for hatch throwing
    public Hardware() {
        intakeMotor = new TalonSRX(Constants.INTAKE_MOTOR_PORT);
        hatchFingers = new Solenoid(Constants.HATCH_FINGERS_SOLENOID_PORT);
        hatchThrowing = new Solenoid(Constants.HATCH_OUTTAKE_PISTONS_SOLDNOID_PORT);
    }
}

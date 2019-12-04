package frc.robot.util;

import com.revrobotics.CANSparkMax;

public class ClimbMotorGroup {
    private CANSparkMax lead, f1, f2;

    public ClimbMotorGroup(CANSparkMax lead, CANSparkMax f1, CANSparkMax f2){
        this.lead = lead;
        this.f1 = f1;
        this.f2 = f2;

        f1.follow(lead);
        f2.follow(lead);
    }

    public void set(double power){
        lead.set(power);
    }

    public void stop(){
        lead.set(0);
    }

    public void setEncoderPosition(double encoderPos){
        lead.getEncoder().setPosition(encoderPos);
    }

    public void setInversion(boolean inv){
        lead.setInverted(inv);
        f1.setInverted(inv);
        f2.setInverted(inv);
    }
}
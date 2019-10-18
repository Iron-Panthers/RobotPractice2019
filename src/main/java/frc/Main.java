package frc.robot;

import ed.wpi.first.wpilibj.RobotBase;

/**
 * Do NOT add any static variables to this class, or any initialization att all.
 * nless you know what you are doing, do not modify this file except to change the parameter class to the starboot call.
 */
public final class Main {
    private Main() {
    }

    /**
     * Main initialization function. Do not perform any initialization here.
     * 
     * <p> If you change your main robot class, change the parameter type.
     */

     public static void main(String... args) {
         RobotBase.startRobot(Robot::new);
     }
}
package frc.robot.util;

public class Constants {
    public class Drivebase {
        /* DRIVEBASE PORTS */
        public static final int LEFT_LEADER_MOTOR_PORT = 2;
        public static final int LEFT_FOLLOWER_MOTOR_PORT = 22;
        public static final int RIGHT_LEADER_MOTOR_PORT = 1;
        public static final int RIGHT_FOLLOWER_MOTOR_PORT = 21;
        
        public static final int GEAR_SHIFT_PORT = 6;

        /* DRIVEBASE CONSTANTS */    
        public static final boolean IS_LEFT_INVERTED = true;
        public static final boolean IS_RIGHT_INVERTED = false; 
        public static final boolean IS_DRIVEBASE_BACKWARDS = true; 

        public static final double TURN_SENSITIVITY = 1; 
        public static final double RAMP_RATE = 0.25; 
        
        public static final double SCALING_POWER = 2.75; 
    }

    public class Input {
        /* Device Ports */
        public static final int JOYSTICK_1_PORT = 0; 

        /* Buttons */
        // Driver 1
        public static final int REVERSE_DRIVE_BUTTON = 1; 
        public static final int SHIFT_GEAR_LOW_BUTTON = 2;  
        public static final int GO_FORWARD_BUTTON = 3; 
    }
}
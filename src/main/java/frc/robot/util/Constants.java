package frc.robot.util;

public class Constants{
    //stick 
    public static int STICK_1_PORT = 0;

    //buttons
    public static int CLIMB_UP_BUTTON = 1;
    public static int CLIMB_DOWN_BUTTON = 2;
    public static int EXTEND_SUPER_STRUCTURE_BUTTON = 3;
    public static int RETRACT_SUPER_STRUCTURE_BUTTON = 4;

    //climb motor ports
    public static int L_CLIMB_LEAD_PORT = 8;
    public static int L_CLIMB_F1_PORT = 9;
    public static int L_CLIMB_F2_PORT = 10;
    public static int R_CLIMB_LEAD_PORT = 11;
    public static int R_CLIMB_F1_PORT = 12;
    public static int R_CLIMB_F2_PORT = 13;
    public static int L_WINCH_PORT = 7;
    public static int R_WINCH_PORT = 5;
    public static int SUPER_STRUCTURE_PORT = 4;

    //inversions
    public static boolean IS_LEFT_INVERTED = false;
    public static boolean IS_RIGHT_INVERTED = true;

    //digital inputs
    public static int CLIMB_UP_LIMIT = 0;
    public static int CLIMB_DOWN_LIMIT = 1;

    //encoder positions
    public static int CLIMB_UP_ENCODER_POS = 129;
    public static int CLIMB_DOWN_ENCODER_POS = 0;

    //motor powers
    public static double CLIMB_UP_POWER = 0.25;
    public static double CLIMB_DOWN_POWER = -0.25;
    
    //winch
    public static int WINCH_OUTPUT = 1;
}
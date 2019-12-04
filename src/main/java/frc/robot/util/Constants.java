package frc.robot.util;

/**
 * This class contains static members that define properties of the robot,
 * device IDs, or various unchanging values to be used throughout the robot
 * program.
 */
public class Constants {
	// Prevent initialization from outside
	private Constants() {
	}

	/**
	 * Defines all the CAN IDs for the robot (device IDs for all relevant devices on
	 * the CAN chain).
	 */
	public class CANIDs {
		private CANIDs() {
		}

		public static final int DRIVE_R1_PORT = 2;
		public static final int DRIVE_R2_PORT = 22;
		public static final int DRIVE_L1_PORT = 1;
		public static final int DRIVE_L2_PORT = 21;

		public static final int ELEVATOR_M1 = 12;
		public static final int ELEVATOR_M2 = 11;
		public static final int ELEVATOR_M3 = 10;

		public static final int INTAKE = 4;

		/** TODO: Check */
		public static final int LEFT_WINCH = 30; // Based on orientation where the battery is the front
		public static final int RIGHT_WINCH = 31; // See above
		public static final int VACUUM_PORT = 7;
	}

	public class DigitalAnalogIDs {
		private DigitalAnalogIDs() {
		}

		public static final int PRESSURE_SENSOR_PORT = 0;
	}

	/**
	 * Defines all the solenoid IDs for the PCM (Pneumatics Control Module).
	 */
	public class PCMIDs {
		private PCMIDs() {
		}

		public static final int INTAKE_HEIGHT = 0;
		public static final int CLIMB_RELEASE = 1;
		public static final int ELEVATOR_SHIFT = 2;
		public static final int HATCH_FINGERS = 3;
		public static final int HATCH_EJECTORS = 4;
		public static final int DRIVE_GEAR_SHIFT = 6;
	}

	public static final boolean IS_LEFT_INVERTED = true;
	public static final boolean IS_RIGHT_INVERTED = false;
	public static final boolean IS_DRIVEBASE_BACKWARDS = true;
	public static final double TURN_SENSITIVITY = 1;
	public static final double RADIAL_TURN_SENSITIVITY = 20;
	public static final double SCALING_POWER = 2.75;
	public static final double RAMP_RATE = 0.25; // Seconds to go from 0 to full throttle
	public static final int DRIVE_CURRENT_LIMIT = 60; // Amps to limit the drive motors to, removes voltage instead of
														// stopping. 60 seems better but not exactly correct. Not tested
														// on the floor, only free spin (40 trips the breaker normally,
														// 60 is high)

	/** Elevator Constants */
	public static final double BOTTOM_LIMIT_POSITION = 0.0; // In rotations by default but using conversion factors we
															// can make this into inches/meters
	public static final double TOP_LIMIT_POSITION = 46.2; // Tested by James 11/5/19 // 172.0 is for low gear // Tested
															// by Ingi 10/31/19
	public static final double TOP_LOW_GEAR_LIMIT_POSITION = 172.0; // Tested by Ingi 10/31/19
	public static final double ELEVATOR_ROTATION_TOLERANCE_LOW_GEAR = 10.0; // Rotations away from the ends of the
																			// elevator to
	// slow down in low gear.
	public static final double ELEVATOR_ROTATION_TOLERANCE_HIGH_GEAR = 3.0; // See above, high gear
	public static final double OH_CRAP_TOLERANCE = 0.5; // Rotation tolerance to stop Oh Crap
	public static final double ROTATION_TOLERANCE_MULTIPLIER = 0.5; // TBD, Placeholder
	public static final double HIGH_GEAR_TO_LOW_GEAR_ROTATIONS = TOP_LOW_GEAR_LIMIT_POSITION / TOP_LIMIT_POSITION; // Multiply
																													// high
																													// gear
																													// position
																													// by
																													// this
																													// to
																													// convert
																													// to
																													// the
																													// equivalent
																													// low
																													// gear
																													// position
	public static final double LOW_GEAR_TO_HIGH_GEAR_ROATIONS = TOP_LIMIT_POSITION / TOP_LOW_GEAR_LIMIT_POSITION; // Multiply
																													// low
																													// gear
																													// position
																													// by
																													// this
																													// to
																													// convert
																													// to
																													// the
																													// equivalent
																													// high
																													// gear
																													// position

	// Constants for high gear/scoring
	public static final double ELEVATOR_P = 0.075;
	public static final double ELEVATOR_I = 0.0;
	public static final double ELEVATOR_D = 0.0;
	public static final double ELEVATOR_F = 0.0;
	public static final double ELEVATOR_I_ZONE = 0.0; // Range in which I is used
	public static final double ELEVATOR_MIN_OUTPUT = -0.5; // Gravity helps this so we limit this
	public static final double ELEVATOR_MAX_OUTPUT = 0.75;
	public static final int HIGH_GEAR_PID_SLOT = 1;

	// Constants for low gear/climbing. ALWAYS ZERO TO PREVENT LOW GEAR POSITION
	// CONTROL
	public static final double ELEVATOR_CLIMB_P = 0.5; // Needs further testing
	public static final double ELEVATOR_CLIMB_I = 0.0;
	public static final double ELEVATOR_CLIMB_D = 0.0;
	public static final double ELEVATOR_CLIMB_F = 0.0;
	public static final double ELEVATOR_CLIMB_I_ZONE = 0.0; // Range in which I is used
	public static final double ELEVATOR_LOW_GEAR_MIN_OUTPUT = -0.5;
	public static final double ELEVATOR_LOW_GEAR_MAX_OUTPUT = 0.75;
	public static final int LOW_GEAR_PID_SLOT = 0;

	/** Elevator Setpoints */
	public static final double HATCH_LEVEL_1_HEIGHT = 1.0;
	public static final double HATCH_LEVEL_2_HEIGHT = 26.0;
	public static final double HATCH_LEVEL_3_HEIGHT = 45.95;
	public static final double CARGO_SHIP_HEIGHT = 27.0;
	public static final double CARGO_LEVEL_1_HEIGHT = 1.0;
	public static final double CARGO_LEVEL_2_HEIGHT = 25.5;
	public static final double CARGO_LEVEL_3_HEIGHT = 45.95;

	public static final double CLIMB_SETUP_HEIGHT = 120.0; // TBD, needs testing

	/** CLIMB CONSTANTS */
	public static final double WINCH_RAISE_POWER = 0.6;
	public static final double WINCH_LOWER_POWER = -0.6;
	public static final boolean IS_RIGHT_WINCH_INVERTED = false;
	public static final boolean IS_LEFT_WINCH_INVERTED = true;

	public static final double VACUUM_POWER = 1.0;
	public static final boolean IS_VACUUM_MOTOR_INVERTED = false;
	public static final double SENSOR_VOLTS_TO_PSI_SLOPE = 8.99; // Calculated using two points of voltage and PSI and
																	// finding the slope
	public static final double SENSOR_VOLTS_TO_PSI_Y_INTERCEPT = -23.72; // See above. This means that at 0V, it will be
																			// -23.72 PSI, which is admittedly
																			// inaccurate (should be -14.5)
	public static final double VACUUM_PRESSURE_THRESHOLD = SENSOR_VOLTS_TO_PSI_Y_INTERCEPT;

	/** INPUT CONSTANTS */
	public static final double ELEVATOR_MANUAL_POWER_SCALAR = 1.0;
	public static final double CARGO_INTAKE_INPUT_MAGNITUDE = 0.5;
	public static final double CARGO_OUTTAKE_MAGNITUDE = 1.0;
	/**
	 * Seconds
	 */
	public static final double HATCH_EJECT_RETRACT_TIMEOUT = 0.3;
}


package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;


//Developed By GitHub User CJBuchel <https://github.com/CJBuchel>
//And addons Sourced by DogeCV <https://github.com/dogecv/DogeCV>

@TeleOp(name="Drive 4788 Example", group="Linear Opmode")

//@Disabled
public class Drive_4788_GenericSteering extends LinearOpMode {

    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor leftDrive = null;
    private DcMotor rightDrive = null;
    private DcMotor hexDrive1 = null;
    private DcMotor hexDrive2 = null;

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Initialize the hardware variables. Note that the strings used here as parameters
        // to 'get' must correspond to the names assigned during the robot configuration
        // step (using the FTC Robot Controller app on the phone).
        leftDrive  = hardwareMap.get(DcMotor.class, "left_drive");
        rightDrive = hardwareMap.get(DcMotor.class, "right_drive");
        hexDrive1 = hardwareMap.get(DcMotor.class, "hex_motor1");
        hexDrive2 = hardwareMap.get(DcMotor.class, "hex_motor2");

        

        // Most robots need the motor on one side to be reversed to drive forward
        // Reverse the motor that runs backwards when connected directly to the battery
        leftDrive.setDirection(DcMotor.Direction.FORWARD);
        rightDrive.setDirection(DcMotor.Direction.REVERSE);

        hexDrive1.setDirection(DcMotor.Direction.FORWARD);
        hexDrive1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        hexDrive2.setDirection(DcMotor.Direction.FORWARD);
        hexDrive2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        


        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        runtime.reset();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

            // --------------------------------------------------------------------------------------------------------
            // Drive Motor Section
            // --------------------------------------------------------------------------------------------------------

            // Setup a variable for each drive wheel to save power level for telemetry
            double leftPower;
            double rightPower;


            // Choose to drive using either Tank Mode, or POV Mode
            // Comment out the method that's not used.  The default below is POV.

            // POV Mode uses left stick to go forward, and right stick to turn.
            // - This uses basic math to combine motions and is easier to drive straight..3.\10
            double drive = -gamepad1.left_stick_y;
            double turn  = -gamepad1.right_stick_x;

            leftPower = drive + turn;
            rightPower = drive - turn;

            // Tank Mode uses one stick to control each wheel.
            // - This requires no math, but it is hard to drive forward slowly and keep straight.
            //leftPower  = gamepad1.left_stick_y ;
            //rightPower = gamepad1.right_stick_y ;

            // Send calculated power to wheels
            leftDrive.setPower(leftPower);
            rightDrive.setPower(rightPower);



            // --------------------------------------------------------------------------------------------------------
            // Extra Motor Section
            // --------------------------------------------------------------------------------------------------------
            // Assigns 0% power to hex_motors/ arm power, x and x for low power, a and b for high power.
            float armPower = 0;
            if (gamepad1.x) armPower += 0.3; // assigns 30% power when press x
            if (gamepad1.y) armPower -= 0.3;

            if (gamepad1.a) armPower += 1.0; // assigns 100% power when press a
            if (gamepad1.b) armPower -= 1.0;

            hexDrive1.setPower(armPower); // sets motor power to gamepad button.
            hexDrive2.setPower(-armPower);


            // ---------------------------------------------------------------------------------
            // Show the elapsed game time and wheel power.
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.addData("Motors", "left (%.2f), right (%.2f)", leftPower, rightPower);
            telemetry.update();
        }
    }
}

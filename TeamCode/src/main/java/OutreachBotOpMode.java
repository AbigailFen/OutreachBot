
import com.arcrobotics.ftclib.command.Command;
import com.arcrobotics.ftclib.command.ParallelCommandGroup;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name="DOG", group="Linear OpMode")
public class OutreachBotOpMode extends LinearOpMode {

    // Declare OpMode members.
    private Servo hip1;
    private Servo hip2;
    private Servo hip3;
    private Servo hip4;
    private Servo ankle1;
    private Servo ankle2;
    private Servo ankle3;
    private Servo ankle4;
    private Servo ears;
    private Servo mouth;
    private Servo tail;


    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        ears = hardwareMap.get(Servo.class, "ears");
        mouth = hardwareMap.get(Servo.class, "mouth");

        hip1 = hardwareMap.get(Servo.class, "hip1");
        hip2 = hardwareMap.get(Servo.class, "hip2");
        hip3 = hardwareMap.get(Servo.class, "hip3");
        hip4 = hardwareMap.get(Servo.class, "hip4");
        ankle1 = hardwareMap.get(Servo.class, "ankle1");
        ankle2 = hardwareMap.get(Servo.class, "ankle2");
        ankle3 = hardwareMap.get(Servo.class, "ankle3");
        ankle4 = hardwareMap.get(Servo.class, "ankle4");
        tail = hardwareMap.get(Servo.class, "tail");


        ankle2.setDirection(Servo.Direction.REVERSE);


//hip max 1 min 0.3
// hip2 max 0.85 min 0
        // hip3 max 1 min 0.1
        // hip4 max 1 min 0.2
        // ankle1 max 0.7 min 0
        // ankle2 max 1 min .5 reversed
        // ankle3 max 0.55 min 0
        // ankle4 max 0.7 min 0

        // Wait for the game to start (driver presses START)
        waitForStart();

        hip1.setPosition(0.63);
        hip2.setPosition(0.35);
        hip3.setPosition(0.43);
        hip4.setPosition(0.67);
        ankle1.setPosition(0.23);//25
        ankle2.setPosition(0.75);
        ankle3.setPosition(0.3);//35
        ankle4.setPosition(0.33);
        tail.setPosition(0.5);


        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            if(opModeIsActive()){
                tail.setPosition(0.7);
                sleep(700);
                tail.setPosition(0.3);
                sleep(700);
            }

if(gamepad1.a){

    hip1.setPosition(0.55);
            ankle1.setPosition(0.15);

            hip2.setPosition(0.45);
            ankle2.setPosition(0.65);

    hip3.setPosition(0.33);
    ankle3.setPosition(0.2);

//
            hip4.setPosition(0.77);
            ankle4.setPosition(0.4);
           }

            if(gamepad1.x){
                hip3.setPosition(0.233);
                ankle3.setPosition(0.25);

                hip2.setPosition(0.65);
                ankle2.setPosition(0.65);

            }

            if(gamepad1.b){
                hip1.setPosition(0.45);
                ankle1.setPosition(0.15);

                hip4.setPosition(0.97);
                ankle4.setPosition(0.4);

            }





            if(gamepad1.y){

                hip1.setPosition(0.63);
                hip2.setPosition(0.35);
                hip3.setPosition(0.43);
                hip4.setPosition(0.67);
                ankle1.setPosition(0.23);//25
                ankle2.setPosition(0.75);
                ankle3.setPosition(0.3);//35
                ankle4.setPosition(0.33);
            }


//            hip4.setPosition(0.9);
//            ankle4.setPosition(0.41);
//
//            hip1.setPosition(0.5);
//            ankle1.setPosition(0.2);  forward


//            hip2.setPosition(0.3);
//            ankle2.setPosition(0.8);
//
//            hip3.setPosition(0.6);
//            ankle3.setPosition(0.45); back


            if(gamepad1.right_bumper) {
                while (opModeIsActive() && gamepad1.right_bumper) {

                    hip1.setPosition(0.35);
                    ankle1.setPosition(0.15);
                    hip4.setPosition(1);
                    ankle4.setPosition(0.4);

                    sleep (500);

                    hip1.setPosition(0.55);
                    ankle1.setPosition(0.15);

                    hip2.setPosition(0.45);
                    ankle2.setPosition(0.65);

                    hip3.setPosition(0.33);
                    ankle3.setPosition(0.2);

                    hip4.setPosition(0.77);
                    ankle4.setPosition(0.4);

                    sleep (500);

                    hip3.setPosition(0.233);
                    ankle3.setPosition(0.25);

                    hip2.setPosition(0.65);
                    ankle2.setPosition(0.65);

                    sleep(500);

                    hip1.setPosition(0.55);
                    ankle1.setPosition(0.15);

                    hip2.setPosition(0.45);
                    ankle2.setPosition(0.65);

                    hip3.setPosition(0.33);
                    ankle3.setPosition(0.2);

                    hip4.setPosition(0.77);
                    ankle4.setPosition(0.4);

                    sleep(500);

                }
            }

            if(gamepad1.left_bumper) {
                while (opModeIsActive() && gamepad1.left_bumper) {

                    hip1.setPosition(0.35);
                    ankle1.setPosition(0.15);
                    hip4.setPosition(1);
                    ankle4.setPosition(0.4);

                    sleep (500);

                    hip1.setPosition(0.63);
                    hip2.setPosition(0.35);
                    hip3.setPosition(0.43);
                    hip4.setPosition(0.67);
                    ankle1.setPosition(0.23);//25
                    ankle2.setPosition(0.75);
                    ankle3.setPosition(0.3);//35
                    ankle4.setPosition(0.33);

                    sleep (500);

                    hip3.setPosition(0.233);
                    ankle3.setPosition(0.25);

                    hip2.setPosition(0.65);
                    ankle2.setPosition(0.65);

                    sleep (500);
                    
                    hip1.setPosition(0.63);
                    hip2.setPosition(0.35);
                    hip3.setPosition(0.43);
                    hip4.setPosition(0.67);
                    ankle1.setPosition(0.23);//25
                    ankle2.setPosition(0.75);
                    ankle3.setPosition(0.3);//35
                    ankle4.setPosition(0.33);

                    sleep (500);


                }
            }


//open mouth
if (gamepad1.dpad_up){
    mouth.setPosition(0.6);
    ears.setPosition(0);
}
//
////close mouth
if (gamepad1.dpad_down){
    mouth.setPosition(0.5);
    ears.setPosition(0.2);
}

//ears up 0
//ears down 0.2

//            if(gamepad1.right_bumper) {
//                while (opModeIsActive() && gamepad1.right_bumper) {
//                    hip4.setPosition(0.9);
//                    ankle4.setPosition(0.41);
//                    hip1.setPosition(0.5);
//                    ankle1.setPosition(0.2);
//                    sleep (500);
//                    hip1.setPosition(0.63);
//                    hip2.setPosition(0.4);
//                    hip3.setPosition(0.43);
//                    hip4.setPosition(0.64);
//                    ankle1.setPosition(0.25);
//                    ankle2.setPosition(0.75);
//                    ankle3.setPosition(0.35);
//                    ankle4.setPosition(0.33);
//                    sleep (500);
//                    hip2.setPosition(0.55);
//                    ankle2.setPosition(0.65);
//                    hip3.setPosition(0.2);
//                    ankle3.setPosition(0.25);
//                    sleep(500);
//                    hip1.setPosition(0.63);
//                    hip2.setPosition(0.4);
//                    hip3.setPosition(0.43);
//                    hip4.setPosition(0.64);
//                    ankle1.setPosition(0.25);
//                    ankle2.setPosition(0.75);
//                    ankle3.setPosition(0.35);
//                    ankle4.setPosition(0.33);
//                    sleep(500);
//
//                }
//            }

//            if(gamepad1.left_bumper) {
//                while (opModeIsActive() && gamepad1.left_bumper) {
//                    hip4.setPosition(0.9);
//                    ankle4.setPosition(0.41);
//                    hip2.setPosition(0.55);
//                    ankle2.setPosition(0.65);
//                    sleep (1000);
////                    hip2.setPosition(0.4);
////                    hip4.setPosition(0.64);
////                    ankle2.setPosition(0.75);
////                    ankle4.setPosition(0.33);
////                    hip1.setPosition(0.5);
////                    ankle1.setPosition(0.2);
////                    hip3.setPosition(0.2);
////                    ankle3.setPosition(0.25);
//                    sleep(1000);
//                    hip1.setPosition(0.63);
//                    hip2.setPosition(0.4);
//                    hip3.setPosition(0.43);
//                    hip4.setPosition(0.64);
//                    ankle1.setPosition(0.25);
//                    ankle2.setPosition(0.75);
//                    ankle3.setPosition(0.35);
//                    ankle4.setPosition(0.33);
//                    sleep(1000);
//
//                }
//            }

//            if(gamepad1.a) {
//                while (opModeIsActive() && gamepad1.a) {
//                    hip4.setPosition(0.9);
//                    ankle4.setPosition(0.41);
//                    hip2.setPosition(0.55);
//                    ankle2.setPosition(0.65);
//                    sleep (1000);
//                    hip1.setPosition(0.63);
//                    hip2.setPosition(0.4);
//                    hip3.setPosition(0.43);
//                    hip4.setPosition(0.64);
//                    ankle1.setPosition(0.25);
//                    ankle2.setPosition(0.75);
//                    ankle3.setPosition(0.35);
//                    ankle4.setPosition(0.33);
//                    sleep (1000);
//                    hip4.setPosition(0.9);
//                    ankle4.setPosition(0.41);
//                    hip2.setPosition(0.55);
//                    ankle2.setPosition(0.65);
//                    sleep(1000);
//                    hip1.setPosition(0.63);
//                    hip2.setPosition(0.4);
//                    hip3.setPosition(0.43);
//                    hip4.setPosition(0.64);
//                    ankle1.setPosition(0.25);
//                    ankle2.setPosition(0.75);
//                    ankle3.setPosition(0.35);
//                    ankle4.setPosition(0.33);
//                    sleep(1000);
//
//                }
//            }

//            if (gamepad1.y){
//                hip2.setPosition(0.55);
//                ankle2.setPosition(0.65);
//
//                hip3.setPosition(0.2);
//                ankle3.setPosition(0.25);
//            }
//
//            if (gamepad1.dpad_left){
//                hip4.setPosition(0.9);
//                ankle4.setPosition(0.41);
//                hip1.setPosition(0.5);
//                ankle1.setPosition(0.2);
//            }
//
//            //home
//            if(gamepad1.b){
//               hip1.setPosition(0.63);
//        hip2.setPosition(0.4);
//        hip3.setPosition(0.43);
//        hip4.setPosition(0.64);
//        ankle1.setPosition(0.25);
//        ankle2.setPosition(0.75);
//        ankle3.setPosition(0.35);
//        ankle4.setPosition(0.33);
//            }


//            telemetry.addData("Servo", "Servo Position" + hip1.getPosition());
            telemetry.update();
        }
    }
}

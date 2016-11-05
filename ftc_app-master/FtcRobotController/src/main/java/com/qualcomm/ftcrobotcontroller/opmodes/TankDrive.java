package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created on 10/1/2016.
 */
public class TankDrive extends OpMode {

    DcMotor leftMotor;
    DcMotor rightMotor;
    DcMotor atMotor;

    @Override
    public void init(){

        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        atMotor = hardwareMap.dcMotor.get("attachment");
        rightMotor.setDirection(DcMotor.Direction.REVERSE);


    }
    @Override
    public void loop (){

        atMotor.setPower(gamepad1.dpad_down ? -1.0 :
                (gamepad1.dpad_up ? 1.0 : 0));

        // Intentionally swapped
        leftMotor.setPower(-gamepad1.left_stick_y);
        rightMotor.setPower(-gamepad1.right_stick_y);



    }
}


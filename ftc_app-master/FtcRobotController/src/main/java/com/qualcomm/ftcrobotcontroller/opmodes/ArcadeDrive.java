package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

/**
 * Created on 10/1/2016.
 */

public class ArcadeDrive extends OpMode {

    DcMotor leftMotor;
    DcMotor rightMotor;

    @Override
    public void init(){

        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");

        rightMotor.setDirection(DcMotor.Direction.REVERSE);

    }

    @Override
    public void loop(){

        float xValue = gamepad1.left_stick_x;
        float yValue = -gamepad1.left_stick_y;

        float leftPower = yValue + xValue;
        float rightPower = yValue - xValue;

        leftPower = Range.clip(leftPower, -1, 1);
        rightPower = Range.clip(rightPower, -1, 1);

        leftMotor.setPower(leftPower);
        rightMotor.setPower(rightPower);
    }
}

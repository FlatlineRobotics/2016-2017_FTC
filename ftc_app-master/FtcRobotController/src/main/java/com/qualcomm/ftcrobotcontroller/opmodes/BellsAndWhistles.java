package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.ftcrobotcontroller.opmodes.ArcadeDrive;
import com.qualcomm.ftcrobotcontroller.opmodes.TankDrive;

/**
 * Created on 10/1/2016.
 */

public class BellsAndWhistles extends OpMode {

    float i;

    @Override
    public void init() {


    }

    @Override
    public void loop() {

        boolean rBump = gamepad1.left_bumper;

        if (rBump == true){

            i += i;

            if ( i % 2 == 0){

                class A extends ArcadeDrive {



                }

            }

            else {

                class A extends TankDrive {


                }
            }

        }

        else{


        }


    }

}

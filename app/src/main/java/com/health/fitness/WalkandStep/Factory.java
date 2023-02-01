
package com.health.fitness.WalkandStep;

import android.content.pm.PackageManager;

import com.health.fitness.WalkandStep.services.AbstractStepDetectorService;
import com.health.fitness.WalkandStep.services.AccelerometerStepDetectorService;
import com.health.fitness.WalkandStep.services.HardwareStepDetectorService;
import com.health.fitness.WalkandStep.utils.AndroidVersionHelper;




public class Factory {



    public static Class<? extends AbstractStepDetectorService> getStepDetectorServiceClass(PackageManager pm){
        if(pm != null && AndroidVersionHelper.supportsStepDetector(pm)) {
            return HardwareStepDetectorService.class;
        }else{
            return AccelerometerStepDetectorService.class;
        }
    }
}

package org.spring.service;

import org.spring.aspect.LoggingAspect;
import org.spring.aspect.LoggingAspect2;
import org.spring.model.Circle;

public class ShapeServiceProxy extends ShapeService{

    public Circle getCircle()
    {
        LoggingAspect2 loggingAspect2 = new LoggingAspect2();
        loggingAspect2.loggingAdvice();
        return super.getCircle();
    }
}

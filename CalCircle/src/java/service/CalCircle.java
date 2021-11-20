/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Pongsiri
 */
@WebService(serviceName = "CalCircle")
public class CalCircle {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "CalCircumference")
    public double CalCircumference(@WebParam(name = "i") double r) {
        return 2 * 3.14 * r;
    }
    @WebMethod(operationName = "CalCircleArea")
    public double CalCircleArea(@WebParam(name = "i") double r) {
        return 3.14 * r * r;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import service.Student;
import service.StudentTable;

/**
 *
 * @author Pongsiri
 */
@WebService(serviceName = "StudentWebService")
public class StudentWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Insert")
    public String Insert(@WebParam(name = "id") int id, @WebParam(name = "name") String name, @WebParam(name = "gpa") double gpa) {
        //TODO write your implementation code here:
        Student s = new Student(id ,name,gpa);
        StudentTable.insertStudent(s);
        return "complete";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Update")
    public String Update(@WebParam(name = "id") int id, @WebParam(name = "name") String name, @WebParam(name = "gpa") double gpa) {
        //TODO write your implementation code here:
        Student s = new Student(id ,name,gpa);
        StudentTable.updateStudent(s);
        return "complete";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Delete")
    public String Delete(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        Student s = new Student(id);
        StudentTable.removeStudent(s);
        return "complete";
    }
    
    
    
    

    /**
     * This is a sample web service operation
     */
    
}

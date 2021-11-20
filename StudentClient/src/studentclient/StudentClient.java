/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentclient;
/**
 *
 * @author Pongsiri
 */
public class StudentClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        insert(62050202 , "Fi",4.00);
        update(620502020 ,"karn",3.97);
        delete(6250194);
    }

    private static String insert(int id, java.lang.String name, double gpa) {
        service.StudentWebService_Service service = new service.StudentWebService_Service();
        service.StudentWebService port = service.getStudentWebServicePort();
        return port.insert(id, name, gpa);
    }

    private static String update(int id, java.lang.String name, double gpa) {
        service.StudentWebService_Service service = new service.StudentWebService_Service();
        service.StudentWebService port = service.getStudentWebServicePort();
        return port.update(id, name, gpa);
    }

    private static String delete(int id) {
        service.StudentWebService_Service service = new service.StudentWebService_Service();
        service.StudentWebService port = service.getStudentWebServicePort();
        return port.delete(id);
    }
    
}

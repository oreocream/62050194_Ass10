/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcircleclient;

/**
 *
 * @author Pongsiri
 */
public class CalcircleClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(calCircleArea(12));
        System.out.println(calCircumference(12));
    }

    private static double calCircleArea(double i) {
        service.CalCircle_Service service = new service.CalCircle_Service();
        service.CalCircle port = service.getCalCirclePort();
        return port.calCircleArea(i);
    }

    private static double calCircumference(double i) {
        service.CalCircle_Service service = new service.CalCircle_Service();
        service.CalCircle port = service.getCalCirclePort();
        return port.calCircumference(i);
    }
    
}


package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentWebService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentWebService {


    /**
     * 
     * @param name
     * @param gpa
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Update")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Update", targetNamespace = "http://service/", className = "service.Update")
    @ResponseWrapper(localName = "UpdateResponse", targetNamespace = "http://service/", className = "service.UpdateResponse")
    @Action(input = "http://service/StudentWebService/UpdateRequest", output = "http://service/StudentWebService/UpdateResponse")
    public String update(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "gpa", targetNamespace = "")
        double gpa);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Delete")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Delete", targetNamespace = "http://service/", className = "service.Delete")
    @ResponseWrapper(localName = "DeleteResponse", targetNamespace = "http://service/", className = "service.DeleteResponse")
    @Action(input = "http://service/StudentWebService/DeleteRequest", output = "http://service/StudentWebService/DeleteResponse")
    public String delete(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param name
     * @param gpa
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Insert")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Insert", targetNamespace = "http://service/", className = "service.Insert")
    @ResponseWrapper(localName = "InsertResponse", targetNamespace = "http://service/", className = "service.InsertResponse")
    @Action(input = "http://service/StudentWebService/InsertRequest", output = "http://service/StudentWebService/InsertResponse")
    public String insert(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "gpa", targetNamespace = "")
        double gpa);

}
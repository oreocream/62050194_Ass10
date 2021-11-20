
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalCicelAreaResponse_QNAME = new QName("http://service/", "CalCicelAreaResponse");
    private final static QName _CalCicelArea_QNAME = new QName("http://service/", "CalCicelArea");
    private final static QName _CalCircumferenceResponse_QNAME = new QName("http://service/", "CalCircumferenceResponse");
    private final static QName _CalCircumference_QNAME = new QName("http://service/", "CalCircumference");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalCircumference }
     * 
     */
    public CalCircumference createCalCircumference() {
        return new CalCircumference();
    }

    /**
     * Create an instance of {@link CalCicelArea }
     * 
     */
    public CalCicelArea createCalCicelArea() {
        return new CalCicelArea();
    }

    /**
     * Create an instance of {@link CalCircumferenceResponse }
     * 
     */
    public CalCircumferenceResponse createCalCircumferenceResponse() {
        return new CalCircumferenceResponse();
    }

    /**
     * Create an instance of {@link CalCicelAreaResponse }
     * 
     */
    public CalCicelAreaResponse createCalCicelAreaResponse() {
        return new CalCicelAreaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalCicelAreaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "CalCicelAreaResponse")
    public JAXBElement<CalCicelAreaResponse> createCalCicelAreaResponse(CalCicelAreaResponse value) {
        return new JAXBElement<CalCicelAreaResponse>(_CalCicelAreaResponse_QNAME, CalCicelAreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalCicelArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "CalCicelArea")
    public JAXBElement<CalCicelArea> createCalCicelArea(CalCicelArea value) {
        return new JAXBElement<CalCicelArea>(_CalCicelArea_QNAME, CalCicelArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalCircumferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "CalCircumferenceResponse")
    public JAXBElement<CalCircumferenceResponse> createCalCircumferenceResponse(CalCircumferenceResponse value) {
        return new JAXBElement<CalCircumferenceResponse>(_CalCircumferenceResponse_QNAME, CalCircumferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalCircumference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "CalCircumference")
    public JAXBElement<CalCircumference> createCalCircumference(CalCircumference value) {
        return new JAXBElement<CalCircumference>(_CalCircumference_QNAME, CalCircumference.class, null, value);
    }

}

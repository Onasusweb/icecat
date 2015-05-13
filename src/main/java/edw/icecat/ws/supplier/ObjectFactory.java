
package edw.icecat.ws.supplier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edw.icecat.ws.supplier package. 
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

    private final static QName _ICECATInterface_QNAME = new QName("", "ICECAT-interface");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edw.icecat.ws.supplier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link SupplierMappings }
     * 
     */
    public SupplierMappings createSupplierMappings() {
        return new SupplierMappings();
    }

    /**
     * Create an instance of {@link Symbol }
     * 
     */
    public Symbol createSymbol() {
        return new Symbol();
    }

    /**
     * Create an instance of {@link SupplierMapping }
     * 
     */
    public SupplierMapping createSupplierMapping() {
        return new SupplierMapping();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Body }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ICECAT-interface")
    public JAXBElement<Body> createICECATInterface(Body value) {
        return new JAXBElement<Body>(_ICECATInterface_QNAME, Body.class, null, value);
    }

}

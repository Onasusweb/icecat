
package com.sap.document.sap.soap.functions.mc_style;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ZCRM_INFO_1", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style", wsdlLocation = "/despec/ws/ZCRM_INFO_1.wsdl")
public class ZCRM_INFO_1_Service
    extends Service
{

    private final static URL ZCRMINFO1_WSDL_LOCATION;
    private final static WebServiceException ZCRMINFO1_EXCEPTION;
    private final static QName ZCRMINFO1_QNAME = new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZCRM_INFO_1");

    static {
        ZCRMINFO1_WSDL_LOCATION = com.sap.document.sap.soap.functions.mc_style.ZCRM_INFO_1_Service.class.getResource("/despec/ws/ZCRM_INFO_1.wsdl");
        WebServiceException e = null;
        if (ZCRMINFO1_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find '/despec/ws/ZCRM_INFO_1.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        ZCRMINFO1_EXCEPTION = e;
    }

    public ZCRM_INFO_1_Service() {
        super(__getWsdlLocation(), ZCRMINFO1_QNAME);
    }

    public ZCRM_INFO_1_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ZCRMINFO1_QNAME, features);
    }

    public ZCRM_INFO_1_Service(URL wsdlLocation) {
        super(wsdlLocation, ZCRMINFO1_QNAME);
    }

    public ZCRM_INFO_1_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ZCRMINFO1_QNAME, features);
    }

    public ZCRM_INFO_1_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ZCRM_INFO_1_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ZCRM_INFO_1_PortType
     */
    @WebEndpoint(name = "ZCRM_INFO_1")
    public ZCRM_INFO_1_PortType getZCRMINFO1() {
        return super.getPort(new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZCRM_INFO_1"), ZCRM_INFO_1_PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZCRM_INFO_1_PortType
     */
    @WebEndpoint(name = "ZCRM_INFO_1")
    public ZCRM_INFO_1_PortType getZCRMINFO1(WebServiceFeature... features) {
        return super.getPort(new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZCRM_INFO_1"), ZCRM_INFO_1_PortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ZCRMINFO1_EXCEPTION!= null) {
            throw ZCRMINFO1_EXCEPTION;
        }
        return ZCRMINFO1_WSDL_LOCATION;
    }

}

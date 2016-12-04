
package org.soa.ws.tp4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.soa.ws.tp4 package. 
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

    private final static QName _GetPersonId_QNAME = new QName("http://tp4.ws.soa.org/", "getPersonId");
    private final static QName _GetPersonIdResponse_QNAME = new QName("http://tp4.ws.soa.org/", "getPersonIdResponse");
    private final static QName _GetPersonIdList_QNAME = new QName("http://tp4.ws.soa.org/", "getPersonIdList");
    private final static QName _GetPersonIdListResponse_QNAME = new QName("http://tp4.ws.soa.org/", "getPersonIdListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.soa.ws.tp4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPersonId }
     * 
     */
    public GetPersonId createGetPersonId() {
        return new GetPersonId();
    }

    /**
     * Create an instance of {@link GetPersonIdResponse }
     * 
     */
    public GetPersonIdResponse createGetPersonIdResponse() {
        return new GetPersonIdResponse();
    }

    /**
     * Create an instance of {@link GetPersonIdList }
     * 
     */
    public GetPersonIdList createGetPersonIdList() {
        return new GetPersonIdList();
    }

    /**
     * Create an instance of {@link GetPersonIdListResponse }
     * 
     */
    public GetPersonIdListResponse createGetPersonIdListResponse() {
        return new GetPersonIdListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp4.ws.soa.org/", name = "getPersonId")
    public JAXBElement<GetPersonId> createGetPersonId(GetPersonId value) {
        return new JAXBElement<GetPersonId>(_GetPersonId_QNAME, GetPersonId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp4.ws.soa.org/", name = "getPersonIdResponse")
    public JAXBElement<GetPersonIdResponse> createGetPersonIdResponse(GetPersonIdResponse value) {
        return new JAXBElement<GetPersonIdResponse>(_GetPersonIdResponse_QNAME, GetPersonIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonIdList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp4.ws.soa.org/", name = "getPersonIdList")
    public JAXBElement<GetPersonIdList> createGetPersonIdList(GetPersonIdList value) {
        return new JAXBElement<GetPersonIdList>(_GetPersonIdList_QNAME, GetPersonIdList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonIdListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp4.ws.soa.org/", name = "getPersonIdListResponse")
    public JAXBElement<GetPersonIdListResponse> createGetPersonIdListResponse(GetPersonIdListResponse value) {
        return new JAXBElement<GetPersonIdListResponse>(_GetPersonIdListResponse_QNAME, GetPersonIdListResponse.class, null, value);
    }

}

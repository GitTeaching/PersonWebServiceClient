
package org.soa.ws.tp4;

import java.util.List;
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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonService", targetNamespace = "http://tp4.ws.soa.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPersonId", targetNamespace = "http://tp4.ws.soa.org/", className = "org.soa.ws.tp4.GetPersonId")
    @ResponseWrapper(localName = "getPersonIdResponse", targetNamespace = "http://tp4.ws.soa.org/", className = "org.soa.ws.tp4.GetPersonIdResponse")
    @Action(input = "http://tp4.ws.soa.org/PersonService/getPersonIdRequest", output = "http://tp4.ws.soa.org/PersonService/getPersonIdResponse")
    public String getPersonId(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPersonIdList", targetNamespace = "http://tp4.ws.soa.org/", className = "org.soa.ws.tp4.GetPersonIdList")
    @ResponseWrapper(localName = "getPersonIdListResponse", targetNamespace = "http://tp4.ws.soa.org/", className = "org.soa.ws.tp4.GetPersonIdListResponse")
    @Action(input = "http://tp4.ws.soa.org/PersonService/getPersonIdListRequest", output = "http://tp4.ws.soa.org/PersonService/getPersonIdListResponse")
    public List<String> getPersonIdList(
        @WebParam(name = "arg0", targetNamespace = "")
        List<String> arg0);

}

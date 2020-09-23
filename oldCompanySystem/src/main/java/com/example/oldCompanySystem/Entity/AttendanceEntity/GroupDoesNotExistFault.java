
package com.example.oldCompanySystem.Entity.AttendanceEntity;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "GroupDoesNotExistFault", targetNamespace = "http://www.oldCompany.com/fault")
public class GroupDoesNotExistFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private GroupDoesNotExistFaultType faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public GroupDoesNotExistFault(String message, GroupDoesNotExistFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public GroupDoesNotExistFault(String message, GroupDoesNotExistFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: AttendanceEntity.GroupDoesNotExistFaultType
     */
    public GroupDoesNotExistFaultType getFaultInfo() {
        return faultInfo;
    }

}


package com.example.oldCompanySystem.bl;

import com.example.oldCompanySystem.Entity.ERPEntity.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ErpPort", targetNamespace = "http://www.oldSystem.com/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ErpPort {


    /**
     * 
     * @param getAllGroupInfosParam
     * @return
     *     returns ERPEntity.GroupInfoList
     */
    @WebMethod(action = "erp/getAllGroupInfos")
    @WebResult(name = "GroupInfoList", targetNamespace = "http://www.oldCompany.com/erp", partName = "groupInfoList")
    @Action(input = "erp/getAllGroupInfosRequest", output = "erp/getAllGroupInfosResponse")
    public GroupInfoList getAllGroupInfos(
            @WebParam(name = "getAllGroupInfosParam", targetNamespace = "http://www.oldCompany.com/erp", partName = "getAllGroupInfosParam")
                    String getAllGroupInfosParam);

    /**
     *
     * @param getGroupInfoByIdParam
     * @return
     *     returns ERPEntity.GroupInformationType
     * @throws GroupDoesNotExistFault
     */
    @WebMethod(action = "erp/getGroupInfoById")
    @WebResult(name = "GroupInfo", targetNamespace = "http://www.oldCompany.com/erp", partName = "groupInfo")
    @Action(input = "erp/getGroupInfoByIdRequest", output = "erp/getGroupInfoByIdResponse", fault = {
        @FaultAction(className = GroupDoesNotExistFault.class, value = "erp/GroupDoesNotExistFault")
    })
    public GroupInformationType getGroupInfoById(
            @WebParam(name = "getGroupInfoByIdParam", targetNamespace = "http://www.oldCompany.com/erp", partName = "getGroupInfoByIdParam")
                    GetGroupInfoByIdParamType getGroupInfoByIdParam)
        throws GroupDoesNotExistFault
    ;

    /**
     *
     * @param getGroupInfoByMemberNameParam
     * @return
     *     returns ERPEntity.GroupInformationType
     * @throws GroupDoesNotExistFault
     */
    @WebMethod(action = "erp/getGroupInfoByMemberName")
    @WebResult(name = "GroupInfo", targetNamespace = "http://www.oldCompany.com/erp", partName = "groupInfo")
    @Action(input = "erp/getGroupInfoByMemberNameRequest", output = "erp/getGroupInfoByMemberNameResponse", fault = {
        @FaultAction(className = GroupDoesNotExistFault.class, value = "erp/GroupDoesNotExistFault")
    })
    public GroupInformationType getGroupInfoByMemberName(
            @WebParam(name = "getGroupInfoByMemberNameParam", targetNamespace = "http://www.oldCompany.com/erp", partName = "getGroupInfoByMemberNameParam")
                    GetGroupInfoByMemberNameParamType getGroupInfoByMemberNameParam)
        throws GroupDoesNotExistFault
    ;

    /**
     *
     * @param getAllMachineInfosParam
     * @return
     *     returns ERPEntity.MachineInfoList
     */
    @WebMethod(action = "erp/getAllMachineInfos")
    @WebResult(name = "MachineInfoList", targetNamespace = "http://www.oldCompany.com/erp", partName = "machineInfoList")
    @Action(input = "erp/getAllMachineInfosRequest", output = "erp/getAllMachineInfosResponse")
    public MachineInfoList getAllMachineInfos(
            @WebParam(name = "getAllMachineInfosParam", targetNamespace = "http://www.oldCompany.com/erp", partName = "getAllMachineInfosParam")
                    String getAllMachineInfosParam);

    /**
     *
     * @param getMachineInfoByNameParam
     * @return
     *     returns ERPEntity.MachineInfoType
     * @throws MachineDoesNotExistFault
     */
    @WebMethod(action = "erp/getMachineInfoByName")
    @WebResult(name = "MachineInfo", targetNamespace = "http://www.oldCompany.com/erp", partName = "machineInfo")
    @Action(input = "erp/getMachineInfoByNameRequest", output = "erp/getMachineInfoByNameResponse", fault = {
        @FaultAction(className = MachineDoesNotExistFault.class, value = "erp/MachineDoesNotExistFault")
    })
    public MachineInfoType getMachineInfoByName(
            @WebParam(name = "getMachineInfoByNameParam", targetNamespace = "http://www.oldCompany.com/erp", partName = "getMachineInfoByNameParam")
                    GetMachineInfoByNameParamType getMachineInfoByNameParam)
        throws MachineDoesNotExistFault
    ;

    /**
     *
     * @param getMachineInfosByTypeParam
     * @return
     *     returns ERPEntity.MachineInfoList
     */
    @WebMethod(action = "erp/getMachineInfosByType")
    @WebResult(name = "MachineInfoList", targetNamespace = "http://www.oldCompany.com/erp", partName = "machineInfoList")
    @Action(input = "erp/getMachineInfosByTypeRequest", output = "erp/getMachineInfosByTypeResponse")
    public MachineInfoList getMachineInfosByType(
            @WebParam(name = "getMachineInfosByTypeParam", targetNamespace = "http://www.oldCompany.com/erp", partName = "getMachineInfosByTypeParam")
                    GetMachineInfosByTypeParamType getMachineInfosByTypeParam);

    /**
     *
     * @param getAllItemInfosParam
     * @return
     *     returns ERPEntity.ItemInfoList
     */
    @WebMethod(action = "erp/getAllItemInfos")
    @WebResult(name = "ItemInfoList", targetNamespace = "http://www.oldCompany.com/erp", partName = "itemInfoList")
    @Action(input = "erp/getAllItemInfosRequest", output = "erp/getAllItemInfosResponse")
    public ItemInfoList getAllItemInfos(
            @WebParam(name = "getAllItemInfosParam", targetNamespace = "http://www.oldCompany.com/erp", partName = "getAllItemInfosParam")
                    String getAllItemInfosParam);

    /**
     *
     * @param getItemInfoByIdParam
     * @return
     *     returns ERPEntity.ItemInfoType
     * @throws ItemDoesNotExistFault
     */
    @WebMethod(action = "erp/getItemInfoById")
    @WebResult(name = "ItemInfo", targetNamespace = "http://www.oldCompany.com/erp", partName = "itemInfo")
    @Action(input = "erp/getItemInfoByIdRequest", output = "erp/getItemInfoByIdResponse", fault = {
        @FaultAction(className = ItemDoesNotExistFault.class, value = "erp/ItemDoesNotExistFault")
    })
    public ItemInfoType getItemInfoById(
            @WebParam(name = "getItemInfoByIdParam", targetNamespace = "http://www.oldCompany.com/erp", partName = "getItemInfoByIdParam")
                    GetItemInfoByIdParamType getItemInfoByIdParam)
        throws ItemDoesNotExistFault
    ;

}

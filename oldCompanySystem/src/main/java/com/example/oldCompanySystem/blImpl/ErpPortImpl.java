package com.example.oldCompanySystem.blImpl;

import com.example.oldCompanySystem.Entity.ERPEntity.*;
import com.example.oldCompanySystem.bl.ErpPort;
import org.apache.cxf.staxutils.StaxUtils;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "ErpPort", targetNamespace = "http://www.oldCompany.com/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class ErpPortImpl implements ErpPort {
    @PostConstruct
    public void init(){
        System.setProperty(StaxUtils.ALLOW_INSECURE_PARSER, "true");
    }
    @Override
    public GroupInfoList getAllGroupInfos(String getAllGroupInfosParam) {
        return null;
    }

    @Override
    public GroupInformationType getGroupInfoById(GetGroupInfoByIdParamType getGroupInfoByIdParam) throws GroupDoesNotExistFault {
        return null;
    }

    @Override
    public GroupInformationType getGroupInfoByMemberName(GetGroupInfoByMemberNameParamType getGroupInfoByMemberNameParam) throws GroupDoesNotExistFault {
        return null;
    }

    @Override
    public MachineInfoList getAllMachineInfos(String getAllMachineInfosParam) {
        return null;
    }

    @Override
    public MachineInfoType getMachineInfoByName(GetMachineInfoByNameParamType getMachineInfoByNameParam) throws MachineDoesNotExistFault {
        return null;
    }

    @Override
    public MachineInfoList getMachineInfosByType(GetMachineInfosByTypeParamType getMachineInfosByTypeParam) {
        return null;
    }

    @Override
    public ItemInfoList getAllItemInfos(String getAllItemInfosParam) {
        return null;
    }

    @Override
    public ItemInfoType getItemInfoById(GetItemInfoByIdParamType getItemInfoByIdParam) throws ItemDoesNotExistFault {
        return null;
    }
}

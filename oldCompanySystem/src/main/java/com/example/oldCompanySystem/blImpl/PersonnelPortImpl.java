package com.example.oldCompanySystem.blImpl;

import com.example.oldCompanySystem.Entity.PersonnelEntity.*;
import com.example.oldCompanySystem.bl.PersonnelPort;
import org.apache.cxf.staxutils.StaxUtils;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "PersonnelPort", targetNamespace = "http://www.oldCompany.com/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class PersonnelPortImpl implements PersonnelPort {
    @PostConstruct
    public void init(){
        System.setProperty(StaxUtils.ALLOW_INSECURE_PARSER, "true");
    }

    @Override
    public PersonnelInfoList getAllPersonnelInfos(String getAllPersonnelInfosParam) {
        return null;
    }

    @Override
    public PersonnelInfoType getPersonnelInfoById(GetPersonnelInfoByIdParamType getPersonnelInfoByIdParam) throws PersonnelDoesNotExistFault {
        return null;
    }

    @Override
    public PersonnelInfoType getPersonnelInfoByName(GetPersonnelInfoByNameParamType getPersonnelInfoByNameParam) throws PersonnelDoesNotExistFault {
        return null;
    }

    @Override
    public RoleType getPersonnelRoleById(GetPersonnelRoleByIdParamType getPersonnelRoleByIdParam) throws PersonnelDoesNotExistFault {
        return null;
    }

    @Override
    public RoleType getPersonnelRoleByName(GetPersonnelRoleByNameParamType getPersonnelRoleByNameParam) throws PersonnelDoesNotExistFault {
        return null;
    }
}

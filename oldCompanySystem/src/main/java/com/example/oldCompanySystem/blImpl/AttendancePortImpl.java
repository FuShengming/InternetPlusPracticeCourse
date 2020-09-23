package com.example.oldCompanySystem.blImpl;

import com.example.oldCompanySystem.Entity.AttendanceEntity.*;
import com.example.oldCompanySystem.bl.AttendancePort;
import com.example.oldCompanySystem.dao.CsvReader;
import org.apache.cxf.staxutils.StaxUtils;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

@WebService(name = "AttendancePort", targetNamespace = "http://www.oldCompany.com/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class AttendancePortImpl implements AttendancePort {
    @PostConstruct
    public void init(){
        System.setProperty(StaxUtils.ALLOW_INSECURE_PARSER, "true");
    }



    @Override
    public GroupScheduleInformationList getAllGroupSchedules(String getAllGroupSchedulesParam) {
        return null;
    }

    @Override
    public GroupScheduleInformationType getGroupScheduleById(GetGroupScheduleInformationParamType getGroupScheduleByIdParam) throws GroupDoesNotExistFault {
        return null;
    }

    @Override
    public ShiftList getAllShifts(String getAllShiftsParam) {
        return null;
    }
}

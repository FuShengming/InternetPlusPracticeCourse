package com.example.oldCompanySystem.blImpl;

import com.example.oldCompanySystem.Entity.BOMEntity.BOMList;
import com.example.oldCompanySystem.Entity.BOMEntity.BOMType;
import com.example.oldCompanySystem.Entity.BOMEntity.GetBOMByItemIdParamType;
import com.example.oldCompanySystem.Entity.BOMEntity.ItemDoesNotExistFault;
import com.example.oldCompanySystem.bl.BOMPort;
import com.example.oldCompanySystem.dao.CsvReader;
import org.apache.cxf.staxutils.StaxUtils;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

@WebService(name = "BOMPort", targetNamespace = "http://www.oldCompany.com/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class BOMPortImpl implements BOMPort {

    ArrayList<String> fileLines;
    private BOMList bomList;
    @PostConstruct
    public void init(){
        System.setProperty(StaxUtils.ALLOW_INSECURE_PARSER, "true");
        fileLines = new CsvReader("csv\\订单信息.csv").readCsv();
        
    }
    @Override
    public BOMList getAllBOMs(String getAllBOMsParam) {
        return null;
    }

    @Override
    public BOMType getBOMByItemId(GetBOMByItemIdParamType getBOMByItemIdParam) throws ItemDoesNotExistFault {
        return null;
    }
}

package com.example.oldCompanySystem.blImpl;

import com.example.oldCompanySystem.Entity.OrderEntity.*;
import com.example.oldCompanySystem.bl.OrderPort;
import com.example.oldCompanySystem.dao.CsvReader;
import com.sun.corba.se.spi.orb.ORBData;
import org.apache.cxf.staxutils.StaxUtils;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

@WebService(name = "OrderPort", targetNamespace = "http://www.oldCompany.com/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class OrderPortImpl implements OrderPort {
    @PostConstruct
    public void init(){
        System.setProperty(StaxUtils.ALLOW_INSECURE_PARSER, "true");
    }

    ArrayList<String> fileLines = new CsvReader("csv\\订单信息.csv").readCsv();

    @Override
    public OrderList getAllOrders(String getAllOrdersParam) {
        OrderList res = new OrderList();
        List<OrderInfoType> orderInfoTypes = new ArrayList<OrderInfoType>();
        res.setOrderInfo(orderInfoTypes);
        int cnt = 0;
       for(String line:fileLines){
           if(cnt==0){
               cnt++;
               continue;
           }
           String[] properties = line.split(",");
           for(String s:properties){
               System.out.println(s);
           }
           OrderInfoType orderInfoType = new OrderInfoType();
           orderInfoType.setOrderId(properties[0]);
           orderInfoType.setItem(properties[1]);
           orderInfoType.setNumOfOrder(Integer.parseInt(properties[2]));

           //orderInfoType.setTermOfDelivery();
           orderInfoType.setComment(properties[4]);
           orderInfoType.setLength(properties[5]);
           orderInfoTypes.add(orderInfoType);
       }
        return res;
    }

    @Override
    public OrderInfoType getOrderById(GetOrderByIdType getOrderByIdParam) throws OrderDoesNotExistFault {
        return null;
    }

    @Override
    public OrderList getOrdersByItemId(GetOrdersByItemIdType getOrdersByMaterielIdParam) throws ItemDoesNotExistFault {
        return null;
    }
}


package com.example.oldCompanySystem.Entity.BOMEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ProcessType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProcessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RequiredItemInfoList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="RequiredItemInfo" type="{http://www.oldCompany.com/bom}RequiredItemInfoType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessType", namespace = "http://www.oldCompany.com/bom", propOrder = {
    "processName",
    "requiredItemInfoList"
})
public class ProcessType {

    @XmlElement(required = true)
    protected String processName;
    @XmlElement(name = "RequiredItemInfoList", required = true)
    protected ProcessType.RequiredItemInfoList requiredItemInfoList;

    /**
     * 获取processName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * 设置processName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessName(String value) {
        this.processName = value;
    }

    /**
     * 获取requiredItemInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProcessType.RequiredItemInfoList }
     *
     */
    public ProcessType.RequiredItemInfoList getRequiredItemInfoList() {
        return requiredItemInfoList;
    }

    /**
     * 设置requiredItemInfoList属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ProcessType.RequiredItemInfoList }
     *
     */
    public void setRequiredItemInfoList(ProcessType.RequiredItemInfoList value) {
        this.requiredItemInfoList = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="RequiredItemInfo" type="{http://www.oldCompany.com/bom}RequiredItemInfoType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "requiredItemInfo"
    })
    public static class RequiredItemInfoList {

        @XmlElement(name = "RequiredItemInfo", namespace = "http://www.oldCompany.com/bom", required = true)
        protected List<RequiredItemInfoType> requiredItemInfo;

        /**
         * Gets the value of the requiredItemInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requiredItemInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequiredItemInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequiredItemInfoType }
         * 
         * 
         */
        public List<RequiredItemInfoType> getRequiredItemInfo() {
            if (requiredItemInfo == null) {
                requiredItemInfo = new ArrayList<RequiredItemInfoType>();
            }
            return this.requiredItemInfo;
        }

    }

}

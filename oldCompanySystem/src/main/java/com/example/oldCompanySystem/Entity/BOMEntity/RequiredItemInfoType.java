
package com.example.oldCompanySystem.Entity.BOMEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RequiredItemInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RequiredItemInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemInfo" type="{http://www.oldCompany.com/erp}ItemInfoType"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourceInfo" type="{http://www.oldCompany.com/bom}resourceInfoType"/>
 *         &lt;element name="standardCapacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timeOfChangeLine" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="numOfPersonnel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredItemInfoType", namespace = "http://www.oldCompany.com/bom", propOrder = {
    "itemInfo",
    "number",
    "unit",
    "resourceInfo",
    "standardCapacity",
    "priority",
    "timeOfChangeLine",
    "numOfPersonnel"
})
public class RequiredItemInfoType {

    @XmlElement(required = true)
    protected ItemInfoType itemInfo;
    protected double number;
    @XmlElement(required = true)
    protected String unit;
    @XmlElement(required = true)
    protected ResourceInfoType resourceInfo;
    protected int standardCapacity;
    protected int priority;
    protected double timeOfChangeLine;
    protected int numOfPersonnel;

    /**
     * 获取itemInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemInfoType }
     *     
     */
    public ItemInfoType getItemInfo() {
        return itemInfo;
    }

    /**
     * 设置itemInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInfoType }
     *     
     */
    public void setItemInfo(ItemInfoType value) {
        this.itemInfo = value;
    }

    /**
     * 获取number属性的值。
     * 
     */
    public double getNumber() {
        return number;
    }

    /**
     * 设置number属性的值。
     * 
     */
    public void setNumber(double value) {
        this.number = value;
    }

    /**
     * 获取unit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置unit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * 获取resourceInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResourceInfoType }
     *     
     */
    public ResourceInfoType getResourceInfo() {
        return resourceInfo;
    }

    /**
     * 设置resourceInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceInfoType }
     *     
     */
    public void setResourceInfo(ResourceInfoType value) {
        this.resourceInfo = value;
    }

    /**
     * 获取standardCapacity属性的值。
     * 
     */
    public int getStandardCapacity() {
        return standardCapacity;
    }

    /**
     * 设置standardCapacity属性的值。
     * 
     */
    public void setStandardCapacity(int value) {
        this.standardCapacity = value;
    }

    /**
     * 获取priority属性的值。
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * 设置priority属性的值。
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * 获取timeOfChangeLine属性的值。
     * 
     */
    public double getTimeOfChangeLine() {
        return timeOfChangeLine;
    }

    /**
     * 设置timeOfChangeLine属性的值。
     * 
     */
    public void setTimeOfChangeLine(double value) {
        this.timeOfChangeLine = value;
    }

    /**
     * 获取numOfPersonnel属性的值。
     * 
     */
    public int getNumOfPersonnel() {
        return numOfPersonnel;
    }

    /**
     * 设置numOfPersonnel属性的值。
     * 
     */
    public void setNumOfPersonnel(int value) {
        this.numOfPersonnel = value;
    }

}


package com.example.oldCompanySystem.Entity.BOMEntity;

import javax.xml.bind.annotation.*;


/**
 * <p>resourceInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="resourceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourceMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourceType" type="{http://www.oldCompany.com/bom}ResourceType"/>
 *         &lt;element name="leastNumOfResource" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourceInfoType", namespace = "http://www.oldCompany.com/bom", propOrder = {
    "resourceName",
    "resourceMode",
    "resourceType",
    "leastNumOfResource"
})
public class ResourceInfoType {

    @XmlElement(required = true)
    protected String resourceName;
    @XmlElement(required = true)
    protected String resourceMode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ResourceType resourceType;
    protected int leastNumOfResource;

    /**
     * 获取resourceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * 设置resourceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceName(String value) {
        this.resourceName = value;
    }

    /**
     * 获取resourceMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceMode() {
        return resourceMode;
    }

    /**
     * 设置resourceMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceMode(String value) {
        this.resourceMode = value;
    }

    /**
     * 获取resourceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResourceType }
     *     
     */
    public ResourceType getResourceType() {
        return resourceType;
    }

    /**
     * 设置resourceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceType }
     *     
     */
    public void setResourceType(ResourceType value) {
        this.resourceType = value;
    }

    /**
     * 获取leastNumOfResource属性的值。
     * 
     */
    public int getLeastNumOfResource() {
        return leastNumOfResource;
    }

    /**
     * 设置leastNumOfResource属性的值。
     * 
     */
    public void setLeastNumOfResource(int value) {
        this.leastNumOfResource = value;
    }

}

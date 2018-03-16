
package com.chuangye.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="as_tradetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="as_trademsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "asTradetype",
    "asTrademsg"
})
@XmlRootElement(name = "runservice")
public class Runservice {

    @XmlElement(name = "as_tradetype")
    protected String asTradetype;
    @XmlElement(name = "as_trademsg")
    protected String asTrademsg;

    /**
     * Gets the value of the asTradetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsTradetype() {
        return asTradetype;
    }

    /**
     * Sets the value of the asTradetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsTradetype(String value) {
        this.asTradetype = value;
    }

    /**
     * Gets the value of the asTrademsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsTrademsg() {
        return asTrademsg;
    }

    /**
     * Sets the value of the asTrademsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsTrademsg(String value) {
        this.asTrademsg = value;
    }

}

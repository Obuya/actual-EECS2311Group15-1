//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.25 at 11:44:40 AM EST 
//


package drumTag;

import java.math.BigDecimal;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}system-margins"/&gt;
 *         &lt;element ref="{}system-distance"/&gt;
 *         &lt;element ref="{}top-system-distance"/&gt;
 *         &lt;element ref="{}system-dividers"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "systemMargins",
    "systemDistance",
    "topSystemDistance",
    "systemDividers"
})
@XmlRootElement(name = "system-layout")
public class SystemLayout {

    @XmlElement(name = "system-margins", required = true)
    protected SystemMargins systemMargins;
    @XmlElement(name = "system-distance", required = true)
    protected BigDecimal systemDistance;
    @XmlElement(name = "top-system-distance", required = true)
    protected BigDecimal topSystemDistance;
    @XmlElement(name = "system-dividers", required = true)
    protected SystemDividers systemDividers;

    /**
     * Gets the value of the systemMargins property.
     * 
     * @return
     *     possible object is
     *     {@link SystemMargins }
     *     
     */
    public SystemMargins getSystemMargins() {
        return systemMargins;
    }

    /**
     * Sets the value of the systemMargins property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemMargins }
     *     
     */
    public void setSystemMargins(SystemMargins value) {
        this.systemMargins = value;
    }

    /**
     * Gets the value of the systemDistance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSystemDistance() {
        return systemDistance;
    }

    /**
     * Sets the value of the systemDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSystemDistance(BigDecimal value) {
        this.systemDistance = value;
    }

    /**
     * Gets the value of the topSystemDistance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTopSystemDistance() {
        return topSystemDistance;
    }

    /**
     * Sets the value of the topSystemDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTopSystemDistance(BigDecimal value) {
        this.topSystemDistance = value;
    }

    /**
     * Gets the value of the systemDividers property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDividers }
     *     
     */
    public SystemDividers getSystemDividers() {
        return systemDividers;
    }

    /**
     * Sets the value of the systemDividers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDividers }
     *     
     */
    public void setSystemDividers(SystemDividers value) {
        this.systemDividers = value;
    }

}

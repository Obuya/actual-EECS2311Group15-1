//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.25 at 11:44:40 AM EST 
//


package drumTag;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}tuning-step"/&gt;
 *         &lt;element ref="{}tuning-alter"/&gt;
 *         &lt;element ref="{}tuning-octave"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="line" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tuningStep",
    "tuningAlter",
    "tuningOctave"
})
@XmlRootElement(name = "staff-tuning")
public class StaffTuning {

    @XmlElement(name = "tuning-step", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String tuningStep;
    @XmlElement(name = "tuning-alter", required = true)
    protected BigDecimal tuningAlter;
    @XmlElement(name = "tuning-octave", required = true)
    protected BigInteger tuningOctave;
    @XmlAttribute(name = "line", required = true)
    protected BigInteger line;

    public StaffTuning() {
	}
    public StaffTuning(BigInteger line, java.lang.String tuningStep, BigInteger tuningOctave) {

        this.line = line;
        this.tuningStep = tuningStep;
        this.tuningOctave = tuningOctave;
	}

	/**
     * Gets the value of the tuningStep property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTuningStep() {
        return tuningStep;
    }

    /**
     * Sets the value of the tuningStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTuningStep(java.lang.String value) {
        this.tuningStep = value;
    }

    /**
     * Gets the value of the tuningAlter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTuningAlter() {
        return tuningAlter;
    }

    /**
     * Sets the value of the tuningAlter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTuningAlter(BigDecimal value) {
        this.tuningAlter = value;
    }

    /**
     * Gets the value of the tuningOctave property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTuningOctave() {
        return tuningOctave;
    }

    /**
     * Sets the value of the tuningOctave property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTuningOctave(BigInteger value) {
        this.tuningOctave = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLine(BigInteger value) {
        this.line = value;
    }

}

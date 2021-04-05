//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.25 at 11:44:40 AM EST 
//


package drumTag;

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
 *         &lt;element ref="{}display-text"/&gt;
 *         &lt;element ref="{}accidental-text"/&gt;
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
    "displayText",
    "accidentalText"
})
@XmlRootElement(name = "notehead-text")
public class NoteheadText {

    @XmlElement(name = "display-text", required = true)
    protected DisplayText displayText;
    @XmlElement(name = "accidental-text", required = true)
    protected AccidentalText accidentalText;

    /**
     * Gets the value of the displayText property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayText }
     *     
     */
    public DisplayText getDisplayText() {
        return displayText;
    }

    /**
     * Sets the value of the displayText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayText }
     *     
     */
    public void setDisplayText(DisplayText value) {
        this.displayText = value;
    }

    /**
     * Gets the value of the accidentalText property.
     * 
     * @return
     *     possible object is
     *     {@link AccidentalText }
     *     
     */
    public AccidentalText getAccidentalText() {
        return accidentalText;
    }

    /**
     * Sets the value of the accidentalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccidentalText }
     *     
     */
    public void setAccidentalText(AccidentalText value) {
        this.accidentalText = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.25 at 11:44:40 AM EST 
//


package musicXML;

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
 *         &lt;element ref="{}string"/&gt;
 *         &lt;element ref="{}fret"/&gt;
 *         &lt;element ref="{}fingering"/&gt;
 *         &lt;element ref="{}barre"/&gt;
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
    "string",
    "fret",
    "fingering",
    "barre"
})
@XmlRootElement(name = "frame-note")
public class FrameNote {

    @XmlElement(required = true)
    protected String string;
    @XmlElement(required = true)
    protected Fret fret;
    @XmlElement(required = true)
    protected Fingering fingering;
    @XmlElement(required = true)
    protected Barre barre;

    /**
     * Gets the value of the string property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString() {
        return string;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString(String value) {
        this.string = value;
    }

    /**
     * Gets the value of the fret property.
     * 
     * @return
     *     possible object is
     *     {@link Fret }
     *     
     */
    public Fret getFret() {
        return fret;
    }

    /**
     * Sets the value of the fret property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fret }
     *     
     */
    public void setFret(Fret value) {
        this.fret = value;
    }

    /**
     * Gets the value of the fingering property.
     * 
     * @return
     *     possible object is
     *     {@link Fingering }
     *     
     */
    public Fingering getFingering() {
        return fingering;
    }

    /**
     * Sets the value of the fingering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fingering }
     *     
     */
    public void setFingering(Fingering value) {
        this.fingering = value;
    }

    /**
     * Gets the value of the barre property.
     * 
     * @return
     *     possible object is
     *     {@link Barre }
     *     
     */
    public Barre getBarre() {
        return barre;
    }

    /**
     * Sets the value of the barre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Barre }
     *     
     */
    public void setBarre(Barre value) {
        this.barre = value;
    }

}
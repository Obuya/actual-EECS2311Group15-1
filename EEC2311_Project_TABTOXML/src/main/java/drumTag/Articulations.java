//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.25 at 11:44:40 AM EST 
//


package drumTag;

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
 *         &lt;element ref="{}accent"/&gt;
 *         &lt;element ref="{}strong-accent"/&gt;
 *         &lt;element ref="{}staccato"/&gt;
 *         &lt;element ref="{}tenuto"/&gt;
 *         &lt;element ref="{}detached-legato"/&gt;
 *         &lt;element ref="{}staccatissimo"/&gt;
 *         &lt;element ref="{}spiccato"/&gt;
 *         &lt;element ref="{}scoop"/&gt;
 *         &lt;element ref="{}plop"/&gt;
 *         &lt;element ref="{}doit"/&gt;
 *         &lt;element ref="{}falloff"/&gt;
 *         &lt;element ref="{}breath-mark"/&gt;
 *         &lt;element ref="{}caesura"/&gt;
 *         &lt;element ref="{}stress"/&gt;
 *         &lt;element ref="{}unstress"/&gt;
 *         &lt;element ref="{}soft-accent"/&gt;
 *         &lt;element ref="{}other-articulation"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accent",
    "strongAccent",
    "staccato",
    "tenuto",
    "detachedLegato",
    "staccatissimo",
    "spiccato",
    "scoop",
    "plop",
    "doit",
    "falloff",
    "breathMark",
    "caesura",
    "stress",
    "unstress",
    "softAccent",
    "otherArticulation"
})
@XmlRootElement(name = "articulations")
public class Articulations {

    @XmlElement(required = true)
    protected Accent accent;
    @XmlElement(name = "strong-accent", required = true)
    protected StrongAccent strongAccent;
    @XmlElement(required = true)
    protected Staccato staccato;
    @XmlElement(required = true)
    protected Tenuto tenuto;
    @XmlElement(name = "detached-legato", required = true)
    protected DetachedLegato detachedLegato;
    @XmlElement(required = true)
    protected Staccatissimo staccatissimo;
    @XmlElement(required = true)
    protected Spiccato spiccato;
    @XmlElement(required = true)
    protected Scoop scoop;
    @XmlElement(required = true)
    protected Plop plop;
    @XmlElement(required = true)
    protected Doit doit;
    @XmlElement(required = true)
    protected Falloff falloff;
    @XmlElement(name = "breath-mark", required = true)
    protected BreathMark breathMark;
    @XmlElement(required = true)
    protected Caesura caesura;
    @XmlElement(required = true)
    protected Stress stress;
    @XmlElement(required = true)
    protected Unstress unstress;
    @XmlElement(name = "soft-accent", required = true)
    protected SoftAccent softAccent;
    @XmlElement(name = "other-articulation", required = true)
    protected OtherArticulation otherArticulation;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String id;

    /**
     * Gets the value of the accent property.
     * 
     * @return
     *     possible object is
     *     {@link Accent }
     *     
     */
    public Accent getAccent() {
        return accent;
    }

    /**
     * Sets the value of the accent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accent }
     *     
     */
    public void setAccent(Accent value) {
        this.accent = value;
    }

    /**
     * Gets the value of the strongAccent property.
     * 
     * @return
     *     possible object is
     *     {@link StrongAccent }
     *     
     */
    public StrongAccent getStrongAccent() {
        return strongAccent;
    }

    /**
     * Sets the value of the strongAccent property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrongAccent }
     *     
     */
    public void setStrongAccent(StrongAccent value) {
        this.strongAccent = value;
    }

    /**
     * Gets the value of the staccato property.
     * 
     * @return
     *     possible object is
     *     {@link Staccato }
     *     
     */
    public Staccato getStaccato() {
        return staccato;
    }

    /**
     * Sets the value of the staccato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Staccato }
     *     
     */
    public void setStaccato(Staccato value) {
        this.staccato = value;
    }

    /**
     * Gets the value of the tenuto property.
     * 
     * @return
     *     possible object is
     *     {@link Tenuto }
     *     
     */
    public Tenuto getTenuto() {
        return tenuto;
    }

    /**
     * Sets the value of the tenuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tenuto }
     *     
     */
    public void setTenuto(Tenuto value) {
        this.tenuto = value;
    }

    /**
     * Gets the value of the detachedLegato property.
     * 
     * @return
     *     possible object is
     *     {@link DetachedLegato }
     *     
     */
    public DetachedLegato getDetachedLegato() {
        return detachedLegato;
    }

    /**
     * Sets the value of the detachedLegato property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetachedLegato }
     *     
     */
    public void setDetachedLegato(DetachedLegato value) {
        this.detachedLegato = value;
    }

    /**
     * Gets the value of the staccatissimo property.
     * 
     * @return
     *     possible object is
     *     {@link Staccatissimo }
     *     
     */
    public Staccatissimo getStaccatissimo() {
        return staccatissimo;
    }

    /**
     * Sets the value of the staccatissimo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Staccatissimo }
     *     
     */
    public void setStaccatissimo(Staccatissimo value) {
        this.staccatissimo = value;
    }

    /**
     * Gets the value of the spiccato property.
     * 
     * @return
     *     possible object is
     *     {@link Spiccato }
     *     
     */
    public Spiccato getSpiccato() {
        return spiccato;
    }

    /**
     * Sets the value of the spiccato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spiccato }
     *     
     */
    public void setSpiccato(Spiccato value) {
        this.spiccato = value;
    }

    /**
     * Gets the value of the scoop property.
     * 
     * @return
     *     possible object is
     *     {@link Scoop }
     *     
     */
    public Scoop getScoop() {
        return scoop;
    }

    /**
     * Sets the value of the scoop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Scoop }
     *     
     */
    public void setScoop(Scoop value) {
        this.scoop = value;
    }

    /**
     * Gets the value of the plop property.
     * 
     * @return
     *     possible object is
     *     {@link Plop }
     *     
     */
    public Plop getPlop() {
        return plop;
    }

    /**
     * Sets the value of the plop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Plop }
     *     
     */
    public void setPlop(Plop value) {
        this.plop = value;
    }

    /**
     * Gets the value of the doit property.
     * 
     * @return
     *     possible object is
     *     {@link Doit }
     *     
     */
    public Doit getDoit() {
        return doit;
    }

    /**
     * Sets the value of the doit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Doit }
     *     
     */
    public void setDoit(Doit value) {
        this.doit = value;
    }

    /**
     * Gets the value of the falloff property.
     * 
     * @return
     *     possible object is
     *     {@link Falloff }
     *     
     */
    public Falloff getFalloff() {
        return falloff;
    }

    /**
     * Sets the value of the falloff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Falloff }
     *     
     */
    public void setFalloff(Falloff value) {
        this.falloff = value;
    }

    /**
     * Gets the value of the breathMark property.
     * 
     * @return
     *     possible object is
     *     {@link BreathMark }
     *     
     */
    public BreathMark getBreathMark() {
        return breathMark;
    }

    /**
     * Sets the value of the breathMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreathMark }
     *     
     */
    public void setBreathMark(BreathMark value) {
        this.breathMark = value;
    }

    /**
     * Gets the value of the caesura property.
     * 
     * @return
     *     possible object is
     *     {@link Caesura }
     *     
     */
    public Caesura getCaesura() {
        return caesura;
    }

    /**
     * Sets the value of the caesura property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caesura }
     *     
     */
    public void setCaesura(Caesura value) {
        this.caesura = value;
    }

    /**
     * Gets the value of the stress property.
     * 
     * @return
     *     possible object is
     *     {@link Stress }
     *     
     */
    public Stress getStress() {
        return stress;
    }

    /**
     * Sets the value of the stress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stress }
     *     
     */
    public void setStress(Stress value) {
        this.stress = value;
    }

    /**
     * Gets the value of the unstress property.
     * 
     * @return
     *     possible object is
     *     {@link Unstress }
     *     
     */
    public Unstress getUnstress() {
        return unstress;
    }

    /**
     * Sets the value of the unstress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unstress }
     *     
     */
    public void setUnstress(Unstress value) {
        this.unstress = value;
    }

    /**
     * Gets the value of the softAccent property.
     * 
     * @return
     *     possible object is
     *     {@link SoftAccent }
     *     
     */
    public SoftAccent getSoftAccent() {
        return softAccent;
    }

    /**
     * Sets the value of the softAccent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftAccent }
     *     
     */
    public void setSoftAccent(SoftAccent value) {
        this.softAccent = value;
    }

    /**
     * Gets the value of the otherArticulation property.
     * 
     * @return
     *     possible object is
     *     {@link OtherArticulation }
     *     
     */
    public OtherArticulation getOtherArticulation() {
        return otherArticulation;
    }

    /**
     * Sets the value of the otherArticulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherArticulation }
     *     
     */
    public void setOtherArticulation(OtherArticulation value) {
        this.otherArticulation = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}

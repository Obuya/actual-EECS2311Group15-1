//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.25 at 11:44:40 AM EST 
//


package drumTag;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{}beat-unit"/&gt;
 *           &lt;element ref="{}beat-unit-dot"/&gt;
 *           &lt;element ref="{}beat-unit-tied"/&gt;
 *           &lt;element ref="{}per-minute"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}metronome-arrows"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{}metronome-note"/&gt;
 *           &lt;element ref="{}metronome-relation"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="color" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="default-x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="default-y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="font-family" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="font-size" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="font-style" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="font-weight" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="halign" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="justify" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="parentheses" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="relative-x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="relative-y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="valign" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "beatUnitOrBeatUnitDotOrBeatUnitTied",
    "metronomeArrows",
    "metronomeNoteOrMetronomeRelation"
})
@XmlRootElement(name = "metronome")
public class Metronome {

    @XmlElementRefs({
        @XmlElementRef(name = "beat-unit", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "beat-unit-dot", type = BeatUnitDot.class, required = false),
        @XmlElementRef(name = "beat-unit-tied", type = BeatUnitTied.class, required = false),
        @XmlElementRef(name = "per-minute", type = PerMinute.class, required = false)
    })
    protected List<Object> beatUnitOrBeatUnitDotOrBeatUnitTied;
    @XmlElement(name = "metronome-arrows", required = true)
    protected MetronomeArrows metronomeArrows;
    @XmlElementRefs({
        @XmlElementRef(name = "metronome-note", type = MetronomeNote.class, required = false),
        @XmlElementRef(name = "metronome-relation", type = JAXBElement.class, required = false)
    })
    protected List<Object> metronomeNoteOrMetronomeRelation;
    @XmlAttribute(name = "color", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String color;
    @XmlAttribute(name = "default-x", required = true)
    protected BigDecimal defaultX;
    @XmlAttribute(name = "default-y", required = true)
    protected BigDecimal defaultY;
    @XmlAttribute(name = "font-family", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String fontFamily;
    @XmlAttribute(name = "font-size", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String fontSize;
    @XmlAttribute(name = "font-style", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String fontStyle;
    @XmlAttribute(name = "font-weight", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String fontWeight;
    @XmlAttribute(name = "halign", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String halign;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String id;
    @XmlAttribute(name = "justify", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String justify;
    @XmlAttribute(name = "parentheses", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String parentheses;
    @XmlAttribute(name = "relative-x", required = true)
    protected BigDecimal relativeX;
    @XmlAttribute(name = "relative-y", required = true)
    protected BigDecimal relativeY;
    @XmlAttribute(name = "valign", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String valign;

    /**
     * Gets the value of the beatUnitOrBeatUnitDotOrBeatUnitTied property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beatUnitOrBeatUnitDotOrBeatUnitTied property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeatUnitOrBeatUnitDotOrBeatUnitTied().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     * {@link BeatUnitDot }
     * {@link BeatUnitTied }
     * {@link PerMinute }
     * 
     * 
     */
    public List<Object> getBeatUnitOrBeatUnitDotOrBeatUnitTied() {
        if (beatUnitOrBeatUnitDotOrBeatUnitTied == null) {
            beatUnitOrBeatUnitDotOrBeatUnitTied = new ArrayList<Object>();
        }
        return this.beatUnitOrBeatUnitDotOrBeatUnitTied;
    }

    /**
     * Gets the value of the metronomeArrows property.
     * 
     * @return
     *     possible object is
     *     {@link MetronomeArrows }
     *     
     */
    public MetronomeArrows getMetronomeArrows() {
        return metronomeArrows;
    }

    /**
     * Sets the value of the metronomeArrows property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetronomeArrows }
     *     
     */
    public void setMetronomeArrows(MetronomeArrows value) {
        this.metronomeArrows = value;
    }

    /**
     * Gets the value of the metronomeNoteOrMetronomeRelation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metronomeNoteOrMetronomeRelation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetronomeNoteOrMetronomeRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetronomeNote }
     * {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     * 
     * 
     */
    public List<Object> getMetronomeNoteOrMetronomeRelation() {
        if (metronomeNoteOrMetronomeRelation == null) {
            metronomeNoteOrMetronomeRelation = new ArrayList<Object>();
        }
        return this.metronomeNoteOrMetronomeRelation;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setColor(java.lang.String value) {
        this.color = value;
    }

    /**
     * Gets the value of the defaultX property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultX() {
        return defaultX;
    }

    /**
     * Sets the value of the defaultX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultX(BigDecimal value) {
        this.defaultX = value;
    }

    /**
     * Gets the value of the defaultY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultY() {
        return defaultY;
    }

    /**
     * Sets the value of the defaultY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultY(BigDecimal value) {
        this.defaultY = value;
    }

    /**
     * Gets the value of the fontFamily property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the value of the fontFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFontFamily(java.lang.String value) {
        this.fontFamily = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFontSize(java.lang.String value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the fontStyle property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFontStyle() {
        return fontStyle;
    }

    /**
     * Sets the value of the fontStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFontStyle(java.lang.String value) {
        this.fontStyle = value;
    }

    /**
     * Gets the value of the fontWeight property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFontWeight() {
        return fontWeight;
    }

    /**
     * Sets the value of the fontWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFontWeight(java.lang.String value) {
        this.fontWeight = value;
    }

    /**
     * Gets the value of the halign property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getHalign() {
        return halign;
    }

    /**
     * Sets the value of the halign property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setHalign(java.lang.String value) {
        this.halign = value;
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

    /**
     * Gets the value of the justify property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getJustify() {
        return justify;
    }

    /**
     * Sets the value of the justify property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setJustify(java.lang.String value) {
        this.justify = value;
    }

    /**
     * Gets the value of the parentheses property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getParentheses() {
        return parentheses;
    }

    /**
     * Sets the value of the parentheses property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setParentheses(java.lang.String value) {
        this.parentheses = value;
    }

    /**
     * Gets the value of the relativeX property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRelativeX() {
        return relativeX;
    }

    /**
     * Sets the value of the relativeX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRelativeX(BigDecimal value) {
        this.relativeX = value;
    }

    /**
     * Gets the value of the relativeY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRelativeY() {
        return relativeY;
    }

    /**
     * Sets the value of the relativeY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRelativeY(BigDecimal value) {
        this.relativeY = value;
    }

    /**
     * Gets the value of the valign property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getValign() {
        return valign;
    }

    /**
     * Sets the value of the valign property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setValign(java.lang.String value) {
        this.valign = value;
    }

}

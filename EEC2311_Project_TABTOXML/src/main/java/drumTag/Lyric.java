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
 *           &lt;element ref="{}elision"/&gt;
 *           &lt;element ref="{}syllabic"/&gt;
 *           &lt;element ref="{}text"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}extend" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}laughing"/&gt;
 *         &lt;element ref="{}humming"/&gt;
 *         &lt;element ref="{}end-line"/&gt;
 *         &lt;element ref="{}end-paragraph"/&gt;
 *         &lt;element ref="{}footnote"/&gt;
 *         &lt;element ref="{}level"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="color" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="default-x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="default-y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="justify" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="placement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="print-object" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="relative-x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="relative-y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="time-only" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "elisionOrSyllabicOrText",
    "extend",
    "laughing",
    "humming",
    "endLine",
    "endParagraph",
    "footnote",
    "level"
})
@XmlRootElement(name = "lyric")
public class Lyric {

    @XmlElementRefs({
        @XmlElementRef(name = "elision", type = Elision.class, required = false),
        @XmlElementRef(name = "syllabic", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "text", type = Text.class, required = false)
    })
    protected List<Object> elisionOrSyllabicOrText;
    @XmlElement(required = true)
    protected List<Extend> extend;
    @XmlElement(required = true)
    protected Laughing laughing;
    @XmlElement(required = true)
    protected Humming humming;
    @XmlElement(name = "end-line", required = true)
    protected EndLine endLine;
    @XmlElement(name = "end-paragraph", required = true)
    protected EndParagraph endParagraph;
    @XmlElement(required = true)
    protected Footnote footnote;
    @XmlElement(required = true)
    protected Level level;
    @XmlAttribute(name = "color", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String color;
    @XmlAttribute(name = "default-x", required = true)
    protected BigDecimal defaultX;
    @XmlAttribute(name = "default-y", required = true)
    protected BigDecimal defaultY;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String id;
    @XmlAttribute(name = "justify", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String justify;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String name;
    @XmlAttribute(name = "number", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String number;
    @XmlAttribute(name = "placement", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String placement;
    @XmlAttribute(name = "print-object", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String printObject;
    @XmlAttribute(name = "relative-x", required = true)
    protected BigDecimal relativeX;
    @XmlAttribute(name = "relative-y", required = true)
    protected BigDecimal relativeY;
    @XmlAttribute(name = "time-only", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String timeOnly;

    /**
     * Gets the value of the elisionOrSyllabicOrText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elisionOrSyllabicOrText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElisionOrSyllabicOrText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Elision }
     * {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     * {@link Text }
     * 
     * 
     */
    public List<Object> getElisionOrSyllabicOrText() {
        if (elisionOrSyllabicOrText == null) {
            elisionOrSyllabicOrText = new ArrayList<Object>();
        }
        return this.elisionOrSyllabicOrText;
    }

    /**
     * Gets the value of the extend property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extend property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extend }
     * 
     * 
     */
    public List<Extend> getExtend() {
        if (extend == null) {
            extend = new ArrayList<Extend>();
        }
        return this.extend;
    }

    /**
     * Gets the value of the laughing property.
     * 
     * @return
     *     possible object is
     *     {@link Laughing }
     *     
     */
    public Laughing getLaughing() {
        return laughing;
    }

    /**
     * Sets the value of the laughing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Laughing }
     *     
     */
    public void setLaughing(Laughing value) {
        this.laughing = value;
    }

    /**
     * Gets the value of the humming property.
     * 
     * @return
     *     possible object is
     *     {@link Humming }
     *     
     */
    public Humming getHumming() {
        return humming;
    }

    /**
     * Sets the value of the humming property.
     * 
     * @param value
     *     allowed object is
     *     {@link Humming }
     *     
     */
    public void setHumming(Humming value) {
        this.humming = value;
    }

    /**
     * Gets the value of the endLine property.
     * 
     * @return
     *     possible object is
     *     {@link EndLine }
     *     
     */
    public EndLine getEndLine() {
        return endLine;
    }

    /**
     * Sets the value of the endLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndLine }
     *     
     */
    public void setEndLine(EndLine value) {
        this.endLine = value;
    }

    /**
     * Gets the value of the endParagraph property.
     * 
     * @return
     *     possible object is
     *     {@link EndParagraph }
     *     
     */
    public EndParagraph getEndParagraph() {
        return endParagraph;
    }

    /**
     * Sets the value of the endParagraph property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndParagraph }
     *     
     */
    public void setEndParagraph(EndParagraph value) {
        this.endParagraph = value;
    }

    /**
     * Gets the value of the footnote property.
     * 
     * @return
     *     possible object is
     *     {@link Footnote }
     *     
     */
    public Footnote getFootnote() {
        return footnote;
    }

    /**
     * Sets the value of the footnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Footnote }
     *     
     */
    public void setFootnote(Footnote value) {
        this.footnote = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Level }
     *     
     */
    public Level getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Level }
     *     
     */
    public void setLevel(Level value) {
        this.level = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setName(java.lang.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNumber(java.lang.String value) {
        this.number = value;
    }

    /**
     * Gets the value of the placement property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPlacement() {
        return placement;
    }

    /**
     * Sets the value of the placement property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPlacement(java.lang.String value) {
        this.placement = value;
    }

    /**
     * Gets the value of the printObject property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPrintObject() {
        return printObject;
    }

    /**
     * Sets the value of the printObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPrintObject(java.lang.String value) {
        this.printObject = value;
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
     * Gets the value of the timeOnly property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTimeOnly() {
        return timeOnly;
    }

    /**
     * Sets the value of the timeOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTimeOnly(java.lang.String value) {
        this.timeOnly = value;
    }

}

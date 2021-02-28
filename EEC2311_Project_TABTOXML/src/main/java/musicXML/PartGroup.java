//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.25 at 11:44:40 AM EST 
//


package musicXML;

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
 *         &lt;element ref="{}group-name"/&gt;
 *         &lt;element ref="{}group-name-display"/&gt;
 *         &lt;element ref="{}group-abbreviation"/&gt;
 *         &lt;element ref="{}group-abbreviation-display"/&gt;
 *         &lt;element ref="{}group-symbol"/&gt;
 *         &lt;element ref="{}group-barline"/&gt;
 *         &lt;element ref="{}group-time"/&gt;
 *         &lt;element ref="{}footnote"/&gt;
 *         &lt;element ref="{}level"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "groupName",
    "groupNameDisplay",
    "groupAbbreviation",
    "groupAbbreviationDisplay",
    "groupSymbol",
    "groupBarline",
    "groupTime",
    "footnote",
    "level"
})
@XmlRootElement(name = "part-group")
public class PartGroup {

    @XmlElement(name = "group-name", required = true)
    protected GroupName groupName;
    @XmlElement(name = "group-name-display", required = true)
    protected GroupNameDisplay groupNameDisplay;
    @XmlElement(name = "group-abbreviation", required = true)
    protected GroupAbbreviation groupAbbreviation;
    @XmlElement(name = "group-abbreviation-display", required = true)
    protected GroupAbbreviationDisplay groupAbbreviationDisplay;
    @XmlElement(name = "group-symbol", required = true)
    protected GroupSymbol groupSymbol;
    @XmlElement(name = "group-barline", required = true)
    protected GroupBarline groupBarline;
    @XmlElement(name = "group-time", required = true)
    protected GroupTime groupTime;
    @XmlElement(required = true)
    protected Footnote footnote;
    @XmlElement(required = true)
    protected Level level;
    @XmlAttribute(name = "number", required = true)
    protected BigInteger number;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected java.lang.String type;

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link GroupName }
     *     
     */
    public GroupName getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupName }
     *     
     */
    public void setGroupName(GroupName value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the groupNameDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link GroupNameDisplay }
     *     
     */
    public GroupNameDisplay getGroupNameDisplay() {
        return groupNameDisplay;
    }

    /**
     * Sets the value of the groupNameDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupNameDisplay }
     *     
     */
    public void setGroupNameDisplay(GroupNameDisplay value) {
        this.groupNameDisplay = value;
    }

    /**
     * Gets the value of the groupAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link GroupAbbreviation }
     *     
     */
    public GroupAbbreviation getGroupAbbreviation() {
        return groupAbbreviation;
    }

    /**
     * Sets the value of the groupAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupAbbreviation }
     *     
     */
    public void setGroupAbbreviation(GroupAbbreviation value) {
        this.groupAbbreviation = value;
    }

    /**
     * Gets the value of the groupAbbreviationDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link GroupAbbreviationDisplay }
     *     
     */
    public GroupAbbreviationDisplay getGroupAbbreviationDisplay() {
        return groupAbbreviationDisplay;
    }

    /**
     * Sets the value of the groupAbbreviationDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupAbbreviationDisplay }
     *     
     */
    public void setGroupAbbreviationDisplay(GroupAbbreviationDisplay value) {
        this.groupAbbreviationDisplay = value;
    }

    /**
     * Gets the value of the groupSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link GroupSymbol }
     *     
     */
    public GroupSymbol getGroupSymbol() {
        return groupSymbol;
    }

    /**
     * Sets the value of the groupSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupSymbol }
     *     
     */
    public void setGroupSymbol(GroupSymbol value) {
        this.groupSymbol = value;
    }

    /**
     * Gets the value of the groupBarline property.
     * 
     * @return
     *     possible object is
     *     {@link GroupBarline }
     *     
     */
    public GroupBarline getGroupBarline() {
        return groupBarline;
    }

    /**
     * Sets the value of the groupBarline property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupBarline }
     *     
     */
    public void setGroupBarline(GroupBarline value) {
        this.groupBarline = value;
    }

    /**
     * Gets the value of the groupTime property.
     * 
     * @return
     *     possible object is
     *     {@link GroupTime }
     *     
     */
    public GroupTime getGroupTime() {
        return groupTime;
    }

    /**
     * Sets the value of the groupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupTime }
     *     
     */
    public void setGroupTime(GroupTime value) {
        this.groupTime = value;
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
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setType(java.lang.String value) {
        this.type = value;
    }

}
//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.08 um 12:13:24 PM CEST 
//


package net.opengis.wfs._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.fes._2.AbstractAdhocQueryExpressionType;


/**
 * <p>Java-Klasse für QueryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/fes/2.0}AbstractAdhocQueryExpressionType">
 *       &lt;attribute name="srsName" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="featureVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isGetFeatureById" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryType")
public class QueryType
    extends AbstractAdhocQueryExpressionType
{

    @XmlAttribute(name = "srsName")
    @XmlSchemaType(name = "anyURI")
    protected String srsName;
    @XmlAttribute(name = "featureVersion")
    protected String featureVersion;
    @XmlAttribute(name = "isGetFeatureById")
    protected Boolean isGetFeatureById;

    /**
     * Ruft den Wert der srsName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Legt den Wert der srsName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    public boolean isSetSrsName() {
        return (this.srsName!= null);
    }

    /**
     * Ruft den Wert der featureVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureVersion() {
        return featureVersion;
    }

    /**
     * Legt den Wert der featureVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureVersion(String value) {
        this.featureVersion = value;
    }

    public boolean isSetFeatureVersion() {
        return (this.featureVersion!= null);
    }

    /**
     * Ruft den Wert der isGetFeatureById-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsGetFeatureById() {
        if (isGetFeatureById == null) {
            return false;
        } else {
            return isGetFeatureById;
        }
    }

    /**
     * Legt den Wert der isGetFeatureById-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGetFeatureById(boolean value) {
        this.isGetFeatureById = value;
    }

    public boolean isSetIsGetFeatureById() {
        return (this.isGetFeatureById!= null);
    }

    public void unsetIsGetFeatureById() {
        this.isGetFeatureById = null;
    }

}

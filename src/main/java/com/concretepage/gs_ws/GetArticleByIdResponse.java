//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.09 at 09:23:52 PM IST 
//


package com.concretepage.gs_ws;

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
 *         &lt;element name="articleInfo" type="{http://www.concretepage.com/article-ws}articleInfo"/&gt;
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
    "articleInfo"
})
@XmlRootElement(name = "getArticleByIdResponse")
public class GetArticleByIdResponse {

    @XmlElement(required = true)
    protected ArticleInfo articleInfo;

    /**
     * Gets the value of the articleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleInfo }
     *     
     */
    public ArticleInfo getArticleInfo() {
        return articleInfo;
    }

    /**
     * Sets the value of the articleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleInfo }
     *     
     */
    public void setArticleInfo(ArticleInfo value) {
        this.articleInfo = value;
    }

}

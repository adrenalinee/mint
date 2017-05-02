package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_api.model.Brand;
import com.coupang.apigateway.services.search_api.model.Geometry;
import com.coupang.apigateway.services.search_api.model.NoHitResult;
import com.coupang.apigateway.services.search_api.model.RelatedKeywords;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class Metadata   {
  
  private List<RelatedKeywords> relatedKeywords = new ArrayList<RelatedKeywords>();
  private NoHitResult noHit = null;


  public enum KeywordTypesEnum {
    LOCATION("LOCATION"),
    BRAND("BRAND");

    private String value;

    KeywordTypesEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private List<KeywordTypesEnum> keywordTypes = new ArrayList<KeywordTypesEnum>();
  private Geometry geometry = null;
  private List<Brand> brands = new ArrayList<Brand>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("relatedKeywords")
  @com.fasterxml.jackson.annotation.JsonProperty("relatedKeywords")
  public List<RelatedKeywords> getRelatedKeywords() {
    return relatedKeywords;
  }
  
  /**
   **/
  public void setRelatedKeywords(List<RelatedKeywords> relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("noHit")
  @com.fasterxml.jackson.annotation.JsonProperty("noHit")
  public NoHitResult getNoHit() {
    return noHit;
  }
  
  /**
   **/
  public void setNoHit(NoHitResult noHit) {
    this.noHit = noHit;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("keywordTypes")
  @com.fasterxml.jackson.annotation.JsonProperty("keywordTypes")
  public List<KeywordTypesEnum> getKeywordTypes() {
    return keywordTypes;
  }
  
  /**
   **/
  public void setKeywordTypes(List<KeywordTypesEnum> keywordTypes) {
    this.keywordTypes = keywordTypes;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("geometry")
  @com.fasterxml.jackson.annotation.JsonProperty("geometry")
  public Geometry getGeometry() {
    return geometry;
  }
  
  /**
   **/
  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("brands")
  @com.fasterxml.jackson.annotation.JsonProperty("brands")
  public List<Brand> getBrands() {
    return brands;
  }
  
  /**
   **/
  public void setBrands(List<Brand> brands) {
    this.brands = brands;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.relatedKeywords, metadata.relatedKeywords) &&
        Objects.equals(this.noHit, metadata.noHit) &&
        Objects.equals(this.keywordTypes, metadata.keywordTypes) &&
        Objects.equals(this.geometry, metadata.geometry) &&
        Objects.equals(this.brands, metadata.brands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedKeywords, noHit, keywordTypes, geometry, brands);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    
    sb.append("    relatedKeywords: ").append(toIndentedString(relatedKeywords)).append("\n");
    sb.append("    noHit: ").append(toIndentedString(noHit)).append("\n");
    sb.append("    keywordTypes: ").append(toIndentedString(keywordTypes)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static MetadataBuilder builder() {
    return new MetadataBuilder();
  }

  public static class MetadataBuilder {

    private List<RelatedKeywords> relatedKeywords = new ArrayList<RelatedKeywords>();
    private NoHitResult noHit = null;
    private List<KeywordTypesEnum> keywordTypes = new ArrayList<KeywordTypesEnum>();
    private Geometry geometry = null;
    private List<Brand> brands = new ArrayList<Brand>();
    

    MetadataBuilder() {
    }

    /**
     **/
    public MetadataBuilder relatedKeywords(List<RelatedKeywords> relatedKeywords) {
      this.relatedKeywords = relatedKeywords;
      return this;
    }

    /**
     **/
    public MetadataBuilder noHit(NoHitResult noHit) {
      this.noHit = noHit;
      return this;
    }

    /**
     **/
    public MetadataBuilder keywordTypes(List<KeywordTypesEnum> keywordTypes) {
      this.keywordTypes = keywordTypes;
      return this;
    }

    /**
     **/
    public MetadataBuilder geometry(Geometry geometry) {
      this.geometry = geometry;
      return this;
    }

    /**
     **/
    public MetadataBuilder brands(List<Brand> brands) {
      this.brands = brands;
      return this;
    }


    public Metadata build() {
      Metadata metadata = new Metadata();
      metadata.setRelatedKeywords(this.relatedKeywords);
      metadata.setNoHit(this.noHit);
      metadata.setKeywordTypes(this.keywordTypes);
      metadata.setGeometry(this.geometry);
      metadata.setBrands(this.brands);
      return metadata;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MetadataBuilder {\n");
      
      sb.append("    relatedKeywords: ").append(toIndentedString(relatedKeywords)).append("\n");
      sb.append("    noHit: ").append(toIndentedString(noHit)).append("\n");
      sb.append("    keywordTypes: ").append(toIndentedString(keywordTypes)).append("\n");
      sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
      sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
      sb.append("}");
      return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
      if (o == null) {
        return "null";
      }
      return o.toString().replace("\n", "\n    ");
    }
  }
}


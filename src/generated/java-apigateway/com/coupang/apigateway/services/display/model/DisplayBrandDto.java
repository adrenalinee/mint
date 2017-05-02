package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayBrandAttributeDto;
import com.coupang.apigateway.services.display.model.DisplayBrandMetaDto;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayBrandDto   {
  
  private Boolean used = null;
  private String type = null;
  private List<String> synonyms = new ArrayList<String>();
  private Map<Long, String> subBrand = new HashMap<Long, String>();
  private String name = null;
  private Long modifiedAt = null;
  private Integer itemCount = null;
  private Long id = null;
  private Boolean exposeConsonantHeader = null;
  private List<DisplayBrandMetaDto> displayBrandMetaDtoList = new ArrayList<DisplayBrandMetaDto>();
  private Long createdAt = null;
  private String consonant = null;
  private String code = null;
  private String brandShopLevel = null;
  private Boolean brandShopActivated = null;
  private List<DisplayBrandAttributeDto> attributes = new ArrayList<DisplayBrandAttributeDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("used")
  @com.fasterxml.jackson.annotation.JsonProperty("used")
  public Boolean getUsed() {
    return used;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isUsed() {
    return used == null ? false : used;
  }
  
  /**
   **/
  public void setUsed(Boolean used) {
    this.used = used;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("type")
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  public String getType() {
    return type;
  }
  
  /**
   **/
  public void setType(String type) {
    this.type = type;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("synonyms")
  @com.fasterxml.jackson.annotation.JsonProperty("synonyms")
  public List<String> getSynonyms() {
    return synonyms;
  }
  
  /**
   **/
  public void setSynonyms(List<String> synonyms) {
    this.synonyms = synonyms;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("subBrand")
  @com.fasterxml.jackson.annotation.JsonProperty("subBrand")
  public Map<Long, String> getSubBrand() {
    return subBrand;
  }
  
  /**
   **/
  public void setSubBrand(Map<Long, String> subBrand) {
    this.subBrand = subBrand;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("name")
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  public String getName() {
    return name;
  }
  
  /**
   **/
  public void setName(String name) {
    this.name = name;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("modifiedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("modifiedAt")
  public Long getModifiedAt() {
    return modifiedAt;
  }
  
  /**
   **/
  public void setModifiedAt(Long modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemCount")
  @com.fasterxml.jackson.annotation.JsonProperty("itemCount")
  public Integer getItemCount() {
    return itemCount;
  }
  
  /**
   **/
  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("id")
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  public Long getId() {
    return id;
  }
  
  /**
   **/
  public void setId(Long id) {
    this.id = id;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("exposeConsonantHeader")
  @com.fasterxml.jackson.annotation.JsonProperty("exposeConsonantHeader")
  public Boolean getExposeConsonantHeader() {
    return exposeConsonantHeader;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isExposeConsonantHeader() {
    return exposeConsonantHeader == null ? false : exposeConsonantHeader;
  }
  
  /**
   **/
  public void setExposeConsonantHeader(Boolean exposeConsonantHeader) {
    this.exposeConsonantHeader = exposeConsonantHeader;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayBrandMetaDtoList")
  @com.fasterxml.jackson.annotation.JsonProperty("displayBrandMetaDtoList")
  public List<DisplayBrandMetaDto> getDisplayBrandMetaDtoList() {
    return displayBrandMetaDtoList;
  }
  
  /**
   **/
  public void setDisplayBrandMetaDtoList(List<DisplayBrandMetaDto> displayBrandMetaDtoList) {
    this.displayBrandMetaDtoList = displayBrandMetaDtoList;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("createdAt")
  @com.fasterxml.jackson.annotation.JsonProperty("createdAt")
  public Long getCreatedAt() {
    return createdAt;
  }
  
  /**
   **/
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("consonant")
  @com.fasterxml.jackson.annotation.JsonProperty("consonant")
  public String getConsonant() {
    return consonant;
  }
  
  /**
   **/
  public void setConsonant(String consonant) {
    this.consonant = consonant;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("code")
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  public String getCode() {
    return code;
  }
  
  /**
   **/
  public void setCode(String code) {
    this.code = code;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("brandShopLevel")
  @com.fasterxml.jackson.annotation.JsonProperty("brandShopLevel")
  public String getBrandShopLevel() {
    return brandShopLevel;
  }
  
  /**
   **/
  public void setBrandShopLevel(String brandShopLevel) {
    this.brandShopLevel = brandShopLevel;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("brandShopActivated")
  @com.fasterxml.jackson.annotation.JsonProperty("brandShopActivated")
  public Boolean getBrandShopActivated() {
    return brandShopActivated;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isBrandShopActivated() {
    return brandShopActivated == null ? false : brandShopActivated;
  }
  
  /**
   **/
  public void setBrandShopActivated(Boolean brandShopActivated) {
    this.brandShopActivated = brandShopActivated;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributes")
  @com.fasterxml.jackson.annotation.JsonProperty("attributes")
  public List<DisplayBrandAttributeDto> getAttributes() {
    return attributes;
  }
  
  /**
   **/
  public void setAttributes(List<DisplayBrandAttributeDto> attributes) {
    this.attributes = attributes;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayBrandDto displayBrandDto = (DisplayBrandDto) o;
    return Objects.equals(this.used, displayBrandDto.used) &&
        Objects.equals(this.type, displayBrandDto.type) &&
        Objects.equals(this.synonyms, displayBrandDto.synonyms) &&
        Objects.equals(this.subBrand, displayBrandDto.subBrand) &&
        Objects.equals(this.name, displayBrandDto.name) &&
        Objects.equals(this.modifiedAt, displayBrandDto.modifiedAt) &&
        Objects.equals(this.itemCount, displayBrandDto.itemCount) &&
        Objects.equals(this.id, displayBrandDto.id) &&
        Objects.equals(this.exposeConsonantHeader, displayBrandDto.exposeConsonantHeader) &&
        Objects.equals(this.displayBrandMetaDtoList, displayBrandDto.displayBrandMetaDtoList) &&
        Objects.equals(this.createdAt, displayBrandDto.createdAt) &&
        Objects.equals(this.consonant, displayBrandDto.consonant) &&
        Objects.equals(this.code, displayBrandDto.code) &&
        Objects.equals(this.brandShopLevel, displayBrandDto.brandShopLevel) &&
        Objects.equals(this.brandShopActivated, displayBrandDto.brandShopActivated) &&
        Objects.equals(this.attributes, displayBrandDto.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(used, type, synonyms, subBrand, name, modifiedAt, itemCount, id, exposeConsonantHeader, displayBrandMetaDtoList, createdAt, consonant, code, brandShopLevel, brandShopActivated, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayBrandDto {\n");
    
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    subBrand: ").append(toIndentedString(subBrand)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    exposeConsonantHeader: ").append(toIndentedString(exposeConsonantHeader)).append("\n");
    sb.append("    displayBrandMetaDtoList: ").append(toIndentedString(displayBrandMetaDtoList)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    consonant: ").append(toIndentedString(consonant)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    brandShopLevel: ").append(toIndentedString(brandShopLevel)).append("\n");
    sb.append("    brandShopActivated: ").append(toIndentedString(brandShopActivated)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

  public static DisplayBrandDtoBuilder builder() {
    return new DisplayBrandDtoBuilder();
  }

  public static class DisplayBrandDtoBuilder {

    private Boolean used = null;
    private String type = null;
    private List<String> synonyms = new ArrayList<String>();
    private Map<Long, String> subBrand = new HashMap<Long, String>();
    private String name = null;
    private Long modifiedAt = null;
    private Integer itemCount = null;
    private Long id = null;
    private Boolean exposeConsonantHeader = null;
    private List<DisplayBrandMetaDto> displayBrandMetaDtoList = new ArrayList<DisplayBrandMetaDto>();
    private Long createdAt = null;
    private String consonant = null;
    private String code = null;
    private String brandShopLevel = null;
    private Boolean brandShopActivated = null;
    private List<DisplayBrandAttributeDto> attributes = new ArrayList<DisplayBrandAttributeDto>();
    

    DisplayBrandDtoBuilder() {
    }

    /**
     **/
    public DisplayBrandDtoBuilder used(Boolean used) {
      this.used = used;
      return this;
    }

    /**
     **/
    public DisplayBrandDtoBuilder type(String type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public DisplayBrandDtoBuilder synonyms(List<String> synonyms) {
      this.synonyms = synonyms;
      return this;
    }

    /**
     **/
    public DisplayBrandDtoBuilder subBrand(Map<Long, String> subBrand) {
      this.subBrand = subBrand;
      return this;
    }

    /**
     **/
    public DisplayBrandDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public DisplayBrandDtoBuilder modifiedAt(Long modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    /**
     **/
    public DisplayBrandDtoBuilder itemCount(Integer itemCount) {
      this.itemCount = itemCount;
      return this;
    }

    /**
     **/
    public DisplayBrandDtoBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public DisplayBrandDtoBuilder exposeConsonantHeader(Boolean exposeConsonantHeader) {
      this.exposeConsonantHeader = exposeConsonantHeader;
      return this;
    }

    /**
     **/
    public DisplayBrandDtoBuilder displayBrandMetaDtoList(List<DisplayBrandMetaDto> displayBrandMetaDtoList) {
      this.displayBrandMetaDtoList = displayBrandMetaDtoList;
      return this;
    }

    /**
     **/
    public DisplayBrandDtoBuilder createdAt(Long createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     **/
    public DisplayBrandDtoBuilder consonant(String consonant) {
      this.consonant = consonant;
      return this;
    }

    /**
     **/
    public DisplayBrandDtoBuilder code(String code) {
      this.code = code;
      return this;
    }

    /**
     **/
    public DisplayBrandDtoBuilder brandShopLevel(String brandShopLevel) {
      this.brandShopLevel = brandShopLevel;
      return this;
    }

    /**
     **/
    public DisplayBrandDtoBuilder brandShopActivated(Boolean brandShopActivated) {
      this.brandShopActivated = brandShopActivated;
      return this;
    }

    /**
     **/
    public DisplayBrandDtoBuilder attributes(List<DisplayBrandAttributeDto> attributes) {
      this.attributes = attributes;
      return this;
    }


    public DisplayBrandDto build() {
      DisplayBrandDto displayBrandDto = new DisplayBrandDto();
      displayBrandDto.setUsed(this.used);
      displayBrandDto.setType(this.type);
      displayBrandDto.setSynonyms(this.synonyms);
      displayBrandDto.setSubBrand(this.subBrand);
      displayBrandDto.setName(this.name);
      displayBrandDto.setModifiedAt(this.modifiedAt);
      displayBrandDto.setItemCount(this.itemCount);
      displayBrandDto.setId(this.id);
      displayBrandDto.setExposeConsonantHeader(this.exposeConsonantHeader);
      displayBrandDto.setDisplayBrandMetaDtoList(this.displayBrandMetaDtoList);
      displayBrandDto.setCreatedAt(this.createdAt);
      displayBrandDto.setConsonant(this.consonant);
      displayBrandDto.setCode(this.code);
      displayBrandDto.setBrandShopLevel(this.brandShopLevel);
      displayBrandDto.setBrandShopActivated(this.brandShopActivated);
      displayBrandDto.setAttributes(this.attributes);
      return displayBrandDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayBrandDtoBuilder {\n");
      
      sb.append("    used: ").append(toIndentedString(used)).append("\n");
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
      sb.append("    subBrand: ").append(toIndentedString(subBrand)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
      sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    exposeConsonantHeader: ").append(toIndentedString(exposeConsonantHeader)).append("\n");
      sb.append("    displayBrandMetaDtoList: ").append(toIndentedString(displayBrandMetaDtoList)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
      sb.append("    consonant: ").append(toIndentedString(consonant)).append("\n");
      sb.append("    code: ").append(toIndentedString(code)).append("\n");
      sb.append("    brandShopLevel: ").append(toIndentedString(brandShopLevel)).append("\n");
      sb.append("    brandShopActivated: ").append(toIndentedString(brandShopActivated)).append("\n");
      sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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


package com.coupang.apigateway.services.catalog_compat_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.107+09:00")
public class AttributeTypeDto   {
  
  private Long weight = null;
  private Boolean valid = null;
  private String unitGroupName = null;
  private String unitGroup = null;
  private String name = null;
  private Boolean mandatory = null;
  private Boolean isExpose = null;
  private String inputType = null;
  private String inputHint = null;
  private String inputGuide = null;
  private String divisionType = null;
  private String description = null;
  private String dataType = null;
  private Long attributeTypeId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("weight")
  @com.fasterxml.jackson.annotation.JsonProperty("weight")
  public Long getWeight() {
    return weight;
  }
  
  /**
   **/
  public void setWeight(Long weight) {
    this.weight = weight;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("valid")
  @com.fasterxml.jackson.annotation.JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isValid() {
    return valid == null ? false : valid;
  }
  
  /**
   **/
  public void setValid(Boolean valid) {
    this.valid = valid;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("unitGroupName")
  @com.fasterxml.jackson.annotation.JsonProperty("unitGroupName")
  public String getUnitGroupName() {
    return unitGroupName;
  }
  
  /**
   **/
  public void setUnitGroupName(String unitGroupName) {
    this.unitGroupName = unitGroupName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("unitGroup")
  @com.fasterxml.jackson.annotation.JsonProperty("unitGroup")
  public String getUnitGroup() {
    return unitGroup;
  }
  
  /**
   **/
  public void setUnitGroup(String unitGroup) {
    this.unitGroup = unitGroup;
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
  @org.codehaus.jackson.annotate.JsonProperty("mandatory")
  @com.fasterxml.jackson.annotation.JsonProperty("mandatory")
  public Boolean getMandatory() {
    return mandatory;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isMandatory() {
    return mandatory == null ? false : mandatory;
  }
  
  /**
   **/
  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isExpose")
  @com.fasterxml.jackson.annotation.JsonProperty("isExpose")
  public Boolean getIsExpose() {
    return isExpose;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsExpose() {
    return isExpose == null ? false : isExpose;
  }
  
  /**
   **/
  public void setIsExpose(Boolean isExpose) {
    this.isExpose = isExpose;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("inputType")
  @com.fasterxml.jackson.annotation.JsonProperty("inputType")
  public String getInputType() {
    return inputType;
  }
  
  /**
   **/
  public void setInputType(String inputType) {
    this.inputType = inputType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("inputHint")
  @com.fasterxml.jackson.annotation.JsonProperty("inputHint")
  public String getInputHint() {
    return inputHint;
  }
  
  /**
   **/
  public void setInputHint(String inputHint) {
    this.inputHint = inputHint;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("inputGuide")
  @com.fasterxml.jackson.annotation.JsonProperty("inputGuide")
  public String getInputGuide() {
    return inputGuide;
  }
  
  /**
   **/
  public void setInputGuide(String inputGuide) {
    this.inputGuide = inputGuide;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("divisionType")
  @com.fasterxml.jackson.annotation.JsonProperty("divisionType")
  public String getDivisionType() {
    return divisionType;
  }
  
  /**
   **/
  public void setDivisionType(String divisionType) {
    this.divisionType = divisionType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("description")
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  public String getDescription() {
    return description;
  }
  
  /**
   **/
  public void setDescription(String description) {
    this.description = description;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("dataType")
  @com.fasterxml.jackson.annotation.JsonProperty("dataType")
  public String getDataType() {
    return dataType;
  }
  
  /**
   **/
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributeTypeId")
  @com.fasterxml.jackson.annotation.JsonProperty("attributeTypeId")
  public Long getAttributeTypeId() {
    return attributeTypeId;
  }
  
  /**
   **/
  public void setAttributeTypeId(Long attributeTypeId) {
    this.attributeTypeId = attributeTypeId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeTypeDto attributeTypeDto = (AttributeTypeDto) o;
    return Objects.equals(this.weight, attributeTypeDto.weight) &&
        Objects.equals(this.valid, attributeTypeDto.valid) &&
        Objects.equals(this.unitGroupName, attributeTypeDto.unitGroupName) &&
        Objects.equals(this.unitGroup, attributeTypeDto.unitGroup) &&
        Objects.equals(this.name, attributeTypeDto.name) &&
        Objects.equals(this.mandatory, attributeTypeDto.mandatory) &&
        Objects.equals(this.isExpose, attributeTypeDto.isExpose) &&
        Objects.equals(this.inputType, attributeTypeDto.inputType) &&
        Objects.equals(this.inputHint, attributeTypeDto.inputHint) &&
        Objects.equals(this.inputGuide, attributeTypeDto.inputGuide) &&
        Objects.equals(this.divisionType, attributeTypeDto.divisionType) &&
        Objects.equals(this.description, attributeTypeDto.description) &&
        Objects.equals(this.dataType, attributeTypeDto.dataType) &&
        Objects.equals(this.attributeTypeId, attributeTypeDto.attributeTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, valid, unitGroupName, unitGroup, name, mandatory, isExpose, inputType, inputHint, inputGuide, divisionType, description, dataType, attributeTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeTypeDto {\n");
    
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    unitGroupName: ").append(toIndentedString(unitGroupName)).append("\n");
    sb.append("    unitGroup: ").append(toIndentedString(unitGroup)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    isExpose: ").append(toIndentedString(isExpose)).append("\n");
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
    sb.append("    inputHint: ").append(toIndentedString(inputHint)).append("\n");
    sb.append("    inputGuide: ").append(toIndentedString(inputGuide)).append("\n");
    sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    attributeTypeId: ").append(toIndentedString(attributeTypeId)).append("\n");
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

  public static AttributeTypeDtoBuilder builder() {
    return new AttributeTypeDtoBuilder();
  }

  public static class AttributeTypeDtoBuilder {

    private Long weight = null;
    private Boolean valid = null;
    private String unitGroupName = null;
    private String unitGroup = null;
    private String name = null;
    private Boolean mandatory = null;
    private Boolean isExpose = null;
    private String inputType = null;
    private String inputHint = null;
    private String inputGuide = null;
    private String divisionType = null;
    private String description = null;
    private String dataType = null;
    private Long attributeTypeId = null;
    

    AttributeTypeDtoBuilder() {
    }

    /**
     **/
    public AttributeTypeDtoBuilder weight(Long weight) {
      this.weight = weight;
      return this;
    }

    /**
     **/
    public AttributeTypeDtoBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public AttributeTypeDtoBuilder unitGroupName(String unitGroupName) {
      this.unitGroupName = unitGroupName;
      return this;
    }

    /**
     **/
    public AttributeTypeDtoBuilder unitGroup(String unitGroup) {
      this.unitGroup = unitGroup;
      return this;
    }

    /**
     **/
    public AttributeTypeDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public AttributeTypeDtoBuilder mandatory(Boolean mandatory) {
      this.mandatory = mandatory;
      return this;
    }

    /**
     **/
    public AttributeTypeDtoBuilder isExpose(Boolean isExpose) {
      this.isExpose = isExpose;
      return this;
    }

    /**
     **/
    public AttributeTypeDtoBuilder inputType(String inputType) {
      this.inputType = inputType;
      return this;
    }

    /**
     **/
    public AttributeTypeDtoBuilder inputHint(String inputHint) {
      this.inputHint = inputHint;
      return this;
    }

    /**
     **/
    public AttributeTypeDtoBuilder inputGuide(String inputGuide) {
      this.inputGuide = inputGuide;
      return this;
    }

    /**
     **/
    public AttributeTypeDtoBuilder divisionType(String divisionType) {
      this.divisionType = divisionType;
      return this;
    }

    /**
     **/
    public AttributeTypeDtoBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public AttributeTypeDtoBuilder dataType(String dataType) {
      this.dataType = dataType;
      return this;
    }

    /**
     **/
    public AttributeTypeDtoBuilder attributeTypeId(Long attributeTypeId) {
      this.attributeTypeId = attributeTypeId;
      return this;
    }


    public AttributeTypeDto build() {
      AttributeTypeDto attributeTypeDto = new AttributeTypeDto();
      attributeTypeDto.setWeight(this.weight);
      attributeTypeDto.setValid(this.valid);
      attributeTypeDto.setUnitGroupName(this.unitGroupName);
      attributeTypeDto.setUnitGroup(this.unitGroup);
      attributeTypeDto.setName(this.name);
      attributeTypeDto.setMandatory(this.mandatory);
      attributeTypeDto.setIsExpose(this.isExpose);
      attributeTypeDto.setInputType(this.inputType);
      attributeTypeDto.setInputHint(this.inputHint);
      attributeTypeDto.setInputGuide(this.inputGuide);
      attributeTypeDto.setDivisionType(this.divisionType);
      attributeTypeDto.setDescription(this.description);
      attributeTypeDto.setDataType(this.dataType);
      attributeTypeDto.setAttributeTypeId(this.attributeTypeId);
      return attributeTypeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AttributeTypeDtoBuilder {\n");
      
      sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    unitGroupName: ").append(toIndentedString(unitGroupName)).append("\n");
      sb.append("    unitGroup: ").append(toIndentedString(unitGroup)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
      sb.append("    isExpose: ").append(toIndentedString(isExpose)).append("\n");
      sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
      sb.append("    inputHint: ").append(toIndentedString(inputHint)).append("\n");
      sb.append("    inputGuide: ").append(toIndentedString(inputGuide)).append("\n");
      sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
      sb.append("    attributeTypeId: ").append(toIndentedString(attributeTypeId)).append("\n");
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


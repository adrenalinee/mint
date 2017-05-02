package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayAttributeTypeValueGroupDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayAttributeTypeDto   {
  
  private List<DisplayAttributeTypeValueGroupDto> valueGroups = new ArrayList<DisplayAttributeTypeValueGroupDto>();
  private Boolean requiredValueGroupShow = null;
  private String name = null;
  private Long filterId = null;
  private String dataType = null;
  private Long attributeTypeId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("valueGroups")
  @com.fasterxml.jackson.annotation.JsonProperty("valueGroups")
  public List<DisplayAttributeTypeValueGroupDto> getValueGroups() {
    return valueGroups;
  }
  
  /**
   **/
  public void setValueGroups(List<DisplayAttributeTypeValueGroupDto> valueGroups) {
    this.valueGroups = valueGroups;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("requiredValueGroupShow")
  @com.fasterxml.jackson.annotation.JsonProperty("requiredValueGroupShow")
  public Boolean getRequiredValueGroupShow() {
    return requiredValueGroupShow;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isRequiredValueGroupShow() {
    return requiredValueGroupShow == null ? false : requiredValueGroupShow;
  }
  
  /**
   **/
  public void setRequiredValueGroupShow(Boolean requiredValueGroupShow) {
    this.requiredValueGroupShow = requiredValueGroupShow;
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
  @org.codehaus.jackson.annotate.JsonProperty("filterId")
  @com.fasterxml.jackson.annotation.JsonProperty("filterId")
  public Long getFilterId() {
    return filterId;
  }
  
  /**
   **/
  public void setFilterId(Long filterId) {
    this.filterId = filterId;
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
    DisplayAttributeTypeDto displayAttributeTypeDto = (DisplayAttributeTypeDto) o;
    return Objects.equals(this.valueGroups, displayAttributeTypeDto.valueGroups) &&
        Objects.equals(this.requiredValueGroupShow, displayAttributeTypeDto.requiredValueGroupShow) &&
        Objects.equals(this.name, displayAttributeTypeDto.name) &&
        Objects.equals(this.filterId, displayAttributeTypeDto.filterId) &&
        Objects.equals(this.dataType, displayAttributeTypeDto.dataType) &&
        Objects.equals(this.attributeTypeId, displayAttributeTypeDto.attributeTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueGroups, requiredValueGroupShow, name, filterId, dataType, attributeTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayAttributeTypeDto {\n");
    
    sb.append("    valueGroups: ").append(toIndentedString(valueGroups)).append("\n");
    sb.append("    requiredValueGroupShow: ").append(toIndentedString(requiredValueGroupShow)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    filterId: ").append(toIndentedString(filterId)).append("\n");
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

  public static DisplayAttributeTypeDtoBuilder builder() {
    return new DisplayAttributeTypeDtoBuilder();
  }

  public static class DisplayAttributeTypeDtoBuilder {

    private List<DisplayAttributeTypeValueGroupDto> valueGroups = new ArrayList<DisplayAttributeTypeValueGroupDto>();
    private Boolean requiredValueGroupShow = null;
    private String name = null;
    private Long filterId = null;
    private String dataType = null;
    private Long attributeTypeId = null;
    

    DisplayAttributeTypeDtoBuilder() {
    }

    /**
     **/
    public DisplayAttributeTypeDtoBuilder valueGroups(List<DisplayAttributeTypeValueGroupDto> valueGroups) {
      this.valueGroups = valueGroups;
      return this;
    }

    /**
     **/
    public DisplayAttributeTypeDtoBuilder requiredValueGroupShow(Boolean requiredValueGroupShow) {
      this.requiredValueGroupShow = requiredValueGroupShow;
      return this;
    }

    /**
     **/
    public DisplayAttributeTypeDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public DisplayAttributeTypeDtoBuilder filterId(Long filterId) {
      this.filterId = filterId;
      return this;
    }

    /**
     **/
    public DisplayAttributeTypeDtoBuilder dataType(String dataType) {
      this.dataType = dataType;
      return this;
    }

    /**
     **/
    public DisplayAttributeTypeDtoBuilder attributeTypeId(Long attributeTypeId) {
      this.attributeTypeId = attributeTypeId;
      return this;
    }


    public DisplayAttributeTypeDto build() {
      DisplayAttributeTypeDto displayAttributeTypeDto = new DisplayAttributeTypeDto();
      displayAttributeTypeDto.setValueGroups(this.valueGroups);
      displayAttributeTypeDto.setRequiredValueGroupShow(this.requiredValueGroupShow);
      displayAttributeTypeDto.setName(this.name);
      displayAttributeTypeDto.setFilterId(this.filterId);
      displayAttributeTypeDto.setDataType(this.dataType);
      displayAttributeTypeDto.setAttributeTypeId(this.attributeTypeId);
      return displayAttributeTypeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayAttributeTypeDtoBuilder {\n");
      
      sb.append("    valueGroups: ").append(toIndentedString(valueGroups)).append("\n");
      sb.append("    requiredValueGroupShow: ").append(toIndentedString(requiredValueGroupShow)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    filterId: ").append(toIndentedString(filterId)).append("\n");
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


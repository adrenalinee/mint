package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayAttributeFilterValueGroupDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayAttributeFilterDto   {
  
  private List<DisplayAttributeFilterValueGroupDto> valueGroups = new ArrayList<DisplayAttributeFilterValueGroupDto>();
  private Boolean requiredValueGroupShow = null;
  private String name = null;
  private String filterKey = null;
  private Long filterId = null;
  private String dataType = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("valueGroups")
  @com.fasterxml.jackson.annotation.JsonProperty("valueGroups")
  public List<DisplayAttributeFilterValueGroupDto> getValueGroups() {
    return valueGroups;
  }
  
  /**
   **/
  public void setValueGroups(List<DisplayAttributeFilterValueGroupDto> valueGroups) {
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
  @org.codehaus.jackson.annotate.JsonProperty("filterKey")
  @com.fasterxml.jackson.annotation.JsonProperty("filterKey")
  public String getFilterKey() {
    return filterKey;
  }
  
  /**
   **/
  public void setFilterKey(String filterKey) {
    this.filterKey = filterKey;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayAttributeFilterDto displayAttributeFilterDto = (DisplayAttributeFilterDto) o;
    return Objects.equals(this.valueGroups, displayAttributeFilterDto.valueGroups) &&
        Objects.equals(this.requiredValueGroupShow, displayAttributeFilterDto.requiredValueGroupShow) &&
        Objects.equals(this.name, displayAttributeFilterDto.name) &&
        Objects.equals(this.filterKey, displayAttributeFilterDto.filterKey) &&
        Objects.equals(this.filterId, displayAttributeFilterDto.filterId) &&
        Objects.equals(this.dataType, displayAttributeFilterDto.dataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueGroups, requiredValueGroupShow, name, filterKey, filterId, dataType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayAttributeFilterDto {\n");
    
    sb.append("    valueGroups: ").append(toIndentedString(valueGroups)).append("\n");
    sb.append("    requiredValueGroupShow: ").append(toIndentedString(requiredValueGroupShow)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    filterKey: ").append(toIndentedString(filterKey)).append("\n");
    sb.append("    filterId: ").append(toIndentedString(filterId)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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

  public static DisplayAttributeFilterDtoBuilder builder() {
    return new DisplayAttributeFilterDtoBuilder();
  }

  public static class DisplayAttributeFilterDtoBuilder {

    private List<DisplayAttributeFilterValueGroupDto> valueGroups = new ArrayList<DisplayAttributeFilterValueGroupDto>();
    private Boolean requiredValueGroupShow = null;
    private String name = null;
    private String filterKey = null;
    private Long filterId = null;
    private String dataType = null;
    

    DisplayAttributeFilterDtoBuilder() {
    }

    /**
     **/
    public DisplayAttributeFilterDtoBuilder valueGroups(List<DisplayAttributeFilterValueGroupDto> valueGroups) {
      this.valueGroups = valueGroups;
      return this;
    }

    /**
     **/
    public DisplayAttributeFilterDtoBuilder requiredValueGroupShow(Boolean requiredValueGroupShow) {
      this.requiredValueGroupShow = requiredValueGroupShow;
      return this;
    }

    /**
     **/
    public DisplayAttributeFilterDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public DisplayAttributeFilterDtoBuilder filterKey(String filterKey) {
      this.filterKey = filterKey;
      return this;
    }

    /**
     **/
    public DisplayAttributeFilterDtoBuilder filterId(Long filterId) {
      this.filterId = filterId;
      return this;
    }

    /**
     **/
    public DisplayAttributeFilterDtoBuilder dataType(String dataType) {
      this.dataType = dataType;
      return this;
    }


    public DisplayAttributeFilterDto build() {
      DisplayAttributeFilterDto displayAttributeFilterDto = new DisplayAttributeFilterDto();
      displayAttributeFilterDto.setValueGroups(this.valueGroups);
      displayAttributeFilterDto.setRequiredValueGroupShow(this.requiredValueGroupShow);
      displayAttributeFilterDto.setName(this.name);
      displayAttributeFilterDto.setFilterKey(this.filterKey);
      displayAttributeFilterDto.setFilterId(this.filterId);
      displayAttributeFilterDto.setDataType(this.dataType);
      return displayAttributeFilterDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayAttributeFilterDtoBuilder {\n");
      
      sb.append("    valueGroups: ").append(toIndentedString(valueGroups)).append("\n");
      sb.append("    requiredValueGroupShow: ").append(toIndentedString(requiredValueGroupShow)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    filterKey: ").append(toIndentedString(filterKey)).append("\n");
      sb.append("    filterId: ").append(toIndentedString(filterId)).append("\n");
      sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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


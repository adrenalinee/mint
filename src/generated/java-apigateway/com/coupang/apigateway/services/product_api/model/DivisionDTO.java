package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class DivisionDTO   {
  
  private Object properties = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("properties")
  @com.fasterxml.jackson.annotation.JsonProperty("properties")
  public Object getProperties() {
    return properties;
  }
  
  /**
   **/
  public void setProperties(Object properties) {
    this.properties = properties;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DivisionDTO divisionDTO = (DivisionDTO) o;
    return Objects.equals(this.properties, divisionDTO.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DivisionDTO {\n");
    
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

  public static DivisionDTOBuilder builder() {
    return new DivisionDTOBuilder();
  }

  public static class DivisionDTOBuilder {

    private Object properties = null;
    

    DivisionDTOBuilder() {
    }

    /**
     **/
    public DivisionDTOBuilder properties(Object properties) {
      this.properties = properties;
      return this;
    }


    public DivisionDTO build() {
      DivisionDTO divisionDTO = new DivisionDTO();
      divisionDTO.setProperties(this.properties);
      return divisionDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DivisionDTOBuilder {\n");
      
      sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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


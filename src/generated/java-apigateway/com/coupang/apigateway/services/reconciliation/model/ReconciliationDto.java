package com.coupang.apigateway.services.reconciliation.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.914+09:00")
public class ReconciliationDto   {
  
  private String mainImagePath = null;
  private String itemId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mainImagePath")
  @com.fasterxml.jackson.annotation.JsonProperty("mainImagePath")
  public String getMainImagePath() {
    return mainImagePath;
  }
  
  /**
   **/
  public void setMainImagePath(String mainImagePath) {
    this.mainImagePath = mainImagePath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemId")
  @com.fasterxml.jackson.annotation.JsonProperty("itemId")
  public String getItemId() {
    return itemId;
  }
  
  /**
   **/
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReconciliationDto reconciliationDto = (ReconciliationDto) o;
    return Objects.equals(this.mainImagePath, reconciliationDto.mainImagePath) &&
        Objects.equals(this.itemId, reconciliationDto.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainImagePath, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReconciliationDto {\n");
    
    sb.append("    mainImagePath: ").append(toIndentedString(mainImagePath)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

  public static ReconciliationDtoBuilder builder() {
    return new ReconciliationDtoBuilder();
  }

  public static class ReconciliationDtoBuilder {

    private String mainImagePath = null;
    private String itemId = null;
    

    ReconciliationDtoBuilder() {
    }

    /**
     **/
    public ReconciliationDtoBuilder mainImagePath(String mainImagePath) {
      this.mainImagePath = mainImagePath;
      return this;
    }

    /**
     **/
    public ReconciliationDtoBuilder itemId(String itemId) {
      this.itemId = itemId;
      return this;
    }


    public ReconciliationDto build() {
      ReconciliationDto reconciliationDto = new ReconciliationDto();
      reconciliationDto.setMainImagePath(this.mainImagePath);
      reconciliationDto.setItemId(this.itemId);
      return reconciliationDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReconciliationDtoBuilder {\n");
      
      sb.append("    mainImagePath: ").append(toIndentedString(mainImagePath)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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


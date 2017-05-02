package com.coupang.apigateway.services.identity_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.identity_api.model.DeliveryDetailsDTO;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.052+09:00")
public class DeliveryDetailsSignificantDTO   {
  
  private DeliveryDetailsDTO recent = null;
  private DeliveryDetailsDTO main = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("recent")
  @com.fasterxml.jackson.annotation.JsonProperty("recent")
  public DeliveryDetailsDTO getRecent() {
    return recent;
  }
  
  /**
   **/
  public void setRecent(DeliveryDetailsDTO recent) {
    this.recent = recent;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("main")
  @com.fasterxml.jackson.annotation.JsonProperty("main")
  public DeliveryDetailsDTO getMain() {
    return main;
  }
  
  /**
   **/
  public void setMain(DeliveryDetailsDTO main) {
    this.main = main;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryDetailsSignificantDTO deliveryDetailsSignificantDTO = (DeliveryDetailsSignificantDTO) o;
    return Objects.equals(this.recent, deliveryDetailsSignificantDTO.recent) &&
        Objects.equals(this.main, deliveryDetailsSignificantDTO.main);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recent, main);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryDetailsSignificantDTO {\n");
    
    sb.append("    recent: ").append(toIndentedString(recent)).append("\n");
    sb.append("    main: ").append(toIndentedString(main)).append("\n");
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

  public static DeliveryDetailsSignificantDTOBuilder builder() {
    return new DeliveryDetailsSignificantDTOBuilder();
  }

  public static class DeliveryDetailsSignificantDTOBuilder {

    private DeliveryDetailsDTO recent = null;
    private DeliveryDetailsDTO main = null;
    

    DeliveryDetailsSignificantDTOBuilder() {
    }

    /**
     **/
    public DeliveryDetailsSignificantDTOBuilder recent(DeliveryDetailsDTO recent) {
      this.recent = recent;
      return this;
    }

    /**
     **/
    public DeliveryDetailsSignificantDTOBuilder main(DeliveryDetailsDTO main) {
      this.main = main;
      return this;
    }


    public DeliveryDetailsSignificantDTO build() {
      DeliveryDetailsSignificantDTO deliveryDetailsSignificantDTO = new DeliveryDetailsSignificantDTO();
      deliveryDetailsSignificantDTO.setRecent(this.recent);
      deliveryDetailsSignificantDTO.setMain(this.main);
      return deliveryDetailsSignificantDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DeliveryDetailsSignificantDTOBuilder {\n");
      
      sb.append("    recent: ").append(toIndentedString(recent)).append("\n");
      sb.append("    main: ").append(toIndentedString(main)).append("\n");
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


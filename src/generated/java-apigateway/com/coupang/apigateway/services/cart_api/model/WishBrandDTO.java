package com.coupang.apigateway.services.cart_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.904+09:00")
public class WishBrandDTO   {
  
  private Long brandId = null;


  public enum AgentTypeEnum {
    PC("PC"),
    MWEB("MWEB"),
    AOS("AOS"),
    IOS("IOS"),
    ETC("ETC");

    private String value;

    AgentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private AgentTypeEnum agentType = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("brandId")
  @com.fasterxml.jackson.annotation.JsonProperty("brandId")
  public Long getBrandId() {
    return brandId;
  }
  
  /**
   **/
  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("agentType")
  @com.fasterxml.jackson.annotation.JsonProperty("agentType")
  public AgentTypeEnum getAgentType() {
    return agentType;
  }
  
  /**
   **/
  public void setAgentType(AgentTypeEnum agentType) {
    this.agentType = agentType;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WishBrandDTO wishBrandDTO = (WishBrandDTO) o;
    return Objects.equals(this.brandId, wishBrandDTO.brandId) &&
        Objects.equals(this.agentType, wishBrandDTO.agentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, agentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WishBrandDTO {\n");
    
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
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

  public static WishBrandDTOBuilder builder() {
    return new WishBrandDTOBuilder();
  }

  public static class WishBrandDTOBuilder {

    private Long brandId = null;
    private AgentTypeEnum agentType = null;
    

    WishBrandDTOBuilder() {
    }

    /**
     **/
    public WishBrandDTOBuilder brandId(Long brandId) {
      this.brandId = brandId;
      return this;
    }

    /**
     **/
    public WishBrandDTOBuilder agentType(AgentTypeEnum agentType) {
      this.agentType = agentType;
      return this;
    }


    public WishBrandDTO build() {
      WishBrandDTO wishBrandDTO = new WishBrandDTO();
      wishBrandDTO.setBrandId(this.brandId);
      wishBrandDTO.setAgentType(this.agentType);
      return wishBrandDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WishBrandDTOBuilder {\n");
      
      sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
      sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
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


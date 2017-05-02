package com.coupang.apigateway.services.fds_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.fds_api.model.PurchaseRequestItemDTO;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.579+09:00")
public class PurchaseRequestDTO   {
  
  private String violationKeyType = null;
  private String violationKey = null;
  private String memberSrl = null;
  private List<PurchaseRequestItemDTO> items = new ArrayList<PurchaseRequestItemDTO>();
  private String agentType = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("violationKeyType")
  @com.fasterxml.jackson.annotation.JsonProperty("violationKeyType")
  public String getViolationKeyType() {
    return violationKeyType;
  }
  
  /**
   **/
  public void setViolationKeyType(String violationKeyType) {
    this.violationKeyType = violationKeyType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("violationKey")
  @com.fasterxml.jackson.annotation.JsonProperty("violationKey")
  public String getViolationKey() {
    return violationKey;
  }
  
  /**
   **/
  public void setViolationKey(String violationKey) {
    this.violationKey = violationKey;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("memberSrl")
  @com.fasterxml.jackson.annotation.JsonProperty("memberSrl")
  public String getMemberSrl() {
    return memberSrl;
  }
  
  /**
   **/
  public void setMemberSrl(String memberSrl) {
    this.memberSrl = memberSrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("items")
  @com.fasterxml.jackson.annotation.JsonProperty("items")
  public List<PurchaseRequestItemDTO> getItems() {
    return items;
  }
  
  /**
   **/
  public void setItems(List<PurchaseRequestItemDTO> items) {
    this.items = items;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("agentType")
  @com.fasterxml.jackson.annotation.JsonProperty("agentType")
  public String getAgentType() {
    return agentType;
  }
  
  /**
   **/
  public void setAgentType(String agentType) {
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
    PurchaseRequestDTO purchaseRequestDTO = (PurchaseRequestDTO) o;
    return Objects.equals(this.violationKeyType, purchaseRequestDTO.violationKeyType) &&
        Objects.equals(this.violationKey, purchaseRequestDTO.violationKey) &&
        Objects.equals(this.memberSrl, purchaseRequestDTO.memberSrl) &&
        Objects.equals(this.items, purchaseRequestDTO.items) &&
        Objects.equals(this.agentType, purchaseRequestDTO.agentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(violationKeyType, violationKey, memberSrl, items, agentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseRequestDTO {\n");
    
    sb.append("    violationKeyType: ").append(toIndentedString(violationKeyType)).append("\n");
    sb.append("    violationKey: ").append(toIndentedString(violationKey)).append("\n");
    sb.append("    memberSrl: ").append(toIndentedString(memberSrl)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

  public static PurchaseRequestDTOBuilder builder() {
    return new PurchaseRequestDTOBuilder();
  }

  public static class PurchaseRequestDTOBuilder {

    private String violationKeyType = null;
    private String violationKey = null;
    private String memberSrl = null;
    private List<PurchaseRequestItemDTO> items = new ArrayList<PurchaseRequestItemDTO>();
    private String agentType = null;
    

    PurchaseRequestDTOBuilder() {
    }

    /**
     **/
    public PurchaseRequestDTOBuilder violationKeyType(String violationKeyType) {
      this.violationKeyType = violationKeyType;
      return this;
    }

    /**
     **/
    public PurchaseRequestDTOBuilder violationKey(String violationKey) {
      this.violationKey = violationKey;
      return this;
    }

    /**
     **/
    public PurchaseRequestDTOBuilder memberSrl(String memberSrl) {
      this.memberSrl = memberSrl;
      return this;
    }

    /**
     **/
    public PurchaseRequestDTOBuilder items(List<PurchaseRequestItemDTO> items) {
      this.items = items;
      return this;
    }

    /**
     **/
    public PurchaseRequestDTOBuilder agentType(String agentType) {
      this.agentType = agentType;
      return this;
    }


    public PurchaseRequestDTO build() {
      PurchaseRequestDTO purchaseRequestDTO = new PurchaseRequestDTO();
      purchaseRequestDTO.setViolationKeyType(this.violationKeyType);
      purchaseRequestDTO.setViolationKey(this.violationKey);
      purchaseRequestDTO.setMemberSrl(this.memberSrl);
      purchaseRequestDTO.setItems(this.items);
      purchaseRequestDTO.setAgentType(this.agentType);
      return purchaseRequestDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PurchaseRequestDTOBuilder {\n");
      
      sb.append("    violationKeyType: ").append(toIndentedString(violationKeyType)).append("\n");
      sb.append("    violationKey: ").append(toIndentedString(violationKey)).append("\n");
      sb.append("    memberSrl: ").append(toIndentedString(memberSrl)).append("\n");
      sb.append("    items: ").append(toIndentedString(items)).append("\n");
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


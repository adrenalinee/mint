package com.coupang.apigateway.services.promotion_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.promotion_api.model.DiscountSourceOptionalPolicyDTO;
import com.coupang.apigateway.services.promotion_api.model.DiscountSourcePolicyDTO;
import com.coupang.apigateway.services.promotion_api.model.StoredDiscountSourceDTO;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.975+09:00")
public class DownloadPromotionSourceHolderDTO   {
  
  private StoredDiscountSourceDTO storedSource = null;
  private DiscountSourcePolicyDTO policy = null;
  private DiscountSourceOptionalPolicyDTO optionalPolicy = null;
  private Long id = null;
  private String createdAt = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("storedSource")
  @com.fasterxml.jackson.annotation.JsonProperty("storedSource")
  public StoredDiscountSourceDTO getStoredSource() {
    return storedSource;
  }
  
  /**
   **/
  public void setStoredSource(StoredDiscountSourceDTO storedSource) {
    this.storedSource = storedSource;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("policy")
  @com.fasterxml.jackson.annotation.JsonProperty("policy")
  public DiscountSourcePolicyDTO getPolicy() {
    return policy;
  }
  
  /**
   **/
  public void setPolicy(DiscountSourcePolicyDTO policy) {
    this.policy = policy;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("optionalPolicy")
  @com.fasterxml.jackson.annotation.JsonProperty("optionalPolicy")
  public DiscountSourceOptionalPolicyDTO getOptionalPolicy() {
    return optionalPolicy;
  }
  
  /**
   **/
  public void setOptionalPolicy(DiscountSourceOptionalPolicyDTO optionalPolicy) {
    this.optionalPolicy = optionalPolicy;
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
  @org.codehaus.jackson.annotate.JsonProperty("createdAt")
  @com.fasterxml.jackson.annotation.JsonProperty("createdAt")
  public String getCreatedAt() {
    return createdAt;
  }
  
  /**
   **/
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadPromotionSourceHolderDTO downloadPromotionSourceHolderDTO = (DownloadPromotionSourceHolderDTO) o;
    return Objects.equals(this.storedSource, downloadPromotionSourceHolderDTO.storedSource) &&
        Objects.equals(this.policy, downloadPromotionSourceHolderDTO.policy) &&
        Objects.equals(this.optionalPolicy, downloadPromotionSourceHolderDTO.optionalPolicy) &&
        Objects.equals(this.id, downloadPromotionSourceHolderDTO.id) &&
        Objects.equals(this.createdAt, downloadPromotionSourceHolderDTO.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storedSource, policy, optionalPolicy, id, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadPromotionSourceHolderDTO {\n");
    
    sb.append("    storedSource: ").append(toIndentedString(storedSource)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    optionalPolicy: ").append(toIndentedString(optionalPolicy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

  public static DownloadPromotionSourceHolderDTOBuilder builder() {
    return new DownloadPromotionSourceHolderDTOBuilder();
  }

  public static class DownloadPromotionSourceHolderDTOBuilder {

    private StoredDiscountSourceDTO storedSource = null;
    private DiscountSourcePolicyDTO policy = null;
    private DiscountSourceOptionalPolicyDTO optionalPolicy = null;
    private Long id = null;
    private String createdAt = null;
    

    DownloadPromotionSourceHolderDTOBuilder() {
    }

    /**
     **/
    public DownloadPromotionSourceHolderDTOBuilder storedSource(StoredDiscountSourceDTO storedSource) {
      this.storedSource = storedSource;
      return this;
    }

    /**
     **/
    public DownloadPromotionSourceHolderDTOBuilder policy(DiscountSourcePolicyDTO policy) {
      this.policy = policy;
      return this;
    }

    /**
     **/
    public DownloadPromotionSourceHolderDTOBuilder optionalPolicy(DiscountSourceOptionalPolicyDTO optionalPolicy) {
      this.optionalPolicy = optionalPolicy;
      return this;
    }

    /**
     **/
    public DownloadPromotionSourceHolderDTOBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public DownloadPromotionSourceHolderDTOBuilder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }


    public DownloadPromotionSourceHolderDTO build() {
      DownloadPromotionSourceHolderDTO downloadPromotionSourceHolderDTO = new DownloadPromotionSourceHolderDTO();
      downloadPromotionSourceHolderDTO.setStoredSource(this.storedSource);
      downloadPromotionSourceHolderDTO.setPolicy(this.policy);
      downloadPromotionSourceHolderDTO.setOptionalPolicy(this.optionalPolicy);
      downloadPromotionSourceHolderDTO.setId(this.id);
      downloadPromotionSourceHolderDTO.setCreatedAt(this.createdAt);
      return downloadPromotionSourceHolderDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DownloadPromotionSourceHolderDTOBuilder {\n");
      
      sb.append("    storedSource: ").append(toIndentedString(storedSource)).append("\n");
      sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
      sb.append("    optionalPolicy: ").append(toIndentedString(optionalPolicy)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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


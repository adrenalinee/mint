package com.coupang.apigateway.services.cart_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.cart_api.model.BrandStatus;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.904+09:00")
public class WishBrandStatusResponse   {
  
  private String msg = null;
  private List<BrandStatus> brandStatus = new ArrayList<BrandStatus>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("msg")
  @com.fasterxml.jackson.annotation.JsonProperty("msg")
  public String getMsg() {
    return msg;
  }
  
  /**
   **/
  public void setMsg(String msg) {
    this.msg = msg;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("brandStatus")
  @com.fasterxml.jackson.annotation.JsonProperty("brandStatus")
  public List<BrandStatus> getBrandStatus() {
    return brandStatus;
  }
  
  /**
   **/
  public void setBrandStatus(List<BrandStatus> brandStatus) {
    this.brandStatus = brandStatus;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WishBrandStatusResponse wishBrandStatusResponse = (WishBrandStatusResponse) o;
    return Objects.equals(this.msg, wishBrandStatusResponse.msg) &&
        Objects.equals(this.brandStatus, wishBrandStatusResponse.brandStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msg, brandStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WishBrandStatusResponse {\n");
    
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    brandStatus: ").append(toIndentedString(brandStatus)).append("\n");
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

  public static WishBrandStatusResponseBuilder builder() {
    return new WishBrandStatusResponseBuilder();
  }

  public static class WishBrandStatusResponseBuilder {

    private String msg = null;
    private List<BrandStatus> brandStatus = new ArrayList<BrandStatus>();
    

    WishBrandStatusResponseBuilder() {
    }

    /**
     **/
    public WishBrandStatusResponseBuilder msg(String msg) {
      this.msg = msg;
      return this;
    }

    /**
     **/
    public WishBrandStatusResponseBuilder brandStatus(List<BrandStatus> brandStatus) {
      this.brandStatus = brandStatus;
      return this;
    }


    public WishBrandStatusResponse build() {
      WishBrandStatusResponse wishBrandStatusResponse = new WishBrandStatusResponse();
      wishBrandStatusResponse.setMsg(this.msg);
      wishBrandStatusResponse.setBrandStatus(this.brandStatus);
      return wishBrandStatusResponse;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WishBrandStatusResponseBuilder {\n");
      
      sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
      sb.append("    brandStatus: ").append(toIndentedString(brandStatus)).append("\n");
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


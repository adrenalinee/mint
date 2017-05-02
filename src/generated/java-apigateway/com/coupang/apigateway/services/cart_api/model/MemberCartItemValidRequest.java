package com.coupang.apigateway.services.cart_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.cart_api.model.ShoppingCartItemId;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.904+09:00")
public class MemberCartItemValidRequest   {
  
  private List<ShoppingCartItemId> validCartItemIds = new ArrayList<ShoppingCartItemId>();
  private Long memberSrl = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("validCartItemIds")
  @com.fasterxml.jackson.annotation.JsonProperty("validCartItemIds")
  public List<ShoppingCartItemId> getValidCartItemIds() {
    return validCartItemIds;
  }
  
  /**
   **/
  public void setValidCartItemIds(List<ShoppingCartItemId> validCartItemIds) {
    this.validCartItemIds = validCartItemIds;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("memberSrl")
  @com.fasterxml.jackson.annotation.JsonProperty("memberSrl")
  public Long getMemberSrl() {
    return memberSrl;
  }
  
  /**
   **/
  public void setMemberSrl(Long memberSrl) {
    this.memberSrl = memberSrl;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberCartItemValidRequest memberCartItemValidRequest = (MemberCartItemValidRequest) o;
    return Objects.equals(this.validCartItemIds, memberCartItemValidRequest.validCartItemIds) &&
        Objects.equals(this.memberSrl, memberCartItemValidRequest.memberSrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validCartItemIds, memberSrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberCartItemValidRequest {\n");
    
    sb.append("    validCartItemIds: ").append(toIndentedString(validCartItemIds)).append("\n");
    sb.append("    memberSrl: ").append(toIndentedString(memberSrl)).append("\n");
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

  public static MemberCartItemValidRequestBuilder builder() {
    return new MemberCartItemValidRequestBuilder();
  }

  public static class MemberCartItemValidRequestBuilder {

    private List<ShoppingCartItemId> validCartItemIds = new ArrayList<ShoppingCartItemId>();
    private Long memberSrl = null;
    

    MemberCartItemValidRequestBuilder() {
    }

    /**
     **/
    public MemberCartItemValidRequestBuilder validCartItemIds(List<ShoppingCartItemId> validCartItemIds) {
      this.validCartItemIds = validCartItemIds;
      return this;
    }

    /**
     **/
    public MemberCartItemValidRequestBuilder memberSrl(Long memberSrl) {
      this.memberSrl = memberSrl;
      return this;
    }


    public MemberCartItemValidRequest build() {
      MemberCartItemValidRequest memberCartItemValidRequest = new MemberCartItemValidRequest();
      memberCartItemValidRequest.setValidCartItemIds(this.validCartItemIds);
      memberCartItemValidRequest.setMemberSrl(this.memberSrl);
      return memberCartItemValidRequest;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MemberCartItemValidRequestBuilder {\n");
      
      sb.append("    validCartItemIds: ").append(toIndentedString(validCartItemIds)).append("\n");
      sb.append("    memberSrl: ").append(toIndentedString(memberSrl)).append("\n");
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


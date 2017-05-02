package com.coupang.apigateway.services.cart_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.cart_api.model.ShoppingCartItemDTO;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.904+09:00")
public class AnonymousCartItemValidResponse   {
  
  private List<ShoppingCartItemDTO> shoppingCartItemDTOs = new ArrayList<ShoppingCartItemDTO>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("shoppingCartItemDTOs")
  @com.fasterxml.jackson.annotation.JsonProperty("shoppingCartItemDTOs")
  public List<ShoppingCartItemDTO> getShoppingCartItemDTOs() {
    return shoppingCartItemDTOs;
  }
  
  /**
   **/
  public void setShoppingCartItemDTOs(List<ShoppingCartItemDTO> shoppingCartItemDTOs) {
    this.shoppingCartItemDTOs = shoppingCartItemDTOs;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnonymousCartItemValidResponse anonymousCartItemValidResponse = (AnonymousCartItemValidResponse) o;
    return Objects.equals(this.shoppingCartItemDTOs, anonymousCartItemValidResponse.shoppingCartItemDTOs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shoppingCartItemDTOs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnonymousCartItemValidResponse {\n");
    
    sb.append("    shoppingCartItemDTOs: ").append(toIndentedString(shoppingCartItemDTOs)).append("\n");
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

  public static AnonymousCartItemValidResponseBuilder builder() {
    return new AnonymousCartItemValidResponseBuilder();
  }

  public static class AnonymousCartItemValidResponseBuilder {

    private List<ShoppingCartItemDTO> shoppingCartItemDTOs = new ArrayList<ShoppingCartItemDTO>();
    

    AnonymousCartItemValidResponseBuilder() {
    }

    /**
     **/
    public AnonymousCartItemValidResponseBuilder shoppingCartItemDTOs(List<ShoppingCartItemDTO> shoppingCartItemDTOs) {
      this.shoppingCartItemDTOs = shoppingCartItemDTOs;
      return this;
    }


    public AnonymousCartItemValidResponse build() {
      AnonymousCartItemValidResponse anonymousCartItemValidResponse = new AnonymousCartItemValidResponse();
      anonymousCartItemValidResponse.setShoppingCartItemDTOs(this.shoppingCartItemDTOs);
      return anonymousCartItemValidResponse;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AnonymousCartItemValidResponseBuilder {\n");
      
      sb.append("    shoppingCartItemDTOs: ").append(toIndentedString(shoppingCartItemDTOs)).append("\n");
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


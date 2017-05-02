package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class BlockMemberMessageDto   {
  
  private String title = null;
  private String message = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("title")
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  public String getTitle() {
    return title;
  }
  
  /**
   **/
  public void setTitle(String title) {
    this.title = title;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("message")
  @com.fasterxml.jackson.annotation.JsonProperty("message")
  public String getMessage() {
    return message;
  }
  
  /**
   **/
  public void setMessage(String message) {
    this.message = message;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockMemberMessageDto blockMemberMessageDto = (BlockMemberMessageDto) o;
    return Objects.equals(this.title, blockMemberMessageDto.title) &&
        Objects.equals(this.message, blockMemberMessageDto.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockMemberMessageDto {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

  public static BlockMemberMessageDtoBuilder builder() {
    return new BlockMemberMessageDtoBuilder();
  }

  public static class BlockMemberMessageDtoBuilder {

    private String title = null;
    private String message = null;
    

    BlockMemberMessageDtoBuilder() {
    }

    /**
     **/
    public BlockMemberMessageDtoBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     **/
    public BlockMemberMessageDtoBuilder message(String message) {
      this.message = message;
      return this;
    }


    public BlockMemberMessageDto build() {
      BlockMemberMessageDto blockMemberMessageDto = new BlockMemberMessageDto();
      blockMemberMessageDto.setTitle(this.title);
      blockMemberMessageDto.setMessage(this.message);
      return blockMemberMessageDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BlockMemberMessageDtoBuilder {\n");
      
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


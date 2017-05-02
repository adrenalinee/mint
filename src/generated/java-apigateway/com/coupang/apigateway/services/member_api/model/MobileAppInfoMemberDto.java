package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.member_api.model.BasisMemberDTO;
import com.coupang.apigateway.services.member_api.model.MobileAppInfoDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class MobileAppInfoMemberDto   {
  
  private MobileAppInfoDto mobileAppInfoDto = null;
  private BasisMemberDTO basisMemberDTO = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mobileAppInfoDto")
  @com.fasterxml.jackson.annotation.JsonProperty("mobileAppInfoDto")
  public MobileAppInfoDto getMobileAppInfoDto() {
    return mobileAppInfoDto;
  }
  
  /**
   **/
  public void setMobileAppInfoDto(MobileAppInfoDto mobileAppInfoDto) {
    this.mobileAppInfoDto = mobileAppInfoDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("basisMemberDTO")
  @com.fasterxml.jackson.annotation.JsonProperty("basisMemberDTO")
  public BasisMemberDTO getBasisMemberDTO() {
    return basisMemberDTO;
  }
  
  /**
   **/
  public void setBasisMemberDTO(BasisMemberDTO basisMemberDTO) {
    this.basisMemberDTO = basisMemberDTO;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileAppInfoMemberDto mobileAppInfoMemberDto = (MobileAppInfoMemberDto) o;
    return Objects.equals(this.mobileAppInfoDto, mobileAppInfoMemberDto.mobileAppInfoDto) &&
        Objects.equals(this.basisMemberDTO, mobileAppInfoMemberDto.basisMemberDTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobileAppInfoDto, basisMemberDTO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileAppInfoMemberDto {\n");
    
    sb.append("    mobileAppInfoDto: ").append(toIndentedString(mobileAppInfoDto)).append("\n");
    sb.append("    basisMemberDTO: ").append(toIndentedString(basisMemberDTO)).append("\n");
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

  public static MobileAppInfoMemberDtoBuilder builder() {
    return new MobileAppInfoMemberDtoBuilder();
  }

  public static class MobileAppInfoMemberDtoBuilder {

    private MobileAppInfoDto mobileAppInfoDto = null;
    private BasisMemberDTO basisMemberDTO = null;
    

    MobileAppInfoMemberDtoBuilder() {
    }

    /**
     **/
    public MobileAppInfoMemberDtoBuilder mobileAppInfoDto(MobileAppInfoDto mobileAppInfoDto) {
      this.mobileAppInfoDto = mobileAppInfoDto;
      return this;
    }

    /**
     **/
    public MobileAppInfoMemberDtoBuilder basisMemberDTO(BasisMemberDTO basisMemberDTO) {
      this.basisMemberDTO = basisMemberDTO;
      return this;
    }


    public MobileAppInfoMemberDto build() {
      MobileAppInfoMemberDto mobileAppInfoMemberDto = new MobileAppInfoMemberDto();
      mobileAppInfoMemberDto.setMobileAppInfoDto(this.mobileAppInfoDto);
      mobileAppInfoMemberDto.setBasisMemberDTO(this.basisMemberDTO);
      return mobileAppInfoMemberDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MobileAppInfoMemberDtoBuilder {\n");
      
      sb.append("    mobileAppInfoDto: ").append(toIndentedString(mobileAppInfoDto)).append("\n");
      sb.append("    basisMemberDTO: ").append(toIndentedString(basisMemberDTO)).append("\n");
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


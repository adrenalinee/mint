package com.coupang.apigateway.services.buybox.model;

import java.util.Objects;
import com.coupang.apigateway.services.buybox.model.VendorItemDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.784+09:00")
public class WinnerDto   {
  
  private List<VendorItemDto> winners = new ArrayList<VendorItemDto>();
  private Long totalWinners = null;
  private Integer totalPages = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("winners")
  @com.fasterxml.jackson.annotation.JsonProperty("winners")
  public List<VendorItemDto> getWinners() {
    return winners;
  }
  
  /**
   **/
  public void setWinners(List<VendorItemDto> winners) {
    this.winners = winners;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("totalWinners")
  @com.fasterxml.jackson.annotation.JsonProperty("totalWinners")
  public Long getTotalWinners() {
    return totalWinners;
  }
  
  /**
   **/
  public void setTotalWinners(Long totalWinners) {
    this.totalWinners = totalWinners;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("totalPages")
  @com.fasterxml.jackson.annotation.JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }
  
  /**
   **/
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WinnerDto winnerDto = (WinnerDto) o;
    return Objects.equals(this.winners, winnerDto.winners) &&
        Objects.equals(this.totalWinners, winnerDto.totalWinners) &&
        Objects.equals(this.totalPages, winnerDto.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(winners, totalWinners, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WinnerDto {\n");
    
    sb.append("    winners: ").append(toIndentedString(winners)).append("\n");
    sb.append("    totalWinners: ").append(toIndentedString(totalWinners)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

  public static WinnerDtoBuilder builder() {
    return new WinnerDtoBuilder();
  }

  public static class WinnerDtoBuilder {

    private List<VendorItemDto> winners = new ArrayList<VendorItemDto>();
    private Long totalWinners = null;
    private Integer totalPages = null;
    

    WinnerDtoBuilder() {
    }

    /**
     **/
    public WinnerDtoBuilder winners(List<VendorItemDto> winners) {
      this.winners = winners;
      return this;
    }

    /**
     **/
    public WinnerDtoBuilder totalWinners(Long totalWinners) {
      this.totalWinners = totalWinners;
      return this;
    }

    /**
     **/
    public WinnerDtoBuilder totalPages(Integer totalPages) {
      this.totalPages = totalPages;
      return this;
    }


    public WinnerDto build() {
      WinnerDto winnerDto = new WinnerDto();
      winnerDto.setWinners(this.winners);
      winnerDto.setTotalWinners(this.totalWinners);
      winnerDto.setTotalPages(this.totalPages);
      return winnerDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WinnerDtoBuilder {\n");
      
      sb.append("    winners: ").append(toIndentedString(winners)).append("\n");
      sb.append("    totalWinners: ").append(toIndentedString(totalWinners)).append("\n");
      sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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


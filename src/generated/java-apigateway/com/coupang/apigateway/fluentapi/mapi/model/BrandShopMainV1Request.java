package com.coupang.apigateway.fluentapi.mapi.model;

import java.util.*;




@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.fluentapi.FluentApiCodegen", date = "2017-05-02T13:05:23.237+09:00")
public class BrandShopMainV1Request   {

	private BrandShopHotCategoryParameters brandShopHotCategory = null;
	private BrandShopLogoParameters brandShopLogo = null;
	private BrandShopProductListParameters brandShopProductList = null;
	private BrandShopProductListTitleParameters brandShopProductListTitle = null;
	private BrandShopRecentProductParameters brandShopRecentProduct = null;
	private BrandShopPromotionBannerParameters brandShopPromotionBanner = null;
	

	public BrandShopHotCategoryParameters getBrandShopHotCategory() {
		return brandShopHotCategory;
	}

	public void setBrandShopHotCategory(BrandShopHotCategoryParameters brandShopHotCategory) {
		this.brandShopHotCategory = brandShopHotCategory;
	}

	public BrandShopLogoParameters getBrandShopLogo() {
		return brandShopLogo;
	}

	public void setBrandShopLogo(BrandShopLogoParameters brandShopLogo) {
		this.brandShopLogo = brandShopLogo;
	}

	public BrandShopProductListParameters getBrandShopProductList() {
		return brandShopProductList;
	}

	public void setBrandShopProductList(BrandShopProductListParameters brandShopProductList) {
		this.brandShopProductList = brandShopProductList;
	}

	public BrandShopProductListTitleParameters getBrandShopProductListTitle() {
		return brandShopProductListTitle;
	}

	public void setBrandShopProductListTitle(BrandShopProductListTitleParameters brandShopProductListTitle) {
		this.brandShopProductListTitle = brandShopProductListTitle;
	}

	public BrandShopRecentProductParameters getBrandShopRecentProduct() {
		return brandShopRecentProduct;
	}

	public void setBrandShopRecentProduct(BrandShopRecentProductParameters brandShopRecentProduct) {
		this.brandShopRecentProduct = brandShopRecentProduct;
	}

	public BrandShopPromotionBannerParameters getBrandShopPromotionBanner() {
		return brandShopPromotionBanner;
	}

	public void setBrandShopPromotionBanner(BrandShopPromotionBannerParameters brandShopPromotionBanner) {
		this.brandShopPromotionBanner = brandShopPromotionBanner;
	}

	

	/**
	 * Fluent API Request Parameter(body) builder
	 */
	public static BrandShopMainV1RequestBuilder builder() {
		return new BrandShopMainV1RequestBuilder(new BrandShopMainV1Request());
	}

	public static class BrandShopMainV1RequestBuilder {
		private final BrandShopMainV1Request _parent;
		private BrandShopHotCategoryParameters brandShopHotCategory = new BrandShopHotCategoryParameters();
		private BrandShopLogoParameters brandShopLogo = new BrandShopLogoParameters();
		private BrandShopProductListParameters brandShopProductList = new BrandShopProductListParameters();
		private BrandShopProductListTitleParameters brandShopProductListTitle = new BrandShopProductListTitleParameters();
		private BrandShopRecentProductParameters brandShopRecentProduct = new BrandShopRecentProductParameters();
		private BrandShopPromotionBannerParameters brandShopPromotionBanner = new BrandShopPromotionBannerParameters();
		

		BrandShopMainV1RequestBuilder(BrandShopMainV1Request _parent) {
			this._parent = _parent;
		}

		
		BrandShopMainV1RequestBuilder brandShopHotCategory(BrandShopHotCategoryParameters brandShopHotCategory) {
			this.brandShopHotCategory = brandShopHotCategory;
			return this;
		}

		public BrandShopHotCategoryParameters.BrandShopHotCategoryParametersBuilder brandShopHotCategory() {
			return new BrandShopHotCategoryParameters.BrandShopHotCategoryParametersBuilder(this);
		}
		
		BrandShopMainV1RequestBuilder brandShopLogo(BrandShopLogoParameters brandShopLogo) {
			this.brandShopLogo = brandShopLogo;
			return this;
		}

		public BrandShopLogoParameters.BrandShopLogoParametersBuilder brandShopLogo() {
			return new BrandShopLogoParameters.BrandShopLogoParametersBuilder(this);
		}
		
		BrandShopMainV1RequestBuilder brandShopProductList(BrandShopProductListParameters brandShopProductList) {
			this.brandShopProductList = brandShopProductList;
			return this;
		}

		public BrandShopProductListParameters.BrandShopProductListParametersBuilder brandShopProductList() {
			return new BrandShopProductListParameters.BrandShopProductListParametersBuilder(this);
		}
		
		BrandShopMainV1RequestBuilder brandShopProductListTitle(BrandShopProductListTitleParameters brandShopProductListTitle) {
			this.brandShopProductListTitle = brandShopProductListTitle;
			return this;
		}

		public BrandShopProductListTitleParameters.BrandShopProductListTitleParametersBuilder brandShopProductListTitle() {
			return new BrandShopProductListTitleParameters.BrandShopProductListTitleParametersBuilder(this);
		}
		
		BrandShopMainV1RequestBuilder brandShopRecentProduct(BrandShopRecentProductParameters brandShopRecentProduct) {
			this.brandShopRecentProduct = brandShopRecentProduct;
			return this;
		}

		public BrandShopRecentProductParameters.BrandShopRecentProductParametersBuilder brandShopRecentProduct() {
			return new BrandShopRecentProductParameters.BrandShopRecentProductParametersBuilder(this);
		}
		
		BrandShopMainV1RequestBuilder brandShopPromotionBanner(BrandShopPromotionBannerParameters brandShopPromotionBanner) {
			this.brandShopPromotionBanner = brandShopPromotionBanner;
			return this;
		}

		public BrandShopPromotionBannerParameters.BrandShopPromotionBannerParametersBuilder brandShopPromotionBanner() {
			return new BrandShopPromotionBannerParameters.BrandShopPromotionBannerParametersBuilder(this);
		}
		

		
		public BrandShopMainV1Request build() {
			
			this._parent.setBrandShopHotCategory(this.brandShopHotCategory);
			this._parent.setBrandShopLogo(this.brandShopLogo);
			this._parent.setBrandShopProductList(this.brandShopProductList);
			this._parent.setBrandShopProductListTitle(this.brandShopProductListTitle);
			this._parent.setBrandShopRecentProduct(this.brandShopRecentProduct);
			this._parent.setBrandShopPromotionBanner(this.brandShopPromotionBanner);
			return this._parent;
		}
	}

	/**
	 * Fluent API 의 구성 API 중 brandShopHotCategory 의 요청 정보 BrandShopHotCategoryParameters 클래스
	 */
	public static class BrandShopHotCategoryParameters {

		private boolean skip = true;
		private BrandShopHotCategoryQueryParameters query = null;
		private BrandShopHotCategoryHeaderParameters header = null;
		

		public boolean isSkip() {
			return skip;
		}

		public void setSkip(boolean skip) {
			this.skip = skip;
		}

		public BrandShopHotCategoryQueryParameters getQuery() {
			return query;
		}

		public void setQuery(BrandShopHotCategoryQueryParameters query) {
			this.query = query;
		}
		public BrandShopHotCategoryHeaderParameters getHeader() {
			return header;
		}

		public void setHeader(BrandShopHotCategoryHeaderParameters header) {
			this.header = header;
		}
		

		/**
		 * BrandShopHotCategoryParameters 빌더 클래스
		 */
		public static class BrandShopHotCategoryParametersBuilder {
			private final BrandShopMainV1RequestBuilder _parent;
			private BrandShopHotCategoryQueryParameters query = null;
			private BrandShopHotCategoryHeaderParameters header = null;
			

			BrandShopHotCategoryParametersBuilder(BrandShopMainV1RequestBuilder _parent) {
				this._parent = _parent;
			}

			
			BrandShopHotCategoryParametersBuilder brandShopHotCategory(BrandShopHotCategoryQueryParameters query) {
				this.query = query;
				return this;
			}

			public BrandShopHotCategoryQueryParameters.BrandShopHotCategoryQueryParametersBuilder query() {
				return new BrandShopHotCategoryQueryParameters.BrandShopHotCategoryQueryParametersBuilder(this);
			}
			
			BrandShopHotCategoryParametersBuilder brandShopHotCategory(BrandShopHotCategoryHeaderParameters header) {
				this.header = header;
				return this;
			}

			public BrandShopHotCategoryHeaderParameters.BrandShopHotCategoryHeaderParametersBuilder header() {
				return new BrandShopHotCategoryHeaderParameters.BrandShopHotCategoryHeaderParametersBuilder(this);
			}
			

			
			public BrandShopMainV1RequestBuilder build() {
				BrandShopHotCategoryParameters obj = new BrandShopHotCategoryParameters();
				obj.setSkip(false);
				obj.setQuery(this.query);
				obj.setHeader(this.header);
				return this._parent.brandShopHotCategory(obj);
			}
		}

		
		public static class BrandShopHotCategoryQueryParameters {
			
			private String brandName = null;

			
			@io.swagger.annotations.ApiModelProperty(value = "brandName")
			@org.codehaus.jackson.annotate.JsonProperty("brandName")
			@com.fasterxml.jackson.annotation.JsonProperty("brandName")
			public String getBrandName() {
				return brandName;
			}
			
			/**
			 * brandName
			 **/
			public void setBrandName(String brandName) {
				this.brandName = brandName;
			}
			

			public static class BrandShopHotCategoryQueryParametersBuilder {
				private final BrandShopHotCategoryParametersBuilder _parent;
				private String brandName = null;
				

				BrandShopHotCategoryQueryParametersBuilder(BrandShopHotCategoryParametersBuilder _parent) {
					this._parent = _parent;
				}

				
				/**
				 * brandName
				 */
				public BrandShopHotCategoryQueryParametersBuilder brandName(String brandName) {
					this.brandName = brandName;
					return this;
				}
				

				public BrandShopHotCategoryParametersBuilder build() {
					BrandShopHotCategoryQueryParameters query = new BrandShopHotCategoryQueryParameters();
					query.setBrandName(this.brandName);
					return this._parent.brandShopHotCategory(query);
				}
			}
		}
		public static class BrandShopHotCategoryHeaderParameters {
			
			private String modularApp = null;

			
			@io.swagger.annotations.ApiModelProperty(value = "modular app client information")
			@org.codehaus.jackson.annotate.JsonProperty("modular-app")
			@com.fasterxml.jackson.annotation.JsonProperty("modular-app")
			public String getModularApp() {
				return modularApp;
			}
			
			/**
			 * modular app client information
			 **/
			public void setModularApp(String modularApp) {
				this.modularApp = modularApp;
			}
			

			public static class BrandShopHotCategoryHeaderParametersBuilder {
				private final BrandShopHotCategoryParametersBuilder _parent;
				private String modularApp = null;
				

				BrandShopHotCategoryHeaderParametersBuilder(BrandShopHotCategoryParametersBuilder _parent) {
					this._parent = _parent;
				}

				
				/**
				 * modular app client information
				 */
				public BrandShopHotCategoryHeaderParametersBuilder modularApp(String modularApp) {
					this.modularApp = modularApp;
					return this;
				}
				

				public BrandShopHotCategoryParametersBuilder build() {
					BrandShopHotCategoryHeaderParameters header = new BrandShopHotCategoryHeaderParameters();
					header.setModularApp(this.modularApp);
					return this._parent.brandShopHotCategory(header);
				}
			}
		}
	}	/**
	 * Fluent API 의 구성 API 중 brandShopLogo 의 요청 정보 BrandShopLogoParameters 클래스
	 */
	public static class BrandShopLogoParameters {

		private boolean skip = true;
		private BrandShopLogoQueryParameters query = null;
		private BrandShopLogoHeaderParameters header = null;
		

		public boolean isSkip() {
			return skip;
		}

		public void setSkip(boolean skip) {
			this.skip = skip;
		}

		public BrandShopLogoQueryParameters getQuery() {
			return query;
		}

		public void setQuery(BrandShopLogoQueryParameters query) {
			this.query = query;
		}
		public BrandShopLogoHeaderParameters getHeader() {
			return header;
		}

		public void setHeader(BrandShopLogoHeaderParameters header) {
			this.header = header;
		}
		

		/**
		 * BrandShopLogoParameters 빌더 클래스
		 */
		public static class BrandShopLogoParametersBuilder {
			private final BrandShopMainV1RequestBuilder _parent;
			private BrandShopLogoQueryParameters query = null;
			private BrandShopLogoHeaderParameters header = null;
			

			BrandShopLogoParametersBuilder(BrandShopMainV1RequestBuilder _parent) {
				this._parent = _parent;
			}

			
			BrandShopLogoParametersBuilder brandShopLogo(BrandShopLogoQueryParameters query) {
				this.query = query;
				return this;
			}

			public BrandShopLogoQueryParameters.BrandShopLogoQueryParametersBuilder query() {
				return new BrandShopLogoQueryParameters.BrandShopLogoQueryParametersBuilder(this);
			}
			
			BrandShopLogoParametersBuilder brandShopLogo(BrandShopLogoHeaderParameters header) {
				this.header = header;
				return this;
			}

			public BrandShopLogoHeaderParameters.BrandShopLogoHeaderParametersBuilder header() {
				return new BrandShopLogoHeaderParameters.BrandShopLogoHeaderParametersBuilder(this);
			}
			

			
			public BrandShopMainV1RequestBuilder build() {
				BrandShopLogoParameters obj = new BrandShopLogoParameters();
				obj.setSkip(false);
				obj.setQuery(this.query);
				obj.setHeader(this.header);
				return this._parent.brandShopLogo(obj);
			}
		}

		
		public static class BrandShopLogoQueryParameters {
			
			private String brandName = null;

			
			@io.swagger.annotations.ApiModelProperty(value = "brandName")
			@org.codehaus.jackson.annotate.JsonProperty("brandName")
			@com.fasterxml.jackson.annotation.JsonProperty("brandName")
			public String getBrandName() {
				return brandName;
			}
			
			/**
			 * brandName
			 **/
			public void setBrandName(String brandName) {
				this.brandName = brandName;
			}
			

			public static class BrandShopLogoQueryParametersBuilder {
				private final BrandShopLogoParametersBuilder _parent;
				private String brandName = null;
				

				BrandShopLogoQueryParametersBuilder(BrandShopLogoParametersBuilder _parent) {
					this._parent = _parent;
				}

				
				/**
				 * brandName
				 */
				public BrandShopLogoQueryParametersBuilder brandName(String brandName) {
					this.brandName = brandName;
					return this;
				}
				

				public BrandShopLogoParametersBuilder build() {
					BrandShopLogoQueryParameters query = new BrandShopLogoQueryParameters();
					query.setBrandName(this.brandName);
					return this._parent.brandShopLogo(query);
				}
			}
		}
		public static class BrandShopLogoHeaderParameters {
			
			private String modularApp = null;

			
			@io.swagger.annotations.ApiModelProperty(value = "modular app client information")
			@org.codehaus.jackson.annotate.JsonProperty("modular-app")
			@com.fasterxml.jackson.annotation.JsonProperty("modular-app")
			public String getModularApp() {
				return modularApp;
			}
			
			/**
			 * modular app client information
			 **/
			public void setModularApp(String modularApp) {
				this.modularApp = modularApp;
			}
			

			public static class BrandShopLogoHeaderParametersBuilder {
				private final BrandShopLogoParametersBuilder _parent;
				private String modularApp = null;
				

				BrandShopLogoHeaderParametersBuilder(BrandShopLogoParametersBuilder _parent) {
					this._parent = _parent;
				}

				
				/**
				 * modular app client information
				 */
				public BrandShopLogoHeaderParametersBuilder modularApp(String modularApp) {
					this.modularApp = modularApp;
					return this;
				}
				

				public BrandShopLogoParametersBuilder build() {
					BrandShopLogoHeaderParameters header = new BrandShopLogoHeaderParameters();
					header.setModularApp(this.modularApp);
					return this._parent.brandShopLogo(header);
				}
			}
		}
	}	/**
	 * Fluent API 의 구성 API 중 brandShopProductList 의 요청 정보 BrandShopProductListParameters 클래스
	 */
	public static class BrandShopProductListParameters {

		private boolean skip = true;
		private BrandShopProductListQueryParameters query = null;
		private BrandShopProductListHeaderParameters header = null;
		

		public boolean isSkip() {
			return skip;
		}

		public void setSkip(boolean skip) {
			this.skip = skip;
		}

		public BrandShopProductListQueryParameters getQuery() {
			return query;
		}

		public void setQuery(BrandShopProductListQueryParameters query) {
			this.query = query;
		}
		public BrandShopProductListHeaderParameters getHeader() {
			return header;
		}

		public void setHeader(BrandShopProductListHeaderParameters header) {
			this.header = header;
		}
		

		/**
		 * BrandShopProductListParameters 빌더 클래스
		 */
		public static class BrandShopProductListParametersBuilder {
			private final BrandShopMainV1RequestBuilder _parent;
			private BrandShopProductListQueryParameters query = null;
			private BrandShopProductListHeaderParameters header = null;
			

			BrandShopProductListParametersBuilder(BrandShopMainV1RequestBuilder _parent) {
				this._parent = _parent;
			}

			
			BrandShopProductListParametersBuilder brandShopProductList(BrandShopProductListQueryParameters query) {
				this.query = query;
				return this;
			}

			public BrandShopProductListQueryParameters.BrandShopProductListQueryParametersBuilder query() {
				return new BrandShopProductListQueryParameters.BrandShopProductListQueryParametersBuilder(this);
			}
			
			BrandShopProductListParametersBuilder brandShopProductList(BrandShopProductListHeaderParameters header) {
				this.header = header;
				return this;
			}

			public BrandShopProductListHeaderParameters.BrandShopProductListHeaderParametersBuilder header() {
				return new BrandShopProductListHeaderParameters.BrandShopProductListHeaderParametersBuilder(this);
			}
			

			
			public BrandShopMainV1RequestBuilder build() {
				BrandShopProductListParameters obj = new BrandShopProductListParameters();
				obj.setSkip(false);
				obj.setQuery(this.query);
				obj.setHeader(this.header);
				return this._parent.brandShopProductList(obj);
			}
		}

		
		public static class BrandShopProductListQueryParameters {
			
			private String filter = null;
			private String nextPageKey = null;
			private String pageUUID = null;
			private String brandName = null;
			private String componentId = null;
			private Boolean recentProductOnly = null;
			private String keyword = null;

			
			@io.swagger.annotations.ApiModelProperty(value = "")
			@org.codehaus.jackson.annotate.JsonProperty("filter")
			@com.fasterxml.jackson.annotation.JsonProperty("filter")
			public String getFilter() {
				return filter;
			}
			
			/**
			 **/
			public void setFilter(String filter) {
				this.filter = filter;
			}
			
			@io.swagger.annotations.ApiModelProperty(value = "")
			@org.codehaus.jackson.annotate.JsonProperty("nextPageKey")
			@com.fasterxml.jackson.annotation.JsonProperty("nextPageKey")
			public String getNextPageKey() {
				return nextPageKey;
			}
			
			/**
			 **/
			public void setNextPageKey(String nextPageKey) {
				this.nextPageKey = nextPageKey;
			}
			
			@io.swagger.annotations.ApiModelProperty(value = "")
			@org.codehaus.jackson.annotate.JsonProperty("pageUUID")
			@com.fasterxml.jackson.annotation.JsonProperty("pageUUID")
			public String getPageUUID() {
				return pageUUID;
			}
			
			/**
			 **/
			public void setPageUUID(String pageUUID) {
				this.pageUUID = pageUUID;
			}
			
			@io.swagger.annotations.ApiModelProperty(value = "")
			@org.codehaus.jackson.annotate.JsonProperty("brandName")
			@com.fasterxml.jackson.annotation.JsonProperty("brandName")
			public String getBrandName() {
				return brandName;
			}
			
			/**
			 **/
			public void setBrandName(String brandName) {
				this.brandName = brandName;
			}
			
			@io.swagger.annotations.ApiModelProperty(value = "")
			@org.codehaus.jackson.annotate.JsonProperty("componentId")
			@com.fasterxml.jackson.annotation.JsonProperty("componentId")
			public String getComponentId() {
				return componentId;
			}
			
			/**
			 **/
			public void setComponentId(String componentId) {
				this.componentId = componentId;
			}
			
			@io.swagger.annotations.ApiModelProperty(value = "")
			@org.codehaus.jackson.annotate.JsonProperty("recentProductOnly")
			@com.fasterxml.jackson.annotation.JsonProperty("recentProductOnly")
			public Boolean getRecentProductOnly() {
				return recentProductOnly;
			}
			
			/**
			 **/
			public void setRecentProductOnly(Boolean recentProductOnly) {
				this.recentProductOnly = recentProductOnly;
			}
			
			@io.swagger.annotations.ApiModelProperty(value = "")
			@org.codehaus.jackson.annotate.JsonProperty("keyword")
			@com.fasterxml.jackson.annotation.JsonProperty("keyword")
			public String getKeyword() {
				return keyword;
			}
			
			/**
			 **/
			public void setKeyword(String keyword) {
				this.keyword = keyword;
			}
			

			public static class BrandShopProductListQueryParametersBuilder {
				private final BrandShopProductListParametersBuilder _parent;
				private String filter = null;
				private String nextPageKey = null;
				private String pageUUID = null;
				private String brandName = null;
				private String componentId = null;
				private Boolean recentProductOnly = null;
				private String keyword = null;
				

				BrandShopProductListQueryParametersBuilder(BrandShopProductListParametersBuilder _parent) {
					this._parent = _parent;
				}

				
				/**
				 */
				public BrandShopProductListQueryParametersBuilder filter(String filter) {
					this.filter = filter;
					return this;
				}
				
				/**
				 */
				public BrandShopProductListQueryParametersBuilder nextPageKey(String nextPageKey) {
					this.nextPageKey = nextPageKey;
					return this;
				}
				
				/**
				 */
				public BrandShopProductListQueryParametersBuilder pageUUID(String pageUUID) {
					this.pageUUID = pageUUID;
					return this;
				}
				
				/**
				 */
				public BrandShopProductListQueryParametersBuilder brandName(String brandName) {
					this.brandName = brandName;
					return this;
				}
				
				/**
				 */
				public BrandShopProductListQueryParametersBuilder componentId(String componentId) {
					this.componentId = componentId;
					return this;
				}
				
				/**
				 */
				public BrandShopProductListQueryParametersBuilder recentProductOnly(Boolean recentProductOnly) {
					this.recentProductOnly = recentProductOnly;
					return this;
				}
				
				/**
				 */
				public BrandShopProductListQueryParametersBuilder keyword(String keyword) {
					this.keyword = keyword;
					return this;
				}
				

				public BrandShopProductListParametersBuilder build() {
					BrandShopProductListQueryParameters query = new BrandShopProductListQueryParameters();
					query.setFilter(this.filter);
					query.setNextPageKey(this.nextPageKey);
					query.setPageUUID(this.pageUUID);
					query.setBrandName(this.brandName);
					query.setComponentId(this.componentId);
					query.setRecentProductOnly(this.recentProductOnly);
					query.setKeyword(this.keyword);
					return this._parent.brandShopProductList(query);
				}
			}
		}
		public static class BrandShopProductListHeaderParameters {
			
			private String modularApp = null;

			
			@io.swagger.annotations.ApiModelProperty(value = "modular app client information")
			@org.codehaus.jackson.annotate.JsonProperty("modular-app")
			@com.fasterxml.jackson.annotation.JsonProperty("modular-app")
			public String getModularApp() {
				return modularApp;
			}
			
			/**
			 * modular app client information
			 **/
			public void setModularApp(String modularApp) {
				this.modularApp = modularApp;
			}
			

			public static class BrandShopProductListHeaderParametersBuilder {
				private final BrandShopProductListParametersBuilder _parent;
				private String modularApp = null;
				

				BrandShopProductListHeaderParametersBuilder(BrandShopProductListParametersBuilder _parent) {
					this._parent = _parent;
				}

				
				/**
				 * modular app client information
				 */
				public BrandShopProductListHeaderParametersBuilder modularApp(String modularApp) {
					this.modularApp = modularApp;
					return this;
				}
				

				public BrandShopProductListParametersBuilder build() {
					BrandShopProductListHeaderParameters header = new BrandShopProductListHeaderParameters();
					header.setModularApp(this.modularApp);
					return this._parent.brandShopProductList(header);
				}
			}
		}
	}	/**
	 * Fluent API 의 구성 API 중 brandShopProductListTitle 의 요청 정보 BrandShopProductListTitleParameters 클래스
	 */
	public static class BrandShopProductListTitleParameters {

		private boolean skip = true;
		private BrandShopProductListTitleHeaderParameters header = null;
		

		public boolean isSkip() {
			return skip;
		}

		public void setSkip(boolean skip) {
			this.skip = skip;
		}

		public BrandShopProductListTitleHeaderParameters getHeader() {
			return header;
		}

		public void setHeader(BrandShopProductListTitleHeaderParameters header) {
			this.header = header;
		}
		

		/**
		 * BrandShopProductListTitleParameters 빌더 클래스
		 */
		public static class BrandShopProductListTitleParametersBuilder {
			private final BrandShopMainV1RequestBuilder _parent;
			private BrandShopProductListTitleHeaderParameters header = null;
			

			BrandShopProductListTitleParametersBuilder(BrandShopMainV1RequestBuilder _parent) {
				this._parent = _parent;
			}

			
			BrandShopProductListTitleParametersBuilder brandShopProductListTitle(BrandShopProductListTitleHeaderParameters header) {
				this.header = header;
				return this;
			}

			public BrandShopProductListTitleHeaderParameters.BrandShopProductListTitleHeaderParametersBuilder header() {
				return new BrandShopProductListTitleHeaderParameters.BrandShopProductListTitleHeaderParametersBuilder(this);
			}
			

			
			public BrandShopMainV1RequestBuilder build() {
				BrandShopProductListTitleParameters obj = new BrandShopProductListTitleParameters();
				obj.setSkip(false);
				obj.setHeader(this.header);
				return this._parent.brandShopProductListTitle(obj);
			}
		}

		
		public static class BrandShopProductListTitleHeaderParameters {
			
			private String modularApp = null;

			
			@io.swagger.annotations.ApiModelProperty(value = "modular app client information")
			@org.codehaus.jackson.annotate.JsonProperty("modular-app")
			@com.fasterxml.jackson.annotation.JsonProperty("modular-app")
			public String getModularApp() {
				return modularApp;
			}
			
			/**
			 * modular app client information
			 **/
			public void setModularApp(String modularApp) {
				this.modularApp = modularApp;
			}
			

			public static class BrandShopProductListTitleHeaderParametersBuilder {
				private final BrandShopProductListTitleParametersBuilder _parent;
				private String modularApp = null;
				

				BrandShopProductListTitleHeaderParametersBuilder(BrandShopProductListTitleParametersBuilder _parent) {
					this._parent = _parent;
				}

				
				/**
				 * modular app client information
				 */
				public BrandShopProductListTitleHeaderParametersBuilder modularApp(String modularApp) {
					this.modularApp = modularApp;
					return this;
				}
				

				public BrandShopProductListTitleParametersBuilder build() {
					BrandShopProductListTitleHeaderParameters header = new BrandShopProductListTitleHeaderParameters();
					header.setModularApp(this.modularApp);
					return this._parent.brandShopProductListTitle(header);
				}
			}
		}
	}	/**
	 * Fluent API 의 구성 API 중 brandShopRecentProduct 의 요청 정보 BrandShopRecentProductParameters 클래스
	 */
	public static class BrandShopRecentProductParameters {

		private boolean skip = true;
		private BrandShopRecentProductQueryParameters query = null;
		private BrandShopRecentProductHeaderParameters header = null;
		

		public boolean isSkip() {
			return skip;
		}

		public void setSkip(boolean skip) {
			this.skip = skip;
		}

		public BrandShopRecentProductQueryParameters getQuery() {
			return query;
		}

		public void setQuery(BrandShopRecentProductQueryParameters query) {
			this.query = query;
		}
		public BrandShopRecentProductHeaderParameters getHeader() {
			return header;
		}

		public void setHeader(BrandShopRecentProductHeaderParameters header) {
			this.header = header;
		}
		

		/**
		 * BrandShopRecentProductParameters 빌더 클래스
		 */
		public static class BrandShopRecentProductParametersBuilder {
			private final BrandShopMainV1RequestBuilder _parent;
			private BrandShopRecentProductQueryParameters query = null;
			private BrandShopRecentProductHeaderParameters header = null;
			

			BrandShopRecentProductParametersBuilder(BrandShopMainV1RequestBuilder _parent) {
				this._parent = _parent;
			}

			
			BrandShopRecentProductParametersBuilder brandShopRecentProduct(BrandShopRecentProductQueryParameters query) {
				this.query = query;
				return this;
			}

			public BrandShopRecentProductQueryParameters.BrandShopRecentProductQueryParametersBuilder query() {
				return new BrandShopRecentProductQueryParameters.BrandShopRecentProductQueryParametersBuilder(this);
			}
			
			BrandShopRecentProductParametersBuilder brandShopRecentProduct(BrandShopRecentProductHeaderParameters header) {
				this.header = header;
				return this;
			}

			public BrandShopRecentProductHeaderParameters.BrandShopRecentProductHeaderParametersBuilder header() {
				return new BrandShopRecentProductHeaderParameters.BrandShopRecentProductHeaderParametersBuilder(this);
			}
			

			
			public BrandShopMainV1RequestBuilder build() {
				BrandShopRecentProductParameters obj = new BrandShopRecentProductParameters();
				obj.setSkip(false);
				obj.setQuery(this.query);
				obj.setHeader(this.header);
				return this._parent.brandShopRecentProduct(obj);
			}
		}

		
		public static class BrandShopRecentProductQueryParameters {
			
			private String brandName = null;

			
			@io.swagger.annotations.ApiModelProperty(value = "brandName")
			@org.codehaus.jackson.annotate.JsonProperty("brandName")
			@com.fasterxml.jackson.annotation.JsonProperty("brandName")
			public String getBrandName() {
				return brandName;
			}
			
			/**
			 * brandName
			 **/
			public void setBrandName(String brandName) {
				this.brandName = brandName;
			}
			

			public static class BrandShopRecentProductQueryParametersBuilder {
				private final BrandShopRecentProductParametersBuilder _parent;
				private String brandName = null;
				

				BrandShopRecentProductQueryParametersBuilder(BrandShopRecentProductParametersBuilder _parent) {
					this._parent = _parent;
				}

				
				/**
				 * brandName
				 */
				public BrandShopRecentProductQueryParametersBuilder brandName(String brandName) {
					this.brandName = brandName;
					return this;
				}
				

				public BrandShopRecentProductParametersBuilder build() {
					BrandShopRecentProductQueryParameters query = new BrandShopRecentProductQueryParameters();
					query.setBrandName(this.brandName);
					return this._parent.brandShopRecentProduct(query);
				}
			}
		}
		public static class BrandShopRecentProductHeaderParameters {
			
			private String modularApp = null;

			
			@io.swagger.annotations.ApiModelProperty(value = "modular app client information")
			@org.codehaus.jackson.annotate.JsonProperty("modular-app")
			@com.fasterxml.jackson.annotation.JsonProperty("modular-app")
			public String getModularApp() {
				return modularApp;
			}
			
			/**
			 * modular app client information
			 **/
			public void setModularApp(String modularApp) {
				this.modularApp = modularApp;
			}
			

			public static class BrandShopRecentProductHeaderParametersBuilder {
				private final BrandShopRecentProductParametersBuilder _parent;
				private String modularApp = null;
				

				BrandShopRecentProductHeaderParametersBuilder(BrandShopRecentProductParametersBuilder _parent) {
					this._parent = _parent;
				}

				
				/**
				 * modular app client information
				 */
				public BrandShopRecentProductHeaderParametersBuilder modularApp(String modularApp) {
					this.modularApp = modularApp;
					return this;
				}
				

				public BrandShopRecentProductParametersBuilder build() {
					BrandShopRecentProductHeaderParameters header = new BrandShopRecentProductHeaderParameters();
					header.setModularApp(this.modularApp);
					return this._parent.brandShopRecentProduct(header);
				}
			}
		}
	}	/**
	 * Fluent API 의 구성 API 중 brandShopPromotionBanner 의 요청 정보 BrandShopPromotionBannerParameters 클래스
	 */
	public static class BrandShopPromotionBannerParameters {

		private boolean skip = true;
		private BrandShopPromotionBannerQueryParameters query = null;
		private BrandShopPromotionBannerHeaderParameters header = null;
		

		public boolean isSkip() {
			return skip;
		}

		public void setSkip(boolean skip) {
			this.skip = skip;
		}

		public BrandShopPromotionBannerQueryParameters getQuery() {
			return query;
		}

		public void setQuery(BrandShopPromotionBannerQueryParameters query) {
			this.query = query;
		}
		public BrandShopPromotionBannerHeaderParameters getHeader() {
			return header;
		}

		public void setHeader(BrandShopPromotionBannerHeaderParameters header) {
			this.header = header;
		}
		

		/**
		 * BrandShopPromotionBannerParameters 빌더 클래스
		 */
		public static class BrandShopPromotionBannerParametersBuilder {
			private final BrandShopMainV1RequestBuilder _parent;
			private BrandShopPromotionBannerQueryParameters query = null;
			private BrandShopPromotionBannerHeaderParameters header = null;
			

			BrandShopPromotionBannerParametersBuilder(BrandShopMainV1RequestBuilder _parent) {
				this._parent = _parent;
			}

			
			BrandShopPromotionBannerParametersBuilder brandShopPromotionBanner(BrandShopPromotionBannerQueryParameters query) {
				this.query = query;
				return this;
			}

			public BrandShopPromotionBannerQueryParameters.BrandShopPromotionBannerQueryParametersBuilder query() {
				return new BrandShopPromotionBannerQueryParameters.BrandShopPromotionBannerQueryParametersBuilder(this);
			}
			
			BrandShopPromotionBannerParametersBuilder brandShopPromotionBanner(BrandShopPromotionBannerHeaderParameters header) {
				this.header = header;
				return this;
			}

			public BrandShopPromotionBannerHeaderParameters.BrandShopPromotionBannerHeaderParametersBuilder header() {
				return new BrandShopPromotionBannerHeaderParameters.BrandShopPromotionBannerHeaderParametersBuilder(this);
			}
			

			
			public BrandShopMainV1RequestBuilder build() {
				BrandShopPromotionBannerParameters obj = new BrandShopPromotionBannerParameters();
				obj.setSkip(false);
				obj.setQuery(this.query);
				obj.setHeader(this.header);
				return this._parent.brandShopPromotionBanner(obj);
			}
		}

		
		public static class BrandShopPromotionBannerQueryParameters {
			
			private String brandName = null;

			
			@io.swagger.annotations.ApiModelProperty(value = "brandName")
			@org.codehaus.jackson.annotate.JsonProperty("brandName")
			@com.fasterxml.jackson.annotation.JsonProperty("brandName")
			public String getBrandName() {
				return brandName;
			}
			
			/**
			 * brandName
			 **/
			public void setBrandName(String brandName) {
				this.brandName = brandName;
			}
			

			public static class BrandShopPromotionBannerQueryParametersBuilder {
				private final BrandShopPromotionBannerParametersBuilder _parent;
				private String brandName = null;
				

				BrandShopPromotionBannerQueryParametersBuilder(BrandShopPromotionBannerParametersBuilder _parent) {
					this._parent = _parent;
				}

				
				/**
				 * brandName
				 */
				public BrandShopPromotionBannerQueryParametersBuilder brandName(String brandName) {
					this.brandName = brandName;
					return this;
				}
				

				public BrandShopPromotionBannerParametersBuilder build() {
					BrandShopPromotionBannerQueryParameters query = new BrandShopPromotionBannerQueryParameters();
					query.setBrandName(this.brandName);
					return this._parent.brandShopPromotionBanner(query);
				}
			}
		}
		public static class BrandShopPromotionBannerHeaderParameters {
			
			private String modularApp = null;

			
			@io.swagger.annotations.ApiModelProperty(value = "modular app client information")
			@org.codehaus.jackson.annotate.JsonProperty("modular-app")
			@com.fasterxml.jackson.annotation.JsonProperty("modular-app")
			public String getModularApp() {
				return modularApp;
			}
			
			/**
			 * modular app client information
			 **/
			public void setModularApp(String modularApp) {
				this.modularApp = modularApp;
			}
			

			public static class BrandShopPromotionBannerHeaderParametersBuilder {
				private final BrandShopPromotionBannerParametersBuilder _parent;
				private String modularApp = null;
				

				BrandShopPromotionBannerHeaderParametersBuilder(BrandShopPromotionBannerParametersBuilder _parent) {
					this._parent = _parent;
				}

				
				/**
				 * modular app client information
				 */
				public BrandShopPromotionBannerHeaderParametersBuilder modularApp(String modularApp) {
					this.modularApp = modularApp;
					return this;
				}
				

				public BrandShopPromotionBannerParametersBuilder build() {
					BrandShopPromotionBannerHeaderParameters header = new BrandShopPromotionBannerHeaderParameters();
					header.setModularApp(this.modularApp);
					return this._parent.brandShopPromotionBanner(header);
				}
			}
		}
	}
}

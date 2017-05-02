package com.mallibu.console.search;

import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

import org.joda.time.DateTime;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.configuration.ApiGatewayAdapterConfig;
import com.coupang.apigateway.services.search_api.SearchapiApiV1CategoryAdapter;
import com.coupang.apigateway.services.search_api.SearchapiApiV1SearchAdapter;
import com.coupang.apigateway.services.search_api.model.CategoryConditionV1;
import com.coupang.apigateway.services.search_api.model.CategoryConditionV1.SortEnum;
import com.coupang.apigateway.services.search_api.model.Context;
import com.coupang.apigateway.services.search_api.model.Context.OsTypeEnum;
import com.coupang.apigateway.services.search_api.model.Context.ViewTypeEnum;
import com.coupang.apigateway.services.search_api.model.GeneralFilter;
import com.coupang.apigateway.services.search_api.model.GeneralFilter.FieldEnum;
import com.coupang.apigateway.services.search_api.model.GeneralFilter.GeneralFilterTypeEnum;
import com.coupang.apigateway.services.search_api.model.GeneralFilter.OperatorEnum;
import com.coupang.apigateway.services.search_api.model.SearchConditionV1;
import com.coupang.apigateway.services.search_api.model.SearchResult;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(ApiGatewayAdapterConfig.class)
public class SearchApiTest {
	
	@Autowired
	private SearchapiApiV1CategoryAdapter searchapiApiV1CategoryAdapter;
	
	@Autowired
	private SearchapiApiV1SearchAdapter searchapiApiV1SearchAdapter;
	
	@Test
	public void test1() throws ApiException, JsonProcessingException {
		Context context = Context.builder()
				.viewType(ViewTypeEnum.APP)
				.uuid(UUID.randomUUID().toString())
				.bundleId(52L)
				.osType(OsTypeEnum.Android)
				.userNo(0L)
				.appVersion("4.6.4")
				.ip("192.168.55.57")
				.channel("mobile")
				.build();
		
		
//		GeneralFilter generalFilter = GeneralFilter.builder()
//			.generalFilterType(GeneralFilterTypeEnum.DefaultFilter)
//			.field(FieldEnum.BRANDID)
//			.values(Arrays.asList("31134", "31131"))
//			.operator(OperatorEnum.OR)
//			.build();
//			
//		Map<String, GeneralFilter> filter = Maps.newHashMap();
//		filter.put(FieldEnum.BRANDID.name(), generalFilter);
		
		
		CategoryConditionV1 categoryCondition = CategoryConditionV1.builder()
			.limit(10)
			.start(0)
			.sort(Arrays.asList(SortEnum.DEFAULT))
			.date(DateTime.now().toString("yyyyMMddhhmmss"))
			.context(context)
//			.filter(filter)
			.build();
		
		SearchResult searchResult = searchapiApiV1CategoryAdapter.postApiV1Category(categoryCondition);
		
		
		ObjectMapper om = new ObjectMapper();
		System.out.println(om.writeValueAsString(searchResult));
	}
	
	
	@Ignore
	@Test
	public void test2() throws ApiException, JsonProcessingException {
		Context context = Context.builder()
			.viewType(ViewTypeEnum.APP)
			.uuid(UUID.randomUUID().toString())
			.bundleId(52L)
			.osType(OsTypeEnum.Android)
			.userNo(0L)
			.appVersion("4.6.4")
			.ip("192.168.55.57")
			.channel("mobile")
			.build();
		
//		GeneralFilter generalFilter = GeneralFilter.builder()
//			.generalFilterType(GeneralFilterTypeEnum.DefaultFilter)
//			.field(FieldEnum.BRANDID)
//			.values(Arrays.asList("31134", "31131"))
//			.operator(OperatorEnum.OR)
////			.build();
//		
//		Map<String, GeneralFilter> filter = Maps.newHashMap();
//		filter.put(FieldEnum.BRANDID.name(), generalFilter);
		
		SearchConditionV1 searchCondition = SearchConditionV1.builder()
			.limit(30)
			.start(0)
			.sort(Arrays.asList(SearchConditionV1.SortEnum.DEFAULT))
			.date(DateTime.now().toString("yyyyMMddhhmmss"))
			.context(context)
//			.filter(filter)
			.query("macbook")
			.build();
		
		SearchResult searchResult = searchapiApiV1SearchAdapter.postApiV1Search(searchCondition);
		
		ObjectMapper om = new ObjectMapper();
		System.out.println(om.writeValueAsString(searchResult));
	}
}
;
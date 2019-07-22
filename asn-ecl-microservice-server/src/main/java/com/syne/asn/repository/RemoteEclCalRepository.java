package com.syne.asn.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.syne.asn.dto.EclCalDto;
import com.syne.asn.dto.EclRunDetailDto;
import com.syne.asn.dto.EclRunDto;

/*
 * @author subhajit
 */
public class RemoteEclCalRepository implements EclCalRepository {

	@Autowired
	protected RestTemplate restTemplate;

	protected String serviceUrl;

	public RemoteEclCalRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl : "http://" + serviceUrl;
	}

	public List<EclRunDto> getEcl(EclCalDto eclCalDto) {
		return restTemplate.postForObject(serviceUrl + "/ecl", eclCalDto, List.class);
	}

	@Override
	public List<EclRunDto> getEclHistoryData(EclCalDto eclCalDto) {
		return restTemplate.postForObject(serviceUrl + "/ecl/historydata", eclCalDto, List.class);
	}

	@Override
	public List<EclRunDetailDto> getSubEclHistoryData(EclCalDto eclCalDto) {
		return restTemplate.postForObject(serviceUrl + "/ecl/sub/historydata", eclCalDto, List.class);
	}
}
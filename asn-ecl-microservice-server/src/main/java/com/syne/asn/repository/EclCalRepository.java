package com.syne.asn.repository;

import java.util.List;

import com.syne.asn.dto.EclCalDto;
import com.syne.asn.dto.EclRunDetailDto;
import com.syne.asn.dto.EclRunDto;

public interface EclCalRepository {

	List<EclRunDto> getEcl(EclCalDto eclCalDto);

	List<EclRunDto> getEclHistoryData(EclCalDto eclCalDto);

	List<EclRunDetailDto> getSubEclHistoryData(EclCalDto eclCalDto);

}

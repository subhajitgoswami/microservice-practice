package com.syne.asn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.syne.asn.dto.EclCalDto;
import com.syne.asn.dto.EclRunDetailDto;
import com.syne.asn.dto.EclRunDto;
import com.syne.asn.repository.EclCalRepository;

/*
 * @author subhajit
 */
@RestController
@CrossOrigin
//@RequestMapping("/asn/ecl")
public class EclCalController {
	@Autowired
	EclCalRepository eclCalRepos;

	public static final Logger logger = LoggerFactory.getLogger(EclCalController.class);

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<List<EclRunDto>> getEcl(@RequestBody EclCalDto eclCalDto) {
		logger.info("Get ecl calculation: " + eclCalDto);
		List<EclRunDto> eclDtoList = eclCalRepos.getEcl(eclCalDto);

		return new ResponseEntity<List<EclRunDto>>(eclDtoList, HttpStatus.OK);
	}

	@RequestMapping(value = "/historydata", method = RequestMethod.POST)
	public ResponseEntity<List<EclRunDto>> getEclHistory(@RequestBody EclCalDto eclCalDto) {
		logger.info("Get ECL history data");
		List<EclRunDto> eclHistoryLst = eclCalRepos.getEclHistoryData(eclCalDto);
		return new ResponseEntity<List<EclRunDto>>(eclHistoryLst, HttpStatus.OK);
	}

	@RequestMapping(value = "/sub/historydata", method = RequestMethod.POST)
	public ResponseEntity<List<EclRunDetailDto>> getSubEclHistory(@RequestBody EclCalDto eclCalDto) {
		logger.info("Get Sub ECL history data");
		List<EclRunDetailDto> eclSubHistoryLst = eclCalRepos.getSubEclHistoryData(eclCalDto);
		return new ResponseEntity<List<EclRunDetailDto>>(eclSubHistoryLst, HttpStatus.OK);
	}
}

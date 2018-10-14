package com.suresh.spring.csvupload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.suresh.spring.csvupload.service.CsvUploadService;

@RestController
public class CsvUploadController {

	@Autowired
	private CsvUploadService csvUploadService;
	
	@RequestMapping("/")
	public String uploadCsv(MultipartFile file) {
		return csvUploadService.uploadCsvFile(file);
	}
}

package com.suresh.spring.csvupload.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.suresh.spring.csvupload.service.CsvUploadService;

@Service
public class CsvUploadServiceImpl implements CsvUploadService {

	@Override
	public String uploadCsvFile(MultipartFile file) {
		String message = "Success";
		
		return message;
	}
}

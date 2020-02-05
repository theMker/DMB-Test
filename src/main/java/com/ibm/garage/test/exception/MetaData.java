package com.ibm.garage.test.exception;

import java.util.HashMap;
import java.util.Map;

import com.ibm.garage.test.exception.ApiExceptionResponse;
import com.ibm.garage.test.exception.ErrorStatusCode;
import com.ibm.garage.test.model.*;

public class MetaData {

	public static final Map<String,Map<ErrorStatusCode, ApiExceptionResponse>> apiExceptions;
	
	static {		
		apiExceptions = new HashMap<String,Map<ErrorStatusCode, ApiExceptionResponse>>();

		Map<ErrorStatusCode, ApiExceptionResponse> responses; 
		try {
		
		
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}

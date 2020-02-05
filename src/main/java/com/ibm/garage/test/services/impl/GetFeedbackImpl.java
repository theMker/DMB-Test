package com.ibm.garage.test.services.impl;
 
import java.util.*;
 
import com.ibm.garage.test.model.GetFeedbackP;
import com.ibm.garage.test.model.GetFeedbackResponseWrapper;
import com.ibm.garage.test.services.GetFeedbackI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class GetFeedbackImpl implements GetFeedbackI {
 
    private static final Log logger = LogFactory.getLog(GetFeedbackImpl.class);
   
    @Override
    public GetFeedbackResponseWrapper execute(GetFeedbackP requestParams){
        //TODO
        return new GetFeedbackResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }

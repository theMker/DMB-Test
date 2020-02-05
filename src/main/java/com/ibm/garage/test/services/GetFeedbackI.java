package com.ibm.garage.test.services;

import com.ibm.garage.test.model.GetFeedbackP;
import com.ibm.garage.test.model.GetFeedbackResponseWrapper;

public interface GetFeedbackI {

    public GetFeedbackResponseWrapper execute(GetFeedbackP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}

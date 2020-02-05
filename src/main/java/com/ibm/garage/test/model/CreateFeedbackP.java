package com.ibm.garage.test.model;


public class CreateFeedbackP {

    private FeedbackInput feedbackInput;

    public CreateFeedbackP() {

    }

    public CreateFeedbackP(FeedbackInput feedbackInput) {
        this.feedbackInput = feedbackInput;
    }

    public FeedbackInput getFeedbackInput () {
        return feedbackInput;
    }

    public void setFeedbackInput (FeedbackInput feedbackInput) {
        this.feedbackInput = feedbackInput;
    }

}

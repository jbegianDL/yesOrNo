package com.detroitlabs.yesOrNo.Service;

import com.detroitlabs.yesOrNo.Model.Answer;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AnswerService {

    public Answer fetchAnswerData(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://yesno.wtf/api", Answer.class);
    }
}

package com.detroitlabs.yesOrNo.Controller;

import com.detroitlabs.yesOrNo.Model.Answer;
import com.detroitlabs.yesOrNo.Service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnswerController {

    @Autowired
    AnswerService answerService;

    @RequestMapping("/")
    public String displayHome(){
        return "home";
    }

    @RequestMapping("answer")
    public String displayAnswer(ModelMap modelMap){
        Answer answer = answerService.fetchAnswerData();
        String userAnswer = answer.getAnswer();
        String answerImage = answer.getImage();

        modelMap.put("userAnswer",userAnswer);
        modelMap.put("answerImage",answerImage);

        return "answer";
    }
}

package com.example.ms1.note;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @RequestMapping("/")
    public String main(Model model, ParamHandler paramHandler) {
       MainDataDto mainDataDto = mainService.getDefaultMainData(paramHandler.getKeyword());
       model.addAttribute("mainDataDto",mainDataDto);
        return "main";
    }


}

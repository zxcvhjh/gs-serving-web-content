package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

}

/*
전체 흐름 정리
사용자가 /greeting?name=John 이렇게 접속하면, name에 "John"이 들어옴
model.addAttribute("name", name) 으로 "John"이라는 값을 "name"이라는 이름으로 모델에 넣음
return "greeting" 하면, 스프링이 greeting.html 파일을 열어서,
그 안에서 ${name} 부분을 찾아 "John"으로 바꿔서 최종 화면을 만들어 줌
 */

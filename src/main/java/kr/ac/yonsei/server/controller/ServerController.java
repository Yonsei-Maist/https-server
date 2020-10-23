package kr.ac.yonsei.server.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class ServerController {

    @RequestMapping(value="/index")
    public String index() throws Exception {
        return "/templates/index.html";
    }
}

package br.com.emanuelli.Controller;

import br.com.emanuelli.Service.ConteudoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    @Autowired
    ConteudoServiceImpl conteudoService;



    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("conteudos", conteudoService.findAll());
        return "index";
    }
}
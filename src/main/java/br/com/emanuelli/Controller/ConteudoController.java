package br.com.emanuelli.Controller;

import br.com.emanuelli.Model.Conteudo;
import br.com.emanuelli.Service.AlunoServiceImpl;
import br.com.emanuelli.Service.ConteudoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConteudoController {
    @Autowired
    AlunoServiceImpl alunoService;

    @Autowired
    ConteudoServiceImpl conteudoService;

    @GetMapping("conteudo/add")
    public String add(Model model){
        model.addAttribute("conteudo", new Conteudo());
        model.addAttribute("alunos", alunoService.findAll());
        return "conteudo/add";
    }

    @PostMapping("/conteudo/save")
    public String save(Conteudo conteudo, Model model){
        if (conteudoService.save(conteudo)){
            return "redirect:/";
        }else{
            return "redirect:/";
        }
    }

    @GetMapping("/conteudo/edit/{id}")
    public String edit(@PathVariable long id, Model model){
        model.addAttribute("conteudo", conteudoService.findById(id));
        model.addAttribute("alunos", alunoService.findAll());
        return "conteudo/edit";
    }

    @GetMapping("/conteudo/delete/{id}")
    public String delete(@PathVariable long id){

        if (conteudoService.deleteById(id)){
            return "redirect:/";
        }else{


            return "/";
        }
    }
}

package br.com.emanuelli.Controller;

import br.com.emanuelli.Model.Aluno;
import br.com.emanuelli.Service.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlunoController {

    @Autowired
    AlunoServiceImpl alunoService;

    @GetMapping("/aluno/list")
    public String list(Model model) {

        model.addAttribute("alunos", alunoService.findAll());
        return "aluno/list";
    }

    @GetMapping("/aluno/add")
    public String add(Model model) {
        model.addAttribute("aluno", new Aluno());
        return "aluno/add";

    }

    @PostMapping("/aluno/save")
    public String save(Aluno aluno, Model model) {
        System.out.println("-->>>>>" + aluno);

        if (aluno != null) {
            if(alunoService.save(aluno) != null){
                model.addAttribute("salvou", true);
                model.addAttribute("erro", false);
                model.addAttribute("aluno", aluno);
            } else {
                model.addAttribute("salvou", false);
                model.addAttribute("erro", true);
                model.addAttribute("aluno", aluno);
            }
            return "aluno/edit";

        }else{
            return "redirect:/aluno/add";
        }
    }

    @GetMapping("/aluno/edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        model.addAttribute("aluno", alunoService.findById(id));
        return "aluno/edit";
    }

    @GetMapping("/aluno/delete/{id}")
    public String delete(@PathVariable Long id) {
        alunoService.delete(id);
        return "redirect:/aluno/list";
    }
}
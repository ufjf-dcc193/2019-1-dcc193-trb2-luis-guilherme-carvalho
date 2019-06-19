package br.carvalho.luis.trb02.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.carvalho.luis.trb02.model.AreaConhecimento;
import br.carvalho.luis.trb02.model.Trabalho;
import br.carvalho.luis.trb02.repository.IAreaConhecimentoRepository;
import br.carvalho.luis.trb02.repository.ITrabalhoRepository;

/**
 * TrabalhoController
 */
@Controller
public class TrabalhoController {

    @Autowired
    ITrabalhoRepository trabalhoRepo;

    @Autowired
    private IAreaConhecimentoRepository areaRepo;

    @GetMapping({"/trabalho","/trabalho/list"})
    public ModelAndView Index() {
        List<Trabalho> trabalhoList = trabalhoRepo.findAll(); 
        ModelAndView mv = new ModelAndView();
        mv.setViewName("trabalho-list");
        mv.addObject("trabalhoList", trabalhoList);
        return mv;
    }

    @GetMapping({"/trabalho/create"})
    public ModelAndView Create(Trabalho trabalho){
        ModelAndView mv = new ModelAndView();
        List<AreaConhecimento> areaList = areaRepo.findAll();
        mv.setViewName("trabalho-form");
        mv.addObject("trabalho", trabalho);
        mv.addObject("areaList", areaList);
        return mv;
    }

    @PostMapping(value="/trabalho/create")
    public ModelAndView Create(@Valid Trabalho trabalho, BindingResult binding){
        ModelAndView mv = new ModelAndView();
        if(binding.hasErrors())
        {
            mv.setViewName("trabalho-form");
            mv.addObject("trabalho", trabalho);
            return mv;
        }
        trabalhoRepo.save(trabalho);
        mv.setViewName("redirect:/trabalho");
        return mv;
    }
    
}
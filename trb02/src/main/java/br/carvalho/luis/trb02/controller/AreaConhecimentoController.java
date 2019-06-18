package br.carvalho.luis.trb02.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import br.carvalho.luis.trb02.model.AreaConhecimento;
import br.carvalho.luis.trb02.repository.IAreaConhecimentoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * AreaConhecimentoController
 */
@Controller
public class AreaConhecimentoController {

    @Autowired
    IAreaConhecimentoRepository areaRepo;

    @GetMapping({"/areaConhecimento","/areaConhecimento/list"})
    public ModelAndView Index() {
        List<AreaConhecimento> areaList = areaRepo.findAll(); 
        ModelAndView mv = new ModelAndView();
        mv.setViewName("area-conhecimento-list");
        mv.addObject("areaList", areaList);
        return mv;
    }

    @GetMapping({"/areaConhecimento/create"})
    public ModelAndView Create(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("area-conhecimento-form");
        return mv;
    }

    @PostMapping(value="/areaConhecimento/create")
    public ModelAndView Create(@Valid AreaConhecimento area, BindingResult binding){
        ModelAndView mv = new ModelAndView();
        if(binding.hasErrors())
        {
            mv.setViewName("area-conhecimento-form");
            mv.addObject("area", area);
            return mv;
        }
        areaRepo.save(area);
        mv.setViewName("redirect:areaConhecimento");
        return mv;
    }
    
    
}
package br.carvalho.luis.trb02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.carvalho.luis.trb02.model.AreaConhecimento;
import br.carvalho.luis.trb02.model.Avaliador;
import br.carvalho.luis.trb02.repository.IAreaConhecimentoRepository;
import br.carvalho.luis.trb02.repository.IAvaliadorRepository;

/**
 * AvaliadorController
 */
@Controller
public class AvaliadorController {

    @Autowired
    private IAvaliadorRepository avaliadorRepo;

    @Autowired
    private IAreaConhecimentoRepository areaRepo;

    @GetMapping({"/avaliador","/avaliador/list"})
    public ModelAndView Index(){
        List<Avaliador> avaliadorList = avaliadorRepo.findAll(); 
        ModelAndView mv = new ModelAndView();
        mv.setViewName("avaliador-list");
        mv.addObject("avaliadorList", avaliadorList);
        return mv;
    }

    @GetMapping({"/avaliador/create"})
    public ModelAndView Create(){
        ModelAndView mv = new ModelAndView();
        List<AreaConhecimento> areaList = areaRepo.findAll();
        mv.setViewName("avaliador-form");
        mv.addObject("areaList", areaList);
        return mv;
    }
}
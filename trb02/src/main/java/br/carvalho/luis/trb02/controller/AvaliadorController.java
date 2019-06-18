package br.carvalho.luis.trb02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * AvaliadorController
 */
@Controller
public class AvaliadorController {

    @RequestMapping({"/avaliador","/avaliador/list"})
    public ModelAndView Index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("avaliador-list");
        return mv;
    }
}
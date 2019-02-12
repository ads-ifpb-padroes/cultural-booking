package br.edu.ifpb.cultural.booking.controller;

import br.edu.ifpb.cultural.booking.infra.model.AtracaoRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class AtracaoController {

    @Inject
    private AtracaoRepository repository;



}

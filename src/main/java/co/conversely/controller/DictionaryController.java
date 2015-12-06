package co.conversely.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import co.conversely.domain.Dictionary;
import co.conversely.service.DictionaryRepository;

@Controller
@RequestMapping("dictionaries")
public class DictionaryController {

  @Autowired
  private DictionaryRepository repo;

  @ModelAttribute("dictionaries")
  public Iterable<Dictionary> messages() {
    return repo.findAll();
  }

  @RequestMapping("")
  public String index(Dictionary dictionary) {
    return "dictionaries";
  }

}

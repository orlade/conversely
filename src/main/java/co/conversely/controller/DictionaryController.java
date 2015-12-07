package co.conversely.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
  public String showList(Dictionary dictionary) {
    return "dictionary/list";
  }

  @RequestMapping("{id}")
  public String showItem(@PathVariable("id") Long id, Model model) {
    model.addAttribute("dictionary", repo.findOne(id));
    return "dictionary/item";
  }

}

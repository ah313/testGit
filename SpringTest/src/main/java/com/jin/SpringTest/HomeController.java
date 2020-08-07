package com.jin.SpringTest;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
   
   private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
   
   private Map<String, String> map;
   public HomeController() {
      map = new HashMap<String, String>();
      
      //member
      map.put("login", "/member/");
      map.put("myPage", "/member/");
      map.put("email", "/member/");
      
      //seoul
      map.put("intro", "/seoul/");
      map.put("join", "/seoul/");
   }
   
   @RequestMapping(value = "/")
   public String home() {
      return "home1";
   }
   @RequestMapping(value = "/{pathName}")
   public String home(@PathVariable String pathName) {
      return map.get(pathName)+pathName;
   }
   /**
    * Simply selects the home view to render by returning its name.
    */
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String home(Locale locale, Model model) {
      logger.info("Welcome home! The client locale is {}.", locale);
      
      Date date = new Date();
      DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
      
      String formattedDate = dateFormat.format(date);
      
      model.addAttribute("serverTime", formattedDate );
      
      return "home1";
   }
}
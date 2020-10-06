package com.heinzelman.lipinski.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class requestController {

    @RequestMapping({"/","/index","index.html","/home","/home.html"})
    public String requestHome(Model model){
        String home ="&lt;br/&gt;<br/>• pełnę diagnostykę komputerową<br/>• usługi z zakresu mechaniki ogólnej pojazdów<br/>• doradztwo i przegląd przy zakupie pojazdów<br/>• usługę \"Pojazdowa Pierwsza Pomoc\" - pomoc i dojazd do uszkodzonego lub niesprawnego pojazdu<br/>• <a href=\"/wulkanizacja\">wulkanizację opon</a><br/>• karty rabatowe dla stałych klientów<br/>• okresowe akcje promocyjne<br/></p><p><br></p><p></p><h2>Ponadto doradzamy naszym klientom w zakresie: </h2><p><br></p><p>- napraw, wymiany i przyciemniania szyb samochodowych<br>- naprawy zamków samochodowych, dorabiania i kodowania kluczyków, kodowania imobilajzerów, awaryjnego otwierania samochodów<br>- chiptuningu i elektroniki samochodowej<br>- ustawienia geometrii kół";



        String lead = "Obsługujemy samochody osobowe i dostawcze wszystkich marek <br/>o masie poniżej 3,5 t.<br/><br/>Oferujemy:";

        String text = "• pełną diagnostykę komputerową<br/>• usługi z zakresu mechaniki ogólnej pojazdów<br/>" +
                "• doradztwo i przegląd przy zakupie pojazdów<br/>• usługę \"Pojazdowa Pierwsza Pomoc\" - pomoc i dojazd do uszkodzonego lub niesprawnego pojazdu<br/>" +
                "• wulkanizację opon<br/>• karty rabatowe dla stałych klientów<br/>• okresowe akcje promocyjne<br/>";

        String lead2 = "Ponadto doradzamy naszym klientom w zakresie:";
        String text2 = "- napraw, wymiany i przyciemniania szyb samochodowych<br/>" +
                "- naprawy zamków samochodowych, dorabiania i kodowania kluczyków,<br/>- kodowania imobilajzerów, awaryjnego otwierania samochodów<br/>" +
                "- chiptuningu i elektroniki samochodowej<br/>" +
                "- ustawienia geometrii kół";

        model.addAttribute("title","Auto Serwis Piotr Lipiński");
        model.addAttribute("lead",lead);
        model.addAttribute("text",text);
        model.addAttribute("lead2",lead2);
        model.addAttribute("text2",text2);

        return "index";
    }


    @RequestMapping("/kontakt")
    String kontaktRequest( Model model ){
        String title="Auto Serwis Piotr Lipiński";
        String lead="kontakt:";
        String text = "Piotr Lipiński Auto Serwis<br/>" +
                "tel. 502 907 204<br/>" +
                "e-mail: <a href=\"mailto:warsztat@lipinskiautoserwis.pl\">warsztat@lipinskiautoserwis.pl</a><br/>";

        String lead2="";
        String text2="ul. Syreny 14, hala nr.16<br/>01-132 Warszawa<br/>" +
                "NIP: 118-181-20-37<br/><br/>www.LipinskiAutoSerwis.pl";

        model.addAttribute("title",title);
        model.addAttribute("lead",lead);
        model.addAttribute("text",text);
        model.addAttribute("lead2",lead2);
        model.addAttribute("text2",text2);
        return "index";
    }



    @RequestMapping("/wulkanizacja")
    String wulkanizacjaRequest( Model model ){
        String title="Wulkanizacja";
        String lead="";
        String text = "• wulkanizacja<br/>" +
                "• wyważanie kół<br/>" +
                "• zmiana opon<br/>" +
                "• przechowywanie opon i kół klientów";

        String lead2="";
        String text2="";

        model.addAttribute("title",title);
        model.addAttribute("lead",lead);
        model.addAttribute("text",text);
        model.addAttribute("lead2",lead2);
        model.addAttribute("text2",text2);
        return "index";
    }


    @RequestMapping("/dojazd")
    String dojazdRequest( Model model ){
        String title="Auto Serwis Piotr Lipiński";
        String lead="";
        String text = "<iframe width=\"100%\" height=\"800px\" frameborder=\"0\" style=\"border:0\" allowfullscreen=\"\" src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2443.421263910288!2d20.9606561157969!3d52.2357315797613!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x471ecb5d6e171c51%3A0x8fc3b481a8b1e15a!2sLipi%C5%84ski+Auto+Serwis!5e0!3m2!1spl!2spl!4v1545522898887\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>\n";

        String lead2="";
        String text2="";

        model.addAttribute("title",title);
        model.addAttribute("lead",lead);
        model.addAttribute("text",text);
        model.addAttribute("lead2",lead2);
        model.addAttribute("text2",text2);
        return "index";
    }
}

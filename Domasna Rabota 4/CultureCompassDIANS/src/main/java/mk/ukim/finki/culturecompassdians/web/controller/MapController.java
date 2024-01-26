package mk.ukim.finki.culturecompassdians.web.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/map")
public class MapController {
    private final String openRouteServiceApiKey = "5b3ce3597851110001cf6248c7904ed6627f4afbbfe8257201c3a8ef";

    @GetMapping()
    public String showPathView(Model model) {
        model.addAttribute("bodyContent", "navigate");

        return "master-template";
    }

    @PostMapping("/findRoute")
    public String findRoute(@RequestParam("startLat") double startLat,
                            @RequestParam("startLon") double startLon,
                            @RequestParam("endLat") double endLat,
                            @RequestParam("endLon") double endLon,
                            HttpSession session, Model model) {

        session.setAttribute("startLat", startLat);
        session.setAttribute("startLon", startLon);
        session.setAttribute("endLat", endLat);
        session.setAttribute("endLon", endLon);
        model.addAttribute("bodyContent", "navigate");
        return "master-template";
    }
}

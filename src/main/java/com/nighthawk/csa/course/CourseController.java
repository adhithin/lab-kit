package com.nighthawk.csa.course;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class CourseController {

    @GetMapping("/course/repos")
    public String courseRepos(Model model) {
        return "course/repos";
    }

    @GetMapping("/course/deploy")
    public String courseDeploy(Model model) {
        return "course/deploy";
    }

    @GetMapping("/course/prep")
    public String coursePrep(Model model) {
        model.addAttribute("url", "https://padlet.com/jmortensen7/csatime");
        return "course/timelines";
    }

    @GetMapping("/course/tri1")
    public String courseTri1(Model model) {
        model.addAttribute("url", "https://padlet.com/jmortensen7/csa2022tri1");
        return "course/timelines";
    }

    @GetMapping("/course/tri2")
    public String courseTri2(Model model) {
        model.addAttribute("url", "https://padlet.com/jmortensen7/csa2022tri2");
        return "course/timelines";
    }

}
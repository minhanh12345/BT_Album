package controllers;

import Model.Album;
import Service.ServiceSong;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.swing.tree.AbstractLayoutCache;
import java.io.File;
import java.io.IOException;

@Controller
public class HomeController {
    @GetMapping("/show")
    public String show(HttpServletRequest request) {
        request.setAttribute("list", ServiceSong.list);
        return "show";
    }

    @GetMapping("/create")
    public String showCreate() {
        return "create";
    }

    @PostMapping("/create")
    public String create(@RequestParam MultipartFile multipartFile, @ModelAttribute Album album) {
        String nameFile = multipartFile.getName();
        try {
            FileCopyUtils.copy(multipartFile.getBytes(), new File("C:\\Users\\Admin\\IdeaProjects\\BT_data\\src\\main\\webapp\\file" + nameFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ServiceSong.create(album);
        return "redirect:/show";
    }

}

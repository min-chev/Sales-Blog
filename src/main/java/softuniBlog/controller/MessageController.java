package softuniBlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import softuniBlog.bindingModel.MessageBindingModel;
import softuniBlog.entity.*;
import softuniBlog.repository.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MessageController {

    @Autowired
    private MsgRepository msgRepository;

    @GetMapping("/message/create")

    public String create(Model model){
       model.addAttribute("view","home/contact");

        return "base-layout";
    }

    @PostMapping("/message/create")
    public String createProcess(MessageBindingModel messageBindingModel){
        Message msgEntity = new Message(
                messageBindingModel.getTitle(),
                messageBindingModel.getContent(),
                messageBindingModel.getPhoneormail()

                );
        this.msgRepository.saveAndFlush(msgEntity);
        return "redirect:/";
    }

}

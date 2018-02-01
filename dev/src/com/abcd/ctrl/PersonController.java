package com.abcd.ctrl;

import com.abcd.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons_details")
public class PersonController {

    //DAO to get and set Person detail
    private PersonDAO  persondao = new PersonDAO();

    public List<Person> getAllPersonList(){
        List<Person> list = persondao.getAllPersonList();
        return list;
    }

}

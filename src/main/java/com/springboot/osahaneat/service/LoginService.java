package com.springboot.osahaneat.service;

import com.springboot.osahaneat.dto.UserDTO;
import com.springboot.osahaneat.entity.Users;
import com.springboot.osahaneat.repository.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {
    @Autowired
    UserInterface userInterface;

    public List<UserDTO> getAllUser(){
        List<Users> listUser = userInterface.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();

        for(Users users:listUser){
            UserDTO userDTO = new UserDTO();
            userDTO.setId(users.getId());
            userDTO.setUserName(users.getUserName());
            userDTO.setFullname(users.getFullname());
            userDTO.setPassword(users.getPassword());

            userDTOList.add(userDTO);
            //System.out.println(users.getFullname());
        }
        return userDTOList;
    }


}

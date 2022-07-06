package com.sagi.dates.logic;

import com.sagi.dates.dto.UserDto;
import com.sagi.dates.entities.UserEntity;
import com.sagi.dates.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersLogic {

    @Autowired
    private IUserRepository userRepository;

    public long createUser(UserDto userDto){
        UserEntity userEntity = new UserEntity(userDto);
        userRepository.save(userEntity);
        return userEntity.getId();
    }

    public UserDto getUserById(long id){
        UserEntity userEntity = userRepository.findById(id).get();
        UserDto userDto = new UserDto(userEntity);
        return userDto;
    }

    public void deleteUserById(long id){
        userRepository.deleteById(id);
    }

    public void updateUser(UserDto userDto){
        UserEntity userEntity = new UserEntity(userDto);
        userRepository.save(userEntity);
    }

}

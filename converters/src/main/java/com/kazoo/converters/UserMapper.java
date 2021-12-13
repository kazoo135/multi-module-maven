package com.kazoo.converters;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.kazoo.domain.UserCommand;
import com.kazoo.entities.User;

@Mapper
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	UserCommand userIdUseCommand(User user);
	User userToUseCommand(UserCommand userCommand);
}

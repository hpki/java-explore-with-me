package ru.practicum.explorewithme.user.mapper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import ru.practicum.explorewithme.user.dto.NewUserDto;
import ru.practicum.explorewithme.user.model.User;
import ru.practicum.explorewithme.user.dto.UserDto;

import java.util.HashSet;

import static java.lang.Boolean.FALSE;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserMapper {

    public static UserDto toUserDto(User user) {
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }

    public static User toUser(NewUserDto userDto) {
        return new User(
                null,
                userDto.getName(),
                userDto.getEmail(),
                new HashSet<>(),
                FALSE
        );
    }
}

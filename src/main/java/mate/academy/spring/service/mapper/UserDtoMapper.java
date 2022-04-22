package mate.academy.spring.service.mapper;

import mate.academy.spring.dto.UserResponseDto;
import mate.academy.spring.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoMapper {

    public UserResponseDto parse(User user) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setFirstName(user.getFirstName());
        userResponseDto.setLastName(user.getLastName());
        return userResponseDto;
    }

    public User toUser(UserResponseDto responseDto) {
        User user = new User();
        user.setId(responseDto.getId());
        user.setFirstName(responseDto.getFirstName());
        user.setLastName(responseDto.getLastName());
        return user;
    }
}
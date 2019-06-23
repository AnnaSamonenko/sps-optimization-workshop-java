package sps.optimization.workshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sps.optimization.workshop.dao.UserDAO;
import sps.optimization.workshop.dto.TagDTO;

import java.util.List;

@Service
public class UserService {

    private UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<TagDTO> getTopTags() {
        return null;
    }

}

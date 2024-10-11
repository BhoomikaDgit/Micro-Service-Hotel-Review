package com.Mvc.UserService.repositories.Services;
import com.Mvc.UserService.entities.User;
import java.util.List;
public interface UserSrvice  {
//user operations
    //create
 User saveUser(User user);

 //get all user
    List<User> getAllUser();
    //get single user of given userId
    User getUser(String userId);
    //TODO:delete
    //TODO:update
}

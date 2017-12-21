package www.leeao.action;

import java.util.List;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import www.leeao.domain.User;

@RestController
@RequestMapping("user")
public class UserAction {
  Logger log = Logger.getLogger(UserAction.class.getName());

  @GetMapping
  public List<User> findAll(){
    log.info("---------");
    return null;
  }

  @GetMapping("/{id}")
  public List<User> findBy(@PathVariable("id") Integer id){
    log.info("id:" + id);
    return null;
  }

  @PutMapping
  public void saveUser(User user){
    log.info(user.toString());
    log.info("李四");
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable("id") Integer id){
    log.info("id:" + id);
  }

}

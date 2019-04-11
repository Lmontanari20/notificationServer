package capstone.notificationServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(path="/notifications")
public class controller {
    @Autowired
    private notificationsRepository notificationsRepository;

    @Autowired
    @RequestMapping(path="/all")
    public @ResponseBody Iterable<notifications> getAllNotifications() {
        return notificationsRepository.findAll();
    }
}

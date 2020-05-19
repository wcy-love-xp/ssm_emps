import com.wang.dao.UserMapper;
import com.wang.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class TestDao {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testUser() {
        for (User user : userMapper.findAll()) {
            System.out.println(user);
        }
    }
}

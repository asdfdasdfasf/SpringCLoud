import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.mapper.AdminMapper;
import com.atguigu.crowd.service.api.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/5/11 20:17
 */
//类上标记必要的注解，spring整合junit
@ContextConfiguration(locations = {"classpath:spring-persist-mybatis.xml","classpath:spring-persist-tx.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MyTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private AdminMapper mapper;

    @Autowired
    private AdminService adminService;

    @Test
    public void test(){
        System.out.println("dataSource="+dataSource);
    }

    @Test
    public void  getLog(){
        Logger logger = LoggerFactory.getLogger(MyTest.class);
        logger.debug("debug!");
        logger.info("info");
        logger.warn("warn!");
        logger.error("error");
    }
    @Test
    public void testServcie(){
        adminService.save(new Admin(null,"1","1","1","1","1"));
    }
}

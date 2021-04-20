package forum.perosonalforum;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@Slf4j
@SpringBootTest
class PerosonalforumApplicationTests {

    @Test
    void contextLoads() {
        log.info("this is test");
        BigDecimal bigDecimal = new BigDecimal("100");
        log.info(String.valueOf(bigDecimal.multiply(new BigDecimal("20"))));
        log.info("this is test ");

    }

}

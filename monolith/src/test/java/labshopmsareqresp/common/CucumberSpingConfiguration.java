package labshopmsareqresp.common;


import labshopmsareqresp.MonolithApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MonolithApplication.class })
public class CucumberSpingConfiguration {
    
}

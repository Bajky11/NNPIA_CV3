package nnpia_cv3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class NnpiaCv3Application {

    @Autowired
    JdbcTemplate jdbcTemplate;
    //test

    public static void main(String[] args) {
        SpringApplication.run(NnpiaCv3Application.class, args);
    }

}

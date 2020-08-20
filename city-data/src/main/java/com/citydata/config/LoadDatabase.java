package com.citydata.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.citydata.entity.City;
import com.citydata.entity.User;
import com.citydata.service.CityService;
import com.citydata.service.UserService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;


@Configuration
public class LoadDatabase {
	
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Value("${data.users:admin,userman,user1,user2,user3,user4,user5}")
    private String[] users;
    
    @Value("${data.description:sky viewing,winter break,sun bathing,moon viewing,spring holiday,weekend holidays,fall views,summer holiday,mountain climbing,bike ridding}")
    private String[] description;
    
    @Value("${data.cities:Kampala,Nairobi,London,New York,Washington Dc,Paris,Hong Kong,Barln, Mosco,Cairo, Abuja, Machester}")
    private String[] cities;
    
    @Value("${data.subDesc:good for, known for, destination for}")
    private String[] subDesc;
    

    @Value("clientSecret:secret")
    private String clientSecret;

    public static int getRandomNumberInts(int min, int max){
        Random random = new Random();
        return random.ints(min,(max+1)).findFirst().getAsInt();
    }

    @Bean
    CommandLineRunner initUsers(UserService repo, BCryptPasswordEncoder passwordEncoder) {

        return args -> {
            for (int i = 0; i < users.length; i++) {
                String email = users[i] + "@" + users[i] + ".com";
              //  User.Role role = i > 1 ? User.Role.USER : i == 0 ? User.Role.ADMIN : User.Role.USER_MANAGER;
              
                String pwd = passwordEncoder.encode("pwd");
                System.out.println("Password : "+pwd);
              log.info("save {}", repo.save(new User(email, pwd)));
            }
        };
    }
    
    @Bean
    CommandLineRunner initCities(CityService repo) {

        return args -> {
            for (int i = 0; i < cities.length; i++) {
                String desc = subDesc[getRandomNumberInts(0,subDesc.length-1)]+" "+description[getRandomNumberInts(0,description.length-1)];
                 long numberOfCitizens = getRandomNumberInts(1000,10000000);
                 LocalDateTime now = LocalDateTime.now();
          //    System.out.println("Citye: "+cities[i]+", Dec :"+desc+ " No. of people: "+numberOfCitizens);
                 log.info("save {}", repo.save(new City(cities[i], desc, numberOfCitizens, now)));
            }
        };
    }


}

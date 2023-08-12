//package com.example.demo.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import javax.sql.DataSource;
//@Configuration
//@EnableWebSecurity
//public class SpringConfig {
//    
//	/**@Autowired
//    private DataSource dataSource;
//	@Bean
//	public UserDetailsService userDetailsService() {
//        
//		JdbcDaoImpl jdbcUserDetailsService = new JdbcDaoImpl();
//        jdbcUserDetailsService.setDataSource(dataSource);
//        jdbcUserDetailsService.setUsersByUsernameQuery(
//            "SELECT user_email, user_password, enabled FROM hr WHERE username = ?");
//        jdbcUserDetailsService.setAuthoritiesByUsernameQuery(
//            "SELECT username, authority FROM app_user_authorities WHERE username = ?");
//        return jdbcUserDetailsService;
//    }**/
//	@Bean
//	public UserDetailsManager userDetailsManager(DataSource dataSource)
//	{
//		return new JdbcUserDetailsManager(dataSource);
//	}
//	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
//	{
//		http.authorizeHttpRequests(configurer -> configurer
//				.antMatchers(HttpMethod.POST,"/api/create-hr").hasRole("ADMIN")
//				.antMatchers(HttpMethod.POST,"/api/login").hasAnyRole("MANAGER","ADMIN")
//				.antMatchers(HttpMethod.GET,"/api/hrDetails/all").hasAnyRole("MANAGER","ADMIN")
//				.antMatchers(HttpMethod.DELETE,"/api/hrdelete/id").hasRole("ADMIN")
//				.antMatchers(HttpMethod.GET,"/api/HR/{id}").hasAnyRole("ADMIN","MANAGER")
//		        .antMatchers(HttpMethod.PATCH,"/api/updateHR").hasAnyRole("ADMIN","MANAGER"));
//		http.httpBasic();
//		http.cors().disable();
//		http.csrf().disable();
//		return http.build();
//	}
//}

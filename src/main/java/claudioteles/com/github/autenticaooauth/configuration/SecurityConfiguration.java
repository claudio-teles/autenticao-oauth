package claudioteles.com.github.autenticaooauth.configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.antMatchers("/usuario").anonymous()
			.antMatchers("//usuario/atualizar").anonymous()
			.antMatchers("/usuarios").anonymous()
			.antMatchers("/cadastro").anonymous()
			.antMatchers("/").permitAll();
	}

}

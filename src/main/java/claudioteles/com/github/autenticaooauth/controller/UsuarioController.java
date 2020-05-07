package claudioteles.com.github.autenticaooauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.ModelAndView;

import claudioteles.com.github.autenticaooauth.model.Pessoa;

@Controller
@SessionScope
public class UsuarioController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping(value="/cadastro", method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView visualizarcadastro() {
		ModelAndView viewCadastro = new ModelAndView("cadastro");
		return viewCadastro;
	}
	
	@RequestMapping(value="/usuario/{id}", method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView verUsuariId(@PathVariable("id") Long id) {
		ModelAndView viewUsuarioId = new ModelAndView("verUsuarioId");
		return viewUsuarioId;
	}
	
	@RequestMapping(value="/usuario/atualizar{id}", method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView atualizarId(@PathVariable("id") Long id) {
		ModelAndView viewAtualizarUsuarioId = new ModelAndView("atualizarUsuarioId");
		return viewAtualizarUsuarioId;
	}
	
	@RequestMapping(value="/usuarios", method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView verUsuarios() {
		ModelAndView viewUsuarios = new ModelAndView("usuarios");
		return viewUsuarios;
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value="/cadastro", method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView fazercadastrar(@RequestBody Pessoa pessoa) {
		ModelAndView viewCadastro = new ModelAndView("cadastro");
		String insert = "INSERT INTO PUBLIC.PUBLIC.PESSOA (NOME, EMAIL, CPF, SEXO, DATA_NASC, NATURALIDADE, NACIONALIDADE) "
				+ "VALUES("+pessoa.getNome()+", "+pessoa.getEmail()+", "+pessoa.getCpf()+", "+pessoa.getSexo()+", "+pessoa.getDatadeNascimento().toGMTString()+", "
						+ ""+pessoa.getNaturalidade()+", "+pessoa.getNacionalidade()+")";
		jdbcTemplate.update(insert);
		return viewCadastro;
	}

}

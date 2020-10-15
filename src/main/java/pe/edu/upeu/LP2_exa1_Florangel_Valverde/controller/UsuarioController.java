package pe.edu.upeu.LP2_exa1_Florangel_Valverde.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.LP2_exa1_Florangel_Valverde.entity.Usuario;
import pe.edu.upeu.LP2_exa1_Florangel_Valverde.security.JwtUtil;
import pe.edu.upeu.LP2_exa1_Florangel_Valverde.service.UsuarioService;

@RestController
public class UsuarioController {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private JwtUtil jwtUtil;

	@GetMapping("/")
	public String mensaje() {
		return "Bienvenidos a Microservicios Síncronos";
	}

	@PostMapping("/authenticate")
	public String generateToken(@RequestBody Usuario authRequest) throws Exception {
		try {
			System.out.println(authRequest.getNomuser());
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getNomuser(), authRequest.getClave()));
		} catch (Exception ex) {
			throw new Exception("Error: " + ex);
		}
		return jwtUtil.generateToken(authRequest.getNomuser());
	}

}
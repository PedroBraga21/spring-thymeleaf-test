package br.com.alura.mvc.mudi.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Novo Echo Dot");
		pedido.setUrlProduto("https://www.amazon.com.br/Staging-Product-Not-Retail-Sale/dp/B084KV8YRR/ref=zg_bs_electronics_home_1?_encoding=UTF8&psc=1&refRID=A8KB53C8C3TC259EAP43");
		pedido.setValorNegociado(new BigDecimal(284.05));
		pedido.setDescricao("Conheça o novo Echo Dot: nosso smart speaker com Alexa de maior sucesso ainda melhor.");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/71Z2bLQ8NmL._AC_SL1000_.jpg");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
	
}

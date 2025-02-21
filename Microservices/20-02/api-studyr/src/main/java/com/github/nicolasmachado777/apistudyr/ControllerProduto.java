package com.github.nicolasmachado777.apistudyr;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produto")
public class ControllerProduto {


    //só tem esses post put e get por conta que diz na imagem 
    @PostMapping
public String create(){
    return "Produto Criado";
}
@PutMapping
public String update(){
    return "Produto atualizado";
}
@GetMapping
public String find(){
    return "Maça";
}
@DeleteMapping
public void delete(){
    
}
}

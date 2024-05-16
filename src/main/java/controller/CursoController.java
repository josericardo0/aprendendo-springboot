package controller;

import model.Curso;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;
@RestController
public class CursoController {


    @RequestMapping("/cursos")
    public List<Curso>retornarTodosOsCursos() {
        return Arrays.asList(
                new Curso(1L, "Filosofia", "Mário Sérgio Cortella"),
                new Curso(2L, "Matemática", "Ledo Vaccaro"),
                new Curso(3L, "Geologia", "Sérgio Sacani"),
                new Curso(4L, "Sistemas para Internet", "Gustavo Guanabara"),
                new Curso(5L, "Jogos Digitais", "José Ricardo Borges Filho")
        );
    }
}

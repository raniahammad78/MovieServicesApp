package tr.edu.altinbas.app.service.rest.movie.controller;

import tr.edu.altinbas.app.service.rest.movie.dto.DirectorsDetailDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/director/directors")
public class DirectorController {

    @GetMapping("all")
    public DirectorsDetailDTO findAllDetail()
    {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("find/movie")
    public DirectorsDetailDTO findByMovieId(@RequestParam("id") long movieId)
    {
        throw new UnsupportedOperationException("TODO");
    }
}

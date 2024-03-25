package tr.edu.altinbas.app.service.rest.movie.controller;

import tr.edu.altinbas.app.service.rest.movie.service.MovieAppService;
import tr.edu.altinbas.app.service.rest.movie.dto.MovieSaveDTO;
import tr.edu.altinbas.app.service.rest.movie.dto.MoviesDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/movie/movies")
public class MovieController {
    @GetMapping("count")
    public long count()
    {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("find/sdate/month")
    public MoviesDTO findByMonth(@RequestParam(name = "m") int month)
    {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("find/sdate/year")
    public MoviesDTO findByYear(@RequestParam(name = "y") int year)
    {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("find/sdate/my")
    public MoviesDTO findByMonthAndYear(int month, int year)
    {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("find/sdate/year/between")
    public MoviesDTO findByYearBetween(int begin, int end)
    {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("find/director")
    public MoviesDTO findByDirectorId(@RequestParam("id") long directorId)
    {
        throw new UnsupportedOperationException("TODO");
    }

    @PostMapping("save")
    public MovieSaveDTO save(@RequestBody MovieSaveDTO movieSaveDTO)
    {
        throw new UnsupportedOperationException("TODO");
    }
}

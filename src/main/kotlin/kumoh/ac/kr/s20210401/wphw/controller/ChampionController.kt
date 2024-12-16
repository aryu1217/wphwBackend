package kumoh.ac.kr.s20210401.wphw.controller

import kumoh.ac.kr.s20210401.wphw.model.Champion
import kumoh.ac.kr.s20210401.wphw.service.ChampionService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins=["http://localhost:3000"])
class ChampionController(private val service: ChampionService) {
    @GetMapping("/champ")
    fun getAllChampions(): List<Champion> = service.getAllChampions()
}
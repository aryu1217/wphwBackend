package kumoh.ac.kr.s20210401.wphw.service

import kumoh.ac.kr.s20210401.wphw.model.Champion
import kumoh.ac.kr.s20210401.wphw.repository.ChampionRepository
import org.springframework.stereotype.Service

@Service
class ChampionService(private val repository: ChampionRepository) {
    fun getAllChampions(): List<Champion> = repository.findAll()
}
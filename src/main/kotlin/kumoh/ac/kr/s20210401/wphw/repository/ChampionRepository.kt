package kumoh.ac.kr.s20210401.wphw.repository

import kumoh.ac.kr.s20210401.wphw.model.Champion
import org.springframework.data.mongodb.repository.MongoRepository


interface ChampionRepository: MongoRepository<Champion, String> {
}
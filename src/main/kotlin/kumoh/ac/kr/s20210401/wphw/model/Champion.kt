package kumoh.ac.kr.s20210401.wphw.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("champions")
data class Champion(
    @Id
    val id: String,
    val name: String,
    val line: String,
    val proficiency: Int,
    val content: String,
    val img_url: String,
    val ename: String
)

package com.example.homework6recyclerview

data class Employee(val id: Long, val name: String, val photo: String, val department: String, var isLike: Boolean) {
    companion object {
        fun getMockEmployees() = listOf(
            Employee(
                0,
                "Dwayne Johnson",
                "https://upload.wikimedia.org/wikipedia/commons/f/f1/Dwayne_Johnson_2%2C_2013.jpg",
                "Fitness department",
                false
            ),
            Employee(
                1,
                "Tom Cruise",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Tom_Cruise_by_Gage_Skidmore_2.jpg/800px-Tom_Cruise_by_Gage_Skidmore_2.jpg",
                "Action department",
                false
            ),
            Employee(
                2,
                "Jim Carrey",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/Jim_Carrey_2008.jpg/800px-Jim_Carrey_2008.jpg",
                "Comedy department",
                false
            ),
            Employee(
                3,
                "Emily Blunt",
                "https://puzzleit.ru/files/puzzles/145/144615/_original.jpg",
                "Adventures department",
                false
            ),
            Employee(
                4,
                "Emilia Clarke",
                "https://i.pinimg.com/originals/2b/5f/7c/2b5f7c959bfa6aa5d756c700ed61a9f0.jpg",
                "Game of thrones department",
                false
            ),
            Employee(
                5,
                "Ryan Reynolds",
                "https://img.buzzfeed.com/buzzfeed-static/static/2018-05/18/18/asset/buzzfeed-prod-web-02/sub-buzz-420-1526684304-7.jpg",
                "Comedy department",
                false
            ),
            Employee(
                6,
                "Emma Stone",
                "https://celebmafia.com/wp-content/uploads/2018/05/emma-stone-met-gala-2018-8.jpg",
                "Bad girls department",
                false
            ),
            Employee(
                7,
                "Robert Downey Jr",
                "https://astrus.su/wp-content/uploads/2019/08/robert-dauni-j.jpg",
                "Avengers department",
                false
            ),
        )
    }
}
package com.ilhamfidatama.androidwithkotlin

object Utils {
    const val EXTRA_USERNAME = "username"

    val movies: MutableList<Movie> = mutableListOf(
        Movie(name = "The Ragnarok", popularity = 135.055, imagePath = "https://image.tmdb.org/t/p/w500/rzRwTcFvttcN1ZpX2xv4j3tSdJu.jpg"),
        Movie(name = "Spider-Man: Homecoming", popularity = 140.322, imagePath = "https://image.tmdb.org/t/p/w500/c24sv2weTHPsmDa7jEMN0m2P3RT.jpg"),
        Movie(name = "Logan", popularity = 82.796, imagePath = "https://image.tmdb.org/t/p/w500/fnbjcRDYn6YviCcePDnGdyAkYsB.jpg"),
        Movie(name = "Doctor Strange", popularity = 118.368, imagePath = "https://image.tmdb.org/t/p/w500/xf8PbyQcR5ucXErmZNzdKR0s8ya.jpg"),
        Movie(name = "Deadpool", popularity = 93.844, imagePath = "https://image.tmdb.org/t/p/w500/8peYuPeLawgCFhuI4IcDjdrAAXw.jpg"),
        Movie(name = "Ant-Man", popularity = 43.368, imagePath = "https://image.tmdb.org/t/p/w500/rQRnQfUl3kfp78nCWq8Ks04vnq1.jpg"),
        Movie(name = "The Wolverine", popularity = 93.23, imagePath = "https://image.tmdb.org/t/p/w500/9zvDWFdc22pzq0BMcEsQaakBgPj.jpg")
    )

    val images = mutableListOf<String>(
            "https://image.tmdb.org/t/p/w500/coJVIUEOToAEGViuhclM7pXC75R.jpg",
            "https://image.tmdb.org/t/p/w500/c24sv2weTHPsmDa7jEMN0m2P3RT.jpg",
            "https://image.tmdb.org/t/p/w500/y4MBh0EjBlMuOzv9axM4qJlmhzz.jpg",
            "https://image.tmdb.org/t/p/w500/2mtQwJKVKQrZgTz49Dizb25eOQQ.jpg",
            "https://image.tmdb.org/t/p/w500/rAGiXaUfPzY7CDEyNKUofk3Kw2e.jpg",
            "https://image.tmdb.org/t/p/w500/oeMpEsjmiT9PEJbRM1Fm7TZ1dE0.jpg",
            "https://image.tmdb.org/t/p/w500/4ssDuvEDkSArWEdyBl2X5EHvYKU.jpg",
            "https://image.tmdb.org/t/p/w500/r7vmZjiyZw9rpJMQJdXpjgiCOk9.jpg",
            "https://image.tmdb.org/t/p/w500/bvN8iUpHyBIvniUk4e52SUZMA7Z.jpg"
    )
}

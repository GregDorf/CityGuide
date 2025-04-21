package com.example.cityguide

import com.example.cityguide.ui.theme.Categories
import com.example.cityguide.ui.theme.PlaceData
import com.example.cityguide.ui.theme.listPlaces

fun setDefaultPlaces() {
    var idCounter = 0
    listPlaces.add(
        PlaceData(
            category = Categories.ENTERTAINMENT,
            name = "Летний сад им. Максима Горького",
            details = "Один из старейших парков Ижевска с аттракционами, зелёными аллеями и местами для отдыха. Популярное место для семейных прогулок.",
            id = idCounter++,
            imageRes = R.drawable.gorkiypark
        )
    )
    listPlaces.add(
        PlaceData(
            category = Categories.ENTERTAINMENT,
            name = "Парк культуры и отдыха им. С.М. Кирова",
            details = "Крупнейший парк города с разнообразными аттракционами, велодорожками, пляжем и местами для пикников. Зимой функционирует каток и лыжная трасса.",
            id = idCounter++,
            imageRes = R.drawable.kirovpark
        )
    )
    listPlaces.add(
        PlaceData(
            category = Categories.ENTERTAINMENT,
            name = "Парк Космонавтов",
            details = "Парк аттракционов с каруселями, батутами и колесом обозрения. Популярное место для отдыха с детьми.",
            id = idCounter++,
            imageRes = R.drawable.cosmopark
        )
    )
    listPlaces.add(
        PlaceData(
            category = Categories.ENTERTAINMENT,
            name = "Берёзовая роща",
            details = "Просторный парк с благоустроенными дорожками, детскими площадками и зонами для отдыха. Идеальное место для прогулок на свежем воздухе.",
            id = idCounter++,
            imageRes = R.drawable.burchpark
        )
    )
    listPlaces.add(
        PlaceData(
            category = Categories.ENTERTAINMENT,
            name = "Сквер Оружейника Драгунова",
            details = "Современный сквер с зелёными насаждениями, скамейками и арт-объектами, посвящёнными известному конструктору оружия.",
            id = idCounter++,
            imageRes = R.drawable.dragunovpark
        )
    )

    listPlaces.add(
        PlaceData(
            category = Categories.LANDMARK,
            name = "Музейно-выставочный комплекс имени Калашникова",
            details = "Музей, посвящённый жизни и деятельности конструктора Михаила Калашникова. В экспозиции представлены образцы стрелкового оружия и интерактивные экспозиции.",
            id = idCounter++,
            imageRes = R.drawable.kalashnikovlandmark
        )
    )
    listPlaces.add(
        PlaceData(
            category = Categories.LANDMARK,
            name = "Собор Александра Невского",
            details = "Красивая православная церковь начала XX века, построенная в стиле классицизма. Одно из главных духовных мест Ижевска.",
            id = idCounter++,
            imageRes = R.drawable.nevskiylandmark
        )
    )
    listPlaces.add(
        PlaceData(
            category = Categories.LANDMARK,
            name = "Этнографический комплекс Лудорвай",
            details = "Музей под открытым небом с более чем 20 старинными постройками, демонстрирующими быт удмуртов, русских и татар XIX века.",
            id = idCounter++,
            imageRes = R.drawable.ludorvailandmark
        )
    )
    listPlaces.add(
        PlaceData(
            category = Categories.LANDMARK,
            name = "Монумент 'Дружба народов'",
            details = "46-метровый обелиск, посвящённый 400-летию вхождения Удмуртии в состав России. Расположен на набережной Зодчего Дудина.",
            id = idCounter++,
            imageRes = R.drawable.druzhbalandmark
        )
    )
    listPlaces.add(
        PlaceData(
            category = Categories.LANDMARK,
            name = "Памятник Пельменю",
            details = "Уникальный памятник в виде пельменя на вилке, символизирующий удмуртское происхождение этого блюда. Установлен в 2004 году.",
            id = idCounter++,
            imageRes = R.drawable.pelmenlandmark
        )
    )

    listPlaces.add(
        PlaceData(
            category = Categories.EATERY,
            name = "Ресторан 'Шеш-Беш'",
            details = "Ресторан кавказской кухни с уютной атмосферой, традиционными блюдами и живой музыкой по вечерам.",
            id = idCounter++,
            imageRes = R.drawable.sheshbesheatery
        )
    )
    listPlaces.add(
        PlaceData(
            category = Categories.EATERY,
            name = "Кафе 'Кофе Культура'",
            details = "Современное кафе с авторскими напитками, свежей выпечкой и уютной обстановкой. Популярное место среди местной молодёжи.",
            id = idCounter++,
            imageRes = R.drawable.cafecultureeatery
        )
    )
    listPlaces.add(
        PlaceData(
            category = Categories.EATERY,
            name = "Reader's Pub",
            details = "Уютный паб с немецко-ирландской кухней, идеальное место для встреч и переговоров в центре Ижевска.",
            id = idCounter++,
            imageRes = R.drawable.readerspubeatery
        )
    )
    listPlaces.add(
        PlaceData(
            category = Categories.EATERY,
            name = "Кафе 'Кама'",
            details = "Кафе с разнообразным меню и вкусной едой, популярное место для встреч с друзьями.",
            id = idCounter++,
            imageRes = R.drawable.cafekamaeatery
        )
    )
    listPlaces.add(
        PlaceData(
            category = Categories.EATERY,
            name = "Pizza House",
            details = "Кафе с широким выбором пиццы и других блюд, известное своим уютным интерьером.",
            id = idCounter++,
            imageRes = R.drawable.pizzahouseeatery
        )
    )

    listPlaces.add(
        PlaceData(
            category = Categories.HOTEL,
            name = "Cosmos Izhevsk Hotel",
            details = "Современный отель, расположенный на Центральной площади Ижевска, предлагает комфортабельные номера и высокий уровень обслуживания.",
            id = idCounter++,
            imageRes = R.drawable.cosmoshotel
        )
    )
    listPlaces.add(
        PlaceData(
            category = Categories.HOTEL,
            name = "Гостиница 'Панорама'",
            details = "Отель с высоким уровнем обслуживания и удобным месторасположением, предлагающий комфортабельные номера с прекрасным видом на город.",
            id = idCounter++,
            imageRes = R.drawable.panoramahotel
        )
    )
    listPlaces.add(
        PlaceData(
            category = Categories.HOTEL,
            name = "АМАКС Центральная",
            details = "Крупный гостиничный комплекс, расположенный на центральной площади города, предлагает широкий спектр услуг для гостей.",
            id = idCounter++,
            imageRes = R.drawable.amakshotel
        )
    )
    listPlaces.add(
        PlaceData(
            category = Categories.HOTEL,
            name = "Гостиница 'ИжОтель'",
            details = "Уютная гостиница с современными номерами, расположенная недалеко от центра города.",
            id = idCounter++,
            imageRes = R.drawable.izhhotel
        )
    )
    listPlaces.add(
        PlaceData(
            category = Categories.HOTEL,
            name = "Гостиница 'Малина'",
            details = "Современный гостиничный комплекс с комфортабельными номерами и высоким уровнем сервиса.",
            id = idCounter++,
            imageRes = R.drawable.malinahotel
        )
    )
}
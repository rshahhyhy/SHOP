package com.example.shop

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_items)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val  itemsList: RecyclerView = findViewById(R.id.items_list)
        val items = arrayListOf<Item>()

        items.add(Item(1, "keyboard", "Игровая клавиатура Red Square Keyrox TKL Equinox (RSQ-20035)", "Клавиатура,  гарантийный талон, пуллер для кейкапов, дополнительные кейкапы для замены сублимационных " +
                "(с изображение) на однотонные)", "Игровая клавиатура Red Square Keyrox" +
                " TKL обладает компактным корпусом в формате Skeleton без цифрового блока и использует смазанные с" +
                " завода, механические переключатели G3ms Amber – линейные и подходящие для быстрых многократных нажатий.", 5300 ))
        items.add(Item(2, "earphones", "Наушники Redmi Buds 4 Active Black M2232E1 (BHR6992GL)", "Наушники Buds 4 Active – это обновлённая акустика, " +
                "хорошая автономность и поддержка игрового режима.", "Гарнитура на базе модуля Bluetooth 5.3 оснащена 12-мм драйверами, которые, обеспечивают " +
                "насыщенное звучание низких частот.", 1478 ))
        items.add(Item(3, "laptop", "Lenovo IdeaPad 3", "Ноутбук Lenovo IdeaPad 3 17, серый работает на базе четырехъядерного процессора " +
                "Intel Core i7 1165G7 и контроллера Iris Xe Graphics.", "Модель в тонком корпусе из ABS пластика оснащена матовым TN-экраном диагональю 17,3 дюйма. " +
                "Антибликовое покрытие, разрешение HD+ и частота обновления до 60 Гц способствуют выводу контрастных и реалистичных изображений.", 79180 ))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)

    }
}
package com.example.ehirplaka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var editTextNumber: EditText
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        editTextNumber = findViewById(R.id.editTextNumber)
        textView = findViewById(R.id.textView)

        button.setOnClickListener {
            if (editTextNumber.text.isNotEmpty()) {
                var plakaKodu = editTextNumber.text.toString().toInt()
                when (plakaKodu) {
                    1 -> textView.text = "Adana"
                    2 -> textView.text = "Adıyaman"
                    3 -> textView.text = "Afyon"
                    4 -> textView.text = "Ağrı"
                    5 -> textView.text = "Amasya"
                    6 -> textView.text = "Ankara"
                    7 -> textView.text = "Antalya"
                    8 -> textView.text = "Artvin "
                    9 -> textView.text = "Aydın "
                    10 -> textView.text = "Balıkesir"
                    11-> textView.text = "Bilecik "
                    12-> textView.text = "Bingöl"
                    13-> textView.text = "Bitlis "
                    14-> textView.text = "Bolu "
                    15-> textView.text = "Burdur"
                    16-> textView.text = "Bursa "
                    17-> textView.text = "Çanakkale"
                    18-> textView.text = "Çankırı"
                    19-> textView.text = "Çorum "
                    20-> textView.text = "Denizli"
                    21-> textView.text = "Diyarbakır"
                    22-> textView.text = "Edirne"
                    23-> textView.text = "Elazığ "
                    24-> textView.text = "Erzincan"
                    25-> textView.text = "Erzurum"
                    26-> textView.text = "Eskişehir"
                    27 -> textView.text = "Gaziantep"
                    28 -> textView.text = "Giresun"
                    29 -> textView.text = "Gümüşhane"
                    30 -> textView.text = "Hakkari"
                    31 -> textView.text = "Hatay"
                    32 -> textView.text = "Isparta"
                    33 -> textView.text = "İçel (Mersin)"
                    34 -> textView.text = "İstanbul"
                    35 -> textView.text = "İzmir"
                    36 -> textView.text = "Kars"
                    37 -> textView.text = "Kastamonu"
                    38 -> textView.text = "Kayseri"
                    39 -> textView.text = "Kırklareli"
                    40 -> textView.text = "Kırşehir"
                    41 -> textView.text = "Kocaeli"
                    42 -> textView.text = "Konya"
                    43 -> textView.text = "Kütahya"
                    44 -> textView.text = "Malatya"
                    45 -> textView.text = "Manisa"
                    46 -> textView.text = "Kahramanmaraş"
                    47 -> textView.text = "Mardin"
                    48 -> textView.text = "Muğla"
                    49 -> textView.text = "Muş"
                    50 -> textView.text = "Nevşehir"
                    51 -> textView.text = "Niğde"
                    52 -> textView.text = "Ordu"
                    53 -> textView.text = "Rize"
                    54 -> textView.text = "Sakarya"
                    55 -> textView.text = "Samsun"
                    56 -> textView.text = "Siirt"
                    57 -> textView.text = "Sinop"
                    58 -> textView.text = "Sivas"
                    59 -> textView.text = "Tekirdağ"
                    60 -> textView.text = "Tokat"
                    61 -> textView.text = "Trabzon"
                    62 -> textView.text = "Tunceli"
                    63 -> textView.text = "Şanlıurfa"
                    64 -> textView.text = "Uşak"
                    65 -> textView.text = "Van"
                    66 -> textView.text = "Yozgat"
                    67 -> textView.text = "Zonguldak"
                    68 -> textView.text = "Aksaray"
                    69 -> textView.text = "Bayburt"
                    70 -> textView.text = "Karaman"
                    71 -> textView.text = "Kırıkkale"
                    72 -> textView.text = "Batman"
                    73 -> textView.text = "Şırnak"
                    74 -> textView.text = "Bartın"
                    75 -> textView.text = "Ardahan"
                    76 -> textView.text = "Iğdır"
                    77 -> textView.text = "Yalova"
                    78 -> textView.text = "Karabük"
                    79 -> textView.text = "Kilis"
                    80 -> textView.text = "Osmaniye"
                    81 -> textView.text = "Düzce"
                    else ->{
                        textView.text = "Bulunamadı"
                    }
                }
            } else {
                textView.text = "Şehir Plaka Kodunu Giriniz"
            }
        }
    }
}

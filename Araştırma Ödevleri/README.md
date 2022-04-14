# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)


### <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?

#### Cevaplar:

<p>•	Lateinit sadece non-primitive veri türleri için kullanılır ve değişken null olamaz. <br>
•	Val ile kullanılmaz sadece var olan değişkenlerde kullanılır.<br>
•	Aynı zamanda sadece non-nullable ve referans tipi değişkenlerde kullanılır. <br>
•	Değişkeni kullanmadan önce başlatmak gerekir, aksi takdirde UninitializedPropertyAccessException hatası alınır.</p>

Örnek kullanım;

    lateinit var name: String
    lateinit var subject: TestSubject

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name=findViewById(R.id.myname)
        subject=findViewById(R.id.mainSubject)
       
    }


### <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 

#### Cevaplar:

Layout dizini içinde xml dosyalarımız için kullandığımız namespace tools:context’dir. 

> **tools:context**

Tools:context ile içerisinde bulunduğu layout dosyasının hangi activity ile ilişkili olduğunu Android Studio’ya tanıtmak için kullanılır. 

Örnek kullanım;  

    <android.support.constraint.ConstraintLayout 
      xmlns:android="http://schemas.android.com/apk/res/android" 
      xmlns:tools="http://schemas.android.com/tools" 
      tools:context=".MainActivity" > 


> **tools:listitem / tools:listheader / tools:listfooter** 

Android Studio layout editor tarafından kullanılır. 
Bu attribute, bir listenin öğeleri, üstbilgisi ve altbilgisi için düzen önizlemesinde hangi düzenin gösterileceğini belirtmek için kullanılır. 

Örnek kullanım; 

    <ListView xmlns:android="http://schemas.android.com/apk/res/android" 
      xmlns:tools="http://schemas.android.com/tools" 
      android:id="@android:id/list" 
      android:layout_width="match_parent" 
      android:layout_height="match_parent" 
      tools:listitem="@layout/sample_list_item" 
      tools:listheader="@layout/sample_list_header" 
      tools:listfooter="@layout/sample_list_footer" />

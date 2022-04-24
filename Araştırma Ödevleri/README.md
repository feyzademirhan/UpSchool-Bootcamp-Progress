# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)
- [Araştırma Projesi 3 - Font family XML](#3)
- [Araştırma Projesi 4 - Property Animation](#4)


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
 
## <a name="3"></a> Araştırma Projesi 3

- Font family dosyası nasıl oluşturulup kullanıyoruz?
- Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?

P.S. [Bu linkten](https://developer.android.com/guide/topics/ui/look-and-feel/fonts-in-xml ) faydalanarak font family projenizde deneyebilirsiniz.

#### Cevaplar:
Res klasörüne sağ tıklanır. New > Android resource directory'e tıklanır. New Resource Directory ekranı açılır. Resource type olarak font seçilir. Bu şekilde font dizini oluşturulmuş olunur. İndirilen font dosyalarını bu dosya dizinine eklenerek kullanılır.
![font](https://user-images.githubusercontent.com/77541994/164994933-73a7d613-9584-4bbe-af5f-4763112eb35d.PNG)

#### XML Font Family nasıl oluşturulur:
font dosyasında sağ tıklanır ve New > Font resource file seçilir. Dosya adı girilir ve OK'a basılır. Yeni bir font xml dosyası oluşturulmuş olunur.

    <?xml version="1.0" encoding="utf-8"?>
    <font-family xmlns:android="http://schemas.android.com/apk/res/android">
     <font
        android:fontStyle="normal"
        android:fontWeight="400"
        android:font="@font/lobster_regular" />
     <font
        android:fontStyle="italic"
        android:fontWeight="400"
        android:font="@font/lobster_italic" />
    </font-family>

#### TextView'e font nasıl eklenir:

    <?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout 
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">

    <TextView
        android:id="@+id/box_one_text"
        style="@style/whiteBox"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="@dimen/margin_wide"
        android:layout_marginTop="@dimen/margin_wide"
        android:layout_marginEnd="@dimen/margin_wide"
        android:text="@string/box_one"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
        
    </androidx.constraintlayout.widget.ConstraintLayout>
    
#### Font'u styles.xml dosyasına nasıl eklenir:

    <?xml version="1.0" encoding="utf-8"?>
    <resources>
    
        <style name="whiteBox">
            <item name="android:background">@android:color/holo_green_light</item>
            <item name="android:textAlignment">center</item>
            <item name="android:textSize">@dimen/box_text_size</item>
            <item name="android:textStyle">bold</item>
            <item name="android:textColor">@android:color/white</item>
            <item name="android:fontFamily">@font/roboto</item>
        </style>
    </resources>
#### Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?

Fontları proje içerisinde kalıcı olması için bu yöntemi kullanmak faydalıdır. Aynı zamanda fontları kişiselleştirmeye yarar.

## <a name="4"></a> Araştırma Projesi 4

- Property Animation ile ilgili olarak objectAnimator ile animator arasındaki farkı kısaca açıklayınız

P.S. [Bu linkten](https://developer.android.com/guide/topics/resources/animation-resource#Property) faydalanabilirsiniz.

#### Cevaplar:



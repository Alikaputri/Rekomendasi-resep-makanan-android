package example.com.rekomresepmasakan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import javax.xml.transform.Templates;

public class resep1 extends AppCompatActivity {
    private ImageView GetImage;
    private TextView GetNm_makanan, GetAsal, GetKet, GetBahan, GetCara, Getsumber;
    private WebView GetVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resepmakanan);
        GetImage = (ImageView) findViewById(R.id.gambar);
        GetNm_makanan = (TextView) findViewById(R.id.nm_mkn);
        GetAsal = (TextView) findViewById(R.id.asal);
        GetKet = (TextView) findViewById(R.id.ket);
        GetBahan = (TextView) findViewById(R.id.bhn);
        GetCara = (TextView) findViewById(R.id.cara);
        Getsumber = (TextView) findViewById(R.id.sumber);
        GetVideo = (WebView) findViewById(R.id.video);
        showMakanan();

    }

    private void showMakanan() {
        String Makanan = getIntent().getExtras().getString("MyMakanan");

        switch (Makanan){
            case "Mie Goreng":
                GetImage.setImageResource(R.drawable.miegoreng);
                GetNm_makanan.setText("MIE GORENG");
                GetAsal.setText("Asal: Jawa Tengah");
                GetKet.setText("Mie Goreng biasanya paling nikmat dimakan ketika malam hari dan cuaca dingin...");
                GetBahan.setText("Bahan:\n" +
                        "1 bungkus mie burung dara\n" +
                        "sayur kol secukupnya\n" +
                        "2 batang daun bawang(iris)\n" +
                        "1 buah wortel(iris)\n" +
                        "1 butir telur ayam\n" +
                        "3 sdm kecap manis\n" +
                        "3 sdm saus sambal\n" +
                        "1/2 bubuk kaldu\n" +
                        "Minyak Goreng\n" +
                        "irisan bawang seledri\n" +
                        "Bahan Halus:\n" +
                        "1 sdt merica\n" +
                        "secukupnya garam\n" +
                        "3 siung bawang putih\n" +
                        "2 butir kemiri\n" +
                        "bawnag merah goreng\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Siapkan semua bahan.\n" +
                        "2. rebus mie lebih kurang 10 menit.\n" +
                        "angkat dan tiriskan mie yang sudah matang dan lunak\n" +
                        "3. siapkan irisan sayuran, haluskan bahan halus.\n" +
                        "4. siapkan minyak, kemudian tumis bahan halus," +
                        "masukan 1 butir telur, orak arik.\n" +
                        "5. masukan saus sambal dan kecap manis, masukan irisan sayuran,aduk merata.\n" +
                        "6. masukan air sedikit,, masukan mie, lalu masak hingga matang, lebih kurang 15 menit.\n" +
                        "7. masukan irisan daun bawang, angkat, kemudian sajikan\n");
                Getsumber.setText("Sumber Video: Zasanah San");
                GetVideo.loadUrl("file:///android_asset/miegoreng.html");
                        GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Mie Ayam Bangka":
                GetImage.setImageResource(R.drawable.mieayambangka);
                GetNm_makanan.setText("MIE AYAM BANGKA");
                GetAsal.setText("Asal: Bangka Belitung");
                GetKet.setText("Mie Ayam Bangka paling nikmat dimakan ketika hujan, agar tubuh lebih hangat.");
                GetBahan.setText("Bahan:\n" +
                        "500g Mie telur\n" +
                        "1 sdm minyak sayur\n" +
                        "1 sdm kecap asin\n" +
                        "2 siung bawang putih\n" +
                        "250g daging ayam\n" +
                        "150gr jamur merang\n" +
                        "2 sdm saus tiram\n" +
                        "1 sdm kecap manis\n" +
                        "1/2 sdt merica bubuk\n" +
                        "1 sdt garam\n" +
                        "200ml air\n" +
                        "500ml kaldu ayam\n" +
                        "1 siung bawang putih\n" +
                        "1 sdm daun bawang\n" +
                        "1 batang sawi\n" +
                        "100g toge\n" +
                        "2sdm bawang merah goreng\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Rebus mie hingga matang, tiriskan\n" +
                        "2. campur mie dengan kecap manis, diamkan, kasih minyak sayur sedikit\n" +
                        "3. untuk membuat toping ayamnya," +
                        "masukan minyak sayur, bawang putih, daging ayam, jamur merang, aduk." +
                        "tambahkan saus tiram, kecap manis, kecap asin, merica dan garam, aduk." +
                        "tambahkan air, aduk lagi.\n" +
                        "4. untuk membuat kuahnya, masukkan kaldu ayam, bawng putih, garam dan merica.\n" +
                        "5. masukkan mie ke mangkok, masukan toping ayam, tambahkan sawi dan " +
                        "tuangkan kuah, siap disajikan. \n");
                Getsumber.setText("Sumber Video: Resep Masakan");
                GetVideo.loadUrl("file:///android_asset/mieayambangka.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Nasi Goreng":
                GetImage.setImageResource(R.drawable.nasigoreng);
                GetNm_makanan.setText("NASI GORENG");
                GetAsal.setText("Asal: Jakarta");
                GetKet.setText("Nasi Goreng bisa dijadikan menu hidangan sarapan pagi bersama keluarga.");
                GetBahan.setText("Bahan:\n" +
                        "300g nasi putih\n" +
                        "50g ayam fillet potong kotak\n" +
                        "1 butir telur ayam\n" +
                        "2 sdm bawang bombay cincang\n" +
                        "1 siung bawang putih  cincang\n" +
                        "1 sdm kecap asin\n" +
                        "1/2 sdt kecap ikan\n" +
                        "1,5 sdm kecap manis\n" +
                        "1/2 sdt kaldu ayam\n" +
                        "1/2 garam\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. masukkan minyak, tumis bawang putih dan bawang bombay, tunggu sampai wangi.\n" +
                        "2. masukkan ayam fillet, aduk sampai berubah warna.\n" +
                        "3. masukkan telur, garam, kaldu bubuk, kecap asin, kecap ikan, aduk-aduk.\n" +
                        "4. masukkan nasi putih, masukan kecap manis, aduk sampai merata." +
                        "5. jika sudah merata, nasi goreng siap disajikan.\n\n");
                Getsumber.setText("Sumber Video: DONA INDIRASANDI");
                GetVideo.loadUrl("file:///android_asset/nasigoreng.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Mie Aceh":
                GetImage.setImageResource(R.drawable.mieaceh);
                GetNm_makanan.setText("MIE ACEH");
                GetAsal.setText("Asal: Aceh");
                GetKet.setText("sebagai pecinta kuliner pedas, mie aceh sangat cocok untuk dicoba.");
                GetBahan.setText("Bahan:\n" +
                        "Mie basah kuning\n" +
                        "1 butir telur\n" +
                        "Sayur kol dan wortel\n" +
                        "Daun bawang\n" +
                        "Kecap\n" +
                        "Bawang goreng\n" +
                        "Saos tiram\n" +
                        "Bubuk kari\n" +
                        "Ayam rebus\n" +
                        "Air kaldu ayam\n" +
                        "Daun seledri\n" +
                        "Irisan  Bawang merah\n" +
                        "Cabe rawit hijau\n" +
                        "Bumbu Halus:\n" +
                        "Bawang Putih dan Bawang merah\n" +
                        "Kemiri\n" +
                        "Lada\n" +
                        "Cabe rawit\n");
                GetCara.setText("Cara Membuat:\n " +
                        "1. Ulek bumbu halus, selain cabai rawit. sudah halus pindahkan\n" +
                        "2. masukkan cabai rawit, ulek.\n" +
                        "3. mie nya campur dengan kecap dan minyak secukupnya.\n" +
                        "4. panaskan minyak dan tumis bumbu halus sampai harum, masukkan telur, aduk." +
                        "masukkan cabai yang sudah halus, masukan sayur kol dan wortel, masukan ayam." +
                        "masukan air kaldu ayam, garam, bubuk kaldu ayam, gula sesuai  selera." +
                        "kecap manis sesuai selera, masukan bumbu kari, tunggu sampai meresap.\n" +
                        "5. masukkan saos sambal, saos tiram, aduk.\n" +
                        "6. masukkan mie basah, daun bawang, aduk hngga merata, " +
                        "tambahkan lagi kaldu ayam, kecap lagi, aduk.\n" +
                        "7. pindahkan ke piring tambahkan pelengkap, siap sajikan.\n");
                Getsumber.setText("Sumber Video: Sari Sigit");
                GetVideo.loadUrl("file:///android_asset/mieaceh.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case ("Mie Lendir"):
                GetImage.setImageResource(R.drawable.mielender);
                GetNm_makanan.setText("MIE LENDIR");
                GetAsal.setText("Asal: Kep. Riau");
                GetKet.setText("namanya terdengar aneh, tapi sangat cocok disajikan untuk sarapan pagi.");
                GetBahan.setText("Bahan:\n" +
                        "Mie kuning\n" +
                        "Toge\n" +
                        "Telur rebus\n" +
                        "Bawang Goreng\n" +
                        "Daun Seledri\n" +
                        "Cabe rawit hijau.\n" +
                        "7 siung bawang merah\n" +
                        "7 siung bawang putih\n" +
                        "7 buah cabe keriting\n" +
                        "2 ruas kencur\nr" +
                        "100gr kacang tanah\n" +
                        "250gr ubi jalar(dikupas)\n" +
                        "2 batang serai\n" +
                        "5 lembar daun salam\n" +
                        "1 liter air\n" +
                        "80gr gula merah\n" +
                        "2 sdt penyedap\n" +
                        "2 sdm tepung maizena\n" +
                        "minyak goreng secukupnya\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Minyak Secukupnya, masukan cabai keriting, bawang putih, bawang merah," +
                        "kencur, goreng sampai wangi, kemudian blender.\n" +
                        "2. kacang tanah, tambahkan air sedikit, lalu blender.\n" +
                        "3. aluskan ubi jalar, tambah air sedikit, lalu blender.\n" +
                        "4. masukkan bumbu halus, serai, daun salam, tumis, masukan air," +
                        "masukan kacang tanah, ubi jalar, gula merah yg dihaluskan" +
                        "masukan garam, penyedap, aduk rata.\n" +
                        "5. larutkan tepung maizena dengan air kemudian tuangkan.\n" +
                        "6. rebus mie, lalu tiriskan. rebus toge, lalu angkat.\n" +
                        "7. masukkan mie ke piring, tambahkan toge, dan masukan kuah yang telah  dibuat." +
                        "tambahkan toping, siap disajikan\n");
                Getsumber.setText("Sumber Video: Dapur Adis");
                GetVideo.loadUrl("file:///android_asset/mielendir.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case ("Rendang"):
                GetImage.setImageResource(R.drawable.rendang);
                GetNm_makanan.setText("RENDANG");
                GetAsal.setText("Asal: Sumatera Barat");
                GetKet.setText("Rendang sangat nikmati dihidangkan ketika ada pertemuan acara keluarga " +
                        " atau makan bersama keluarga.");
                GetBahan.setText("Bahan:\n" +
                        "1 kg daging sapi\n" +
                        "1/2 kg santan\n" +
                        "Daun kunyit\n" +
                        "Serai\n" +
                        "5 lembar daun jeruk\n" +
                        "2 ruas jahe\n" +
                        "2 ruas lengkuas(digeprek)\n" +
                        "2 bawang merah\n" +
                        "2 buah kemiri\n" +
                        "5 siung bawang putih\n" +
                        "1 ons cabe\n" +
                        "Bahan Halus:\n" +
                        "ketumbar\n" +
                        "1 buah pala\n" +
                        "15 buah cengkeh\n" +
                        "1 ruas kembang lawang\n" +
                        "2 kapulaga\n" +
                        "kayu manis\n" +
                        "jintan\n" +
                        "lada hitam\n");
                GetCara.setText("Cara Membuat:\n " +
                        "1. haluskan bahan halus, pisahkan. kemudian haluskan cabai,pisahkan." +
                        "haluskan bawang merah dan putih, pisahkan. jahe haluska, dipisah.\n" +
                        "2. masukkan santan, daun jeruk, serai, daun kunyit," +
                        "masukan semua bumbu yang sudah dihaluskan, aduk sampai mendidih.\n" +
                        "3. kasih gula sedikit, masukan garam.\n" +
                        "4. masukkan daging, aduk merata. tutup, sesekali diaduk.\n" +
                        "5. jika sudah matang, siap disajikan.\n");
                Getsumber.setText("Sumber Video: Ragam Indonesia");
                GetVideo.loadUrl("file:///android_asset/rendang.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Gudeg":
                GetImage.setImageResource(R.drawable.gudeg);
                GetNm_makanan.setText("GUDEG");
                GetAsal.setText("Asal: Yogyakarta");
                GetKet.setText("Jogja itu istimewa, wisatanya begitu menyenangkan" +
                                "dan kulinernya ngangenin, salah satunya gudeg.\n");
                GetBahan.setText("Bahan:\n" +
                        "250 gr nangka muda\n" +
                        "250 gr ayam\n" +
                        "4 butir telur ayam rebus\n" +
                        "300 ml santan \n" +
                        "6 lbr daun salam\n" +
                        "2 cm lengkuas geprek\n" +
                        "1 sdt garam\n" +
                        "1 sdt kaldu bubuk\n" +
                        "1 bulatan kecil/1 sdm gula merah sisir\n" +
                        "Bahan Halus:\n" +
                        "8 siung bawang merah\n" +
                        "5 siung bawang putih\n" +
                        "5 biji kemiri\n" +
                        "1 sdt ketumbar\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Siapkan bahan\n" +
                        "2. Sangrai bumbu halus lalu ulek\n" +
                        "3. Tata dalam panci : daun salam, nangka muda, bumbu halus, ayam, telur, " +
                        "dan santan. Beri garam, gula, kaldu bubuk, dan lengkuas. " +
                        "Tutup panci lalu nyalakan kompor dengan api kecil. " +
                        "Masak hingga air surut. lalu hidangkan\n");
                Getsumber.setText("Sumber Video: Dapur Mamah Hawa");
                GetVideo.loadUrl("file:///android_asset/gudeg.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Mie Gomak":
                GetImage.setImageResource(R.drawable.miegomak);
                GetNm_makanan.setText("MIE GOMAK");
                GetAsal.setText("Asal: Sumatera Utara");
                GetKet.setText("Mie Gomak itu spaghettinya orang medan dan paling enak dinikmati saat sarapan.");
                GetBahan.setText("Bahan:\n" +
                        "Sebungkus Mie lidi\n" +
                        "5 buah rawit merah\n" +
                        "10 buah cabai merah keriting\n" +
                        "5 siung bawang merah\n" +
                        "4 siung bawang putih\n" +
                        "2 cm jahe\n" +
                        "2 buah kemiri\n" +
                        "2 sdm udang rebon\n" +
                        "1 sdt lada bubuk\n" +
                        "1/2 sdt kaldu jamur\n" +
                        "3 sdm kecap manis\n" +
                        "kol secukupnya\n" +
                        "Daun bawang\n" +
                        "daun seledri\n" +
                        "cabai rawit hijau sesuai selera\n" +
                        "minyak goreng\n" +
                        "air secukupnya\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. rebus mie, angkat, tiriskan.\n" +
                        "2. letakan mie diwadah dan beri sedikit minyak goreng.\n" +
                        "3. tirikan udang rebon. masukan ke bumbu halus, kemudian blender\n" +
                        "4. panaskan minyak. tumis bumbu yang sudah diblender" +
                        "tambahkan lada bubuk dan garam. aduk.\n" +
                        "5. masukan mie. aduk-aduk.\n" +
                        "6. tambahkan air, aduk lagi. masukan kol, aduk lagi.\n" +
                        "7. masukan kecap manis, aduk merata, masukan cabai rawit utuh." +
                        "masukan daun bawang dan seledri, aduk lagi.\n" +
                        "8. jika sudah matang, siap disajikan.\n");
                Getsumber.setText("Sumber Video: Dapur Malfinky");
                GetVideo.loadUrl("file:///android_asset/miegomak.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Soto Betawi":
                GetImage.setImageResource(R.drawable.sotobetawi);
                GetNm_makanan.setText("SOTO BETAWI");
                GetAsal.setText("Asal: Jakarta");
                GetKet.setText("Soto betawi biasanya dihidangkan untuk menu makan siang bersama keluarga.");
                GetBahan.setText("Bahan:\n" +
                        "Bahan 1:\n" +
                        "300 g Daging Sengkel Sapi\n" +
                        "100 g Paru Sapi\n" +
                        "100 g Babat Sapi\n" +
                        "100 g Usus Sapi\n" +
                        "Bahan 2: (bumbu halus)\n" +
                        "5 buah Cabe Merah Keriting\n" +
                        "3 buah Cabe Merah\n" +
                        "5 siung Bawang Putih\n" +
                        "5 buah Bawang Merah\n" +
                        "3 cm Jahe\n" +
                        "2 cm Lengkuas\n" +
                        "¼ sdt Jintan\n" +
                        "3 butir Kemiri, sangan\n" +
                        "Bahan 3:\n" +
                        "4 biji Cengkih\n" +
                        "¼ batang kecil Kayu Manis\n" +
                        "2 buah Kapulaga\n" +
                        "¼ buah Bunga Lawang\n" +
                        "1 lembar Daun Salam\n" +
                        "5 lembar Daun Jeruk\n" +
                        "2 batang Serai, memarkan\n" +
                        "2½ sdt Garam\n" +
                        "1 sdt Gula Pasir\n" +
                        "600 ml Air\n" +
                        "Bahan 4:\n" +
                        "5 sdm Minyak Goreng\n" +
                        "1 sdt Desaku Ketumbar Bubuk\n" +
                        "1 sdt Ladaku Merica Bubuk\n" +
                        "750 ml Santan Kental\n" +
                        "100 ml Susu Evaporasi\n" +
                        "Bahan 5:\n" +
                        "2 buah Kentang, dipotong 4 bagian dan digoreng\n" +
                        "1 buah Tomat, potong dadu\n" +
                        "2 batang Daun Bawang, ambil bagian hijaunya, rajang\n" +
                        "2 sdm Bawang Goreng\n" +
                        "1 sdm Kecap Manis\n" +
                        "2 buah Jeruk Limau\n" +
                        "1 sdm Sambal Soto\n" +
                        "150 g Emping, goreng \n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. 1. Ulek bahan 2 hingga halus\n" +
                        "2. Panaskan minyak goreng, tumis bumbu halus beserta bahan 3 " +
                        "(kecuali garam dan gula pasir)hingga harum dan matang\n" +
                        "3. Masukkan garam dan gula pasir, aduk hingga garam larut\n" +
                        "4. Tambahkan Desaku Ketumbar Bubuk, aduk rata\n" +
                        "5. Masukkan bahan 1, tumis hingga daging berubah warnanya\n" +
                        "6. Masukkan air kemudian masak selama 50 menit dengan api kecil " +
                        "dan panci tertutup\n" +
                        "7. Setelah daging matang dan empuk, angkat daging, paru, babat dan usus, " +
                        "(jika suka, bisa digoreng sesaat) sisihkan\n" +
                        "8. Masukkan santan, susu evaporasi dan Ladaku Merica Bubuk (bahan 4) ke dalam kuah, " +
                        "masak kembali hingga mulai mendidih kemudian matikan api\n" +
                        "9. Untuk penyajiannya, letakkan potongan paru, daging, babat, usus, kentang, tomat, " +
                        "berikan taburan daun bawang kemudian siram dengan kuah soto, " +
                        "tambahkan bawang goreng, emping, kecap manis, jeruk limau dan sambal soto\n" +
                        "10. Sajikan selagi panas\n");
                Getsumber.setText("Sumber Video: Rasa Sayange TV");
                GetVideo.loadUrl("file:///android_asset/sotobetawi.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Soto Banjar":
                GetImage.setImageResource(R.drawable.sotobanjar);
                GetNm_makanan.setText("SOTO BANJAR");
                GetAsal.setText("Asal: Kalimantan Selatan");
                GetKet.setText("Soto Banjar sangat nikmat dihidangkan ketika cuaca dingin.");
                GetBahan.setText("Bahan:\n" +
                        "BAHAN:\n" +
                        "750 grm Ayam kampung \n" +
                        "5 btr telur itik/ayam (direbus)\n" +
                        "Ketupat\n" +
                        "Perkedel kentang (atau perkedel singkong)\n" +
                        "Sohun\n" +
                        "Daun seledri\n" +
                        "Bawang goreng\n" +
                        "Minyak goreng\n" +
                        "2 liter air\n" +
                        "150 ml Susu cair UHT (dicampur di kuah, opsional)\n" +
                        "BUMBU, DIHALUSKAN:\n" +
                        "10 siung bawang merah\n" +
                        "8 siung bawang putih\n" +
                        "1/2 siung bawang bombay\n" +
                        "1 sdm merica bubuk\n" +
                        "1/2 sdm adas manis\n" +
                        "1/2 sdm kas-kas (bisa diskip jika tidak ada)\n" +
                        "2 cm biji pala\n" +
                        "4 cm jahe\n" +
                        "BUMBU LAINNYA:\n" +
                        "5 siung bawang putih (rajang, goreng, haluskan) \n" +
                        "1 sdm margarin\n" +
                        "Garam\n" +
                        "Kaldu ayam instan\n" +
                        "REMPAH KERING:\n" +
                        "5 buah cengkeh\n" +
                        "5 buah kapulaga\n" +
                        "4 cm kayu manis\n" +
                        "2 bh bunga lawang/bunga sisir\n" +
                        "PELENGKAP:\n" +
                        "Sambal\n" +
                        "Jeruk limau/jeruk nipis\n" +
                        "Kecap manis\n" +
                        "Kecap asin\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. haluskan bumbu dengaan blender\n." +
                        "2. rajang bawang putih, kemudian goreng. tiriskan dan ulek\n" +
                        "3. tumis bumbuu halus dan rempah kering.\n" +
                        "4. rebus ayam, jika sudah matang masukan bumbu yang sudah ditumis.\n" +
                        "5. angkat daging ayam.\n" +
                        "6. masukan garam dan kaldu ayam, tambahkan margarin, masukan bawang putih.\n" +
                        "7. siapkan soun dan daging ayam suir, potong ketupat.\n" +
                        "8. tata ke dalam piring, tambahkan telur dan perkedel.\n" +
                        "9. masukan kuah soto, tambahkan daun seledri dan bawang goreng.\n" +
                        "10. siap disajikan.\n");
                Getsumber.setText("Sumber Video: Lestari Putri Channel");
                GetVideo.loadUrl("file:///android_asset/sotobanjar.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Sate Bebek":
                GetImage.setImageResource(R.drawable.satebebek);
                GetNm_makanan.setText("SATE BEBEK");
                GetAsal.setText("Asal: Banten");
                GetKet.setText("selain ayam dan kambing bisa dijadiin sate," +
                        "bebek tidak kalah enak untuk disate" +
                        "dan dibuat sambil berkumpul bersama teman-teman.");
                GetBahan.setText("Bahan:\n" +
                        "2 kg bebek\n" +
                        "15 biji bawang merah\n" +
                        "15 biji cabai merah\n" +
                        "2 siun bwang putih\n" +
                        "1/8 liter minyak sayut\n" +
                        "asam jawa secukupnya\n" +
                        "merica secukupnya\n" +
                        "garam secukupnya\n" +
                        "gula merah secukupnya\n");
                GetCara.setText("Cara Membuat:\n " +
                        "1.Pisahkan daging bebek dari tulangnya\n" +
                        "2.Potong daging dengan ukuran kurang lebih 1,5 cm\n" +
                        "3.Kumpulkan daging dalam satu wadah\n" +
                        "4.Semua bumbu digoreng setengah matang kecuali : asam, merica, garam dan gula merah\n" +
                        "5.Semua bumbu dihaluskan bersama dengan minyak gorengnya\n" +
                        "6.Campur dan aduk bumbu bersama daging\n" +
                        "7.Diamkan selama ± 4 jam\n" +
                        "8.Tusuk daging sebanyak 4 potong per tusuk atau sesuai selera\n" +
                        "9.Bakar di bara api arang hingga matang\n");
                Getsumber.setText("Sumber Video: Danardy Yaputra");
                GetVideo.loadUrl("file:///android_asset/satebebek.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Kuah Sie Itek":
                GetImage.setImageResource(R.drawable.kuahsieitek);
                GetNm_makanan.setText("KUAH SIE ITEK");
                GetAsal.setText("Asal: Aceh");
                GetKet.setText("Sangat nikmat dihidangkan ketika makan siang.");
                GetBahan.setText("Bahan:\n" +
                        "1 ekor bebek. bersihkan lalu bakar agak kemerahan lalu potong 4\n" +
                        "1 buah jeruk nipis ambil airnya\n" +
                        "bumbu tumis\n" +
                        "4 buah bawang merah\n" +
                        "2 siung bawang putih\n" +
                        "2 ruas jari lengkuas. geprek\n" +
                        "1 batang sereh. geprek\n" +
                        "2 tangkai salam koja. cuci, petik\n" +
                        "2 helai daun pandan\n" +
                        "2 buah kapulaga\n" +
                        "2 buah bunga lawang / pekak\n" +
                        "2 sdm cabe bubuk\n" +
                        "Bahan Halus:\n" +
                        "8 buah cabe merah\n" +
                        "7 buah bawang merah\n" +
                        "3 siung bawang putih\n" +
                        "1 ruas jari kunyit\n" +
                        "1 ruas jari jahe\n" +
                        "1-2 buah pekak\n" +
                        "2 buah kapulaga\n" +
                        "3 biji kemiri\n" +
                        "1 buah biji ketapang keling (bisa ganti dg 8 biji kacang tanah)\n" +
                        "1 biji buah pala\n" +
                        "2 sdm ketumbar bubuk\n" +
                        "1 sdm jintan bubuk\n" +
                        "2 biji cengkeh\n" +
                        "1 sdt lada bubuk\n" +
                        "1 sdm kelapa gongseng halus\n" +
                        "1 liter santan dr 1 kelapa\n" +
                        "secukupnya garam\n" +
                        "2 sdm minyak utk menumis\"\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Siapkan semua bahan\n" +
                        "2. Bebek dicuci bersih lalu diberi garam dan jeruk nipis. sisihkan.\n" +
                        "3. Blender semua bumbu halus kecuali pekak, " +
                        "pala, ketapang, cengkeh, kemiri, kapulaga di masukkan ke plastik bersih " +
                        "lalu dipukul sampai hancur agar saat di blender menjadi halus. " +
                        "lalu blender bersama cabe merah\n" +
                        "4. Jika sudah benar-benar halus masukkan ke bebek. " +
                        "masukkan lada bubuk, ketumbar bubuk, jintan bubuk, kelapa gongseng. " +
                        "aduk rata diamkan 20 menit\n" +
                        "5. Rajang duo bawang. panaskan minyak lalu tumis\n" +
                        "6. Jika bawang sudah agak kemerahan masukkan cabe bubuk aduk rata. " +
                        "7. lalu masukkan bahan utk menumis (daun daunan dsb)\n" +
                        "8. Masukkan bebek beserta bumbu.\n " +
                        "9. aduk rata lalu masak dengan api sedang sampai air menyusut.\n " +
                        "10. beri sedikit santan lalu masak lagi sampai bumbu harum.\n" +
                        "11. Masukkan santan. tunggu sampai mendidih. lalu masukkan kentang. " +
                        "masak sampai kuah mengental, koreksi rasa, dan sajikan\n");
                Getsumber.setText("Sumber Video: Dapur Musra");
                GetVideo.loadUrl("file:///android_asset/kuahsieitek.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Sate Padang":
                GetImage.setImageResource(R.drawable.satepadang);
                GetNm_makanan.setText("SATE PADANG");
                GetAsal.setText("Asal: Sumatera Barat");
                GetKet.setText("sate padang sangat enak dinikmati ketika malam hari.");
                GetBahan.setText("Bahan:\n" +
                        "500 gr daging sapi segar(rebus setengah matang dan potong potong kecil)\n" +
                        "Bumbu Halus:\n" +
                        "10 biji cabe merah kering (rendam air hangat dan buang bijinya)\n" +
                        "15 gr kunyit\n" +
                        "38 gr jahe\n" +
                        "10 siung bawang merah\n" +
                        "6 siung bawang putih\n" +
                        "5 butir kemiri\n" +
                        "Bumbu tambahan: \n" +
                        "1 sdm pasta kari \n" +
                        "1 1/2 sdt bubuk kari kering\n" +
                        "2 sdm ketumbar dan 1 sdt jinten (haluskan di ulekan)\n" +
                        "1 sdt penuh bubuk cabe merah\n" +
                        "1 sdt bubuk merica putih \n" +
                        "45 gr lengkuas (geprek)\n" +
                        "2 batang serai\n" +
                        "5 lembar daun jeruk purut\n" +
                        "3 lembar daun salam\n" +
                        "10 butir cengkeh\n" +
                        "1 sdt bubuk kayu manis\n" +
                        "1 buah bunga lawang \n" +
                        "Air rebusan daging sekitar 1 liter\n" +
                        "Tusuk sate (rendam satu jam)\n" +
                        "Bawang goreng dan daun pisang sebagai alas\n" +
                        "Garam secukupnya\n" +
                        "Penyedap rasa secukupnya \n" +
                        "Tepung beras 80 gr \n" +
                        "Minyak untuk menumis\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Rebus daging sapi 15 menit, angkat, tiriskan.\n" +
                        "2. panaskan minyak untuk menumis bumbu halus. masukan pas kari" +
                        "ketumbar, jinten, daun jeruk, lengkuas, serai, cabe merah, aduk\n" +
                        "3. masukkan daging, tambahkan garam, tutup.\n" +
                        "4. tambahkan air sisa daging rebus tadi, aduk.\n" +
                        "5. biarkan setengah jam, beri merica bubuk, dan jika sudah matang matikan.\n" +
                        "6. pisahkan daging dan tusuk daging dengan tusuk sate.\n" +
                        "7. bakar sate. sisa tumisan tadi disaring\n" +
                        "8. siapkan tepung beras, tuang air tumisan ke tepung beberapa sendok.\n" +
                        "9. kemudian campur ke sisa tumisan lagi dan aduk hingga mengental.\n" +
                        "10. susun sate dipiring dan tuangkan kuah, siap disajikan\n");
                Getsumber.setText("Sumber Video: DAPURSICONGOK");
                GetVideo.loadUrl("file:///android_asset/satepadang.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Gajeboh":
                GetImage.setImageResource(R.drawable.gajeboh);
                GetNm_makanan.setText("GAJEBOH");
                GetAsal.setText("Asal: Sumatera Barat");
                GetKet.setText("bagi pecinta makanan berlemak sangat wajib dicoba untuk makan siang.\n");
                GetBahan.setText("Bahan:\n" +
                        "1 kg daging sapi yang bagian banyak lemak\n" +
                        "20 buah cabai\n" +
                        "8 buah bawang merah\n" +
                        "2 buah bawang putih\n" +
                        "6 buah kemiri\n" +
                        "jahe\n" +
                        "laos\n" +
                        "daun jeruk\n" +
                        "daun salam\n" +
                        "gula pasir\n" +
                        "mentega\n" +
                        "garam\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. bumbu di tumis dengan mentega sampai harum" +
                        "tambahkan daun jeruk dan daun salam, tumis sampai harum.\n" +
                        "2. tambahkan air sampai mendidih\n" +
                        "3. tambahkan sedikit gula, kemudian masukan dagingnya." +
                        "masak sampai dagingnya empuk dan bumbu meresap.\n" +
                        "4. jika sudah matang, kemudian sajikan selagi hangat.\n");
                Getsumber.setText("Sumber Video: Sun Ytube");
                GetVideo.loadUrl("file:///android_asset/gajeboh.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Coto Makassar":
                GetImage.setImageResource(R.drawable.cotomakassar);
                GetNm_makanan.setText("COTO MAKASSAR");
                GetAsal.setText("Asal: Sulawesi Selatan");
                GetKet.setText("sangat enak dimakan saat cuaca dingin agar tubuh menjadi hangat.");
                GetBahan.setText("Bahan:\n" +
                        "5 kg daging sapi\n" +
                        "batang sereh\n" +
                        "lengkuas\n" +
                        "Air secukupnya\n" +
                        "penyedap rasa dagingjeruk nipis\n" +
                        "bawang goreng\n" +
                        "Bumbu yang dihaluskan:\n" +
                        "5 ruas lengkuas ukuran besar\n" +
                        "2 ons bawang merah\n" +
                        "2 ons bawang putih\n" +
                        "1 sdm merica\n" +
                        "1 sdm ketumbar\n" +
                        "1 liter kacang tanah sangrai\n" +
                        "1 cm kayu manis\n" +
                        "20 batang sereh\n\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. kacang disangrai.\n" +
                        "2. daging direbus hingga empuk, geprek serai dan lengkuas masukan direbusan.\n" +
                        "3. jika sudah matang, potong-potong.\n" +
                        "4. haluskan kacang, beserta bumbu yang mau dihaluskan, blender.\n" +
                        "5. tuang bumbu halus ke kuah rebusan tadi, tambahkan kaldu.\n" +
                        "6. tuang daging ke mangkok dan siram kuah ke mangkok.\n" +
                        "7. coto makassar siap disajikan. \n");
                Getsumber.setText("Sumber Video: DAPUR PINK");
                GetVideo.loadUrl("file:///android_asset/cotomakasar.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Se'i Sapi":
                GetImage.setImageResource(R.drawable.sei);
                GetNm_makanan.setText("SE'I SAPI");
                GetAsal.setText("Asal: Nusa Tenggara Timur");
                GetKet.setText("jika ingin memakan daging sapi tidak berlemak, lebih baik" +
                        "dibuat se'i sapi saja, karena proses pengasapannya itu menghilangkan lemak");
                GetBahan.setText("Bahan:\n" +
                        "3 siung bawang putih\n" +
                        "3 siung bawang merah\n" +
                        "1 barang serai\n" +
                        "3 lembar daun jeruk\n" +
                        "15 buah cabai rawit merah\n" +
                        "1 buah jeruk nipis" +
                        "2 sapi yang diasap" +
                        "1/2 sendok terasi bakar\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. daging sapi dipanggang\n" +
                        "2. iris-iris bumbu.\n" +
                        "3. ulek terasi.\n" +
                        "4. masukan minyak, tumis daging." +
                        "5. masukan minyak buat numis tadi ke irisan bumbu." +
                        "6. masukan jeruk nips dan garam, aduk." +
                        "7. pindahkan daging ke piring dan bumbu iris tadi, kemudian aduk." +
                        "8. se'i sapi siap disantap.\n");
                Getsumber.setText("Sumber Video: Mommy Deboy");
                GetVideo.loadUrl("file:///android_asset/sei.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Ikan Asam Pedas":
                GetImage.setImageResource(R.drawable.ikanasampedas);
                GetNm_makanan.setText("IKAN ASAM PEDAS");
                GetAsal.setText("Asal: Riau");
                GetKet.setText("sangat enak dinikmati sebagai menu makan siang harian.");
                GetBahan.setText("Bahan:\n" +
                        "1 ekor ikan ukuran sedang\n" +
                        "Cabe Rawit secukupnya\n" +
                        "Cabe Merah secukupnya\n" +
                        "6 siung Bawang Merah\n" +
                        "3 siung Bawang Putih\n" +
                        "1 ruas kunyit\n" +
                        "1 ruas jahe \n" +
                        "1 ruas lengkuas\n" +
                        "3 lembar daun jeruk\n" +
                        "1 lembar daun kunyit\n" +
                        "2 lembar daun salam\n" +
                        "2 batang serai\n" +
                        "asam jawa secukupnya\n" +
                        "1 buah tomat\n" +
                        "1 jeruk nipis\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Bersihkan Ikan kemudian lumuri dengan Jeruk Nipis dan Garam\n" +
                        "2. Haluskan Cabe Bawang Merah Bawang Putih Kunyit Jahe " +
                        "setelah halus tambahkan terasi\n" +
                        "3. Tumis bumbu halus bersama daun kunyit serai dan lengkuas sampai harum\n" +
                        "4. Kemudian tambahkan air matang sekitar 300 ml" +
                        "biarkan sampai mendidih masukan asam kandis yang sudah dibersihkan\n" +
                        "5. Masukan kecombrang yg telah dibelah dua belimbing wuluh dan cabe rawit utuh\n" +
                        "6. Terakhir masukan Ikan tambahkan garam dan sedikit gula," +
                        "Sajikan\n");
                Getsumber.setText("Sumber Video: Aidil Munandar");
                GetVideo.loadUrl("file:///android_asset/ikanasampedas.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);

                break;
            case "Gence Ruan":
                GetImage.setImageResource(R.drawable.genceruan);
                GetNm_makanan.setText("GENCE RUAN");
                GetAsal.setText("Asal: Kalimantan Timur");
                GetKet.setText("sangat cocok dinikmati ketika makan siang ditambah dengan nasi panas" +
                        "enak banget....");
                GetBahan.setText("Bahan:\n" +
                        "1 ekor/± 800 g ikan haruan (ikan gabus)\n" +
                        "1sdt garam\n" +
                        "1 buah jeruk nipis, ambil airnya\n" +
                        "2 sdm minyak\n" +
                        "1 sdt gula pasir\n" +
                        "125 ml air\n" +
                        "2 sdt air asam jawa (dari 2 sdt asam jawa dan 2 sdm air)\n" +
                        "Bumbu Halus :\n" +
                        "11 butir bawang merah\n" +
                        "5 siung bawang putih\n" +
                        "3 buah cabai merah besar, buang biji\n" +
                        "4 buah cabai merah keriting\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Belah ikan gabus dari kepala sampai ekor namun tidak putus. " +
                        "Bersihkan insang dan isi perutnya.\n" +
                        "2. Lumuri ikan dengan ½ sdt garam dan air jeruk nipis. " +
                        "Diamkan selama 15 menit.\n" +
                        "3. Bakar ikan gabus sambil dibolak-balik sampai harum dan matang. " +
                        "Angkat. Sisihkan.\n" +
                        "4. Panaskan minyak. Tumis bumbu halus sampai harum.\n" +
                        "5. Masukkan ½ sdt garam, gula pasir, air dan air asam jawa. " +
                        "Masak sampai bumbu harum dan matang. Angkat.\n" +
                        "6. Siram bumbu ke permukaan ikan gabus. Sajikan.\n");
                Getsumber.setText("Sumber Video: Masak. TV");
                GetVideo.loadUrl("file:///android_asset/genceruan.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Ikan Kuah Pala Banda":
                GetImage.setImageResource(R.drawable.ikankuahpalabada);
                GetNm_makanan.setText("IKAN KUAH PALA BANDA");
                GetAsal.setText("Asal: Maluku Utara");
                GetKet.setText("ikan kuah pala banda sangat cocok untuk menu sehari-hari.");
                GetBahan.setText("Bahan:\n" +
                        "400 gr ikan tongkol/tengiri/kakap potong bulat dan bersihkan\n" +
                        "50 gr air asam\n" +
                        "2 sdt garam" +
                        "4 sdm minyak\n" +
                        "2 btg serai memarkan\n" +
                        "4 lbr daun jeruk\n" +
                        "1 ikat kemangi ambil daunnya\n" +
                        "2 buah bunga pala\n" +
                        "1 sdt gula\n" +
                        "1 ½ sdt garam\n" +
                        "700 ml santan sedang kentalnya\n" +
                        "Bahan Halus:\n" +
                        "5 buah bawang merah\n" +
                        "1 sdt Desaku Ketumbar Bubuk\n" +
                        "4 siung bawang putih\n" +
                        "5 buah cabe keriting\n" +
                        "1 sdt Kunyit Bubuk\n" +
                        "3 cm jahe\n" +
                        "½ sdt Merica Bubuk\n" +
                        "2 cm lengkuas\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Campur bahan 1 dan diamkan 15 menit.\n" +
                        "2. Tumis bumbu yang dihaluskan hingga harum. " +
                        "Setelah matang tanakkan dengan sedikit santan " +
                        "hingga redius dan berminyak.\n" +
                        "3. Masukkan ikan, serai, daun jeruk, bunga pala, " +
                        "lalu masak perlahan dengan bumbu " +
                        "kemudian sesekali dibalik dan dimasukkan santan sedikit-sedikit " +
                        "hingga santan redius lalu masukkan santan lagi, " +
                        "baru terakhir sisa santanya.\n" +
                        "4. Kecilkan api, masak hingga cukup matangnya " +
                        "lalu masukkan daun kemangi kemudian aduk hingga harum.\n" +
                        "5. Angkat dan sajikan panas-panas.\n");
                Getsumber.setText("Sumber Video: Rasa Sayange TV");
                GetVideo.loadUrl("file:///android_asset/ikankuahpalabanda.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Pempek":
                GetImage.setImageResource(R.drawable.pempek);
                GetNm_makanan.setText("PEMPEK");
                GetAsal.setText("Asal: Sumatera Selatan");
                GetKet.setText("sangat cocok dijadiin cemilan penutup makan berat");
                GetBahan.setText("Bahan:\n" +
                        "280 gr tepung sagu\n" +
                        "200 gr ikan tenggiri\n" +
                        "200 ml air dingin\n" +
                        "1 siung bawang putih\n" +
                        "1 ½ sdt garam\n" +
                        "1 sdt kaldu ayam bubuk\n" +
                        "Bahan cuko :\n" +
                        "250 gr gula merah (gula aren)\n" +
                        "500 ml air\n" +
                        "3 siung bawang putih\n" +
                        "5 buah cabe rawit merah\n" +
                        "3 buah cabe kriting merah\n" +
                        "2 sdt garam\n" +
                        "3 sdm gula pasir\n" +
                        "10 gr asem jawa\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Uleni ikan tenggiri,garam, penyedap rasa, minyak goreng dan air es " +
                        "sampai rata kurang lebih 5 menit\n" +
                        "2. Tambahkan tepung sagu sedikit demi sedikit " +
                        "aduk pelan-pelan dengan spatula(jangan diuleni dengan tangan)campur sampai rata\n" +
                        "3. Memang adonan akan jadi lengket, balurin tangan dengan tepung," +
                        "baru letakan adonan pempek ditangan kemudian bentuk dan isi dengan telur\n" +
                        "4. Kemudian rebus hingga mengapung,\n" +
                        "5. selanjutnya buat cukonya" +
                        "Belender sampai halus cabe kriting, cabe rawit dan bawang putih dgn 500ml air " +
                        "(tangkai rawit dan kulit bawang putih ikut tidak dikupas).\n" +
                        "6. Saring hasil blender kemudian masukkan ke panci dengan api sedang " +
                        "kemudian masukkan gula merah, pula pasir, garam, asam jawa " +
                        "masak sampai mendidih dan mengental.\n" +
                        "7. Setelah mengental masukan cuka " +
                        "aduk sebentar kemudian matikan api. " +
                        "Saring dan masukan ke wadah atau botol\n");
                Getsumber.setText("Sumber Video: CR COOK");
                GetVideo.loadUrl("file:///android_asset/pempek.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Pindang":
                GetImage.setImageResource(R.drawable.pindang);
                GetNm_makanan.setText("PINDANG");
                GetAsal.setText("Asal: Sumatera Selatan");
                GetKet.setText("sangat nikmati disajikan sebagai menu makanan sehari-hari");
                GetBahan.setText("Bahan:\n" +
                        "Ikan patin\n" +
                        "Bumbu\n" +
                        "Bawang merah dan putih\n" +
                        "Lengkuas\n" +
                        "Jahe\n" +
                        "Kunyit\n" +
                        "Sere\n" +
                        "Daun Kemangi\n" +
                        "Cabai merah dan rawit\n" +
                        "Tomat\n" +
                        "Bumbu halus\n" +
                        "Gula pasir\n" +
                        "Garam\n" +
                        "Penyedap/kaldu bubuk\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Cuci bersih ikan, lalu potong-potong sesuai selera\n" +
                        "2. Siapkan bumbu yang diperlukan. " +
                        "Lalu haluskan bawang putih, bawang merah, kemiri dan kunyit. " +
                        "Kemudian geprek serai dan iris-iris laos juga jahe\n" +
                        "3. Panaskan 3sdm minyak goreng, " +
                        "lalu tumis bumbu yang sudah dihaluskan tadi " +
                        "bersama serai geprek, cabe, daun salam, daun jeruk, jahe iris dan lengkuas iris. " +
                        "Lalu aduk2 dan tumis hingga harum\n" +
                        "4.Masukkan air, lalu aduk-aduk hingga mendidih. " +
                        "Kemudian masukkan garam, kecap manis, merica dan gula merah. " +
                        "Kemudian aduk-aduk dan cek rasa. " +
                        "Jika takut kemanisan, gula merahnya jangan langsung dimasukkan semua, " +
                        "bertahap sampai tingkat kemanisan yang diinginkan\n" +
                        "5. Lalu masukkan ikan patinnya. " +
                        "Aduk2 dan masak hingga ikan matang, " +
                        "lalu masukkan tomat yang sudah diiris  Tunggu sebentar, " +
                        "kemudian matikan api. Jika pake kemangi, kemanginya dimasukkan setelah api dimatikan, " +
                        "lalu aduk2 sebentar. Sekarang pindang patinnya sudah jadi dan siap disantap.\n");
                Getsumber.setText("Sumber Video: Dapur Bakku Hebat");
                GetVideo.loadUrl("file:///android_asset/pindang.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Ikan Bakar":
                GetImage.setImageResource(R.drawable.ikanbakar);
                GetNm_makanan.setText("IKAN BAKAR");
                GetAsal.setText("Asal: Kalimantan Tengah");
                GetKet.setText("sangat nikmati dimakan ketika berkumpul bersama teman-teman.");
                GetBahan.setText("Bahan:\n" +
                        "1/2 kg ikan nila/bebas\n" +
                        "Bahan Marinasi Ikan :\n" +
                        "1 sdm garam\n" +
                        "1 buah jeruk nipis\n" +
                        "Bahan Bumbu Oles Merah :\n" +
                        "300 gram cabe besar\n" +
                        "100 gram cabe rawit\n" +
                        "1 keping gula merah\n" +
                        "1 ruas jahe\n" +
                        "1 ruas kunyit\n" +
                        "2 ruas lengkuas\n" +
                        "2 siung bamer\n" +
                        "2 siung baput\n" +
                        "2 butir kemiri\n" +
                        "1 sdm garam\n" +
                        "1 sdm ketumbar bubuk\n" +
                        "1 sdm kaldu ayam bubuk\n" +
                        "Bahan Bumbu Oles Kecap :\n" +
                        "2 sdm kecap manis/disesuaikan (bisa ditambah)\n" +
                        "1 sdm saus tomat\n" +
                        "2 sdm mentega\n" +
                        "1 buah jeruk nipis\n\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Blender halus semua bahan bumbu merah \n" +
                        "2. Campurkan mentega , kecap manis , jeruk nipis untuk dijadikan bumbu kecap\n" +
                        "3. Olesi ikan dengan bumbu merah dahulu , lalu lapisi dengan bumbu kecap\n" +
                        "4. Balik ikannya  , lalu olesi dengan bumbu merah diikuti bumbu kecap (dibakar 10 menit)\n" +
                        "5. Setelah 10 menit , balik ikannya lalu olesi lagi dengan bumbu kecap saja\n" +
                        "6. Setelah 10 menit , balik ikannya olesi sisi baliknya dengan bumbu kecap juga\n" +
                        "7. Ikan bakar siap disantap\n");
                Getsumber.setText("Sumber Video: Master GO");
                GetVideo.loadUrl("file:///android_asset/ikanbakar.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Sate Madura":
                GetImage.setImageResource(R.drawable.satemadura);
                GetNm_makanan.setText("SATE MADURA");
                GetAsal.setText("Asal: Jawa Timur");
                GetKet.setText("sangat enak dinikmati ketika sedang berkumpul bersama" +
                        "keluarga atau teman-teman di malam hari.");
                GetBahan.setText("Bahan:\n" +
                        "1/2kg Dada Ayam (potong memanjang)\n" +
                        "kecap Manis\n" +
                        "Bawang goreng\n" +
                        "Jeruk nipis\n" +
                        "200gr Kacang tanah\n" +
                        "bahan bumbu: \n" +
                        "5 siung Bawang Putih\n" +
                        "5 siung Bawang merah\n" +
                        "7 biji Cabe besar\n" +
                        "1sdt Garam\n" +
                        "1/2sdt Merica bubuk\n" +
                        "2sdm Gula\n" +
                        "1 ltr Air\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Cuci bersih ayam lalu potong ukuran dadu, " +
                        "setelah itu taburi garam lalu simpan dalam kulkas 15menit\n" +
                        "2. Haluskan bumbu halus " +
                        "lalu tumis bersama daun jeruk hingga wangi " +
                        "lalu beri sedikit air biarkan mendidih\n" +
                        "3. Haluskan kacang tanah, " +
                        "lalu masukan kedalam wajan beri air, gula jawa, kecap, garam, kaldu bubuk. " +
                        "Aduk aduk hinggga bumbu sedikit menyusut lalu koreksi rasa\n" +
                        "4. Ambil 3sdm bumbu kacang lalu tambah 1sdm air + 1sdt kecap manis. " +
                        "Balurkan pada ayam yg sebelumnya sudah di tusuk pada lidi sate. " +
                        "Kemudian simpan dalam kulkas ± 1 jam\n" +
                        "5. kemudian bakar sate hingga matang, " +
                        "kemudian sajikan dengan kuah kacang\n");
                Getsumber.setText("Sumber Video: Chalistaa Kitchen");
                GetVideo.loadUrl("file:///android_asset/satemadura.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Sate Lilit":
                GetImage.setImageResource(R.drawable.satelilit);
                GetNm_makanan.setText("SATE LILIT");
                GetAsal.setText("Asal: Bali");
                GetKet.setText("salah satu makanan khas bali yang paling enak dan nikmat sebagai" +
                        "menu sehari-hari");
                GetBahan.setText("Bahan:\n" +
                        "lombok besar 1 buah\n" +
                        "cabe rawit sesuai selera\n" +
                        "cabe merah kriting sesuai selera\n" +
                        "jahe 2 ruas jari\n" +
                        "ayam/ikan 500 gram\n" +
                        "bawang merah segenggam penuh\n" +
                        "bawang putih 7 siung\n" +
                        "kelapa parut 3 genggam\n" +
                        "kunyit 1 ruas jari\n" +
                        "garam&merica secukupnya\n" +
                        "terasi 1/2 sdt\n" +
                        "kemiri 5\n" +
                        "daun jeruk (diiris halus) 3 helai\n" +
                        "gula merah 2 sdm\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Siapkan semua bahan yang diiris dan bahan yang dihaluskan, " +
                        "daging ayam cuci bersih terus digiling.\n" +
                        "2. Siapkan 1 sdm minyak goreng " +
                        "Tumis bumbu halus dengan irisan daun jeruk dan sereh " +
                        "masak hingga harum dan matang. Matikan api dan dinginkan.\n" +
                        "3. Campur daging ayam dengan bumbu yang sudah ditumis " +
                        "tambahkan santan sedikit-sedikit " +
                        "tambah garam, gula pasir, kaldu bubuk, lada bubuk aduk aduk sampai rata\n" +
                        "4. Olesi tangan dengan sedikit minyak " +
                        "ambil 1 sdm adonan beri sereh lilitkan dengan dikepal kepal " +
                        "jangan terlalu tebal agar matang merata lakukan sampai adonan habis\n" +
                        "5. Panggang diatas teflon dengan api kecil agar matangnya rata.\n");
                Getsumber.setText("Sumber Video: Dapur Dina");
                GetVideo.loadUrl("file:///android_asset/satelilit.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Ayam Taliwang":
                GetImage.setImageResource(R.drawable.ayamtaliwang);
                GetNm_makanan.setText("AYAM TALIWANG");
                GetAsal.setText("Asal: Nusa Tenggara Barat");
                GetKet.setText("Ayam taliwang sangat cocok disajikan sebagai menu makanan sehari-hari" +
                        "ditambah dengan nasi hangat lebih mantap.");
                GetBahan.setText("Bahan1:\n" +
                        "1 ekor (400 g)\n" +
                        "½ sdt Garam\n" +
                        "½ sdt Desaku Kunyit Bubuk\n" +
                        "4 sdm Air\n" +
                        "Bahan 2: (bumbu halus)\n" +
                        "3 buah Cabe Merah\n" +
                        "6 buah Cabe Merah Keriting\n" +
                        "3 buah Cabe Rawit Merah\n" +
                        "3 siung Bawang Putih\n" +
                        "5 buah Bawang Merah\n" +
                        "2 cm Kencur\n" +
                        "3 butir Kemiri, disangan\n" +
                        "1½ sdt Terasi Khas Lombok\n" +
                        "1½ sdt Garam\n" +
                        "Bahan 3:\n" +
                        "5 sdm Minyak Goreng\n" +
                        "400 ml Santan Sedang Kentalnya, yang diperoleh dari ½ butir kelapa\n" +
                        "2 sdm Gula Merah, serut\n" +
                        "1½ sdt Gula Pasir\n" +
                        "2 buah Jeruk Limau, ambil airnya\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Haluskan bahan 2\n" +
                        "2. Panaskan minyak goreng, tumis bumbu halus hingga matang\n" +
                        "3. Masukkan santan sedang kental, gula merah dan gula pasir, masak hingga kuah mengental dan berminyak\n" +
                        "4. Matikan api dan sisihkan\n" +
                        "5. Belah dada ayam hingga melebar, balik ayam kemudian lipatkan kaki ayam ke paha, tusuk paha kiri hingga paha kanan menggunakan tusuk sate, lipatkan kepala ayam ke bawah sayap, tusuk kembali bagian sayap kiri hingga kanan\n" +
                        "6. Larutkan Desaku Kunyit Bubuk, garam dan air dalam wadah, aduk hingga garam larut\n" +
                        "7. Masukkan ayam ke dalam wadah, oleskan ayam dengan larutan kunyit\n" +
                        "8. Bakar ayam hingga setengah matang\n" +
                        "9. Oleskan ayam dengan bumbu, bakar hingga bumbu pekat, lakukan sebanyak 2 kali\n" +
                        "10. Masukkan jeruk limau pada sisa bumbu, aduk rata\n" +
                        "11. Oleskan ayam dengan bumbu hingga rata\n" +
                        "12. Sajikan selagi hangat\n");
                Getsumber.setText("Sumber Video: Rasa Sayange TV");
                GetVideo.loadUrl("file:///android_asset/ayamtaliwang.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Bubur Manado":
                GetImage.setImageResource(R.drawable.buburmanado);
                GetNm_makanan.setText("BUBUR MANADO");
                GetAsal.setText("Asal: Sulawesi Utara");
                GetKet.setText("sangat nikmat sebagai menu sarapan pagi.");
                GetBahan.setText("Bahan1:\n" +
                        "100 g Beras, cuci bersih, lalu rendam selama 1 jam\n" +
                        "200 g Labu Kuning, potong dadu\n" +
                        "1.250 ml Air\n" +
                        "2 sdt Garam\n" +
                        "1 sdt Gula Pasir\n" +
                        "Bahan 2:\n" +
                        "100 g Ubi Jalar, potong dadu\n" +
                        "100 g Jagung Pipil\n" +
                        "Bahan 3:\n" +
                        "75 g Kangkung\n" +
                        "50 g Daun Melinjo Muda, potong 2 bagian\n" +
                        "40 g Daun Kemangi\n" +
                        "½ sdt Ladaku Merica Bubuk\n" +
                        "¼ sdt Desaku Kunyit Bubuk\n" +
                        "Bahan 4: (Pelengkap)\n" +
                        "100 g Ikan Asin Jambal, potong serasi dan goreng kering\n" +
                        "Sambal Roa\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Rebus semua bahan 1 dengan api sedang, masak hingga mendidih\n" +
                        "2. Tambahkan Desaku Kunyit Bubuk, aduk hingga beras menjadi bubur halus\n" +
                        "3. Masukkan bahan 2, masak hingga ubi jalar empuk\n" +
                        "4. Masukkan daun melinjo dan kangkung, masak hingga cukup layu\n" +
                        "5. Masukkan kemangi, aduk sesaat hingga cukup layu dan harum\n" +
                        "6. Tambahkan Ladaku Merica Bubuk, aduk rata. Matikan api\n" +
                        "7. Sajikan selagi panas beserta ikan asin dan sambal roa.\n");
                Getsumber.setText("Sumber Video: Rudy dan Sahabat TV");
                GetVideo.loadUrl("file:///android_asset/buburmanado.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Bubur Pedas":
                GetImage.setImageResource(R.drawable.buburpedas);
                GetNm_makanan.setText("BUBUR PEDAS");
                GetAsal.setText("Asal: Kalimantan Barat");
                GetKet.setText("sangat cocok dimakan saat cuaca sedang dingin bersama keluarga.");
                GetBahan.setText("Bahan:\n" +
                        "500 gram beras, cuci bersih, tiriskan\n" +
                        "200 gram kelapa parut\n" +
                        "300 gram tetelan sapi atau daging ayam\n" +
                        "10 lonjor kacang panjang, potong-potong\n" +
                        "2 buah wortel, potong dadu\n" +
                        "100 gram ubi jalar, potong dadu\n" +
                        "2 ikat kangkung, potong-potong\n" +
                        "100 gr tauge\n" +
                        "100 gr rebung, diiris tipis-tipis\n" +
                        "3 ikat pakis, ambil daun dan pucuknya, iris tipis-tipis\n" +
                        "100 gram daun kesum, diiris tipis-tipis\n" +
                        "2000 cc air\n" +
                        "Bahan bumbu bubur pedas\n" +
                        "4 lembar daun salam\n" +
                        "2 batang serai, memarkan\n" +
                        "4 cm lengkuas, memarkan\n" +
                        "6 butir bawang merah, haluskan\n" +
                        "2 siung bawang putih, haluskan\n" +
                        "2 buah cabai merah, haluskan\n" +
                        "1/2 sendok teh merica, haluskan\n" +
                        "Bahan bumbu pelengkap\n" +
                        "200 gram kacang tanah, goreng\n" +
                        "100 gram ikan teri, goreng\n" +
                        "Bawang goreng\n" +
                        "Kecap manis\n" +
                        "Jeruk limau\n" +
                        "Sambal cair dari cabe rawit\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Sangrai beras sampai kekuning-kuningan, tumbuk halus\n" +
                        "2. Sangrai kelapa parut, tumbuk halus\n" +
                        "3. Siapkan air, rebus tetelan hingga matang.\n" +
                        "4. Masukkan bumbu halus, daun salam, serai, lengkuas. Aduk-aduk.\n" +
                        "5. Tambahkan beras tumbuk, aduk-aduk\n" +
                        "6. Masukkan wortel, kacang panjang, kangkung, ubi jalar, pakis dan daun kesum. " +
                        "Aduk-aduk, masak dengan api kecil hingga matang, angkat.\n" +
                        "Sajikan bersama bahan pelengkap " +
                        "untuk taburan antara lain kacang tanah, ikan teri, bawang goreng. Kecap, " +
                        "sambal, jeruk limau, lebih baik disediakan terpisah agar " +
                        "bisa ditambahkan sesuai selera masing-masing.\n");
                Getsumber.setText("Sumber Video: Wak Dabol");
                GetVideo.loadUrl("file:///android_asset/buburpedas.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Karedok":
                GetImage.setImageResource(R.drawable.karedok);
                GetNm_makanan.setText("KAREDOK");
                GetAsal.setText("Asal: Jawa Barat");
                GetKet.setText("lebih cocok dimakan saat cuaca panas karena sayur-sayuran sangat menyegarkan");
                GetBahan.setText("Bahan:\n" +
                        "Kacang panjang\n" +
                        "Kol\n" +
                        "Tauge\n" +
                        "Mentimun\n" +
                        "1 buah gula merah\n" +
                        "100gr kacang tanah\n" +
                        "1 ruas jari kencur\n" +
                        "1/2 siung bawang putih\n" +
                        "4 buah cabe rawit\n" +
                        "garam\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Siapkan sayuran dan bumbu kacang\n" +
                        "2. Uleg bumbu kacang\n" +
                        "3. Masukan yg pertama irisan kacang panjang, " +
                        "irisan kol, irisan mentimun, tauge\n" +
                        "4. ulek lagi, Aduk rata, sajikan\n");
                Getsumber.setText("Sumber Video: Dapur Manda");
                GetVideo.loadUrl("file:///android_asset/karedok.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Gado-gado":
                GetImage.setImageResource(R.drawable.gadogado);
                GetNm_makanan.setText("GADO-GADO");
                GetAsal.setText("Asal: Jakarta");
                GetKet.setText("sangat nikmat dihidangkan ketika cuaca panas" +
                        "agar lebih menyegarkan.");
                GetBahan.setText("Bahan:\n" +
                        "Kecambah\n" +
                        "Kangkung\n" +
                        "Kacang panjang\n" +
                        "Timun\n" +
                        "Nangka muda\n" +
                        "Telur rebus\n" +
                        "Lontong\n" +
                        "Krupuk\n" +
                        "Bawang goreng\n" +
                        "Bumbu:\n" +
                        "Bawang putih, 4 siung (digoreng)\n" +
                        "Terasi 1/2 sendok teh (digoreng)\n" +
                        "Cabe rawit mentah, 3 buah \n" +
                        "Kacang tanah, 100 gram (digoreng)\n" +
                        "Gula merah, secukupnya.\n" +
                        "Garam, secukupnya.\n" +
                        "Jeruk limau, secukupnya.\n\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Saus kacang: cuci dan goreng kacang tanah hingga matang, " +
                        "haluskan bawang putih, terasi, jeruk dan cabai. " +
                        "Kemudian uleg kacang dalam campuran bumbu halus, " +
                        "tambahkan gula merah, garam, dan masukkan sedikit demi sedikit air, " +
                        "hingga kekentalan yang diinginkan.\n" +
                        "2. Rebus sayur yang harus direbus " +
                        "(untuk kecambah jangan direbus terlalu lama. Cukup 2 menitan),saring dan tiriskan. " +
                        "Untuk kentang rebus sampai matang dan kupas potong dadu.\n" +
                        "3. Cuci timun, kemudian potong kecil kecil timun.\n" +
                        "4. Campurkan kedalam piring, siap disajikan.\n");
                Getsumber.setText("Sumber Video: Mpok Hilda");
                GetVideo.loadUrl("file:///android_asset/gadogado.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Papeda":
                GetImage.setImageResource(R.drawable.papeda);
                GetNm_makanan.setText("PAPEDA");
                GetAsal.setText("Asal: Papua");
                GetKet.setText("Sangat cocok dinikmati sebagai makan siang.");
                GetBahan.setText("Bahan:\n" +
                        "4 sdm minyak kelapa\n" +
                        "2 batang serai, memarkan\n" +
                        "2 cm lengkuas, memarkan\n" +
                        "1.000 ml air\n" +
                        "1 ekor (± 600-800 g) ikan patin, potong 5 bagian\n" +
                        "1 sdt gula pasir\n" +
                        "1 sdt garam\n" +
                        "2 buah jeruk nipis\n" +
                        "2 batang daun kemangi\n" +
                        "Bumbu, haluskan:\n" +
                        "6 butir bawang merah\n" +
                        "4 siung bawang putih\n" +
                        "3 buah cabai merah besar\n" +
                        "2 cm jahe\n" +
                        "3 cm kuyit\n" +
                        "Papeda:\n" +
                        "100 g tepung sagu\n" +
                        "300 ml air\n" +
                        "900 ml air mendidih\n" +
                        "1 buah jeruk nipis\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Ikan kuah kuning: Panaskan minyak, tumis bumbu halus, serai, " +
                        "dan lengkuas hingga harum.\n" +
                        "2. Tambahkan air, ikan, gula, dan garam, " +
                        "masak selama 30 menit hingga ikan matang dan bumbu meresap. " +
                        "Angkat, tuang ke dalam piring saji, " +
                        "tambahkan air jeruk nipis dan daun kemangi di atasnya. Sisihkan.\n" +
                        "3. Papeda: Larutkan tepung sagu dan air. Tambahkan air mendidih, " +
                        "aduk cepat hingga mengental.\n" +
                        "4. Penyajian: Sajikan papeda bersama dengan ikan kuah kuning, " +
                        "santap segera selagi hangat.\n");
                Getsumber.setText("Sumber Video: Endeus.tv");
                GetVideo.loadUrl("file:///android_asset/papeda.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Sinonggi":
                GetImage.setImageResource(R.drawable.sinonggi);
                GetNm_makanan.setText("SINONGGI");
                GetAsal.setText("Asal: Sulawesi Tenggara");
                GetKet.setText("sangat nikmat dihidangkan untuk menu sehari-hari.");
                GetBahan.setText("Bahan:\n" +
                        "1/2 litter Sagu\n" +
                        "Ikan\n" +
                        "tomat\n" +
                        "daun serei\n" +
                        "kunyit\n" +
                        "3 siung Bawang putih\n" +
                        "tomat\n" +
                        "Kangkung\n" +
                        "3 siung Bawang merah\n" +
                        "Bumbu Halus:\n" +
                        "3 siung bawang putih\n" +
                        "4 siung bawang merah\"\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Tumis ikan. Haluskan bawang putih dan bawang merah. " +
                        "Masukkan tomat daun serei, masukkan air, lalu masukkan ikan dan kunyit." +
                        "Setelah mendidih masukkan massako.Tes rasa. " +
                        "Setelah matang sisihkan ikan.\n" +
                        "2. Tumis kangkung, masukkan bawang merah dan putih, lalu tomat. " +
                        "Masukkan kangkung yang sudah dicuci bersih, tunggu hingga layu, " +
                        "masukkan penyedap. Tes rasa tunggu hingga matang. Sisihkan\n" +
                        "3. Masak air untuk sagu... Sambil menunggu air matang. " +
                        "Ambil wadah masukkan sagu dengan air, saring sagu (pake saringan kelapa) " +
                        "agar kotoran sagunya hilang. Diamkan sampe mengendap...\n" +
                        "4. Setelah mengendap buang airnya, sisakan sedikit saja, " +
                        "lalu aduk, tuang air mendidih, aduk sagu sampai mengental...\n" +
                        "5. Siap dimakan.\n");
                Getsumber.setText("Sumber Video: Hidupku Sebagai Debbie");
                GetVideo.loadUrl("file:///android_asset/sinonggi.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Tempoyak":
                GetImage.setImageResource(R.drawable.tempoyak);
                GetNm_makanan.setText("TEMPOYAK");
                GetAsal.setText("Asal: Jambi");
                GetKet.setText("sambal tempoyak ini sangat nikmat sambil makan ikan atau ayam bakar" +
                        " dan tak lupa nasi hangat.");
                GetBahan.setText("Bahan:\n" +
                        "2 gelas adonan duren fermentasi (fermentasi selama 1 minggu)\n" +
                        "Secukupnya ikan teri (ukuran kecil)\n" +
                        "Secukupnya minyak, garam dan air" +
                        "Bahan Halus:\n" +
                        "5 siung bawang merah\n" +
                        "3 siung bawang putih\n" +
                        "1 buah kemiri\n" +
                        "11 buah cabai kriting merah\n" +
                        "4 buah cabai rawit merah\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Siapkan bahan-bahan untuk dihaluskan. " +
                        "Tambahkan sedikit air. Haluskan.\n" +
                        "2. Cuci ikan teri, lalu goreng hingga kecoklatan. Tiriskan.\n" +
                        "3. Tumis bumbu dengan minyak sampai setengah matang, " +
                        "lalu masukkan adonan duren. Aduk rata.\n" +
                        "4. Setelah bumbu setengah matang, masukan teri. Aduk kembali.\n" +
                        "5. Sambil menunggu adonan sambal sat. Tes rasa. " +
                        "Jika sambal terlalu asam, bisa diberi garam sedikit demi sedikit," +
                        "agar menetralisir rasa asamnya.\n" +
                        "6. Aduk terus sampai matang, " +
                        "berubah warna kemerah coklatan. Dan siap disajikan.\n");
                Getsumber.setText("Sumber Video: Dapur Amiq Pipit");
                GetVideo.loadUrl("file:///android_asset/tempoyak.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Lawar Kacci Manda":
                GetImage.setImageResource(R.drawable.lawarkaccimanda);
                GetNm_makanan.setText("LAWAR KACCI MANDA");
                GetAsal.setText("Asal: Sulawesi Barat");
                GetKet.setText("sangat nikmat dimakan bersama ikan bakar atau goreng" +
                        " dan yang pasti nasi hangat.");
                GetBahan.setText("Bahan:\n" +
                        "1 buah mangga muda (kupas kulitnya )\n" +
                        "150 gr santan kental\n" +
                        "Bahan Halus:\n" +
                        "Terasi bakar 1 sendok teh\n" +
                        "Garam 3/4 sendok teh\n" +
                        "Gula merah 1 sendok makan\n" +
                        "Cabe merah besar 3 buah\n" +
                        "Cabe rawit 15 buah\n" +
                        "Bawang merah 3 butir\n" +
                        "Bawang putih 2 siung\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1. Serut memanjang buah mangga yang sudah dikupas, sisihkan sejenak\n" +
                        "2. Campurkan gula merah, garam, bawang merah, bawang putih, terasi bakar dan cabe menjadi satu\n" +
                        "3. Haluskan bahan yang dicampur dengan cara diulek secara manual\n" +
                        "4. Masukkan buah mangga kedalam sambal yang sudah diulek\n" +
                        "5. Aduk bersama santan kental hingga tercampur merata\n" +
                        "6. Sajikan Lawar Kacci khas Mandar bersama ikan goreng atau ikan bakar " +
                        "serta nasi hangat yang siap disantap.\n");
                Getsumber.setText("Sumber Video: DAPUR ENAK");
                GetVideo.loadUrl("file:///android_asset/lawarkaccimanda.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
            case "Sambal Seruit":
                GetImage.setImageResource(R.drawable.sambalseruit);
                GetNm_makanan.setText("SAMBAL SERUIT");
                GetAsal.setText("Asal: Lampung");
                GetKet.setText("sebagai teman makan saat mencicipin ikan bakar.");
                GetBahan.setText("Bahan:\n" +
                        "10 biji cabe merah kecil\n" +
                        "3 siung bawang merah\n" +
                        "2 buah tomat sedang/menyesuaikan ukuran tomat tersebut\n" +
                        "secukupnya Garam\n" +
                        "secukupnya Gula\n" +
                        "Terasi jeruk nipis\n");
                GetCara.setText("Cara Membuat:\n" +
                        "1.Giling cabai dengan menggunakan garam, " +
                        "lalu masukkan bawang merah dan tomat. " +
                        "jangan sampai terlalu halus pada saat menggiling\n" +
                        "2. Bakar Terasi (Jangan sampai terlalu coklat/hitam)\n" +
                        "3. Masukkan terasi bakar ke dalam cabai yang kita giling, " +
                        "giling perlahan sambil mencampurkan bahan sambal dan terasi, " +
                        "tambahkan sedikit gula\n" +
                        "4. Siap disajikan dan tambahkan jeruk nipis agar lebih enak dan wangi\n");
                Getsumber.setText("Sumber Video: TARI M GAFUR");
                GetVideo.loadUrl("file:///android_asset/sambalseruit.html");
                GetVideo.getSettings().setJavaScriptEnabled(true);
                break;
        }
    }

}

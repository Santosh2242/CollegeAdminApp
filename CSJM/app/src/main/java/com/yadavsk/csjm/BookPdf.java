package com.yadavsk.csjm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class BookPdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_pdf);
    }

    public void Fcit(View view) {
        openUrl("https://www.google.com/url?sa=t&source=web&rct=j&url=https://www.tutorialspoint.com/computer_fundamentals/computer_fundamentals_tutorial.pdf&ved=2ahUKEwjTp4GEsqjuAhWjxDgGHePXCzAQFjAPegQICBAB&usg=AOvVaw3xeBokPWOwQtWzfTOnyywT");
    }

    private void openUrl(String url) {
        Uri uri = Uri.parse(url);
        Intent launchWeb = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }

    public void Multimedia(View view) {
        openUrl("https://www.pdfdrive.com/download.pdf?id=33473388&h=7d938a1c659e8f7194fbe1565549aa5e&u=cache&ext=pdf");
    }

    public void UsingC(View view) {
        openUrl("http://31.42.184.140/main/63000/43df4fe9e75f7efc467094e4bcbb5880/Yashavant%20Kanetkar%20-%20Let%20Us%20C-BPB%20Publications%20%282004%29.pdf\n");
    }

    public void WebTechnology(View view) {
        openUrl("https://www.google.com/url?sa=t&source=web&rct=j&url=https://wtf.tw/ref/duckett.pdf&ved=2ahUKEwiVgcbRo6fuAhUazDgGHQs9D94QFjAAegQIARAB&usg=AOvVaw1M-ax_DZ_7fKnQs-tQnOXE");
    }

    public void Dccn(View view) {
        openUrl("https://www.google.com/url?sa=t&source=web&rct=j&url=https://www.tutorialspoint.com/data_communication_computer_network/data_communication_computer_network_tutorial.pdf&ved=2ahUKEwiZxKGPpafuAhXTxzgGHXJzAxIQFjAAegQIARAB&usg=AOvVaw088_P0v_D37oZfYufuNfpu&cshid=1611035196088");
    }

    public void Dsuc(View view) {
        openUrl("https://www.google.com/url?sa=t&source=web&rct=j&url=https://vardhaman.org/wp-content/uploads/2018/12/Data%2520Structures.pdf&ved=2ahUKEwjsyp6ZpqfuAhWhzzgGHXwzAgEQFjAHegQIBRAB&usg=AOvVaw3p7sUPhATKoc7nQoarClHG");
    }

    public void DBMS(View view) {
        openUrl("https://drive.google.com/file/d/1Q1AhIR4skvEtvdRBP14loX1m5Qe1QHxm/view?usp=drivesdk\n" +
                "Attachments area\n");
    }

    public void Java(View view) {
        openUrl("https://www.google.com/url?sa=t&source=web&rct=j&url=http://www.sietk.org/downloads/javabook.pdf&ved=2ahUKEwipz_TBqKfuAhVJ8HMBHU9dDH4QFjAAegQIARAB&usg=AOvVaw2e-meZM6S8d6YI8FCkVEn5");
    }

    public void OS(View view) {
        openUrl("https://www.google.com/url?sa=t&source=web&rct=j&url=http://www.uobabylon.edu.iq/download/M.S%25202013-2014/Operating_System_Concepts,_8th_Edition%255BA4%255D.pdf&ved=2ahUKEwitxZiaqafuAhVszzgGHVZyA6IQFjADegQIDRAB&usg=AOvVaw0BwLCaDRO-NcKVCNoY9oyg");
    }

    public void SE(View view) {
        openUrl("\n" +
                "https://www.google.com/url?sa=t&source=web&rct=j&url=https://www.tutorialspoint.com/software_engineering/software_engineering_tutorial.pdf&ved=2ahUKEwiIqtj5qafuAhXqxDgGHU_9AlIQFjAEegQIBBAB&usg=AOvVaw1jDRFGj2NxoQ3WpS8poMxk");
    }

    public void PHP(View view) {
        openUrl("https://www.google.com/url?sa=t&source=web&rct=j&url=https://www.tutorialspoint.com/php/php_tutorial.pdf&ved=2ahUKEwiW68CaqqfuAhXZ4zgGHQRKB7MQFjACegQIDxAB&usg=AOvVaw3h9XdHyVZcvjAZeLFKCbvc\n");
    }

    public void IOT(View view) {
        openUrl("https://www.google.com/url?sa=t&source=web&rct=j&url=https://www.tutorialspoint.com/internet_of_things/internet_of_things_tutorial.pdf&ved=2ahUKEwiW2JqYrafuAhWE_XMBHSmpCvUQFjAGegQIBxAB&usg=AOvVaw2HgxSpWYd5NFv7rXZrqH3C");
    }

    public void python(View view) {
        openUrl("https://www.google.com/url?sa=t&source=web&rct=j&url=http://index-of.es/Python/Python%25203%2520for%2520Absolute%2520Beginners.pdf&ved=2ahUKEwiL8KPDqqfuAhVSyzgGHXyyBk8QFjACegQIDBAB&usg=AOvVaw3F-arGvlRDDqTZnAx-vAtl");
    }

    public void Android(View view) {
        openUrl("https://www.google.com/url?sa=t&source=web&rct=j&url=https://androidatc.com/upload/editor_upload/file/Java-Fundamentals-for-AndroidT-Application-Development-AND-404.pdf&ved=2ahUKEwjD1sTcsafuAhVtwTgGHQpyAWUQFjACegQICxAB&usg=AOvVaw0HZsTKSWYbRAVvcsFluiDV");
    }

    public void Cloud(View view) {
        openUrl("https://www.google.com/url?sa=t&source=web&rct=j&url=https://www.tutorialspoint.com/cloud_computing/cloud_computing_tutorial.pdf&ved=2ahUKEwihx4OksqfuAhWMyDgGHTBnAu4QFjAJegQIBRAB&usg=AOvVaw0aKk4hpbDyFHjUTZK-BQUU");
    }

    public void Bit(View view) {
        openUrl("https://www.google.com/url?sa=t&source=web&rct=j&url=https://www.tutorialspoint.com/computer_fundamentals/computer_fundamentals_tutorial.pdf&ved=2ahUKEwjTp4GEsqjuAhWjxDgGHePXCzAQFjAPegQICBAB&usg=AOvVaw3xeBokPWOwQtWzfTOnyywT");
    }

    public void PCEngg(View view) {
        openUrl("https://www.pdfdrive.com/download.pdf?id=33416115&h=14b3ee94b51c4ca6f42b710f0976a815&u=cache&ext=pdf");
    }

    public void ConsumerElectronic(View view) {
        openUrl("https://www.pdfdrive.com/download.pdf?id=45158982&h=079730645bc7c87d855964731a48bbd2&u=cache&ext=pdf\n");
    }

    public void Cprogramming(View view) {
        openUrl("http://31.42.184.140/main/63000/43df4fe9e75f7efc467094e4bcbb5880/Yashavant%20Kanetkar%20-%20Let%20Us%20C-BPB%20Publications%20%282004%29.pdf\n");
    }

    public void Microwave(View view) {
        openUrl("https://www.google.com/url?sa=t&source=web&rct=j&url=https://radfiz.org.ua/share/s8_DEK/SECONDARY/%25E4%25C5%25D2%25D6/%25E4%25C5%25D2%25D6/%25CE%25D7%25DE%2520%25D4%25C5%25C8%25CE%25A6%25CB%25C1/%25CC%25A6%25D4/Pozar.%2520Microwave%2520Engineering.pdf&ved=2ahUKEwjfuPKRyqjuAhW_6nMBHTLbCSQQFjACegQIDBAB&usg=AOvVaw1lm1TIWyl1368-VlLupsxU&cshid=1611079341372\n");
    }

    public void Wireless(View view) {
        openUrl("https://www.google.com/url?sa=t&source=web&rct=j&url=http://eletrica.ufpr.br/graduacao/e-books/Principles%2520of%2520Mobile%2520Communication.pdf&ved=2ahUKEwiYnt3RyqjuAhVWwjgGHa51A-QQFjAEegQIBxAB&usg=AOvVaw2JnH3qPBaKZaPaS_Mff4Q8&cshid=1611079833746");
    }

    public void IndustrialElectronic(View view) {
        openUrl("https://www.google.com/url?sa=t&source=web&rct=j&url=http://dspace.bhos.edu.az/xmlui/bitstream/handle/123456789/1143/%255BDaniel_J._Shanefield%255D_Industrial_Electronics_for_%2528BookZZ.org%2529.pdf%3Fsequence%3D1&ved=2ahUKEwimv_uy0KjuAhX_8HMBHT7MA0oQFjAEegQIChAB&usg=AOvVaw0hcBYvsQyuaQ5I0xOxduJw&cshid=1611081059180");
    }

    public void Powerplant(View view) {
        openUrl("https://www.pdfdrive.com/download.pdf?id=24561966&h=5dbe70607770a346cb5cfaaaee680a84&u=cache&ext=pdf\n");
    }

    public void Transmission(View view) {
        openUrl("https://www.pdfdrive.com/download.pdf?id=158168123&h=3d0c4b10e3d7bffdf61a80290f3d786e&u=cache&ext=pdf");
    }

    public void Plc(View view) {
        openUrl("\n" +
                "https://www.google.com/url?sa=t&source=web&rct=j&url=http://www.ieec.uned.es/investigacion/Dipseil/PAC/archivos/introtoplcs_SUPER.pdf&ved=2ahUKEwifjeb60qjuAhVnyDgGHVCZCaEQFjAGegQIChAB&usg=AOvVaw2SmkUb5zV9JBI3c242BHfi&cshid=1611081732112");
    }

    public void CsinElectrical(View view) {
        openUrl("https://www.pdfdrive.com/download.pdf?id=10642205&h=47749d0c71dedfe4bc5e8b5497ca2a0e&u=cache&ext=pdf\n");
    }

    public void Utlization(View view) {
        openUrl("\n" +
                "https://www.pdfdrive.com/download.pdf?id=34332918&h=71effd9755dbd00bc814f5f0826c4fba&u=cache&ext=pdf");
    }
}
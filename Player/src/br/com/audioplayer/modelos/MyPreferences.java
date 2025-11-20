package br.com.audioplayer.modelos;

public class MyPreferences {

    public void include (Audio audio) {
        if(audio.getClassification() >= 9) {
            System.out.println(audio.getTitle() + " Sucesso absoluto" + " e preferido por todos!");
        } else {
            System.out.println(audio.getTitle() + " Ótima opção para ouvir depois");
        }
    }
}

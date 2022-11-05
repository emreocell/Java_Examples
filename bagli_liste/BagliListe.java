class Dugum {
    int no;
    String isim;
    Dugum ileri;

    public Dugum(int no, String isim) {
        this.no = no;
        this.isim = isim;
        ileri = null;
    }
}

public class BagliListe {
    Dugum bas;

    public BagliListe(Dugum yeni) {
        bas = null;
    }

    void basaEkle(Dugum yeni) {
        if (bas == null) {
            bas = yeni;
        } else {
            yeni.ileri = bas;
            bas = yeni;
        }
    }

    void sonaEkle(Dugum yeni) {
        Dugum tmp = null;
        if (bas == null) {
            bas = yeni;
        } else {
            tmp = bas;
        }
        while (tmp.ileri != null) {
            tmp = tmp.ileri;
            tmp.ileri = yeni;
        }
    }

    void siraliEkle(Dugum yeni) {
        Dugum tmp = null;
        if (bas == null || bas.no >= yeni.no) {
            yeni.ileri = bas;
            bas = yeni;
        } else {
            tmp = bas;
        }
        while (tmp.ileri != null && tmp.ileri.no < yeni.no) {
            tmp = tmp.ileri;
        }
        yeni.ileri = tmp.ileri;
        tmp.ileri = yeni;
    }

    void sil(int no) {
        Dugum tmp = bas, once = null;
        if (tmp != null && tmp.no == no) {
            bas = bas.ileri;
            return;
        }
        while (tmp != null && tmp.no != no) {
            once = tmp;
            tmp = tmp.ileri;
        }
        if (tmp == null) return;
        once.ileri = tmp.ileri;
    }

    String listele() {
        String S = "";
        Dugum tmp = bas;
        while (tmp != null) {
            S = S + tmp.no + "-" + tmp.isim + "->";
            tmp = tmp.ileri;
        }
        return S;
    }

}


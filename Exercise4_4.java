public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
1-Derleyici HATA vermez.
	Derleyici UYARI da vermez IDE uyarı gösterebilir ama Java derleyicisi göstermez.
	Program sorunsuz çalışır.

	Açıklama:
	Java’da return eden bir metodun sonucunu kullanmamak tamamen yasaldır.
	Sadece IDE şöyle bir uyarı verebilir:

	“Result of method call is ignored”

	Ama bu Java’nın verdiği bir uyarı değildir — sadece IDE yardım amaçlı söyler.

	Sonuç:
	Hiçbir şey olmaz, program normal çalışır.

	2-sayHello() bir void metod - değer döndürmez.

	Ancak println(sayHello() + 7) bir ifade (expression) oluşturuyor:

	sayHello() bir değermiş gibi işlem yapmaya çalışıyor.

	void + 7 → anlamsız

	Java şöyle diyor:

	“Ben değer döndürmeyen (void) bir şeyi matematiksel işlemde kullanamam.”

	Sonuç:
	Kod derlenmez.
	Hata: “void cannot be converted to int”.

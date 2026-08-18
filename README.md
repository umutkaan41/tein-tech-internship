\# ⚔️ Java Metin Tabanlı Macera Oyunu (Text-Based Adventure Game)



Bu proje, staj programım kapsamında \*\*Java\*\* kullanarak geliştirdiğim ve \*\*Nesne Yönelimli Programlama (OOP)\*\* prensiplerini derinlemesine uyguladığım metin tabanlı bir RPG (Rol Yapma) oyunudur.



\## 🏗️ Proje Mimarisi (UML Diyagramı)

Oyunun temelinde kalıtım (inheritance) ve soyutlama (abstraction) yatmaktadır. Tüm mekanlar, karakterler ve düşmanlar yapısal bir hiyerarşi içinde ortak üst sınıflardan (superclass) türetilmiştir.



!\[UML Diyagramı](adventuregameUml.png)



\## 🚀 OOP Prensiplerinin Kullanımı

\- \*\*Kalıtım (Inheritance):\*\* `Location` (Mekan) soyut sınıfından `NormalLoc` (Güvenli Alanlar) ve `BattleLoc` (Savaş Alanları) türetilmiştir. Canavarlar (Zombi, Vampir, Ayı) ise ortak `Obstacle` sınıfından miras alır.

\- \*\*Çok Biçimlilik (Polymorphism):\*\* Farklı savaş alanları ve düşmanlar, oyun döngüsü içinde ortak referanslar üzerinden dinamik olarak yönetilmiştir.

\- \*\*Kapsülleme (Encapsulation):\*\* Oyuncu özellikleri (Can, Hasar, Para) ve envanter bilgileri `private` tutularak sadece `getter/setter` metotlarıyla güvenli bir şekilde erişime açılmıştır.

\- \*\*Soyutlama (Abstraction):\*\* `Location` ve `BattleLoc` gibi sınıflar `abstract` tanımlanarak alt sınıflara (Mağara, Orman, Nehir vb.) bir şablon oluşturulmuştur.



\## 🎮 Oyundan Görüntüler



\### 1. Karakter Seçimi ve Mekan Keşfi

Oyuna başlarken yeteneklerine göre Samuray, Okçu veya Şövalye arasından karakterinizi seçersiniz. Güvenli Ev, Mağaza, Orman, Mağara veya Nehir gibi mekanlar arasında gezinerek maceraya atılırsınız.

!\[Karakter Seçimi ve Menü](ekran1.png)



\### 2. Savaş Mekanikleri (Combat Sistemi) ve Ganimetler

Savaş alanlarına girdiğinizde (Örn: Mağara) rastgele sayıda canavarla karşılaşırsınız. Vur-kaç taktikleriyle düşmanları yendiğinizde para ve bölgeye özel ödüller (Yemek, Odun, Su) kazanırsınız.

!\[Savaş Ekranı](ekran2.png).


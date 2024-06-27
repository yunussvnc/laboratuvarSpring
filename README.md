# Laboratuvar Raporlama Uygulaması

Bu proje, bir laboratuvar raporlama uygulamasının arka ucunu (back-end) geliştirmek amacıyla hazırlanmıştır. Spring Boot, JPA ve Maven teknolojileri kullanılarak geliştirilmiştir.

## Özellikler

- Rapor tanımlama, düzenleme, silme ve görüntüleme
- Laborant ve rapor ilişkisi
- Hasta ve laborant bilgileri ile arama yapabilme
- Rapor tarihi ile sıralama yapabilme

## Gereksinimler

Bu projeyi çalıştırmak için aşağıdaki yazılımlara ihtiyacınız olacak:

- Java 11 veya üstü
- Maven 3.6 veya üstü

## Kullanılan Teknolojiler
- Spring Boot
- Spring Data JPA
- Hibernate
- H2Database
- Lombok

## Kurulum

1. **Depoyu klonlayın:**

    ```bash
    git clone https://github.com/yunussvnc/laboratuvarSpring
    cd lab-raporlama
    ```

2. **Gerekli bağımlılıkları yükleyin:**

    ```bash
    mvn clean install
    ```

3. **Uygulamayı başlatın:**

    ```bash
    mvn spring-boot:run
    ```

Alternatif olarak, JAR dosyası ile uygulamayı çalıştırmak için:

```bash
    java -jar jar/lab-raporlama -0.0.1-SNAPSHOT.jar    
```

Uygulama varsayılan olarak `http://localhost:8080` adresinde çalışacaktır.




### API Endpoint'leri

- GET /api/raporlar : Tüm raporları getirir.
- GET /api/raporlar/arama : Tarihe göre raporları sıralar.
- GET /api/raporlar/sirala : Bilgileri verilen hastanın raporlarını getirir.
- POST /api/raporlar : Yeni rapor oluşturur.
- PUT /api/raporlar/{id} : ID'si verilen raporu günceller.
- DELETE /api/raporlar/{id} : ID'si verilen raporu siler.


- POST /api/laborantlar : Yeni laborant oluşturur.

## Teknik Seçimler ve Gerekçelendirme

- **Spring Boot:** Hızlı uygulama geliştirme, yapılandırma ve dağıtım kolaylığı sağladığı için seçildi.
- **JPA:** Veritabanı işlemlerini daha basit ve okunabilir hale getirdiği için kullanıldı.
- **Maven:** Proje yönetimi ve bağımlılık yönetimi için kullanıldı.
- **H2 Database:** Geliştirme ve test aşamasında kolaylık sağladığı için bellek içi veritabanı olarak tercih edildi.


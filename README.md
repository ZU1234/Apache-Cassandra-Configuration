
## Ubuntu Üzerinde Java 11 ve Cassandra Yapılandırması

Bu dokümantasyon, Ubuntu işletim sistemi üzerinde Java 11 ve Spring Boot kullanarak Apache Cassandra veritabanını yapılandırmanıza yardımcı olacaktır.

## Docker ile Cassandra Kurulumu
Cassandra veritabanını Docker kullanarak hızlıca başlatmak için aşağıdaki komutu kullanabilirsiniz:

```bash
docker run --name my-cassandra-container -d -p 9042:9042 -e CASSANDRA_KEYSPACE=keyspacezu17 -e CASSANDRA_USER=cssndr -e CASSANDRA_PASSWORD=1234 cassandra:3.11
```
Bu komut, Docker'da Cassandra 3.11 sürümünü kullanarak bir Cassandra container'ını başlatır. Ayrıca, Cassandra'nın anahtar alanını, kullanıcı adını ve şifresini yapılandırır. Cassandra'ya bağlanmak için 9042 bağlantı noktasını host sistemindeki 9042 bağlantı noktasına yönlendirir.

Spring Boot Projesine Cassandra Bağımlılığını Eklemek
Spring Boot projesinin pom.xml dosyasına aşağıdaki Cassandra bağımlılığını ekleyerek Cassandra desteği ekleyebilirsiniz:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-cassandra</artifactId>
    <version>2.5.5</version>
</dependency>
```
Bu bağımlılık, Spring Boot projenizde Cassandra kullanmanıza olanak tanır. Projeyi oluşturduktan sonra, CassandraConfig sınıfındaki yapılandırmaları tamamladığınızda Cassandra'ya başarıyla erişebilirsiniz.

---

## 🚀 Kuyruk (Queue) Uygulama Detayları

- **Veri Yapıları**:
  - Kuyruk (Queue) - FIFO (First In, First Out)
  - İçsel veri yapısı: Dizi (Array)
  - Döngüsel yapı (Circular Queue)
  
- **İşlemler**:
  - **enqueue(data)**: Kuyruğa eleman ekler
  - **dequeue()**: Kuyruktan eleman çıkarır
  - **peek()**: Kuyruğun önündeki elemanı görüntüler
  - **printQueue()**: Kuyruk elemanlarını yazdırır
  
- **Hata Yönetimi**:
  - **Kuyruk dolu**: Eleman ekleme başarısız olur
  - **Kuyruk boş**: Eleman çıkarma veya görüntüleme başarısız olur
  
- **Algoritmalar**:
  - **Döngüsel Kuyruk**: Kuyruk tamamlandığında (`rear == maxSize - 1`), yeniden başa döner
  - **Yığın durumu kontrolü**: `isFull()` ve `isEmpty()` metodları
  - **Kuyrukta elemanlar arasında dolaşma**: Döngüsel indeksleme ile elemanlar yönetilir

---


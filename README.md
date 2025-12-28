# MyRagnarokClient – Memory-Efficient Android Client Plan

เอกสารนี้รวบรวมข้อมูลให้อ่านง่ายไว้ในไฟล์เดียว โดยสรุปแนวทางสถาปัตยกรรม เทคโนโลยี และหลักการออกแบบเพื่อสร้างแอป Android ที่ประหยัดแรมและให้ผู้ใช้ตั้งค่าเซิร์ฟเวอร์เองได้

## เป้าหมายหลัก
- ใช้หน่วยความจำให้น้อยที่สุดทั้งขณะรันและขณะเริ่มต้นแอป
- ผู้ใช้สามารถกำหนดปลายทางเซิร์ฟเวอร์ (base URL/port/protocol) ได้เอง
- โค้ดอ่านง่าย แยกเลเยอร์ชัดเจน และพึ่งพาไลบรารีเท่าที่จำเป็น

## สถาปัตยกรรมและโครงสร้างโมดูล
- **Clean Architecture + MVVM** แยกความรับผิดชอบเป็นชั้น presentation / domain / data
- **UI Toolkit:** เลือก Jetpack Compose เพื่อลด boilerplate หรือ View system หากต้องการ footprint ต่ำสุด
- **โมดูลตัวอย่าง**
  - `presentation`: ViewModel + UI (Compose หรือ Views)
  - `domain`: use case, entity, validation
  - `data`: repository, data source (network/DB), DTO/mapper

## เทคโนโลยีและไลบรารีขั้นต่ำ
- ภาษา **Kotlin**
- Concurrency: **Coroutines + Flow**
- Networking: **OkHttp + Retrofit** (base URL อ่านจาก DataStore/DI)
- Persistence/ค่าตั้งค่า: **DataStore Preferences** สำหรับ base URL และโปรไฟล์เซิร์ฟเวอร์
- Dependency Injection: **Hilt** หรือ **Koin** (ถ้าต้องการ DI แบบเบา)
- Build tools: เปิดใช้ **R8/ProGuard**, `shrinkResources`, และ `minifyEnabled` ใน release
- Debug tools: **StrictMode** + **LeakCanary** สำหรับตรวจจับ memory leak (debug เท่านั้น)

## กลยุทธ์ประหยัดหน่วยความจำ
- Lazy load ทรัพยากร/หน้าจอ; ใช้ immutable UI state เพื่อหลีกเลี่ยงการก็อปปี้ซ้ำ
- จำกัดการ cache ในหน่วยความจำ (LRU ขนาดเล็ก) และย้ายข้อมูลที่ต้องจำไว้นานไปยัง DataStore/Room
- ยกเลิกงานเครือข่ายตาม lifecycle (เช่น `viewModelScope` + coroutine cancellation)
- ตรวจสอบ recomposition (Compose) หรือ view recycling (RecyclerView) เพื่อลด allocations
- ใช้รูปแบบเวกเตอร์และเปิด resource shrinking เพื่อลดขนาด APK และ memory footprint

## ฟีเจอร์ตั้งค่าเซิร์ฟเวอร์แบบปรับเอง
- หน้าจอ Settings ให้กรอก base URL/port/protocol พร้อม validation
- บันทึกค่าใน DataStore และ inject ผ่าน Repository/DI ไปยัง Retrofit/OkHttp
- มี health check/ping หลังบันทึกค่าเพื่อยืนยันความถูกต้อง
- (ทางเลือก) รองรับหลายโปรไฟล์และตัวเลือกสลับเซิร์ฟเวอร์

## ระบบเครือข่ายและความปลอดภัย
- Retrofit client อ่าน base URL แบบ reactive จาก DataStore หรือ provider ใน DI
- รองรับ HTTPS/TLS; เพิ่ม certificate pinning หากจำเป็น
- มี error mapper แปลง network/IO/validation error เป็นข้อความ UI ที่ชัดเจน
- เพิ่ม retry/backoff แบบเบา (เช่น interceptor หรือ `retryWhen`)

## UI/UX ที่เบาและตอบสนอง
- หน้าแสดงข้อมูลโหลดแบบ incremental (paging หรือ partial render)
- ใช้ state hoisting ลดการถือ reference ที่ไม่จำเป็น
- แยกส่วนประกอบ UI ให้สามารถ preview/test ได้ง่ายและลดงาน recomposition

## Build Variants และ Telemetry
- Build Types: **debug** (verbose logging, LeakCanary) / **release** (minify, shrinkResources, ปิด verbose logs)
- Logging ใช้ **Timber** หรือ logger เบาที่สามารถตัดทอนใน release
- ตั้ง CI สำหรับ lint, detekt, unit test และ (ถ้ามี) instrumentation test

## การทดสอบและโปรไฟล์
- Unit/integration tests สำหรับ repository และการสลับเซิร์ฟเวอร์
- ใช้ Android Profiler/Perfetto ตรวจ heap/allocations บนอุปกรณ์สเปกต่ำ
- วัด cold/warm start time และ optimize (SplashScreen API, lazy init)

## การแจกจ่ายและเอกสาร
- README/คู่มือการตั้งค่าเซิร์ฟเวอร์ วิธี build (debug/release) และข้อควรระวังด้านความปลอดภัย
- จัดการ signing, versioning (SemVer) และ changelog
- เตรียม artifact สำหรับ Play Store หรือช่องทางแจกจ่ายภายใน

## RenewClient โครงการใหม่
โค้ดเวอร์ชันใหม่ที่จัดทำเป็นโครงสร้างเต็มอยู่ในโฟลเดอร์ `renewclient_project/` พร้อมตัวอย่างสถาปัตยกรรมและจุดเริ่มต้นสำหรับ UI/Use case/Repository/Networking.

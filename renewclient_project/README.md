# RenewClient Project

โฟลเดอร์นี้เป็นโปรเจ็กต์ใหม่ (แยกจาก `/dex`) สำหรับทดสอบไอเดียไคลเอนต์ Android ที่ประหยัดหน่วยความจำและให้ผู้ใช้ตั้งค่าเซิร์ฟเวอร์เองได้ โค้ดถูกจัดเป็น Clean Architecture + Hilt + Jetpack Compose เพื่อความเรียบง่ายและดูแลรักษาง่าย

## ไฮไลต์
- DataStore เก็บโปรโตคอล/โฮสต์/พอร์ต และเผยแพร่ผ่าน Repository/Use case
- ServiceFactory สร้าง Retrofit client แบบไดนามิกตาม base URL ที่ผู้ใช้กำหนด
- หน้าจอ Compose เดียว (Server settings) แยก ViewModel ใช้ StateFlow ควบคุมสถานะ UI
- Build setup เปิดใช้ R8/shrinkResources ใน release และใช้ dependency จำนวนน้อย

## โครงสร้าง
```
renewclient_project/
  settings.gradle.kts      # กำหนดชื่อโปรเจ็กต์และ repository
  build.gradle.kts         # plugin เวอร์ชันหลัก
  app/
    build.gradle.kts       # Android app + Compose + Hilt + DataStore + Retrofit
    src/main/
      AndroidManifest.xml  # ระบุ Application/Activity
      java/com/example/renewclient/
        RenewClientApp.kt  # Hilt entry point
        MainActivity.kt    # UI Compose
        data/              # DataStore + Retrofit factory
        domain/            # Model/Repository interface/Use cases
        di/                # Hilt modules
```

## การทำงาน
1. ผู้ใช้กรอก protocol/host/port บนหน้า Server settings
2. ViewModel เรียก `UpdateServerSettingsUseCase` เพื่อบันทึก DataStore
3. ปุ่ม Health check จะสร้าง Retrofit จาก `ServiceFactory` แล้วเรียก endpoint `/health`
4. สถานะ UI (saving/checking/message) ถูกอัปเดตผ่าน StateFlow

## การรัน (แนวทาง)
- เปิดด้วย Android Studio (Giraffe/ใหม่กว่า)
- ใช้ JDK 17 และ Gradle 8.3+ (ระบุใน build script)
- Compose Compiler 1.5.13, Kotlin 1.9.24, Hilt 2.51
- สร้าง mock server ที่ตอบ `/health` 200 OK เพื่อทดสอบ health check

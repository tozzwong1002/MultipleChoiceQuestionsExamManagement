# Quản lý đề thi trắc nghiệm

## Tổng quan

**Tên project:** Phần mềm quản lý đề thi trắc nghiệm.

**Mô tả:** Project được thực hiện để mô phỏng cơ bản một phần mềm được sử dụng trong giáo dục. Cung cấp các tính năng cơ bản như đăng nhập, xem danh sách đề thi của hệ thống, thêm, sửa đề thi...

**Ngôn ngữ lập trình :** Java

**Cơ sở dữ liệu :** MySQL

## Thư viện

#### Download tất cả : [Google Drive](https://drive.google.com/drive/folders/18W9Rb46cqhHc3omXJsBSq35mTWgCBb50)

#### Chi tiết danh sách thư viện :

**Thư viện excel :**
- [commons-collections4-4.1.jar]()
- [poi-3.17.jar]()
- [poi-ooxml-3.17.jar]()
- [poi-ooxml-schemas-3.17.jar]()
- [xmlbeans-2.6.0.jar]()
**Thư viện xử lý json :**
- [gson-2.8.2.jar]()
- [json-20200518.jar]()
- [jsoup-1.15.3.jar]()
**Thư viện xử lý mail OTP :**
- [jakarta.activation-2.0.1.jar]()
- [jakarta.mail-1.0.0.jar]()
- [jakarta.mail-api-2.1.0.jar]()
**Thư viện xử lý giao diện(GUI) :**
- [flatlaf-2.6.jar]()
- [swingx-1.6.1.jar]()
**Các thư viện khác :**
- [mysql-connector-j-8.0.31.jar]() : Tạo kết nối với cơ sở dữ liệu MySQL.
- [btc-ascii-table-1.0.jar]() : Format dạng bảng cho dữ liệu xuất ra trong console.

## Hướng dẫn cài đặt

1. **Tải project tại :**
- [Github](https://github.com/tozzwong1002/MultipleChoiceQuestionsExamManagement) (Đầy đủ thư viện [src/Libs] và database đi kèm)
2. **Import thư viện vào project :** [Youtube](https://www.youtube.com/watch?v=OQOpYHwA1A0)
3. **Sửa thông tin trong mail OTP :**
###### _Sendmail.java_ (src/BLL)
```
final String username = "";
final String password = "";
```
- Truyền vào _username_ bằng với _email_ của server. Ví dụ : sendexample@gmail.com (Phải là gmail dùng để tạo app password)
- Truyền vào _password_ bằng với _app password_ thuộc email của server. [Hướng dẫn lấy app password](https://www.youtube.com/watch?v=J4CtP1MBtOE).
4. **Chạy project (tại src folder):**
- Chạy _server.java_ (Đối với server).
- Chạy _Main.java_ (Đối với client).

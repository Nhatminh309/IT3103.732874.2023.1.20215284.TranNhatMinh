CREATE TABLE Ho_khau(
    Ma_ho_khau SERIAL PRIMARY KEY,
    Dia_diem VARCHAR(50) NOT NULL,
    So_nha VARCHAR(10) NOT NULL,
    Ten_duong VARCHAR(50) NOT NULL,
    Ten_phuong VARCHAR(50) NOT NULL,
    Ten_quan VARCHAR(50) NOT NULL,
    Ten_thanh_pho VARCHAR(50) NOT NULL,
    Da_xac_nhan BOOLEAN DEFAULT FALSE,
    So_luong_xe_may INT NOT NULL DEFAULT 0,
    So_luong_o_to INT NOT NULL DEFAULT 0,
    Dien_tich INT NOT NULL
);



CREATE TABLE Nhan_khau(
    Ma_nhan_khau SERIAL PRIMARY KEY,
    Ho_va_ten VARCHAR(50) NOT NULL,
    Bi_danh VARCHAR(50),
    Ngay_sinh DATE NOT NULL,
    Gioi_tinh VARCHAR(5) NOT NULL,
    Noi_sinh VARCHAR(255) NOT NULL,
    Que_quan VARCHAR(255) NOT NULL,
    Dan_toc VARCHAR(20) NOT NULL,
    Ton_giao VARCHAR(25),
    Nghe_nghiep VARCHAR(50),
    Noi_lam_viec VARCHAR(255),
    Ngay_dang_ky DATE NOT NULL,
    So_CCCD VARCHAR(20) NOT NULL UNIQUE,
    So_dien_thoai VARCHAR(10),
    Quan_he_voi_chu_ho VARCHAR(25),
    Ma_ho_khau INT NOT NULL,
    Da_xac_nhan BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (Ma_ho_khau) REFERENCES Ho_khau(Ma_ho_khau)
);

CREATE TABLE Chu_ho(
    Ma_ho_khau SERIAL,
    Ma_nhan_khau SERIAL,
    PRIMARY KEY (Ma_ho_khau, Ma_nhan_khau),
    Ngay_tao DATE NOT NULL,
    Da_xac_nhan BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (Ma_ho_khau) REFERENCES Ho_khau(Ma_ho_khau),
    FOREIGN KEY (Ma_nhan_khau) REFERENCES Nhan_khau(Ma_nhan_khau)
);

CREATE TABLE So_tam_tru(
    ID SERIAL PRIMARY KEY,
    Dia_chi_thuong_tru VARCHAR(255),
    Ngay_dang_ky DATE NOT NULL,
    Thoi_han DATE NOT NULL,
    Ma_nhan_khau INT NOT NULL,
    Da_xac_nhan BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (Ma_nhan_khau) REFERENCES Nhan_khau(Ma_nhan_khau)
);

CREATE TABLE Tam_vang(
    ID SERIAL PRIMARY KEY,
    Ma_nhan_khau INT,
    Ngay_tam_vang DATE NOT NULL,
    Noi_den VARCHAR(255),
    Da_xac_nhan BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (Ma_nhan_khau) REFERENCES Nhan_khau(Ma_nhan_khau)
);

CREATE TABLE Khai_tu(
    ID SERIAL PRIMARY KEY,
    Ma_nhan_khau INT,
    Ngay_mat DATE,
    Noi_mat VARCHAR(255),
    Ly_do VARCHAR(255),
    Da_xac_nhan BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (Ma_nhan_khau) REFERENCES Nhan_khau(Ma_nhan_khau)
);



CREATE TABLE Hoa_don(
    ma_hoa_don SERIAL PRIMARY KEY NOT NULL,
    Phi_qly_chung_cu INTEGER,
    Phi_dvu_chung_cu INTEGER,
    Phi_gui_xe INTEGER,
    Phi_dien INTEGER,
    Phi_nuoc INTEGER,
    Phi_Internet INTEGER,
    Thoi_diem_dong VARCHAR(10) CHECK (Thoi_diem_dong LIKE 'YYYY-MM-DD'),
	Han_dong VARCHAR(10) CHECK (Han_dong LIKE 'YYYY-MM-DD'),
    Da_xac_nhan BOOLEAN DEFAULT FALSE,
    Ma_ho_khau INT,
    FOREIGN KEY (Ma_ho_khau) REFERENCES Ho_khau(Ma_ho_khau)
);

CREATE TABLE DangNhap (
    username VARCHAR(20) NOT NULL,
    password VARCHAR(20) NOT NULL,
    Ma_can_bo serial REFERENCES Can_bo(ma_can_bo)
);

CREATE TABLE Can_bo(
    Ma_can_bo serial PRIMARY KEY,
    Ho_ten VARCHAR(30),
    Ngay_sinh DATE,
    Gioi_tinh VARCHAR(10),
    Chuc_vu VARCHAR(30)
);
CREATE TABLE phan_thuong(
    ma_phan_thuong integer NOT NULL,
    loai_phan_thuong varchar(100),
    gia_tri numeric,
    so_luong integer,
    PRIMARY KEY(ma_phan_thuong),
    CONSTRAINT phan_thuong_so_luong_check CHECK ((so_luong > 0))
);

CREATE TABLE phat_thuong(
    ma_phat_thuong SERIAL NOT NULL,
    ma_phan_thuong integer,
    ma_nhan_khau integer,
    ngay_phat date,
    dip_le varchar(15),
    so_luong integer,
    da_xac_nhan boolean DEFAULT false,
    ngay date,
    PRIMARY KEY(ma_phat_thuong),
    CONSTRAINT phat_thuong_ma_phan_thuong_fkey FOREIGN key(ma_phan_thuong) REFERENCES phan_thuong(ma_phan_thuong),
    CONSTRAINT phat_thuong_ma_nhan_khau_fkey FOREIGN key(ma_nhan_khau) REFERENCES nhan_khau(ma_nhan_khau),
    CONSTRAINT aa FOREIGN key(dip_le,ngay) REFERENCES dip_le(ten_dip_le,ngay),
    CONSTRAINT phat_thuong_dip_le_check CHECK (((dip_le)::text = ANY ((ARRAY['Tết Nguyên Đán'::character varying, 'Tết Thiếu Nhi'::character varying, 'Cuối Năm Học'::character varying, 'Tết Trung Thu'::character varying])::text[])))
);

CREATE TABLE dip_le(
    ten_dip_le varchar(200) NOT NULL,
    ngay date NOT NULL,
    PRIMARY KEY(ten_dip_le,ngay)
);

CREATE TABLE thanh_tich_hoc_tap(
    ten_hoc_sinh varchar(100),
    ma_nhan_khau integer NOT NULL,
    nam_hoc integer NOT NULL,
    thanh_tich varchar(255),
    PRIMARY KEY(ma_nhan_khau,nam_hoc),
    CONSTRAINT thanh_tich_hoc_tap_ma_nhan_khau_fkey FOREIGN key(ma_nhan_khau) REFERENCES nhan_khau(ma_nhan_khau)
);



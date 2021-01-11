CREATE DATABASE Eticket

USE Eticket


CREATE SCHEMA human
go
CREATE SCHEMA obj
go
CREATE SCHEMA trans
go


/*TABLE*/
CREATE TABLE human.USERS
(
USERNAME VARCHAR(256) PRIMARY KEY CONSTRAINT pk_USERNAME NOT NULL,
PASS VARCHAR(256) NOT NULL,
BIRTHDATE DATE,
EMAIL VARCHAR(256) NOT NULL
CONSTRAINT pk_EMAIL
	CHECK (EMAIL LIKE ('%@%.%')),
PHONE VARCHAR(13) NOT NULL
)


CREATE TABLE obj.EVENTT
(
EVENTID VARCHAR(5) PRIMARY KEY NOT NULL
	CONSTRAINT pk_EVENTID
	CHECK (EVENTID LIKE ('[E][0-9][0-9][0-9][0-9]')),
EVENT_TYPE VARCHAR(256) NOT NULL,
EVENT_NAME VARCHAR(256) NOT NULL,
EVENT_DATE DATE,
LOCATIONS VARCHAR(256) NOT NULL,
EVENT_PRICE INT NOT NULL,
TOTAL_TICKET INT NOT NULL,
STOCK INT NOT NULL
)

CREATE TABLE trans.TRANSACTIONS
(
TIKETID VARCHAR(5) PRIMARY KEY CONSTRAINT pk_TIKETID NOT NULL,
EVENTID VARCHAR(5) FOREIGN KEY REFERENCES obj.EVENTT NOT NULL,
EVENT_NAME VARCHAR(256) NOT NULL,
USERNAME VARCHAR(256) CONSTRAINT FK_UNAME REFERENCES human.USERS(USERNAME),
QTY INT NOT NULL,
SUBTOTAL int,
TOTAL_PAY int
)

CREATE TABLE Voucher (
Voucher_Name Varchar(10) NOT NULL,
Voucher_values bigint 
)

/*insert*/
INSERT INTO obj.EVENTT (EVENTID,EVENT_TYPE,EVENT_NAME,EVENT_DATE,EVENT_PRICE,LOCATIONS,TOTAL_TICKET,STOCK) VALUES
('E0001','wisata','MUSEUM ANGKUT','','50000','MALANG, JAWA TIMUR',100,100),
('E0002','wisata','FARM HOUSE LEMBANG','','20000','BANDUNG, JAWA BARAT',100,100),
('E0003','wisata','DEVOYAGE','','25000','BOGOR, JAWA BARAT',100,100),
('E0004','wisata','DUFAN','','325000','ANCOL, DKI JAKARTA',100,100),
('E0005','wisata','THE LOST WORLD CASTLE','','60000','YOGYAKARTA, JAWA TENGAH',100,100),
('E0006','wisata','JOGJA BAY','','50000','YOGYAKARTA, JAWA TENGAH',100,100),
('E0007','konser','ARCHATALA','2020/01/18','80000','BANDUNG, JAWA BARAT',150,150),
('E0008','konser','JAVA JAZZ','2020/02/28','80000','KEMAYORAN, DKI JAKARTA',150,150),
('E0009','konser','KONSER AMAL','2020/10/20','35000','KAMPUS UI, DEPOK',150,150),
('E0010','konser','HONNE','2020/11/20','150000','JAKARTA, DKI JAKARTA',150,150),
('E0011','konser','FESTIVAL TANGGERANG','2020/08/18','80000','TANGERANG,BANTEN',150,150),
('E0012','konser','LOUIS TOMLINSON','2020/04/20','200000','SENAYAN, DKI JAKARTA',150,150),
('E0013','bola','INDONESIA VS MALAYSIA','2020/05/05','150000','STADION UTAMA GELORA BUNG KARNO, JAKARTA',3000,1945)

INSERT INTO Voucher (Voucher_Name, Voucher_values)
VALUES ('DISC5','5000')
INSERT INTO Voucher (Voucher_Name, Voucher_values)
VALUES ('DISC10','10000')
INSERT INTO Voucher (Voucher_Name, Voucher_values)
VALUES ('DISC20','20000')
INSERT INTO Voucher (Voucher_Name, Voucher_values)
VALUES ('DISC30','30000')
INSERT INTO Voucher (Voucher_Name, Voucher_values)
VALUES ('DISC40','40000')
INSERT INTO Voucher (Voucher_Name, Voucher_values)
VALUES ('DISC50','50000')
INSERT INTO Voucher (Voucher_Name, Voucher_values)
VALUES ('DISC100','100000')
INSERT INTO Voucher (Voucher_Name, Voucher_values)
VALUES ('DISC200','200000')



select * From trans.TRANSACTIONS

SELECT * FROM trans.TRANSACTIONS
ORDER BY TIKETID DESC;

DELETE trans.TRANSACTIONS

/*trigger*/
--pengurangan stock--
CREATE TRIGGER tr_PENGURANGAN_STOCK on trans.TRANSACTIONS
after insert
as
begin
declare @qty int, @kode varchar(5)
select @qty = QTY, @kode = EVENTID
FROM inserted
update obj.EVENTT set STOCK = STOCK - @qty
where EVENTID = @kode
end

CREATE TRIGGER tr_PENGULANGAN_STOCK on trans.TRANSACTIONS
after delete
as
begin
declare @qty int, @kode varchar(5)
select @qty = QTY, @kode = EVENTID
FROM deleted
update obj.EVENTT set STOCK = STOCK + @qty
where EVENTID = @kode
end


--discount--
/*CREATE TRIGGER tr_DISCOUNT on trans.TRANSACTIONS
for insert
as
begin*/


/*SELECT*/
Select * from human.USERS
Select * from obj.EVENTT
Select * from trans.TRANSACTIONS

ALTER TABLE trans.TRANSACTIONS DROP CONSTRAINT FK_UNAME
DROP TABLE trans.TRANSACTIONS
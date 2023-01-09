use master
go
create database HuongRungBuffet
go
use HuongRungBuffet 
go
create table SlotTime(
	TimeID varchar(100) primary key,
	SlotTime nvarchar(100),
	Price int
)
create table TicketType(
	TicketTypeID varchar(100) primary key,
	TTypeName nvarchar(100),
	Price int
)
go
create table Customer(
	CustomerID varchar(100) primary key,
	CsName nvarchar(100),
	CsPhone varchar(100),
	csBirthDay date,
	CsIdentificationNumber varchar(100),
	CSPoint int
)
go
create table Departments(
	DepartmentID varchar(100) primary key,
	ParkName nvarchar(100)
)
go
create table Employee(
	EmployeeID varchar(100) primary key,
	FullName nvarchar(100),
	Phone varchar(100),
	BirthDay date,
	EAddress nvarchar(100),
	DepartmentID varchar(100) foreign key references Departments(DepartmentID),
	UserName varchar(100),
	[Password] varchar(100),
	IdentificationNumber varchar(100)
)
go
create table Suppliers(
	supplierID varchar(100) primary key,
	supplierName nvarchar(100),
	phone varchar(100),
	Sdescription nvarchar(500)
)
go
create table Category(
	CategoryID varchar(100) primary key,
	CategoryName nvarchar(100),
	Cdescription nvarchar(500)
)
go
create table FoodType(
	FoodTypeID varchar(100) primary key,
	TypeName nvarchar(100)
)
go
create table Food(
	FoodID varchar(100) primary key,
	FoodTypeID varchar(100) foreign key references FoodType(FoodTypeID),
	FoodName nvarchar(100),
	Picture varchar(500),
	FDescription nvarchar(500)
)
go
create table Bill(
	BillID varchar(100) primary key,
	BillDate date,
	EmployeeID varchar(100) foreign key references Employee(EmployeeID),
	CustomerID varchar(100) foreign key references Customer(CustomerID),
	Price int
)
go
create table Ticket(
	TicketID varchar(100) primary key,
	TicketTypeID varchar(100) foreign key references TicketType(TicketTypeID),
	Price int,
	TicketDate date,
	TimeID varchar(100) foreign key references SlotTime(TimeID),
	BillID varchar(100) foreign key references Bill(BillID)
)
go
create table FoodListDay(
	FLDate date primary key,
	EmployeeID varchar(100) foreign key references Employee(EmployeeID)
)
go
create table FoodList(
	FoodID varchar(100) foreign key references Food(FoodID),
	FLDate date foreign key references FoodListDay(FLDate),
	Quantity int
)
go
create table Ingredients(
	IngredientsID varchar(100) primary key,
	FIName nvarchar(100),
	CategoryID varchar(100) foreign key references Category(CategoryID),
	IPriece int,
	unit varchar(100)
)
go
create table IngredientsSup(
	IngredientsID varchar(100) foreign key references Ingredients(IngredientsID),
	supplierID varchar(100) foreign key references Suppliers(supplierID)
)
go
create table IngPerFood(
	FoodID varchar(100) foreign key references Food(FoodID),
	IngredientsID varchar(100) foreign key references Ingredients(IngredientsID),
	Quantity int
)
go
create table Drinks(
	DrinksID varchar(100) primary key,
	DrinkName nvarchar(100),
	CategoryID varchar(100) foreign key references Category(CategoryID),
	DPrice int
)
go
create table DrinksSup(
	DrinksID varchar(100) foreign key references Drinks(DrinksID),
	supplierID varchar(100) foreign key references Suppliers(supplierID)
)
go
create table DrinkDetails(
	DrinksID varchar(100) foreign key references Drinks(DrinksID),
	BillID varchar(100) foreign key references Bill(BillID),
	Quantity int,
	Price int
)
go
create table DrinkExport(
	ExpDate date primary key,
	EmployeeID varchar(100) foreign key references Employee(EmployeeID),
)
go
create table DrinkExportDetails(
	ExpDate date foreign key references DrinkExport(ExpDate),
	DrinksID varchar(100) foreign key references Drinks(DrinksID),
	Quantity int
)
create table IngRequest(
	RequestDate date primary key,
	DepartmentID varchar(100) foreign key references Departments(DepartmentID)
)
create table IngRequestDetails(
	RequestDate date foreign key references IngRequest(RequestDate),
	IngredientsID varchar(100) foreign key references Ingredients(IngredientsID),
	Quantity int,
	Status varchar(100)
)
create table DrinksRequest(
	RequestDate date primary key,
	DepartmentID varchar(100) foreign key references Departments(DepartmentID)
)
create table DrinksRequestDetails(
	RequestDate date foreign key references IngRequest(RequestDate),
	DrinksID varchar(100) foreign key references Ingredients(IngredientsID),
	Quantity int,
	Status varchar(100)
)
create table importDate(
	ImportDate date primary key,
	SupplierID varchar(100) foreign key references Suppliers(SupplierID)
)
create table IngImportDetails(
	IPDate date foreign key references importDate(ImportDate),
	IngredientsID varchar(100) foreign key references Ingredients(IngredientsID),
	Quantity int,
	deliveryTime varchar(100)
)
create table DrinksImportDetails(
	IPDate date foreign key references importDate(ImportDate),
	DrinksID varchar(100) foreign key references Drinks(DrinksID),
	Quantity int,
	deliveryTime varchar(100)
)
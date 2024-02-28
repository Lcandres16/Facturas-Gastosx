CREATE TABLE Expenses (
  id INT PRIMARY KEY,
  Date DATE,
  Description VARCHAR(255),
  Amount DECIMAL(10, 2),
  CategoryID INT,
  FOREIGN KEY (CategoryID) REFERENCES Categories(id)
);
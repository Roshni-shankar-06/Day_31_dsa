# Write your MySQL query statement below
SELECT
  Products.product_name,
  SUM(Orders.unit) AS unit
FROM Products
INNER JOIN Orders
  USING (product_id)

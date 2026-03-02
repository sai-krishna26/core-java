QUESTION 1: RIDE-SHARE FARE CALCULATOR

You are developing software for a ride-sharing app. The fare calculation depends on distance, time of day, surge pricing, and waiting time.

Requirements:

Create a class RideFareCalculator with:

🔹 Instance Variables:

distance – Distance of the ride in kilometers

timeOfDay – Time in 24-hour format (0–23)

isSurgePricing – Boolean indicating surge pricing

waitingMinutes – Minutes the driver waited

🔹 Constructor:

Initialize all instance variables using the this keyword.

🔹 Methods:

calculateBaseFare()

If distance ≤ 2 km → base fare = 5

If distance > 2 km → base fare = 5 + (distance − 2) × 1.5

applyTimeSurcharge(double baseFare)

Between 11 PM (23) and 5 AM (5) → add 25% surcharge

Between 7–9 AM OR 5–7 PM → add 15% surcharge

Otherwise → no surcharge

applyWaitingCharges(double fareAfterTime)

First 2 minutes free

After 2 minutes → 0.50 per minute

Use a for loop

calculateFinalFare()

Call all above methods

If surge pricing is active → multiply by 1.5

Round to 2 decimal places

🔹 Main Class:

Create TestRideFare class to test 3 different ride scenarios.
-------------------------------------------------------------------------------------------------
QUESTION 2: SMART INVENTORY MANAGEMENT SYSTEM

A retail chain needs an intelligent inventory system to manage stock and predict reorder needs.

Create a class InventoryManager with:

🔹 Static Variables:

totalProductsTracked = 0

totalInventoryValue = 0.0

🔹 Instance Variables:

productId

productName

currentStock

dailySalesRate

unitPrice

leadTimeDays

isSeasonal

🔹 Constructor:

Initialize all instance variables using this

Increment totalProductsTracked

Add (currentStock × unitPrice) to totalInventoryValue

🔹 Methods:

static double getAverageInventoryValue()

Return totalInventoryValue / totalProductsTracked

int calculateReorderPoint()

Base = dailySalesRate × leadTimeDays × 1.5

If seasonal → multiply by 1.3

If currentStock < 20 → add 10

Return reorder point

String checkStockStatus()

If stock ≤ 0 → "OUT OF STOCK - URGENT"

If stock ≤ reorderPoint → "REORDER NEEDED - Order X units"

If stock ≤ reorderPoint × 1.5 → "LOW STOCK - Monitor closely"

Else → "HEALTHY STOCK"

double calculateWeeklyRevenue()

Use while loop for 7 days

Reduce stock by dailySalesRate

Cannot sell more than available stock

Return unitsSold × unitPrice

void restock(int unitsReceived)

Increase stock

Update totalInventoryValue

Display restock message

🔹 Main Class:

Create TestInventory class to:

Create 4 different products

Display stock status

Show average inventory value

Calculate weekly revenue

Simulate restocking
--------------------------------------------------------------------------------------------------------
QUESTION 3: NUMBER & STRING OPERATIONS

Create a class NumberStringOperations with the following instance methods:

Find sum of even and odd numbers separately from an array
Example: {1,2,3,4} → oddSum = 4, evenSum = 6

Reverse a given string
Example: "hello" → "olleh"

Check if a number is palindrome
Example:
121 → true
122 → false

Find sum of all numbers in an array
Example: {1,2,3,4,5} → 15

🔹 Runner Class:

Create a Runner class to:

Call all instance methods

Display results
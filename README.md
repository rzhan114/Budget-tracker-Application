# Budget-tracker-Application
## Personal Finance Management System

### What will the application do?
  This **BookKeeping application** allows users can record keep track of their accounts, record transactions, categorize expenses, and generate reports on their spending patterns. You can also set budget for each categorize to help you control finical codition better. You may also refer back to past month and view previous ammount balance.

## Who will use it?
This application is directed towards people who are trying to manage their financial condition by understanding and tracing their monthly transactions.This application can serve as a way to hold yourself accountable for your finicial condition and to gain saving skills. People who also want to track their monthly amount balance can use this application as a way to store that information.
## Why is this project of interest to you?
 As an Early-career student, I start to earn income and manage my living expenses, by setting a budget to prepare a financial saving plan(e.g. travel, computer). I also need to track monthly expenses and recurring bills. Given that I have used similar applications in the past, I would see myself using this platform. Also, by being familiar with bookkeeping, I believe that I am in a good position to add value and differentiation to this kind of solution.

## *User Stories*
- As a user, I want to be able to add a transaction for my account
- As a user, I want to be able to view the list of transaction on my account
- As a user, I want to be able to specify the amount, date, and categorya transaction for my account
- As a user, I can define a budget for each month, and get alert if cost money exceed the budget
- As a user, I want to recieve the notification of resetting budget on the first day of each month
- As a user, I want to be able to see the amount balance monthly and review my privious monthly amount balance.
- As a user,when I select the quit option from the application menu, I want to be reminded to save all of my trasaction details to file and have the option to do so or not.
- As a user, when I start the application, I want to be given the option to load my own amount from file.

## Instructions for End User
- You can add multiple Transactions to a Account by click the transaction button to the panel and submit the new transaction by clicking the submit transaction button
- You can view all the transactions
- You will recieve a warning if the budget is lower than the balance
- You can reset budget by clicking the reset budget button
- You can filter the transactions for every month month by clicking the month menu
- You can filter the transactions for every month month by clicking the category menu
- You can generate the second required action related to the user story "adding multiple Xs to a Y" by...
- You can locate my visual component by see the screen falsh and the background image of home page
- You can save the state of my application click the file menu
- You can reload the state of my application by auto load or the load label in file menu

## "Phase 4: Task 2"
- The log Event Sample
    - --- Event Log ---
    - Wed Nov 27 16:12:17 PST 2024 - Event log cleared.
    (Clear any pre-existing events at the start)
    - Wed Nov 27 16:12:22 PST 2024 - Transaction added: 200.0 MEDICAL 2024-11-27
    - Wed Nov 27 16:12:26 PST 2024 - Transaction added: 3000.0        GROCERY 2024-11-27
    - Wed Nov 27 16:14:51 PST 2024 - Waring: The budget 1500.0 is unsafe
    - Wed Nov 27 16:12:31 PST 2024 - Budget changed from 1500.0 to 2000.0
    - Fri Nov 29 13:23:51 PST 2024 - The user view the transactions in RENTAL
    - Fri Nov 29 13:23:57 PST 2024 - The user view the transactions in OCTOBER
    - Fri Nov 29 13:31:39 PST 2024 - The user download the data
    - --- End of Event Log ---

## "Phase 4: Task 3"
- When I drawing my UML graph, I mention that all of my panels or menus are associated with KeepAccount(each have a private KeepAccount Field), which make the inheritance of the structure of teh project do not clear, so I want to refactor the KeepAccountGUI and these Panels, to avoid duplication of code.
- My application do not have the delection or edition function, so I want to try to change my display area of the transaction panel to present a table of transaction and add mouse events to manage single transactions. 
- My Application loaded from a small sample in the left corner in my computer, so I will try refactor the iinitializeKeepAccountGUI to improve the transaction of different initialize componet of my GUI.
- The Observe part of my code is not good, as there can be more events with different observers, so I will try to analyze the relationship between the other class and their reply to connect them by the observe class.

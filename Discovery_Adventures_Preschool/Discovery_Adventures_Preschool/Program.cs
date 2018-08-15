using System;
using System.Collections.Generic;
using Microsoft.Office.Interop.Excel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;


namespace Discovery_Adventures_Preschool
{

    class Program
    {
        static int selectedClass = 0;
        static List<Payment> payments = new List<Payment>();
        static void Main(string[] args)
        {
            string choice = "y";
            while (choice.ToLower() == "y")
            {
                ShowMenu();
                DisplayEnrollment();
                Console.WriteLine("Do you want to continue? (Y or N)" );
                choice = Console.ReadLine();
            }

            MakeSpreadsheet(payments);
            
        }
        static void MakeSpreadsheet(List<Payment> payments)
        {
            var excelApp = new Application();
            excelApp.Visible = true;
            excelApp.Workbooks.Add();
            Worksheet workSheet = (Worksheet)excelApp.ActiveSheet;
            workSheet.Cells[1, "A"] = "First Name";
            workSheet.Cells[1, "C"] = "Last Name";
            workSheet.Cells[1, "E"] = "Email";
            workSheet.Cells[1, "G"] = "Phone";
            workSheet.Cells[1, "I"] = "Card Number";
            workSheet.Cells[1, "K"] = "Class Enrollment";
            for (int i = 0; i < payments.Count; i++)
            {
                workSheet.Cells[(i + 2), "A"] = payments[i].firstName;
                workSheet.Cells[(i + 2), "C"] = payments[i].LastName;
                workSheet.Cells[(i + 2), "E"] = payments[i].Email;
                workSheet.Cells[(i + 2), "G"] = payments[i].Phone;
                workSheet.Cells[(i + 2), "I"] = payments[i].CardNumber;
                workSheet.Cells[(i + 2), "K"] = payments[i].Enrollments;
            }
        }

        static void ShowMenu()
        {
            Console.WriteLine("Discovery Adventures Preschool Payment");
            Console.WriteLine("Please select the following for which your child is enrolled");
            Console.WriteLine("1. Two day Morning Class");
            Console.WriteLine("2. Three day Moring Class");
            Console.WriteLine("3. Three day Afternoon Class");
            selectedClass = int.Parse(Console.ReadLine());

            while (selectedClass < 1 || selectedClass > 3)
            {
                Console.WriteLine("Please enter in 1, 2, or 3");
                selectedClass = int.Parse(Console.ReadLine());
            }


        }

        static void DisplayEnrollment()
        {

            string cardNumber = "";
         

          
                Console.Write("Enter in your First Name: ");
                string firstName = Console.ReadLine();
                Console.Write("Enter in your Last Name: ");
                string lastName = Console.ReadLine();
                Console.Write("Enter Email address: ");
                string email = Console.ReadLine();
                Console.Write("Enter Phone Number: ");
                string phone = Console.ReadLine();
                Console.Write("Enter in your card number: ");
                ConsoleKeyInfo key;
                bool isValid = false;
                do
                {
                    key = Console.ReadKey(true);

                    // Backspace Should Not Work
                    if (key.Key != ConsoleKey.Backspace)
                    {
                        cardNumber += key.KeyChar;
                        Console.Write("*");
                    }
                    else
                    {
                        Console.Write("\b");
                    }
                    if (cardNumber.Length == 17) isValid = true;
                    else if (cardNumber.Length < 17 && key.Key == ConsoleKey.Enter)
                    {
                        Console.WriteLine("Invalid card #, please enter in your card number: ");
                        cardNumber = "";
                    }
                }
                // Stops Receving Keys Once Enter is Pressed
                while (!isValid);
            
            
            

            
            Payment payable = new Payment(firstName, lastName, email, phone, cardNumber, selectedClass);
            payments.Add(payable);
            Console.WriteLine("\nEnrolled in: {0}", selectedClass);
            Console.WriteLine("Payment due: {0:C}", payable.GetPaymentAmount());
            Console.WriteLine("Would you like to pay your bill Y or N");
            if (Console.ReadLine().ToLower().Equals("n"))
            {
                Console.WriteLine("You have to pay this amount {0:C} if you want to continue your childs education", payable.GetPaymentAmount());
            }
            else
            {
                
                var invoice = new Invoice(payable.GetPaymentAmount(), firstName, lastName);
                Console.WriteLine("Thank you for Your payment here is your Invoice");
                Console.WriteLine("Invoice Number: {0}", invoice.invoiceNumber);
                Console.WriteLine("Total Paid: {0:C}", payable.GetPaymentAmount());

                    
            }

           
    }


  }
}

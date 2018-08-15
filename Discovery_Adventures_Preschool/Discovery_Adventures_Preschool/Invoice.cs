using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Discovery_Adventures_Preschool
{
     public class Invoice: IPayable
    {
        public int invoiceNumber;
        public decimal Amount;
        static int invoiceCount = 0; // shared counter
        private string firstName;
        private string lastName;

        public Invoice(decimal amount, string firstName, string lastName)
        {
            invoiceCount++;
            invoiceNumber = invoiceCount;
            Amount = amount;
            this.firstName = firstName;
            this.lastName = lastName;     
        }

        public int InvoiceNubmer
        {
            get
            {
                return invoiceNumber;
            }

        }

        public decimal GetPaymentAmount() => Amount;


    }
}

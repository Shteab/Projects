using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;

namespace Discovery_Adventures_Preschool
{
    public class Payment: Customers
    {
        private string cardNumber;
        static decimal[] classPrices = new decimal[3] { 65, 85, 85};

        public Payment(string firstName, string lastName, string email, string phone, string cardNumber,
            int classEnrolled) : base(firstName, lastName, email, phone)
        {
            Enrollments = classEnrolled;
            CardNumber = cardNumber;
        }

        public int Enrollments { get; set; }

        public string CardNumber
        { 
           

            get { return cardNumber; }
            set
            {
               
                    if (value.Length == 17)
                    {
                        cardNumber = value;
                    }
                   
                
            }
        }

        public decimal PaymentAmount()
        {
            decimal price = 0.0m;
            return price = classPrices[Enrollments - 1];
            
        }

        public override decimal Owe() => PaymentAmount();



        
    }
  
}

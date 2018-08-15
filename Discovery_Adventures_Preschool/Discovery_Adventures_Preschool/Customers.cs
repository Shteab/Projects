using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Text.RegularExpressions;

namespace Discovery_Adventures_Preschool
{
    public abstract class Customers: IPayable
    {
        public string firstName;
        public string lastName;
        public string email;
        public string phone;

        public Customers(string firstName, string lastName, string email, string phone)
        {
            FirstName = firstName;
            LastName = lastName;
            Email = email;
            Phone = phone;
        }

        public string FirstName
        {
           get { return firstName; }
            set
            {
                try
                {
                    firstName = value;
                }
                catch (Exception)
                {

                    throw new Exception("Please only enter in vaild letters");
                }
            }
        }

        public string LastName
        {
            get { return lastName; }
            set
            {
                try
                {
                    lastName = value;
                }
                catch (Exception)
                {

                    throw new Exception("Please only enter in vaild letters");
                }
            }
        }

        public string Email
        {
            get { return email; }
            set
            {
                try
                {
                    var regEx = new Regex(@"^[\w!#$%&'*+\-/=?\^_`{|}~]+(\.[\w!#$%&'*+\-/=?\^_`{|}~]+)*"
+ "@"
+ @"((([\-\w]+\.)+[a-zA-Z]{2,4})|(([0-9]{1,3}\.){3}[0-9]{1,3}))$");
                    Match m = regEx.Match(value);
                    if (m.Success)
                    {
                     email = value;
                    }
                }
                catch (Exception)
                {

                    throw new Exception("Please enter in a valid email address");
                }
            }
        }

        public string Phone
        {
            get { return phone; }
            set
            {
                if (value.Length == 10 || value.Length == 7)
                {
                    phone = value;
                }
                else
                {
                    throw new Exception("Phone number is not valid please try again");
                }
            }
        }



    

        public abstract decimal Owe();// no implementation here

        public decimal GetPaymentAmount() => Owe();
    }
}

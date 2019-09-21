package Bookstore;

public class Solution {
    public void setBookname(String bookname) {
        Bookname = bookname;
    }

    public void setAuthorname(String authorname) {
        Authorname = authorname;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    private String Bookname;
        private String Authorname;
        private String Isbn;
        public String getBookname(){
            return Bookname;
        }
        public String getAuthorname(){
            return  Authorname;
        }
        public String getIsbn(){
            return Isbn;
        }
        public String toString(){
            return "--------------------------------------\n"+"Book Name: \t"+Bookname+"\n"+"Author Name:\t" +Authorname+"\n"+"ISBN:\t"+Isbn+"\n"+"-------------------------------------";

        }
        public Solution(String Bookname,String Authorname,String Isbn){
            this .Bookname=Bookname;
            this.Authorname=Authorname;
            this.Isbn=Isbn;
        }
    }

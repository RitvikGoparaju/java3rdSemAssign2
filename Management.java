// Roll No :- IMT2015047
public class Management
{
	public static void main(String[] args) 
    {
		BookDatabase Bd = new BookDatabase();
		System.out.println("Initially");
		Bd.displayAll(Bd);
		System.out.println("-------Adding Books----------");
		Bd.addBook("Sherlock Holmes","Arthur Conan Doyle",1500,"Available");
		Bd.addBook("Two States","Chetan Bhagadh",1100,"Available");
        System.out.println("-----------------------------");
        Bd.display(Bd,"Hunger Games");
        System.out.println("-----------------------------");
		Bd.addBook("HCV","Verma",300,"Not Available");
		Bd.displayAll(Bd);
		System.out.println("------Deleting Books---------");
		Bd.delete("HCV","Verma");
		Bd.displayAll(Bd);
	}
}

class BookDatabase
{
	private Book head;
    private Book tail;
    private int size = 0;
    public int getSize() 
    {
        return size;
    }
    public void addBook(String title,String author,int price,String avail) 
    {
        size=size+1;
        if (head == null) 
        {
            head = new Book(title,author,price,avail,null);
            tail = head;
        } 
        else 
        {
            Book book = new Book(title,author,price,avail,head);
            this.head = book;
        }
    }

    public void delete(String title,String author) 
    {
        if (head != null) 
        {
            Book X = new Book("xyz","xyz",-1,"xyz",null);
            Book Y = new Book("xyz","xyz",-1,"xyz",null);
            X = head;
            if(head != null)
            {
                while(X.BookName != title && X.AuthorName !=author) 
                {
                    Y = X;
                    X = X.next;
                }
                if(X.BookName == title && X.AuthorName == author) 
                {
                    Y.next = X.next;
                }
            }
        }
    }

    public void search(String bn,String an)
    {
        Book X = new Book("xyz","xyz",-1,"xyz",null);
        X = head;
        while(X != null)
        {
            if(X.BookName == bn && X.AuthorName ==an) 
            {
                System.out.println("The book exists");
                break;
            }
            else X = X.next;
        }
        if(X == null) System.out.println("the book does not exist");
    }

    public void display(BookDatabase B,String bn)
    {
        if(head == null) System.out.println("Empty");
        else
        {
            Book X = new Book("xyz","xyz",-1,"xyz",null);
            X = head;
            while(X != null)
            {
                if(X.BookName == bn)
                {
                    System.out.println("Book name is:    "+X.BookName);
                    System.out.println("Author name is:  "+X.AuthorName);
                    System.out.println("price is:        "+X.Price);
                    System.out.println("Avaialbility is: "+X.IsAvailable);
                    break;
                }
                else {X = X.next;}    
            }
        }
    } 

    public void displayAll(BookDatabase B)
    {
        if(head == null) 
            System.out.println("NULL");
        else
        {
            Book X = new Book("xyz","xyz",-1,"xyz",null);
            X = head;
            while(head != null)
            {
                System.out.println("Book name is:    "+head.BookName);
                System.out.println("Author name is:  "+head.AuthorName);
                System.out.println("price is:        "+head.Price);
                System.out.println("Avaialbility is: "+head.IsAvailable);
                head = head.next;
            }
            head  = X;
        }
    }    

	class Book
    {
		private Book next;
		private final String BookName;
		private final String AuthorName;
		private int Price;
		private String IsAvailable;
		public Book(String title,String author,int price,String avail,Book n)
        {
			BookName = title;
			AuthorName = author;
			Price = price;
			IsAvailable = avail;
			next = n;
		}
		public String getBookName()
        {
			return BookName;
		}
		public String getAuthorName()
        {
			return AuthorName;
		}
		public int getPrice()
        {
			return Price;
		}
		public String getIsAvailable()
        {
			return IsAvailable;
		}
		public Book getNext()
        {
			return next;
		}
	}
}
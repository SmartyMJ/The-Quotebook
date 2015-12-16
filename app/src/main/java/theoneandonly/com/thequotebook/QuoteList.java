package theoneandonly.com.thequotebook;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by mjabati on 12/15/15.
 */
public class QuoteList {

    private List<Quote> quoteList;

    public List<Quote> getQuoteList(){
        return quoteList;
    }

    public Quote getQuote(int n){
        return quoteList.get(n);
    }

    public int getSize(){
        return quoteList.size();
    }

    public QuoteList(){

        quoteList = new ArrayList<Quote>();

        Quote quote1 = new Quote("Life is about making an impact, not making an income.", "Kevin Kruse");
        quoteList.add(quote1);

        Quote quote2 = new Quote("Whatever the mind of man can conceive and believe, it can achieve.", "Napoleon Hill");
        quoteList.add(quote2);

        Quote quote3 = new Quote("Strive not to be a success, but rather to be of value.", "Albert Einstein");
        quoteList.add(quote3);

        Quote quote4 = new Quote("Two roads diverged in a wood, and I—I took the one less traveled by, And that has made all the difference.",  "Robert Frost");
        quoteList.add(quote4);

        Quote quote5 = new Quote("I attribute my success to this: I never gave or took any excuse.", "Florence Nightingale");
        quoteList.add(quote5);

        Quote quote6 = new Quote("You miss 100% of the shots you don’t take.", "Wayne Gretzky");
        quoteList.add(quote6);

        Quote quote7 = new Quote("I’ve missed more than 9000 shots in my career. I’ve lost almost 300 games. 26 times I’ve been trusted to take the game winning shot and missed. I’ve failed over and over and over again in my life. And that is why I succeed.", "Michael Jordan");
        quoteList.add(quote7);

        Quote quote8 = new Quote("The most difficult thing is the decision to act, the rest is merely tenacity.", "Amelia Earhart");
        quoteList.add(quote8);

        Quote quote9 = new Quote("Every strike brings me closer to the next home run.", "Babe Ruth");
        quoteList.add(quote9);

        Quote quote10 = new Quote("Definiteness of purpose is the starting point of all achievement.", "W. Clement Stone");
        quoteList.add(quote10);

        Quote quote11 = new Quote("Life isn’t about getting and having, it’s about giving and being.", "Kevin Kruse");
        quoteList.add(quote11);

        Quote quote12 = new Quote("Life is what happens to you while you’re busy making other plans.", "John Lennon");
        quoteList.add(quote12);

        Quote quote13 = new Quote("We become what we think about.", "Earl Nightingale");
        quoteList.add(quote13);

        Quote quote14 = new Quote("Twenty years from now you will be more disappointed by the things that you didn’t do than by the ones you did do, so throw off the bowlines, sail away from safe harbor, catch the trade winds in your sails.  Explore, Dream, Discover.", "Mark Twain");
        quoteList.add(quote14);

        Quote quote15 = new Quote("Life is 10% what happens to me and 90% of how I react to it.", "Charles Swindoll");
        quoteList.add(quote15);

        Quote quote16 = new Quote("The most common way people give up their power is by thinking they don’t have any.", "Alice Walker");
        quoteList.add(quote16);

        Quote quote17 = new Quote("The mind is everything. What you think you become.",  "Buddha");
        quoteList.add(quote17);

        Quote quote18 = new Quote("The best time to plant a tree was 20 years ago. The second best time is now.", "Chinese Proverb");
        quoteList.add(quote18);

        Quote quote19 = new Quote("An unexamined life is not worth living.", "Socrates");
        quoteList.add(quote19);

        Quote quote20 = new Quote("Eighty percent of success is showing up.", "Woody Allen");
        quoteList.add(quote20);

        Quote quote21 = new Quote("Your time is limited, so don’t waste it living someone else’s life.", "Steve Jobs");
        quoteList.add(quote21);

        Quote quote22 = new Quote("Winning isn’t everything, but wanting to win is.", "Vince Lombardi");
        quoteList.add(quote22);

        Quote quote23 = new Quote("I am not a product of my circumstances. I am a product of my decisions.", "Stephen Covey");
        quoteList.add(quote23);

        Quote quote24 = new Quote("Every child is an artist.  The problem is how to remain an artist once he grows up.", "Pablo Picasso");
        quoteList.add(quote24);

        Quote quote25 = new Quote("You can never cross the ocean until you have the courage to lose sight of the shore.", "Christopher Columbus");
        quoteList.add(quote25);

        Quote quote26 = new Quote("I’ve learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel.", "Maya Angelou");
        quoteList.add(quote26);

        Quote quote27 = new Quote("Either you run the day, or the day runs you.", "Jim Rohn");
        quoteList.add(quote27);

        Quote quote28 = new Quote("Whether you think you can or you think you can’t, you’re right.", "Henry Ford");
        quoteList.add(quote28);

        Quote quote29 = new Quote("The two most important days in your life are the day you are born and the day you find out why.", "Mark Twain");
        quoteList.add(quote29);

        Quote quote30 = new Quote("Whatever you can do, or dream you can, begin it.  Boldness has genius, power and magic in it.", "Johann Wolfgang von Goethe");
        quoteList.add(quote30);

        Quote quote31 = new Quote("The best revenge is massive success.", "Frank Sinatra");
        quoteList.add(quote31);

        Quote quote32 = new Quote("People often say that motivation doesn’t last. Well, neither does bathing.  That’s why we recommend it daily.", "Zig Ziglar");
        quoteList.add(quote32);

        Quote quote33 = new Quote("Life shrinks or expands in proportion to one’s courage.", "Anais Nin");
        quoteList.add(quote33);

        Quote quote34 = new Quote("If you hear a voice within you say “you cannot paint,” then by all means paint and that voice will be silenced.", "Vincent Van Gogh");
        quoteList.add(quote34);

        Quote quote35 = new Quote("There is only one way to avoid criticism: do nothing, say nothing, and be nothing.", "Aristotle");
        quoteList.add(quote35);

        Quote quote36 = new Quote("Ask and it will be given to you; search, and you will find; knock and the door will be opened for you.", "Jesus");
        quoteList.add(quote36);

        Quote quote37 = new Quote("The only person you are destined to become is the person you decide to be.", "Ralph Waldo Emerson");
        quoteList.add(quote37);

        Quote quote38 = new Quote("Go confidently in the direction of your dreams.  Live the life you have imagined.", "Henry David Thoreau");
        quoteList.add(quote38);

        Quote quote39 = new Quote("When I stand before God at the end of my life, I would hope that I would not have a single bit of talent left and could say, I used everything you gave me.", "Erma Bombeck");
        quoteList.add(quote39);

        Quote quote40 = new Quote("Few things can help an individual more than to place responsibility on him, and to let him know that you trust him.", "Booker T. Washington");
        quoteList.add(quote40);

        Quote quote41 = new Quote("Certain things catch your eye, but pursue only those that capture the heart.", "Ancient Indian Proverb");
        quoteList.add(quote41);

        Quote quote42 = new Quote("Believe you can and you’re halfway there.", "Theodore Roosevelt");
        quoteList.add(quote42);

        Quote quote43 = new Quote("Everything you’ve ever wanted is on the other side of fear.", "George Addair");
        quoteList.add(quote43);

        Quote quote44 = new Quote("We can easily forgive a child who is afraid of the dark; the real tragedy of life is when men are afraid of the light.", "Plato");
        quoteList.add(quote44);

        Quote quote45 = new Quote("Teach thy tongue to say, “I do not know,” and thous shalt progress.", "Maimonides");
        quoteList.add(quote45);

        Quote quote46 = new Quote("Start where you are. Use what you have.  Do what you can.", "Arthur Ashe");
        quoteList.add(quote46);

        Quote quote47 = new Quote("When I was 5 years old, my mother always told me that happiness was the key to life.  When I went to school, they asked me what I wanted to be when I grew up.  I wrote down ‘happy’.  They told me I didn’t understand the assignment, and I told them they didn’t understand life.", "John Lennon");
        quoteList.add(quote47);

        Quote quote48 = new Quote("Fall seven times and stand up eight.", "Japanese Proverb");
        quoteList.add(quote48);

        Quote quote49 = new Quote("When one door of happiness closes, another opens, but often we look so long at the closed door that we do not see the one that has been opened for us.", "Helen Keller");
        quoteList.add(quote49);

        Quote quote50 = new Quote("Everything has beauty, but not everyone can see.", "Confucius");
        quoteList.add(quote50);

        Quote quote51 = new Quote("How wonderful it is that nobody need wait a single moment before starting to improve the world.", "Anne Frank");
        quoteList.add(quote51);

        Quote quote52 = new Quote("When I let go of what I am, I become what I might be.", "Lao Tzu");
        quoteList.add(quote52);

        Quote quote53 = new Quote("Life is not measured by the number of breaths we take, but by the moments that take our breath away.", "Maya Angelou");
        quoteList.add(quote53);

        Quote quote54 = new Quote("Happiness is not something readymade.  It comes from your own actions.", "Dalai Lama");
        quoteList.add(quote54);

        Quote quote55 = new Quote("If you’re offered a seat on a rocket ship, don’t ask what seat! Just get on.", "Sheryl Sandberg");
        quoteList.add(quote55);

        Quote quote56 = new Quote("First, have a definite, clear practical ideal; a goal, an objective. Second, have the necessary means to achieve your ends; wisdom, money, materials, and methods. Third, adjust all your means to that end.", "Aristotle");
        quoteList.add(quote56);

        Quote quote57 = new Quote("If the wind will not serve, take to the oars.", "Latin Proverb");
        quoteList.add(quote57);

        Quote quote58 = new Quote("You can’t fall if you don’t climb.  But there’s no joy in living your whole life on the ground.", "Unknown");
        quoteList.add(quote58);

        Quote quote59 = new Quote("We must believe that we are gifted for something, and that this thing, at whatever cost, must be attained.", "Marie Curie");
        quoteList.add(quote59);

        Quote quote60 = new Quote("Too many of us are not living our dreams because we are living our fears.", "Les Brown");
        quoteList.add(quote60);

        Quote quote61 = new Quote("Challenges are what make life interesting and overcoming them is what makes life meaningful.", "Joshua J. Marine");
        quoteList.add(quote61);

        Quote quote62 = new Quote("If you want to lift yourself up, lift up someone else.", "Booker T. Washington");
        quoteList.add(quote62);

        Quote quote63 = new Quote("I have been impressed with the urgency of doing. Knowing is not enough; we must apply. Being willing is not enough; we must do.", "Leonardo da Vinci");
        quoteList.add(quote63);

        Quote quote64 = new Quote("Limitations live only in our minds.  But if we use our imaginations, our possibilities become limitless.", "Jamie Paolinetti");
        quoteList.add(quote64);

        Quote quote65 = new Quote("You take your life in your own hands, and what happens? A terrible thing, no one to blame.", "Erica Jong");
        quoteList.add(quote65);

        Quote quote66 = new Quote("What’s money? A man is a success if he gets up in the morning and goes to bed at night and in between does what he wants to do.", "Bob Dylan");
        quoteList.add(quote66);

        Quote quote67 = new Quote("I didn’t fail the test. I just found 100 ways to do it wrong.", "Benjamin Franklin");
        quoteList.add(quote67);

        Quote quote68 = new Quote("In order to succeed, your desire for success should be greater than your fear of failure.", "Bill Cosby");
        quoteList.add(quote68);

        Quote quote69 = new Quote("A person who never made a mistake never tried anything new.", "Albert Einstein");
        quoteList.add(quote69);

        Quote quote70 = new Quote("The person who says it cannot be done should not interrupt the person who is doing it.", "Chinese Proverb");
        quoteList.add(quote70);

        Quote quote71 = new Quote("There are no traffic jams along the extra mile.", "Roger Staubach");
        quoteList.add(quote71);

        Quote quote72 = new Quote("It is never too late to be what you might have been.", "George Eliot");
        quoteList.add(quote72);

        Quote quote73 = new Quote("You become what you believe.", "Oprah Winfrey");
        quoteList.add(quote73);

        Quote quote74 = new Quote("I would rather die of passion than of boredom.", "Vincent van Gogh");
        quoteList.add(quote74);

        Quote quote75 = new Quote("A truly rich man is one whose children run into his arms when his hands are empty.", "Unknown");
        quoteList.add(quote75);

        Quote quote76 = new Quote("It is not what you do for your children, but what you have taught them to do for themselves, that will make them successful human beings.", "Ann Landers");
        quoteList.add(quote76);

        Quote quote77 = new Quote("If you want your children to turn out well, spend twice as much time with them, and half as much money.", "Abigail Van Buren");
        quoteList.add(quote77);

        Quote quote78 = new Quote("Build your own dreams, or someone else will hire you to build theirs.", "Farrah Gray");
        quoteList.add(quote78);

        Quote quote79 = new Quote("The battles that count aren’t the ones for gold medals. The struggles within yourself–the invisible battles inside all of us–that’s where it’s at.", "Jesse Owens");
        quoteList.add(quote79);

        Quote quote80 = new Quote("Education costs money.  But then so does ignorance.", "Sir Claus Moser");
        quoteList.add(quote80);

        Quote quote81 = new Quote("I have learned over the years that when one’s mind is made up, this diminishes fear.", "Rosa Parks");
        quoteList.add(quote81);

        Quote quote82 = new Quote("It does not matter how slowly you go as long as you do not stop.", "Confucius");
        quoteList.add(quote82);

        Quote quote83 = new Quote("If you look at what you have in life, you’ll always have more. If you look at what you don’t have in life, you’ll never have enough.", "Oprah Winfrey");
        quoteList.add(quote83);

        Quote quote84 = new Quote("Remember that not getting what you want is sometimes a wonderful stroke of luck.", "Dalai Lama");
        quoteList.add(quote84);

        Quote quote85 = new Quote("You can’t use up creativity.  The more you use, the more you have.", "Maya Angelou");
        quoteList.add(quote85);

        Quote quote86 = new Quote("Dream big and dare to fail.", "Norman Vaughan");
        quoteList.add(quote86);

        Quote quote87 = new Quote("Our lives begin to end the day we become silent about things that matter.", "Martin Luther King Jr.");
        quoteList.add(quote87);

        Quote quote88 = new Quote("Do what you can, where you are, with what you have.", "Teddy Roosevelt");
        quoteList.add(quote88);

        Quote quote89 = new Quote("If you do what you’ve always done, you’ll get what you’ve always gotten.", "Tony Robbins");
        quoteList.add(quote89);

        Quote quote90 = new Quote("Dreaming, after all, is a form of planning.", "Gloria Steinem");
        quoteList.add(quote90);

        Quote quote91 = new Quote("It’s your place in the world; it’s your life. Go on and do all you can with it, and make it the life you want to live.", "Mae Jemison");
        quoteList.add(quote91);

        Quote quote92 = new Quote("You may be disappointed if you fail, but you are doomed if you don’t try.", "Beverly Sills");
        quoteList.add(quote92);

        Quote quote93 = new Quote("Remember no one can make you feel inferior without your consent.", "Eleanor Roosevelt");
        quoteList.add(quote93);

        Quote quote94 = new Quote("Life is what we make it, always has been, always will be.", "Grandma Moses");
        quoteList.add(quote94);

        Quote quote95 = new Quote("The question isn’t who is going to let me; it’s who is going to stop me.", "Ayn Rand");
        quoteList.add(quote95);

        Quote quote96 = new Quote("When everything seems to be going against you, remember that the airplane takes off against the wind, not with it.", "Henry Ford");
        quoteList.add(quote96);

        Quote quote97 = new Quote("It’s not the years in your life that count. It’s the life in your years.", "Abraham Lincoln");
        quoteList.add(quote97);

        Quote quote98 = new Quote("Change your thoughts and you change your world.", "Norman Vincent Peale");
        quoteList.add(quote98);

        Quote quote99 = new Quote("Either write something worth reading or do something worth writing.", "Benjamin Franklin");
        quoteList.add(quote99);

        Quote quote100 = new Quote("Nothing is impossible, the word itself says, \"I’m possible!\"", "Audrey Hepburn");
        quoteList.add(quote100);

        Quote quote101 = new Quote("The only way to do great work is to love what you do.", "Steve Jobs");
        quoteList.add(quote101);

        Quote quote102 = new Quote("If you can dream it, you can achieve it.", "Zig Ziglar");
        quoteList.add(quote102);

    }



}

package com.qiuzapplication;

public class Game {
    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"Who is the Strongest Avenger?","What is the Nearest planet to the sun","What is the Capital of australia?"};
    String[] option1={"Ironman","venues","Sydney"};
    String[] option2={"Hulk","Mercury","Melbourne"};
    String[] option3={"Thor","Jupyter","Canberra"};
    String[] option4={"Dr. Strange","Earth","Perth"};
    int[] answers={1,2,3};

    public void initGame(){
    //        created five objects
            for(int i=0;i<3;i++){
                questions[i]=new Question();
            }
//    //        applying values to the variables og the Object
//            questions[0].question="Who is the Strongest Avenger?";
//            questions[0].option1="Ironman";
//            questions[0].option2="Hulk";
//            questions[0].option3="Thor";
//            questions[0].option4="Dr. Strange";
//            questions[0].correctAnswer=1;
//
//        questions[1].question="What is the Nearest planet to the sun?";
//        questions[1].option1="venues";
//        questions[1].option2="Mercury";
//        questions[1].option3="Jupyter";
//        questions[1].option4="Earth";
//        questions[1].correctAnswer=2;
//
//        questions[2].question="What is the Capital of australia?";
//        questions[2].option1="Sydney";
//        questions[2].option2="Melbourne";
//        questions[2].option3="Canberra";
//        questions[2].option4="Perth";
//        questions[2].correctAnswer=3;

//        or
        for (int i=0;i<3;i++)
        {
            questions[i].question=questionsdata[i];
        questions[i].option1=option1[i];
        questions[i].option2=option2[i];
        questions[i].option3=option3[i];
        questions[i].option4=option4[i];
        questions[i].correctAnswer=answers[i];
        }


   }
    public void play(){
        player.getDetails();
        for(int i=0 ;i<3;i++){
            boolean status=questions[i].askQuestion();
            if(status==true){
                System.out.println("Amazing!!! your Answer is correct.");
                player.score+=5;
            }
            else{
                System.out.println("your Answer is Wrongy!!");
                player.score-=2;
            }
        }
        System.out.println(player.name+" your Score is "+player.score);

    }
}

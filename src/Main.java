import java.util.Scanner;

class KolbLeerstijlenTest {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        String[] question = {
                "Question 1. I have strong beliefs about what is right and wrong, good and bad.",
                "Question 2. I often act without considering the possible consequences.",
                "Question 3. I tend to solve problems using a step-by-step approach.",
                "Question 4. I believe that formal procedures and policies restrict people.",
                "Question 5. I have a reputation for saying what I think, simply and directly.",
                "Question 6. I often find that actions based on feelings are as sound as those based on careful thought and analysis.",
                "Question 7. I like the sort of work where I have time for thorough preparation and implementation.",
                "Question 8. I regularly question people about their basic assumptions.",
                "Question 9. What matters most is whether something works in practice.",
                "Question 10. I actively seek out new experiences.",
                "Question 11. When I hear about a new idea or approach, I immediately start working out how to apply it in practice.",
                "Question 12. I am keen on self discipline such as watching my diet, taking regular exercise, sticking to a fixed routine, etc.",
                "Question 13. I take pride in doing a thorough job.",
                "Question 14. I get on best with logical, analytical people and less well with spontaneous, ‘irrational people.",
                "Question 15. I take care over how I interpret data and avoid jumping to conclusions.",
                "Question 16. I like to reach a decision carefully after weighing up many alternatives.",
                "Question 17. I am attracted more to novel, unusual ideas than to practical ones.",
                "Question 18. I don’t like disorganised things and prefer to fit things into a coherent pattern.",
                "Question 19. I accept and stick to laid down procedures and policies so long as I regard them as anefficient way of getting the job done.",
                "Question 20. I like to relate my actions to a general principle, standard or belief.",
                "Question 21. In discussions, I like to get straight to the point.",
                "Question 22. I tend to have distant, rather formal relationships with people at work.",
                "Question 23. I thrive on the challenge of tackling something new and different.",
                "Question 24. I enjoy fun-loving spontaneous people.",
                "Question 25. I pay careful attention to detail before coming to a conclusion.",
                "Question 26. I find it difficult to produce ideas on impulse.",
                "Question 27. I believe in coming to the point immediately.",
                "Question 28. I am careful not to jump to conclusions too quickly.",
                "Question 29. I prefer to have as many sources of information as possible – the more information tothink over the better.",
                "Question 30. Flippant, superficial people who don’t take things seriously enough usually irritate me.",
                "Question 31. I listen to other people’s points of view before putting my own view forward.",
                "Question 32. I tend to be open about how I’m feeling.",
                "question 33. In discussions, I enjoy watching the plotting and scheming of the other participants.",
                "Question 34. I prefer to respond to events in a spontaneous, flexible way rather than plan things out in advance.",
                "Question 35. I tend to be attracted to techniques such as flow charts, contingency plans etc.",
                "Question 36. It worries me if I have to rush work to meet a tight deadline.",
                "Question 37. I tend to judge people’s ideas on their practical merits.",
                "Question 38. Quiet, thoughtful people tend to make me feel uneasy.",
                "Question 39. I often get irritated by people who want to rush things.",
                "Question 40. It is more important to enjoy the present moment than to think about the past or future.",
                "Question 41. I think that decisions based on a careful analysis of all the information are better than those based on intuition.",
                "Question 42. I tend to be a perfectionist.",
                "Question 43. In discussions, I usually produce lots of spontaneous ideas.",
                "Question 44. In meetings, I put forward practical, realistic ideas.",
                "Question 45. More often than not, rules are there to be broken.",
                "Question 46. I prefer to stand back from a situation and consider all the perspectives.",
                "Question 47. I can often see inconsistencies and weaknesses in other people’s arguments.",
                "Question 48. On balance I talk more than I listen.",
                "Question 49. I can often see better, more practical ways to get things done.",
                "Question 50. I think written reports should be short and to the point.",
                "Question 51. I believe that rational, logical thinking should win the day.",
                "Question 52 I tend to discuss specific things with people rather than engaging in social discussion.",
                "Question 53. I like people who approach things realistically rather than theoretically.",
                "Question 54. In discussions, I get impatient with irrelevant issues and digressions.",
                "Question 55. If I have a report to write, I tend to produce lots of drafts before settling on the final version.",
                "Question 56. I am keen to try things out to see if they work in practice.",
                "Question 57. I am keen to reach answers via a logical approach.",
                "Question 58. I enjoy being the one that talks a lot.",
                "Question 59. In discussions, I often find I am a realist, keeping people to the point and avoiding wild speculations.",
                "Question 60. I like to ponder many alternatives before making up my mind.",
                "Question 61. In discussions with people I often find I am the most dispassionate and objective.",
                "question 62. In discussions I’m more likely to adopt a ‘low profile’ than to take the lead and do most of the talking.",
                "Question 63. I like to be able to relate current actions to the longer-term bigger picture.",
                "Question 64. When things go wrong, I am happy to shrug it off and ‘put it down to experience.",
                "Question 65. I tend to reject wild, spontaneous ideas as being impractical.",
                "Question 66. It’s best to think carefully before taking action.",
                "Question 67. On balance, I do the listening rather than the talking.",
                "Question 68. I tend to be tough on people who find it difficult to adopt a logical approach.",
                "Question 69. Most times I believe the end justifies the means.",
                "Question 70. I don’t mind hurting people’s feelings so long as the job gets done.",
                "Question 71. I find the formality of having specific objectives and plans stifling.",
                "Question 72. I’m usually one of the people who puts life into a party.",
                "Question 73. I do whatever is practical to get the job done.",
                "Question 74. I quickly get bored with methodical, detailed work.",
                "Question 75. I am keen on exploring the basic assumptions, principles and theories underpinning things and events.",
                "Question 76. I’m always interested to find out what people think.",
                "Question 77. I like meetings to be run on methodical lines, sticking to laid down agenda.",
                "Question 78. I steer clear of subjective (biased) or ambiguous (unclear) topics.",
                "Question 79. I enjoy the drama and excitement of a crisis situation.",
                "Question 80. People often find me insensitive to their feelings.",
        };
        // Array to store the answers
        String[] userAnswers = new String[question.length];
        // mutatie
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
            System.out.print("Answer (yes/no): ");
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals("yes") || answer.equals("no")) {
                userAnswers[i] = answer;
            } else {
                System.out.println("Invalid input. Answers with 'yes' or 'no'.");
                i--; //Stays on the same question
            }
        }
        // output
        System.out.println("Answers answered with 'yes':");
        for (int i = 0; i < userAnswers.length; i++) {
            if (userAnswers[i].equals("yes")) {
                System.out.println("Question " + (i + 1) + ": " + userAnswers[i]);  //Result is only answers with 'yes' are used
            }
        }
        int[] activistQuestionNumbers = {2, 4, 6, 10, 17, 23, 24, 32, 34, 38, 40, 43, 45, 48, 58, 64, 71, 72, 74, 79};
        int[] theoristQuestionNumbers = {1, 3, 8, 12, 14, 18, 20, 22, 26, 30, 42, 47, 51, 57, 61, 63, 68, 75, 77, 78 };
        int[] refelectorQuestionNumbers = {7, 13, 15, 16, 25, 28, 29, 31, 33, 36, 39, 41, 46, 52, 55, 60, 62, 66, 67, 76};
        int[] pragmatistQuestionNumbers =  {5, 9, 11, 19, 21, 27, 35, 37, 44, 49, 50, 53, 54, 56, 59, 65, 69, 70, 73, 80};
        int activistScore = countMatches(userAnswers, activistQuestionNumbers);
        System.out.println("The activist score = " + activistScore);
        int theoristScore = countMatches(userAnswers, theoristQuestionNumbers);
        System.out.println("The theorist score = " + theoristScore);
        int reflectorScore = countMatches(userAnswers, refelectorQuestionNumbers);
        System.out.println("The reflector score = " + reflectorScore);
        int pragmatistScore = countMatches(userAnswers, pragmatistQuestionNumbers);
        System.out.println("The activist score = " + activistScore);
    }
    public static int countMatches(String[] answers, int[] questionNumbers) {
        int counter = 0;
        for (int i = 0; i < questionNumbers.length; i++) {
            int opzij = questionNumbers[i] - 1;
            if (answers[opzij].equals("yes")) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}









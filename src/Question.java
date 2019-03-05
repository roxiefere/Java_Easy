public class Question {

    public String[] types = new String[10];
    public String[] questions = new String[10];
    public int[] answers = new int[10];

    public Question() {
        makeTypes();
        makeQuestions();
    }

    public void makeTypes() {
        types[0] = "You are an INTP: Introverted, iNtuitive, Thinking, Perceiving. INTP's are energized by time alone (Introverted), who focuses on ideas and concepts rather than facts and details (iNtuitive), who makes decisions based on logic and reason (Thinking) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). INTPs are sometimes referred to as Architect personalities because of their intuitive understanding of complex systems. ";
        types[1] = "You are an ISFJ: Introverted, Sensing, Feeling, Judging. ISFJ's are energized by time spent alone (Introverted), who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on feelings and values (Feeling) and who prefers to be planned and organized rather than spontaneous and flexible (Judging). ISFJs are sometimes referred to as Protector personalities because of their interest in keeping people safe and well cared for.";
        types[2] = "You are an ISFP: Introverted, Sensing, Feeling, Perceiving. ISFP's are energized by time spent alone (Introverted), who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on feelings and values (Feeling) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). ISFPs are sometimes referred to as Composer personalities because of their innate sensibility for creating aesthetically pleasing experiences.";
        types[3] = "You are an ENTJ: Extraverted, iNtuitive, Thinking, Judging. ENTJ's are energized by time spent with others (Extraverted), who focuses on ideas and concepts rather than facts and details (iNtuitive), who makes decisions based on logic and reason (Thinking) and who prefers to be planned and organized rather than spontaneous and flexible (Judging). ENTJs are sometimes referred to as Commander personalities because of their innate drive to lead others.";
        types[4] = "You are an ESTJ: Extraverted, Sensing, Thinking, Judging. ESTJ's are energized by time spent with others (Extraverted), who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on logic and reason (Thinking) and who prefers to be planned and organized rather than spontaneous and flexible (Judging). ESTJs are sometimes referred to as Supervisor personalities because they tend to take charge and make sure things are done correctly.";
        types[5] = "You are an INTJ: Introverted, iNtuitive, Thinking, Judging. INTJ's are energized by time alone (Introverted), who focuses on ideas and concepts rather than facts and details (iNtuitive), who makes decisions based on logic and reason (Thinking) and who prefers to be planned and organized rather than spontaneous and flexible (Judging). INTJs are sometimes referred to as Mastermind personalities because of their strategic, logical way of thinking.";
        types[6] = "You are an ISTP:  Introverted, Sensing, Thinking, Perceiving. ISTP's are energized by time spent alone (Introverted), who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on logic and reason (Thinking) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). ISTPs are sometimes referred to as Craftsperson personalities because they typically have an innate mechanical ability and facility with tools.";
        types[7] = "You are an ENTP: Extraverted, iNtuitive, Thinking, Perceiving. ENTP's are energized by time spent with others (Extraverted), who focuses on ideas and concepts rather than facts and details (iNtuitive), who makes decisions based on logic and reason (Thinking) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). ENTPs are sometimes referred to as Visionary personalities because of their passion for new, innovative ideas.";
        types[8] = "You are an ESFP: Extraverted, Sensing, Feeling, Perceiving. ESFP's are energized by time spent with others (Extraverted), who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on feelings and values (Feeling) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). ESFPs are sometimes referred to as Performer personalities because of their playful, energetic nature.";
        types[9] = "You are an ENFP: Extraverted, iNtuitive, Feeling, Perceiving. ENFP's are energized by time spent with others (Extraverted), who focuses on ideas and concepts rather than facts and details (iNtuitive), who makes decisions based on feelings and values (Feeling) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). ENFPs are sometimes referred to as Champion personalities because of their enthusiasm for helping others realize their dreams.";
    }

    public void makeQuestions(){
        questions[0] = "On a scale of 0-5, 5 being a lot, how much do you like dogs?";
        questions[1] = "On a scale of 0-5, 5 being a lot, how much do you like school?";
        questions[2] = "On a scale of 0-5, 5 being a lot, how much do you like your family?";
        questions[3] = "On a scale of 0-5, 5 being a lot, how much do you like traveling?";
        questions[4] = "On a scale of 0-5, 5 being a lot, how much do you like sports?";
        questions[5] = "On a scale of 0-5, 5 being a lot, how much do you use your phone?";
        questions[6] = "On a scale of 0-5, 5 being a lot, how often do you watch movies?";
        questions[7] = "On a scale of 0-5, 5 being a lot, how many friends do you have?";
        questions[8] = "5 being the max, how many siblings do you have?";
        questions[9] = "On a scale of 0-5, 5 being a lot, how much do you sleep?";
    }

    public void processInput(){
        int total = 0;
        for(int i=0; i < 10; i++){
            total += answers[i];
        }

        if(total <= 5){
            System.out.println(types[0]);
        }
        if(total <= 10 && total > 5){
            System.out.println(types[1]);
        }
        if(total <= 15 && total > 10){
            System.out.println(types[2]);
        }
        if(total <= 20 && total > 15){
            System.out.println(types[3]);
        }
        if(total <= 25 && total > 20){
            System.out.println(types[4]);
        }
        if(total <= 30 && total > 25){
            System.out.println(types[5]);
        }
        if(total <= 35 && total > 30){
            System.out.println(types[6]);
        }
        if(total <= 40 && total > 35){
            System.out.println(types[7]);
        }
        if(total <= 45 && total > 40){
            System.out.println(types[8]);
        }
        if(total <= 50 && total > 45){
            System.out.println(types[9]);
        }
        if(total > 50){
            System.out.println("Your answer was greater than 5, please try again");
        }
    }
}

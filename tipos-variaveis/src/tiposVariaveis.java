import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class tiposVariaveis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a soma de 5 + 5: ");
        int resultadoSoma = scanner.nextInt();

        if (resultadoSoma == 10) {
            exibirLetraGodsPlan();
        } else {
            System.out.println("Resultado incorreto. A letra de 'God's Plan' não será exibida.");
        }

        scanner.close();
    }

    private static void exibirLetraGodsPlan() {
        // Coloque aqui a letra autorizada de "God's Plan" de Drake
        String letraGodsPlan = "And, they wishin' and wishin' and wishin' and wishin'\r\n" + //
                "They wishin' on me, yeah\r\n" + //
                "I been movin' calm, don't start no trouble with me\r\n" + //
                "Tryna keep it peaceful is a struggle for me\r\n" + //
                "Don't pull up at 6 AM to cuddle with me\r\n" + //
                "You know how I like it when you lovin' on me\r\n" + //
                "I don't wanna die for them to miss me\r\n" + //
                "Yes, I see the things that they wishin' on me\r\n" + //
                "Hope I got some brothers that outlive me\r\n" + //
                "They gon' tell the story, shit was different with me\r\n" + //
                "God's plan, God's plan\r\n" + //
                "I hold back, sometimes I won't, yeah\r\n" + //
                "I feel good, sometimes I don't, ayy, don't\r\n" + //
                "I finessed down Weston Road, ayy, 'nessed\r\n" + //
                "Might go down a G-O-D, yeah, wait\r\n" + //
                "I go hard on Southside G, yeah, Way\r\n" + //
                "I make sure that north side eat\r\n" + //
                "And still\r\n" + //
                "Bad things\r\n" + //
                "It's a lot of bad things\r\n" + //
                "That they wishin' and wishin' and wishin' and wishin'\r\n" + //
                "They wishin' on me\r\n" + //
                "Bad things\r\n" + //
                "It's a lot of bad things\r\n" + //
                "That they wishin' and wishin' and wishin' and wishin'\r\n" + //
                "They wishin' on me\r\n" + //
                "Yeah, ayy, ayy (ayy)\r\n" + //
                "She say, \"Do you love me?\" I tell her, \"Only partly\r\n" + //
                "I only love my bed and my momma, I'm sorry\"\r\n" + //
                "Fifty Dub, I even got it tatted on me\r\n" + //
                "81, they'll bring the crashers to the party\r\n" + //
                "And you know me\r\n" + //
                "Turn a O2 into the O3, dog\r\n" + //
                "Without 40, Oli', there'd be no me\r\n" + //
                "'Magine if I never met the broskis\r\n" + //
                "God's plan, God's plan\r\n" + //
                "I can't do this on my own, ayy, no, ayy\r\n" + //
                "Someone watchin' this shit close, yep, close\r\n" + //
                "I've been me since Scarlett Road, ayy, road, ayy\r\n" + //
                "Might go down as G-O-D, yeah, wait\r\n" + //
                "I go hard on Southside G, ayy, Way\r\n" + //
                "I make sure that north side eat, yuh\r\n" + //
                "And still\r\n" + //
                "Bad things\r\n" + //
                "It's a lot of bad things\r\n" + //
                "That they wishin' and wishin' and wishin' and wishin'\r\n" + //
                "They wishin' on me\r\n" + //
                "Yeah, yeah\r\n" + //
                "Bad things\r\n" + //
                "It's a lot of bad things\r\n" + //
                "That they wishin' and wishin' and wishin' and wishin'\r\n" + //
                "They wishin' on me\r\n" + //
                "Yeah";
        System.out.println("Letra de 'God's Plan' por Drake:");
        System.out.println(letraGodsPlan);
    }
}


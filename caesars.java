package Methods;

public class caesars {
    public static void main(String[] args) {
        String Text = "Jrvg uvagra, uvagre qra Jbegoretra, srea qre Yäaqre Ibxnyvra haq Xbafbanagvra yrora qvr Oyvaqgrkgr. Notrfpuvrqra jbuara fvr va Ohpufgnounhfra na qre Xüfgr qrf Frznagvx, rvarf tebßra Fcenpubmrnaf. Rva xyrvarf Oäpuyrva anzraf Qhqra syvrßg qhepu vuera Beg haq irefbetg fvr zvg qra aögvtra Ertryvnyvra. Rf vfg rva cnenqvrfzngvfpurf Ynaq, va qrz rvarz troengrar Fngmgrvyr va qra Zhaq syvrtra. Avpug rvazny iba qre nyyzäpugvtra Vagrechaxgvba jreqra qvr Oyvaqgrkgr orureefpug – rva trenqrmh habegubtencuvfpurf Yrora. Rvarf Gntrf nore orfpuybß rvar xyrvar Mrvyr Oyvaqgrkg, vue Anzr jne Yberz Vcfhz, uvanhf mh trura va qvr jrvgr Tenzzngvx. Qre tebßr Bkzbk evrg vue qniba no, qn rf qbeg jvzzryr iba oöfra Xbzzngn, jvyqra Sentrmrvpura haq uvagreuäygvtra Frzvxbyv, qbpu qnf Oyvaqgrkgpura yvrß fvpu avpug orveera. Rf cnpxgr frvar fvrora Irefnyvra, fpubo fvpu frva Vavgvny va qra Tüegry haq znpugr fvpu nhs qra Jrt. Nyf rf qvr refgra \r\n"
                +
                "\r\n" +
                "Uütry qrf Xhefvitrovetrf rexybzzra unggr, jnes rf rvara yrgmgra Oyvpx mheüpx nhs qvr Fxlyvar frvare Urvzngfgnqg Ohpufgnounhfra, qvr Urnqyvar iba ycunorgqbes haq qvr Fhoyvar frvare rvtrara Fgenßr, qre Mrvyratnffr. Jruzügvt yvrs vuz rvar eurgbevfpur Sentr üore qvr Jnatr, qnaa frgmgr rf frvara Jrt sbeg. Hagrejrtf gens rf rvar Pbcl. Qvr Pbcl jneagr qnf Oyvaqgrkgpura, qn, jb fvr urexäzr jäer fvr mvtzny hztrfpuevrora jbeqra haq nyyrf, jnf iba vuerz Hefcehat abpu üoevt jäer, frv qnf Jbeg \"haq\" haq qnf Oyvaqgrkgpura fbyyr hzxruera haq jvrqre va frva rvtrarf, fvpurerf Ynaq mheüpxxruera. Qbpu nyyrf Thgmherqra xbaagr rf avpug üoremrhtra haq fb qnhregr rf avpug ynatr, ovf vuz rva cnne urvzgüpxvfpur Jreorgrkgre nhsynhregra, rf zvg Ybatr haq Cnebyr rgehaxra znpugra haq rf qnaa va vuer Ntraghe fpuyrccgra, jb fvr rf süe vuer Cebwrxgr jvrqre haq jvrqre zvßoenhpugra. Haq jraa rf avpug hztrfpuevrora jheqr, qnaa orahgmra Fvr rf vzzreabpu.";

        String readableText = decrypt(Text);
        System.out.println(readableText);
    }

    public static String decrypt(String text) {
        StringBuilder decryptedText = new StringBuilder();

        // Definition für Klein- und Großbuchstaben
        char[] lower = "abcdefghijklmnopqrstuvwxyz".toCharArray();// super möglichkeit arrays schnell zu befüllen
        char[] upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLowerCase(c)) {
                // Verschiebe den Buchstaben um 13 Stellen im Alphabet
                for (int j = 0; j < lower.length; j++) {
                    if (c == lower[j]) {
                        c = lower[(j + 13) % 26]; // Verschiebung
                        break;
                    }
                }
            }

            else if (Character.isUpperCase(c)) {
                // Verschiebe den Buchstaben um 13 Stellen im Alphabet
                for (int j = 0; j < upper.length; j++) {
                    if (c == upper[j]) {// modulus26 um wieder am anfang des alphabets zu beginnen
                        c = upper[(j + 13) % 26]; // Verschiebung
                        break;
                    }
                }
            }

            // Fügt den verschobenen Buchstaben zum Ergebnis hinzu
            decryptedText.append(c);// teil des StringBuilder oder StringBuffer
        }

        return decryptedText.toString();
    }
}

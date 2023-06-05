pessoa p1 = new pesoa();
p1 . nome = "maria";
p1 . idade = 18;
p1 . sexo = 'F' ;
p1 . cpf = "123.456.789-00";

pessoa p2 = new pesoa();
p2 . nome = "joao";
p2 . idade = 22;
p2 . sexo = 'M' ;
p . cpf = "234.567.890-00";


conta c1 = nem conta();
c1 . numero = "1234-5";
c1 . titular = p1; 
c1 . saldo = 100.0;
c1 . limite = 200.0;

conta c1 = nem conta();
c2 . numero = "2345-6";
c2 . titular = p2; 
c2 . saldo = 150.0;
c2 . limite = 200.0;

system.out.println(c1. saldo);
system.out.println(c1. titular . nome);
system.out.println("Saldo da conta " + c2 . numero + "; " + c2.saldo);

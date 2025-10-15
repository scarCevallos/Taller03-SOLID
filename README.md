Integrantes: Scarlet Cevallos, Kenny chung, David Bohorquez, Miguel Alvarado \
Violación a OCP en clase CloudSevicePlatform:
<img width="1231" height="703" alt="image" src="https://github.com/user-attachments/assets/d5c15716-8dd7-4604-ae80-8ee7cc1c801c" /> \
Incumple con el principio ya que si en algún momento se quiere ingresar otro servicio de nube el código se va a tener que modificar. \
\
Violación a SRP en clase LogIn:
<img width="1283" height="536" alt="image" src="https://github.com/user-attachments/assets/d61bd04d-c88a-46b6-bef1-606f060df25d" /> \
Incumple con el principio ya que tiene más responsabilidades de las que debería tener, además de manejar el inicio de sesión también se esta \
encargando de gestionar la inserción de los usuarios en la base de datos.\
\
Violación a LSP en clase LogInAdmin:
<img width="1349" height="695" alt="image" src="https://github.com/user-attachments/assets/a72c27fb-a80d-4ef9-b667-6f6e1622469a" /> \
Incumple con el principio ya que la subclase LogInAdmin altera el comprotamiento del método log() en la clase LogIn

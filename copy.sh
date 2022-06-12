#!/usr/bin/env bash
#----------------------------------------------------------------------
# Script    : [config.sh]
# Descrição :
# Versão    : 1.0
# Autor     : Fabio Junior Ribeiro 
# Email     : rib3iro@live.com
# Github    : https://github.com/frib3iro 
# Data      : 26/05/2022
# Licença   : GNU/GPL v3.0
#----------------------------------------------------------------------
# Uso       :
#----------------------------------------------------------------------
clear

# variaveis --------------------------------------------
r='\e[31m'
g='\e[32m'
b='\e[34m'
f='\e[m'
s='\e[35m>>>\e[m'

# Mensagens ------------------------------------------------------
msg[0]=$(echo -e "${g}Sucesso!${f}")
msg[1]=$(echo -e "${r}Falhou!${f}")
msg[2]=$(echo -e "${s} ${b}Executando o comando $i ${f}")

# Comandos ------------------------------------------------------
cmd[3]=$(sudo cp main.cxx /usr/share/geany/templates/files)
cmd[4]=$(cp -r geany /home/fabio/.config)
cmd[5]=$(cp -r .scripts /home/fabio)
cmd[6]=$(cp -r .vim /home/fabio)
cmd[7]=$(cp .bashrc /home/fabio)
cmd[8]=$(cp .vimrc /home/fabio)
cmd[9]=$(sudo cp -r .vim /root)
cmd[10]=$(sudo cp .vimrc /root)
cmd[11]=$(sudo cp .bashrc /root)
cmd[12]=$(mkdir -p /home/fabio/.vim/pack/plugins/start)
cmd[13]=$(mkdir -p /home/fabio/.vim/pack/themes/start)
cmd[14]=$(cp -r ProjectsGeany /home/fabio/Documentos)
cmd[15]=$(cp -r NetBeansProjects /home/fabio/Documentos)
cmd[16]=$(cp -r repos /home/fabio/Documentos)

for i in {3..16}
do
    echo ${msg[2]}
    if echo ${cmd[$i]}
    then
        echo ${msg[0]}
    else
        echo ${msg[1]}
        break
    fi
done


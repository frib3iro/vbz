# If you come from bash you might have to change your $PATH.
# export PATH=$HOME/bin:/usr/local/bin:$PATH

# Path to your oh-my-zsh installation.
export ZSH="/home/fabio/.oh-my-zsh"

# Set name of the theme to load --- if set to "random", it will
# load a random theme each time oh-my-zsh is loaded, in which case,
# to know which specific one was loaded, run: echo $RANDOM_THEME
# See https://github.com/ohmyzsh/ohmyzsh/wiki/Themes
# ZSH_THEME="robbyrussell"
ZSH_THEME="daveverwer"

# Set list of themes to pick from when loading at random
# Setting this variable when ZSH_THEME=random will cause zsh to load
# a theme from this variable instead of looking in $ZSH/themes/
# If set to an empty array, this variable will have no effect.
# ZSH_THEME_RANDOM_CANDIDATES=( "robbyrussell" "agnoster" )

# Uncomment the following line to use case-sensitive completion.
# CASE_SENSITIVE="true"

# Uncomment the following line to use hyphen-insensitive completion.
# Case-sensitive completion must be off. _ and - will be interchangeable.
# HYPHEN_INSENSITIVE="true"

# Uncomment the following line to disable bi-weekly auto-update checks.
# DISABLE_AUTO_UPDATE="true"

# Uncomment the following line to automatically update without prompting.
# DISABLE_UPDATE_PROMPT="true"

# Uncomment the following line to change how often to auto-update (in days).
# export UPDATE_ZSH_DAYS=13

# Uncomment the following line if pasting URLs and other text is messed up.
# DISABLE_MAGIC_FUNCTIONS=true

# Uncomment the following line to disable colors in ls.
# DISABLE_LS_COLORS="true"

# Uncomment the following line to disable auto-setting terminal title.
# DISABLE_AUTO_TITLE="true"

# Uncomment the following line to enable command auto-correction.
# ENABLE_CORRECTION="true"

# Uncomment the following line to display red dots whilst waiting for completion.
# COMPLETION_WAITING_DOTS="true"

# Uncomment the following line if you want to disable marking untracked files
# under VCS as dirty. This makes repository status check for large repositories
# much, much faster.
# DISABLE_UNTRACKED_FILES_DIRTY="true"

# Uncomment the following line if you want to change the command execution time
# stamp shown in the history command output.
# You can set one of the optional three formats:
# "mm/dd/yyyy"|"dd.mm.yyyy"|"yyyy-mm-dd"
# or set a custom format using the strftime function format specifications,
# see 'man strftime' for details.
# HIST_STAMPS="mm/dd/yyyy"

# Would you like to use another custom folder than $ZSH/custom?
# ZSH_CUSTOM=/path/to/new-custom-folder

# Which plugins would you like to load?
# Standard plugins can be found in $ZSH/plugins/
# Custom plugins may be added to $ZSH_CUSTOM/plugins/
# Example format: plugins=(rails git textmate ruby lighthouse)
# Add wisely, as too many plugins slow down shell startup.
plugins=(
    git
    sudo
    colored-man-pages
)

source $ZSH/oh-my-zsh.sh

# User configuration

# export MANPATH="/usr/local/man:$MANPATH"

# You may need to manually set your language environment
# export LANG=en_US.UTF-8

# Preferred editor for local and remote sessions
# if [[ -n $SSH_CONNECTION ]]; then
#   export EDITOR='vim'
# else
#   export EDITOR='mvim'
# fi

# Compilation flags
# export ARCHFLAGS="-arch x86_64"

# Set personal aliases, overriding those provided by oh-my-zsh libs,
# plugins, and themes. Aliases can be placed here, though oh-my-zsh
# users are encouraged to define aliases within the ZSH_CUSTOM folder.
# For a full list of active aliases, run `alias`.
#
# Example aliases
# alias zshconfig="mate ~/.zshrc"
# alias ohmyzsh="mate ~/.oh-my-zsh"

# ---> Minhas configurações <---------------------------------

## Meu prompt ------------------------------------------------
PROMPT='%B%{$fg[red]%}%m%{$reset_color%}:%{$fg[green]%}%c%{$reset_color%}$(git_prompt_info) %(!.#.$) '
#
## histórioco  -----------------------------------------------
export HISTFILE=${HOME}/.zsh_history
export HISTSIZE=5000
export SAVEHIST=5000

## Editor padrão no zsh --------------------------------------
export FCEDIT='vim'
export VISUAL=$FCEDIT
export EDITOR=$FCEDIT

## export PATH -----------------------------------------------
path+=/home/fabio/bin

## Aliases ---------------------------------------------------
alias cpr="rsync -ahur --progress"
alias {vi,VI}='vim'
alias {vim,VIM}='vim'
alias net="ip -br -c a"

## Funções para o git
#
## Faz pull do repositório
gpull () {
    if [ -z $1 ]; then
        echo "Digite o nome de um repositório"
    else
        cd /home/fabio/GitHub/$1
        git pull && cd /home/fabio
    fi
}

## Clona o repositório
gclone () {
    if [ -z $1 ]; then
        echo "Digite o nome de um repositório"
    else
        cd /home/fabio/GitHub
        git clone https://github.com/frib3iro/$1 && cd /home/fabio
    fi
}

## Remover o diretório
gremovedir () {
    if [ -z $1 ]; then
        echo "Digite o nome de um diretório!"
    else
        cd /home/fabio/GitHub
        rm -rf $1
        cd /home/fabio
    fi
}

## Remover o arquivo
gremovearq () {
    if [ -z $1 ]; then
        echo "Digite o nome de um diretório!"
    else
        cd /home/fabio/GitHub/$1 && ls
        echo -en "Digite o nome do arquivo: "
        read arquivo
        git rm -r $arquivo
        cd /home/fabio
    fi
}

## Inicializa um repositório
ginit () {
    if [ -z $1 ]; then
        echo "Digite o nome de um repositório!"
    else
        cd /home/fabio/GitHub/$1
        echo "# $1" >> README.md
        git init
        git add *
        git commit -m "first commit"
        git remote add origin https://github.com/frib3iro/$1.git
        git push -u origin master
        cd /home/fabio
    fi
}

## Adiciona arquivos
gadd () {
    if [ -z $1 ]; then
        echo "Digite o nome de um repositório!"
    else
        cd /home/fabio/GitHub/$1
        git add *
        git status
        git commit -m "first commit"
        git push origin master
        cd /home/fabio
    fi
}

versao(){
    [[ -z "$*" ]] && _c="Não há comentário para esse commit" || _c="$*"
    git add .
    git status
    git commit -m "${_c}"
    git push origin master
}

## Configura o git
gconf () {
    git config --global user.name "Fabio Junior Ribeiro"
    git config --global user.email rib3iro@live.com
    git config --global core.editor vim
    git config --global core.editor vimdiff
    git config --global color.ui auto
    git config --list | more
}

# Scripts 

export PATH=$PATH:/home/fabio/.scripts

[ -f ~/.fzf.zsh ] && source ~/.fzf.zsh

""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
" Vimrc do Fabio Junior Ribeiro
""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
""let g:pinkmareTransparent = 1

set termguicolors " enable true color support
autocmd vimenter * hi Normal guibg=NONE ctermbg=NONE
highlight Comment cterm=italic

set background=dark
colorscheme onedark

syntax on
set mouse=r " ............................ Copiar e colar com mouse no vim
set title " .............................. Mostra o nome do arquivo no topo da janela
set wildmenu " ........................... Ativa o auto-completar quando aperta tab em modo de comando
set linebreak " .......................... Para que ele quebre as linhas sem dividir as palavras
set number " ............................. Mostra o numero das linhas

set autoindent
set smartindent
set expandtab
set tabstop=4
set shiftwidth=4

set hlsearch " ........................... destaca com cores os termos procurados
set incsearch " .......................... habilita a busca incremental
set cursorline " ......................... Destaca linha atual
set directory=/var/tmp " ................. Mantém os arquivos de troca em um só lugar
set history=99 " ........................ por padrão o historio é de 8 comandos
""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
"" Limpando o "registrador" de buscas

"" A cada busca, se a opção 'hls'[^1] estiver habilitada o Vim faz um destaque colorido, para desabilitar esta opção pode-se criar um mapeamento qualquer, no caso abaixo usando a de tecla <F3>.
nno <F3> <Esc>:let @/=""<CR>
""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
"" Seleciona todo o texto
map <F4> ggVG?
""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
"" Identar linhas automaticamente
map <F5> mqHmwgg=G`wzt`q
""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
""Remove espaços redundantes no inicio das linhas
map <F6> <esc>:%s/^ *//g<cr>
""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
""Remove espaços redundantes no final das linhas
map <F7> <esc>:%s/\s\+$//g<cr>
""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
""Remove mais de um espaço em todo o arquivo
map <F8> <esc>:%s/ */ /g<cr>
""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
"" Remover linhas em branco duplicadas
map <F9> <esc>:%s/\(^\n\{2,}\)/\r/g<cr>
""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
"" Permite habilitar ou desabilitar o relativenumber no arquivo corrente
map <F11> <esc>:set relativenumber!<cr>
""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
"" Permite habilitar ou desabilitar números de linha do arquivo corrente
map <F12> <esc>:set nu!<cr>
""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
"" Para mover o cursor uma linha de cada vez no modo normal
nmap <Down> gj
nmap <Up> gk
""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
"" Mover linhas com Ctrl+(seta abaixo) ou Ctrl+(seta acima)
nmap <C-Down> ddp
nmap <C-Up> ddkP
""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
"" Fechamento automático de parênteses
inoremap ' ''<left>
inoremap " ""<left>
imap { {}<left>
imap ( ()<left>
imap [ []<left>
"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
"" Abrir terminal dentro do vim
""map <C-t> :below terminal<CR>
"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
cab W w
cab Wq wq
cab wQ wq
cab WQ wq
cab Q q
"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""


# Lab 1.2 Notes

## Git commands

### Configuração Inicial

git config --global user.name "Seu Nome": Define o nome de usuário do Git.
git config --global user.email "seuemail@example.com": Define o endereço de e-mail do usuário.

### Inicialização de um Repositório


git init: Inicia um novo repositório Git local.

### Commits

git add <arquivo>: Adiciona as mudanças em um arquivo à área de preparação (staging area).
git add .: Adiciona todas as mudanças de arquivos à área de preparação.
git commit -m "Mensagem do Commit": Cria um novo commit com as mudanças na área de preparação.

### Clonar

git clone <url_do_repositório>: Clona um repositório Git remoto.
git pull: Obtém as atualizações do repositório remoto.
git push: Envia os commits locais para o repositório remoto.


### .gitignore

Para ignorar arquivos ou diretórios, crie um arquivo chamado .gitignore e liste os itens a serem ignorados.


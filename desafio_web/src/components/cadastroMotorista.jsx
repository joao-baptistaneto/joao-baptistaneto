export default function CadastroMotorista() {
    return (
        <form>
            <div class="form-group">
                <label>CPF</label>
                <input type="number" class="form-control" id="cpfMotorista"aria-describedby="cadastroCpfCliente" placeholder="CPF"/>
            </div>
            <div class="form-group">
                <label>Nome</label>
                <input type="text" class="form-control" id="nomeMotorista" aria-describedby="cadastroNomeCliente" placeholder="Informe nome e sobrenome" />
            </div>
            <div class="form-group">
                <label>Data de Nascimento</label>
                <input type="date" class="form-control" id="dataNascimentoMotorista" aria-describedby="cadastrodataNascimentoMotorista" placeholder="Data de nascimento" />
            </div>
            <div class="form-group">
                <label>Modelo do Carro</label>
                <input type="text" class="form-control" id="modeloCarro" aria-describedby="cadastroModeloCarro" placeholder="Modelo do Carro" />
            </div>
            <div class="form-group">
                <label>Status</label>
                <select class="form-control custom-select my-1 mr-sm-2" id="statusMotorista" aria-describedby="cadastroStatusMotorista">
                    <option value="" selected>Selecione...</option>
                    <option value="ativo">Ativo</option>
                    <option value="desativado">Desativado</option>
                </select>
            </div>
            <div class="form-group">
                <label>Sexo</label>
                <select class="form-control custom-select my-1 mr-sm-2" id="sexoMotorista" aria-describedby="cadastroSexoMotorista">
                    <option value="masculino">Masculino</option>
                    <option value="feminino">Feminino</option>
                </select>
            </div>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
    )
}
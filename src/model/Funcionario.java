package model;

public class Funcionario {
    private String nome;
    private String cpf;
    private String cargo;
    private double salario;
    private String turno;

    private int horaTrabalhada = 0;

    public Funcionario(String nome, String cpf, String cargo, double salario, String turno) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        this.turno = turno;
        this.horaTrabalhada = 0;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int gethoraTrabalhada(int horaTrabalhada) {
        return horaTrabalhada;
    }

    public void sethoraTrabalhada(int horaTrabalhada) {
        this.horaTrabalhada = 0;

    }

}

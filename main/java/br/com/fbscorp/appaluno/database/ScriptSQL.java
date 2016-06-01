package br.com.fbscorp.appaluno.database;

/**
 * Created by Felipe on 01/06/2016.
 */
public class ScriptSQL {

    public static String getCreateLink(){
        StringBuilder sqlBuilder = new StringBuilder();

        sqlBuilder.append("CREATE TABLE IF NOT EXISTS LINK( ");
        sqlBuilder.append("_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, ");
        sqlBuilder.append("DESCRICAO VARCHAR(20), ");
        sqlBuilder.append("URL VARCHAR(100) ");
        sqlBuilder.append(");");

        return sqlBuilder.toString();
    }

    public static String getPopulaLink(){
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("INSERT INTO LINK (DESCRICAO, URL) VALUES('SITE FAETERJ','http://www.faeterj-rio.edu.br/'),");
        sqlBuilder.append("('FACEBOOK FAETERJ','https://www.facebook.com/faeterj.campusrio/'), ");
        sqlBuilder.append("('GRUPO FAETERJ NO FACEBOOK','https://www.facebook.com/groups/220821044624217/'), ");
        sqlBuilder.append("('CENTRAL DE ATENDIMENTO','http://faeterj-rio.edu.br/atendimento/'), ");
        sqlBuilder.append("('CAMPUS VIRTUAL','http://www.faeterj-rio.edu.br/campusvirtual/') ");

        return sqlBuilder.toString();
    }

}

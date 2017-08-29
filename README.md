gradle + springMvc + spring + mybatis
持久层 postgreSql


brew services start postgresql

启动 PostgreSQL
`pg_ctl -D /usr/local/var/postgres start`

关闭 PostgreSQL：
`pg_ctl -D /usr/local/var/postgres stop -s -m fast`

创建一个 PostgreSQL 用户
`createuser test -P`

创建数据库
`createdb dbname -O username -E UTF8 -e`

`createdb test_db -O test -E UTF8 -e`

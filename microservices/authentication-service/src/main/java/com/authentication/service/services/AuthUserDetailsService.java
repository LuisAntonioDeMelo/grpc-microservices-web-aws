package com.authentication.service.services;

//@Component
//public class AuthUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private Usuarios usuarios;
//
//    @Autowired
//    private Grupos grupos;
//
//    @Autowired
//    private Permissoes permissoes;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Usuario usuario = usuarios.findByLogin(username);
//
//        if (usuario == null) {
//            throw new UsernameNotFoundException("Usuário não encontrado!");
//        }
//
//        return new UsuarioSistema(usuario.getNome(), usuario.getLogin(), usuario.getSenha(), authorities(usuario));
//    }
//
//    public Collection<? extends GrantedAuthority> authorities(Usuario usuario) {
//        return authorities(grupos.findByUsuariosIn(usuario));
//    }
//
//    public Collection<? extends GrantedAuthority> authorities(List<Grupo> grupos) {
//        Collection<GrantedAuthority> auths = new ArrayList<>();
//
//        for (Grupo grupo: grupos) {
//            List<Permissao> lista = permissoes.findByGruposIn(grupo);
//
//            for (Permissao permissao: lista) {
//                auths.add(new SimpleGrantedAuthority("ROLE_" + permissao.getNome()));
//            }
//        }
//        return auths;
//    }
//}
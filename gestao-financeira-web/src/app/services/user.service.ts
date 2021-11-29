import { environment } from './../../environments/environment';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { User } from '../models/models';

@Injectable({ providedIn: 'root' })
export class UserService {
    constructor(private http: HttpClient) { }

    getAll() {
        return this.http.get<User[]>(`${environment.security_url}/users`);
    }

    register(user: User) {
        return this.http.post(`${environment.security_url}/users/register`, user);
    }


    delete(id: number) {
        return this.http.delete(`${environment.security_url}//users/${id}`);
    }
}

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { User } from '../models/models';
import { security_url } from 'src/environments/environment';

@Injectable({ providedIn: 'root' })
export class UserService {
    constructor(private http: HttpClient) { }

    getAll() {
        return this.http.get<User[]>(`${security_url}/users`);
    }

    register(user: User) {
        return this.http.post(`${security_url}/users/register`, user);
    }

    delete(id: number) {
        return this.http.delete(`${security_url}/users/${id}`);
    }
}

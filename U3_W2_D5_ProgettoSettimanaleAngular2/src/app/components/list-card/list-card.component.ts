// list-card.component.ts

import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/models/todo.interface';
import { User } from 'src/app/models/user.interface';
import { TodoService } from 'src/app/services/todo.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-list-card',
  templateUrl: './list-card.component.html',
  styleUrls: ['./list-card.component.scss'],
})
export class ListCardComponent implements OnInit {
  todos: Todo[] = [];
  users: User[] = [];

  constructor(
    private todoService: TodoService,
    private userService: UserService
  ) { }

  ngOnInit() {
    this.todos = this.todoService.todos;
    this.users = this.userService.users;
  }

  checkBox(todo: Todo) {
    todo.completed = !todo.completed;
  }

  cercaUser(userId: number): User | undefined {
    return this.users.find((user) => user.id === userId);
  }
}

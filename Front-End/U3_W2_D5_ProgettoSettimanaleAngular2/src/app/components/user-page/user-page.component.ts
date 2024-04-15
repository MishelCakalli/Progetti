import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/models/todo.interface';
import { User } from 'src/app/models/user.interface';
import { TodoService } from 'src/app/services/todo.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-user-page',
  templateUrl: './user-page.component.html',
  styleUrls: ['./user-page.component.scss']
})
export class UserPageComponent implements OnInit {
  todos: Todo[] = [];
  users: User[] = [];

  constructor(private todoService: TodoService,private userService: UserService) { }

  ngOnInit() {
    this.todos = this.todoService.todos;
    this.users = this.userService.users;
  }

  checkBox(todo: Todo) {
    todo.completed = !todo.completed;
  }

  getTodosByUserId(userId: number): Todo[] {
    return this.todos.filter(todo => todo.userId === userId);
  }
}

import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/models/todo.interface';
import { TodoService } from 'src/app/services/todo.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-list-missing',
  templateUrl: './list-missing.component.html',
  styleUrls: ['./list-missing.component.scss']
})
export class ListMissingComponent implements OnInit {
  incompleteTodos: Todo[] = [];

  constructor(private todoService: TodoService, private userService: UserService) { }

  ngOnInit() {
    this.incompleteTodos = this.todoService.todos.filter(todo => !todo.completed);
    console.log(this.incompleteTodos);
  }

  checkBox(todo: Todo) {
    todo.completed = !todo.completed;
  }

  cercaUser(userId: number) {
    return this.userService.users.find(user => user.id === userId);
  }
}
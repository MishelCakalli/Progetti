import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/models/todo.interface';
import { TodoService } from 'src/app/services/todo.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-list-done',
  templateUrl: './list-done.component.html',
  styleUrls: ['./list-done.component.scss']
})
export class ListDoneComponent implements OnInit {
  completedTodos: Todo[] = [];

  constructor(private todoService: TodoService, private userService: UserService) { }

  ngOnInit() {
    this.completedTodos = this.todoService.todos.filter(todo => todo.completed);
  }

  checkBox(todo: Todo) {
    todo.completed = !todo.completed;
  }

  cercaUser(userId: number) {
    return this.userService.users.find(user => user.id === userId);
  }
}
